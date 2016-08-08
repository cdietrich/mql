package org.eclipse.xtext.mqrepl.jvmmodel

import com.google.inject.Inject
import com.google.inject.Injector
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.mqrepl.IModelQueryConstants
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Model
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class ModelQueryLanguageJvmModelInferrer extends ModelQueryLanguageJvmModelInferrerBase {

	@Inject extension JvmTypesBuilder
	
   	def dispatch void infer(Model model, IJvmDeclaredTypeAcceptor acceptor, boolean isPrelinkingPhase) {
   		val postfix = model.eResource.URI.trimFileExtension.lastSegment
   		acceptor.accept(
   			model.toClass(IModelQueryConstants.INFERRED_CLASS_NAME + postfix)
   		) [
   				members += model.toField(IModelQueryConstants.INDEX, IResourceDescriptions.typeRef())
   				members += model.toField(IModelQueryConstants.PROJECT, IProject.typeRef())
   				members += model.toField(IModelQueryConstants.RESOURCESET, ResourceSet.typeRef())
   				members += model.toField(IModelQueryConstants.INJECTOR, Injector.typeRef())
   				members += model.toMethod("main", Void.TYPE.typeRef()) [
   					body = model.body
   					exceptions += Exception.typeRef()
   				]
   				for (op : model.methods) {
   					members += op.toMethod(op.name, op.type ?: inferredType) [
							for (p : op.parameters) {
								parameters += p.toParameter(p.name, p.parameterType)
							}
							copyAndFixTypeParameters(op.typeParameters, it)
							body = op.body
						]
   				}
   			]
   		
   		
   	}
}
