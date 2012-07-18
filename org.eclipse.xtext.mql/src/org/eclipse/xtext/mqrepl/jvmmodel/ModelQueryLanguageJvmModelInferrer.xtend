package org.eclipse.xtext.mqrepl.jvmmodel
 
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Model
import org.eclipse.xtext.mqrepl.IModelQueryConstants
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.emf.ecore.resource.ResourceSet
import com.google.inject.Injector

class ModelQueryLanguageJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension JvmTypesBuilder
	
	@Inject extension TypeReferences


   	def dispatch void infer(Model model, IAcceptor<JvmDeclaredType> acceptor, boolean isPrelinkingPhase) {
   		acceptor.accept(
   			model.toClass(IModelQueryConstants::INFERRED_CLASS_NAME) [
   				members += model.toField(IModelQueryConstants::INDEX, typeof(IResourceDescriptions).getTypeForName(model))
   				members += model.toField(IModelQueryConstants::RESOURCESET, typeof(ResourceSet).getTypeForName(model))
   				members += model.toField(IModelQueryConstants::INJECTOR, typeof(Injector).getTypeForName(model))
   				members += model.toMethod("main", Void::TYPE.getTypeForName(model)) [
   					body = model.body
   					exceptions += typeof(Exception).getTypeForName(model)
   				]
   			]
   		)
   		
   	}
}
