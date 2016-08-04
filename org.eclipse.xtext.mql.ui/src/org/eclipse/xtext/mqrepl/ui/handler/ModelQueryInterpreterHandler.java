package org.eclipse.xtext.mqrepl.ui.handler;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.mqrepl.IModelQueryConstants;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Model;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.XtextEditor;
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
import org.eclipse.xtext.xtype.XImportDeclaration;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class ModelQueryInterpreterHandler extends AbstractHandler implements IHandler {

	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	Provider<ResourceSet> resourceSetProvider;
	@Inject
	IResourceSetProvider resourceSetByProjectProvider;

	@Inject
	XbaseInterpreter xbaseInterpreter;

	@Inject
	JavaProjectFactory javaProjectFactory;

	@Inject
	IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	ISerializer serializer;

	@Inject
	Injector injector;

	@Inject
	IWorkbench workbench;

	@Override
	public Object execute(ExecutionEvent event) {

//		final IWorkbenchPart view = HandlerUtil.getActivePart(event);
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
//		 if (view instanceof ModelQueryLanguageView) {
//			final ModelQueryLanguageView mqlv = (ModelQueryLanguageView) view;
//			final Holder<String> ref = new Holder<String>();
//			try {
//				workbench.getProgressService().run(true, true, new IRunnableWithProgress() {
//
//					@Override
//					public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
//						XtextDocument doc = ((ModelQueryLanguageView) view).getEmbeddedEditor().getDocument();
//						String result = doc.readOnly(new IUnitOfWork<String, XtextResource>() {
//							@Override
//							public String exec(XtextResource r) throws Exception {
//								Model m = (Model) r.getContents().get(0);
//								return interpret(m, monitor);
//							}
//						});
//						ref.set(result);
//					}
//				});
//				mqlv.getEmbeddedEditorResult().getDocument().set(ref.get());
//			} catch (InvocationTargetException e) {
//				e.printStackTrace();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//
//		} else 
		if (activeEditor != null && activeEditor instanceof XtextEditor) {
			final XtextEditor editor = (XtextEditor) activeEditor;
			IProject project = ((IFileEditorInput)editor.getEditorInput()).getFile().getProject();
			final Holder<String> ref = new Holder<String>();
			try {
				workbench.getProgressService().run(true, true, new IRunnableWithProgress() {

					@Override
					public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						XtextDocument doc = (XtextDocument) editor.getDocument();
						String result = doc.readOnly(new IUnitOfWork<String, XtextResource>() {
							@Override
							public String exec(XtextResource r) throws Exception {
								Model m = (Model) r.getContents().get(0);
								return interpret(project, m, monitor);
							}
						});
						ref.set(result);
					}
				});
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ModelQueryLanguageDialog dialog = new ModelQueryLanguageDialog(Display.getCurrent().getActiveShell(), ref.get(), project);
			injector.injectMembers(dialog);
			dialog.open();

		} 
		return null;
	}

	private String interpret(final IProject project, final Model m, final IProgressMonitor monitor) {
		final List<String> data = new ArrayList<String>();
		IEvaluationContext context = new DefaultEvaluationContext();
		context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME + "." + IModelQueryConstants.INDEX), resourceDescriptions);
		context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME + "." + IModelQueryConstants.RESOURCESET), resourceSetProvider.get());
		context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME + "." + IModelQueryConstants.PROJECT), project);
		context.newValue(qualifiedNameConverter.toQualifiedName(IModelQueryConstants.INFERRED_CLASS_NAME + "." + IModelQueryConstants.INJECTOR), injector);
		if (m.getImportSection() != null) {
			for (XImportDeclaration i : m.getImportSection().getImportDeclarations()) {
				data.add(serializer.serialize(i).trim());
			}
		}
		for (XMethodDeclaration d : m.getMethods()) {
			data.add(serializer.serialize(d).trim());
		}
		monitor.beginTask("Interpreting", m.getBody().getExpressions().size());
		for (XExpression x : m.getBody().getExpressions()) {
			if (monitor.isCanceled()) {
				System.out.println("mumu");
				monitor.done();
				return IterableExtensions.join(data, "\n");
			}
			IEvaluationResult result = xbaseInterpreter.evaluate(x, context, CancelIndicator.NullImpl);
			data.add(serializer.serialize(x).trim());
			if (result.getException() != null) {
				data.add("// Exception: " + result.getException().getMessage());
				result.getException().printStackTrace();
				return IterableExtensions.join(data, "\n");
			} else {
				if (result.getResult() == null) {
					data.add("// null");
				} else {
					data.add("//" + result.getResult().getClass().getSimpleName() + ": " + result.getResult().toString());
				}
			}
			monitor.worked(1);

		}
		monitor.done();
		return IterableExtensions.join(data, "\n");
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	static class Holder<T> {
		private T t;

		public Holder() {
		}

		public T get() {
			return t;
		}

		public void set(T t) {
			this.t = t;
		}
	}

}
