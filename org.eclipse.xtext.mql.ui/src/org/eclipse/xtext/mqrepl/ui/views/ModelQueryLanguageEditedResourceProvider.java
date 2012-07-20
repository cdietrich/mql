package org.eclipse.xtext.mqrepl.ui.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.util.PluginProjectFactory;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class ModelQueryLanguageEditedResourceProvider implements IEditedResourceProvider {
	
	@Inject Provider<ResourceSet> rsp;
	@Inject IResourceSetProvider resourceSetProvider;
	
	@Inject Provider<PluginProjectFactory> ppfp;
	
	private IProject project;
	
	int counter = 0;

	@Override
	public XtextResource createResource() {
		if (project == null) {
			PluginProjectFactory factory = ppfp.get();
			factory.setProjectName("mqlhidden");
			factory.addFolders(Lists.newArrayList("src"));
			factory.addRequiredBundles(Lists.newArrayList("org.xtext.example.mydsl", "org.eclipse.xtext", "com.google.inject", "org.eclipse.xtext.xbase.lib"));
			factory.addProjectNatures(org.eclipse.xtext.ui.XtextProjectHelper.NATURE_ID, "org.eclipse.jdt.core.javanature", "org.eclipse.pde.PluginNature");
			factory.addBuilderIds(org.eclipse.jdt.core.JavaCore.BUILDER_ID);
			project = factory.createProject(new NullProgressMonitor(), null);
			try {
				project.open(new NullProgressMonitor());
				project.setHidden(true);
				IJavaProject javaProject = JavaCore.create(project);
				javaProject.open(new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		XtextResource r = (XtextResource) resourceSetProvider.get(project).createResource(URI.createURI("test"+(counter++)+".mql"));
		return r;
	}

}
