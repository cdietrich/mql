package org.eclipse.xtext.mqrepl.ui.handler;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.mqrepl.IModelQueryConstants;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Import;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Model;
import org.eclipse.xtext.mqrepl.ui.views.ModelQueryLanguageView;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.util.JavaProjectFactory;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ModelQueryInterpreterHandler extends AbstractHandler implements IHandler {

    
    @Inject
    IResourceDescriptions resourceDescriptions;
    
    @Inject
    IResourceSetProvider resourceSetProvider;
    
    @Inject
    XbaseInterpreter xbaseInterpreter;
    
    @Inject
    JavaProjectFactory javaProjectFactory;
    
    @Inject IQualifiedNameConverter qualifiedNameConverter;
    
    @Inject ISerializer serializer;
    
    @Override
    public Object execute(ExecutionEvent event)  {
            
            ISelection selection = HandlerUtil.getCurrentSelection(event);
            IWorkbenchPart view = HandlerUtil.getActivePart(event);
            if (selection instanceof IStructuredSelection) {
                    IStructuredSelection structuredSelection = (IStructuredSelection) selection;
                    Object firstElement = structuredSelection.getFirstElement();
                    if (firstElement instanceof IFile) {
                            IFile file = (IFile) firstElement;
                            IProject project = file.getProject();
                            
                            URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
                            ResourceSet rs = resourceSetProvider.get(project);
                            Resource r = rs.getResource(uri, true);
                            Model m = (Model) r.getContents().get(0);
                            
                            IEvaluationContext context = new DefaultEvaluationContext();
                            context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME+"."+IModelQueryConstants.INDEX), resourceDescriptions);
                            context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME+"."+IModelQueryConstants.RESOURCESET), rs);
                            IEvaluationResult result = xbaseInterpreter.evaluate(m.getBody(), context , CancelIndicator.NullImpl);
                            System.out.println(result.getResult());
                            
                    }
            } else if (view instanceof ModelQueryLanguageView) {
            	final ModelQueryLanguageView mqlv = (ModelQueryLanguageView) view;
            	XtextDocument doc = ((ModelQueryLanguageView) view).getEmbeddedEditor().getDocument();
            	final List<String> data = new ArrayList<String>();
            	doc.readOnly(new IUnitOfWork<String, XtextResource>() {

					@Override
					public String exec(XtextResource r)
							throws Exception {
							 Model m = (Model) r.getContents().get(0);
	                         
	                         IEvaluationContext context = new DefaultEvaluationContext();
	                         context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME+"."+IModelQueryConstants.INDEX), resourceDescriptions);
	                         context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME+"."+IModelQueryConstants.RESOURCESET), r.getResourceSet());
	                         for (Import i : m.getImports()) {
	                        	 data.add(serializer.serialize(i).trim());
	                         }
	                         for (XExpression x : m.getBody().getExpressions()) {
	                        	 IEvaluationResult result = xbaseInterpreter.evaluate(x, context , CancelIndicator.NullImpl);	   
	                        	 data.add(serializer.serialize(x).trim());
	                        	 if (result.getException() != null) {
	                        		 data.add("// Exception: " + result.getException().getMessage());
	                        		 mqlv.getEmbeddedEditorResult().getDocument().set(IterableExtensions.join(data, "\n"));
	                        		 return null;
	                        	 } else {
	                        		 if (result.getResult() == null) {
	                        			 data.add("// null");
	                        		 } else {
	                        			 data.add("//" + result.getResult().getClass().getSimpleName()+": " + result.getResult().toString());
	                        		 }
	                        	 }
	                         }
	                         
	                         mqlv.getEmbeddedEditorResult().getDocument().set(IterableExtensions.join(data, "\n"));
						return null;
					}
            		
            	});
            }
            return null;
    }

    @Override
    public boolean isEnabled() {
            return true;
    }


}
