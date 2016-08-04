package org.eclipse.xtext.mqrepl.ui.views;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class ModelQueryLanguageEditedResourceProvider implements IEditedResourceProvider {
	
	@Inject IResourceSetProvider rsp;
	private IProject project;

	@Override
	public XtextResource createResource() {
		return (XtextResource) rsp.get(project).createResource(URI.createURI("platform:/resource/"+project.getName()+"/src/___test.mql"));
	}

	public void configureProject(IProject project) {
		this.project = project;
		
		
	}

}
