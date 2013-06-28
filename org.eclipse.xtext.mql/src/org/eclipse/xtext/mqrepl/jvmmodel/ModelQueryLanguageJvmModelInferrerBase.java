package org.eclipse.xtext.mqrepl.jvmmodel;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;

public class ModelQueryLanguageJvmModelInferrerBase extends AbstractModelInferrer {
	
	@Inject
	private TypesFactory typesFactory;
	
	@Inject
	private TypeReferences typeReferences;

	@Inject
	private JvmTypesBuilder jvmTypesBuilder;
	
	@Inject
	private IJvmModelAssociator associator;
	
	protected void copyAndFixTypeParameters(List<JvmTypeParameter> typeParameters, JvmTypeParameterDeclarator target) {
		for (JvmTypeParameter typeParameter : typeParameters) {
			final JvmTypeParameter clonedTypeParameter = jvmTypesBuilder.cloneWithProxies(typeParameter);
			if (clonedTypeParameter != null) {
				target.getTypeParameters().add(clonedTypeParameter);
				boolean upperBoundSeen = false;
				for (JvmTypeConstraint constraint : clonedTypeParameter.getConstraints()) {
					if (constraint instanceof JvmUpperBound) {
						upperBoundSeen = true;
						break;
					}
				}
				if (!upperBoundSeen) {
					JvmUpperBound upperBound = typesFactory.createJvmUpperBound();
					upperBound.setTypeReference(typeReferences.getTypeForName(Object.class, typeParameter));
					clonedTypeParameter.getConstraints().add(upperBound);
				}
				associator.associate(typeParameter, clonedTypeParameter);
			}
		}
	}

}
