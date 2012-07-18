package org.eclipse.xtext.mqrepl.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
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

	@Inject
	ViewerConfiguration configuration;
	
	
	@Override
	public void createPartControl(Composite parent) {
		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);
		sashForm.setLayout(new FillLayout());
		embeddedEditor = embeddedEditorFactory.newEditor(editedResourceProvider).withParent(sashForm);
		embeddedEditorResult = embeddedEditorFactory.newEditor(editedResourceProvider).readOnly().withParent(sashForm);
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
		result.append("// Built in Variables: \n");
		result.append("// index\n");
		result.append("// resourceSet\n");
		result.append("// index\n");
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
