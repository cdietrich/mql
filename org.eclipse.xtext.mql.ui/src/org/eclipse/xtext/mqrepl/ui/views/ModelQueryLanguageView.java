package org.eclipse.xtext.mqrepl.ui.views;



import org.eclipse.emf.ecore.EPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ModelQueryLanguageView extends ViewPart {
	
	private static final String FONT_NAME = "Consolas"; //$NON-NLS-1$
    private static final int FONT_SIZE = 12;
	
	@Inject ModelQueryLanguageEditedResourceProvider editedResourceProvider;
	
	@Inject
	EmbeddedEditorFactory embeddedEditorFactory;
	private EmbeddedEditor embeddedEditor;
	private EmbeddedEditor embeddedEditorResult;
	//private ListViewer listViewer;

	@Inject
	ViewerConfiguration configuration;
	
	
	@Override
	public void createPartControl(Composite parent) {
		
		Composite view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		view.setLayout(layout);
		embeddedEditor = embeddedEditorFactory.newEditor(editedResourceProvider).withParent(view);
		embeddedEditorResult = embeddedEditorFactory.newEditor(editedResourceProvider).readOnly().withParent(view);
		getEmbeddedEditor().createPartialEditor();
		getEmbeddedEditorResult().createPartialEditor();
		configuration.getHighlightingHelper().install(getEmbeddedEditor().getConfiguration(), getEmbeddedEditor().getViewer());
		configuration.getHighlightingHelper().install(getEmbeddedEditorResult().getConfiguration(), getEmbeddedEditorResult().getViewer());
		getEmbeddedEditor().getViewer().getControl().setFont(new Font(Display.getDefault(), FONT_NAME, FONT_SIZE, SWT.NORMAL));
		getEmbeddedEditorResult().getViewer().getControl().setFont(new Font(Display.getDefault(), FONT_NAME, FONT_SIZE, SWT.NORMAL));
		getEmbeddedEditor().getDocument().set(getInitialFile());
		
		parent.pack();
		
	}

	private String getInitialFile() {
		StringBuffer result = new StringBuffer();
		result.append("import org.eclipse.xtext.resource.*\n");
		result.append("import org.eclipse.emf.ecore.util.*\n");
		return result.toString();
	}

	@Override
	public void setFocus() {
		getEmbeddedEditor().getViewer().getControl().setFocus();
	}

	public EmbeddedEditor getEmbeddedEditor() {
		return embeddedEditor;
	}
	public EmbeddedEditor getEmbeddedEditorResult() {
		return embeddedEditorResult;
	}




}
