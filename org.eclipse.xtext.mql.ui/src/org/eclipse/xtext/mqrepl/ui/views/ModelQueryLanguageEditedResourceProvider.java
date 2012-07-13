package org.eclipse.xtext.mqrepl.ui.views;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public class ModelQueryLanguageEditedResourceProvider implements IEditedResourceProvider {
	
	@Inject Provider<ResourceSet> rsp;

	@Override
	public XtextResource createResource() {
		return (XtextResource) rsp.get().createResource(URI.createURI("test.mql"));
	}

}
