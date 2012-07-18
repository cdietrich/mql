package org.eclipse.xtext.mqrepl.ui.handler;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.mqrepl.ui.views.ModelQueryLanguageEditedResourceProvider;
import org.eclipse.xtext.mqrepl.ui.views.ViewerConfiguration;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ModelQueryLanguageDialog extends TitleAreaDialog {

	private final String content;
	
	private static final String FONT_NAME = "Consolas"; //$NON-NLS-1$
    private static final int FONT_SIZE = 12;

	@Inject
	ModelQueryLanguageEditedResourceProvider editedResourceProvider;

	@Inject
	ViewerConfiguration configuration;

	@Inject
	EmbeddedEditorFactory embeddedEditorFactory;
	
	private EmbeddedEditor embeddedEditor;

	public ModelQueryLanguageDialog(Shell parentShell, String content) {
		super(parentShell);
		this.content = content;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		embeddedEditor = embeddedEditorFactory.newEditor(editedResourceProvider).readOnly().withParent(composite);
		embeddedEditor.createPartialEditor();
		configuration.getHighlightingHelper().install(embeddedEditor.getConfiguration(), embeddedEditor.getViewer());
		embeddedEditor.getViewer().getControl().setFont(new Font(Display.getDefault(), FONT_NAME, FONT_SIZE, SWT.NORMAL));
		embeddedEditor.getDocument().set(content);
		composite.pack();
		return composite;
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Control control = super.createContents(parent);
		setTitle("Result");
		setMessage("Result of Interpretation");
		return control;
	}

}
