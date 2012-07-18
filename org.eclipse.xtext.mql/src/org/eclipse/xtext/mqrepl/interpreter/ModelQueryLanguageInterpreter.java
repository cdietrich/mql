package org.eclipse.xtext.mqrepl.interpreter;

import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.mqrepl.IModelQueryConstants;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ModelQueryLanguageInterpreter extends XbaseInterpreter {
	
	@Inject
	IQualifiedNameConverter qualifiedNameConverter;
	
	@Override
	protected Object _featureCallField(JvmField jvmField,
			XAbstractFeatureCall featureCall, Object receiver,
			IEvaluationContext context, CancelIndicator indicator) {
		if (jvmField.getQualifiedName().equals(IModelQueryConstants.INFERRED_CLASS_NAME+"."+IModelQueryConstants.INDEX)) {
			Object result = context.getValue(qualifiedNameConverter.toQualifiedName(jvmField.getQualifiedName()));
			return result;
		} else if (jvmField.getQualifiedName().equals(IModelQueryConstants.INFERRED_CLASS_NAME+"."+IModelQueryConstants.RESOURCESET)) {
			Object result = context.getValue(qualifiedNameConverter.toQualifiedName(jvmField.getQualifiedName()));
			return result;
		} else if (jvmField.getQualifiedName().equals(IModelQueryConstants.INFERRED_CLASS_NAME+"."+IModelQueryConstants.INJECTOR)) {
			Object result = context.getValue(qualifiedNameConverter.toQualifiedName(jvmField.getQualifiedName()));
			return result;
		}
		return super._featureCallField(jvmField, featureCall, receiver, context,
				indicator);
	}

}
