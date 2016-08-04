package org.eclipse.xtext.mqrepl.ui.handler;

import org.eclipse.core.internal.resources.Project;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.source.LineNumberRulerColumn;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.mqrepl.ui.views.ModelQueryLanguageEditedResourceProvider;
import org.eclipse.xtext.mqrepl.ui.views.ViewerConfiguration;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class ModelQueryLanguageDialog extends TitleAreaDialog {

	private final String content;
	
	@Inject
	ModelQueryLanguageEditedResourceProvider editedResourceProvider;

	@Inject
	ViewerConfiguration configuration;

	@Inject
	EmbeddedEditorFactory embeddedEditorFactory;
	
	private EmbeddedEditor embeddedEditor;

	private IProject project;

	public ModelQueryLanguageDialog(Shell parentShell, String content, IProject project) {
		super(parentShell);
		this.content = content;
		this.project = project;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		editedResourceProvider.configureProject(project);
		Composite composite = (Composite) super.createDialogArea(parent);
		embeddedEditor = embeddedEditorFactory.newEditor(editedResourceProvider).showErrorAndWarningAnnotations().readOnly().withParent(composite);
		embeddedEditor.createPartialEditor();
		configuration.getHighlightingHelper().install(embeddedEditor.getConfiguration(), embeddedEditor.getViewer());
		embeddedEditor.getViewer().getTextWidget().setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
		
		LineNumberRulerColumn lineNumberRulerColumn = new LineNumberRulerColumn();
		embeddedEditor.getViewer().addVerticalRulerColumn(lineNumberRulerColumn); 
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
	
	@Override
	protected boolean isResizable() {
		return true;
	}

}
