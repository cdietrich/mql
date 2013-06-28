package org.eclipse.xtext.mqrepl.interpreter;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.mqrepl.IModelQueryConstants;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ModelQueryLanguageInterpreter extends XbaseInterpreter {

	@Inject
	IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	IJvmModelAssociations jvmModelAssociations;

	@Override
	protected Object invokeOperation(JvmOperation operation, Object receiver, List<Object> argumentValues, IEvaluationContext c, CancelIndicator indicator) {
		XMethodDeclaration m = getMethodDeclaration(operation);
		if (m != null) {
			IEvaluationContext context = c.fork();
			int index = 0;
			for (JvmFormalParameter p : m.getParameters()) {
				context.newValue(QualifiedName.create(p.getName()), argumentValues.get(index));
				index++;
			}
			IEvaluationResult result = evaluate(m.getBody(), context, indicator);
			if (result.getException() != null) {
				throw new EvaluationException(result.getException());
			}
			return result.getResult();
		} else {
			return super.invokeOperation(operation, receiver, argumentValues, c, indicator);
		}
	}

	private XMethodDeclaration getMethodDeclaration(JvmOperation op) {
		Set<EObject> sourceElements = jvmModelAssociations.getSourceElements(op);
		for (EObject o : sourceElements) {
			if (o instanceof XMethodDeclaration) {
				return (XMethodDeclaration) o;
			}
		}
		return null;
	}

	@Override
	protected Object _invokeFeature(JvmField jvmField, XAbstractFeatureCall featureCall, Object receiver, IEvaluationContext context, CancelIndicator indicator) {
		if (jvmField.getQualifiedName().equals(IModelQueryConstants.INFERRED_CLASS_NAME + "." + IModelQueryConstants.INDEX)) {
			Object result = context.getValue(qualifiedNameConverter.toQualifiedName(jvmField.getQualifiedName()));
			return result;
		} else if (jvmField.getQualifiedName().equals(IModelQueryConstants.INFERRED_CLASS_NAME + "." + IModelQueryConstants.RESOURCESET)) {
			Object result = context.getValue(qualifiedNameConverter.toQualifiedName(jvmField.getQualifiedName()));
			return result;
		} else if (jvmField.getQualifiedName().equals(IModelQueryConstants.INFERRED_CLASS_NAME + "." + IModelQueryConstants.INJECTOR)) {
			Object result = context.getValue(qualifiedNameConverter.toQualifiedName(jvmField.getQualifiedName()));
			return result;
		}
		return super._invokeFeature(jvmField, featureCall, receiver, context, indicator);
	}

}
