package org.eclipse.xtext.mqrepl.jvmmodel;

import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.Arrays;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.mqrepl.IModelQueryConstants;
import org.eclipse.xtext.mqrepl.jvmmodel.ModelQueryLanguageJvmModelInferrerBase;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Model;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelQueryLanguageJvmModelInferrer extends ModelQueryLanguageJvmModelInferrerBase {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  protected void _infer(final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    final String postfix = model.eResource().getURI().trimFileExtension().lastSegment();
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmMember> _members = it.getMembers();
      JvmField _field = this._jvmTypesBuilder.toField(model, IModelQueryConstants.INDEX, this._typeReferenceBuilder.typeRef(IResourceDescriptions.class));
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
      EList<JvmMember> _members_1 = it.getMembers();
      JvmField _field_1 = this._jvmTypesBuilder.toField(model, IModelQueryConstants.PROJECT, this._typeReferenceBuilder.typeRef(IProject.class));
      this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
      EList<JvmMember> _members_2 = it.getMembers();
      JvmField _field_2 = this._jvmTypesBuilder.toField(model, IModelQueryConstants.RESOURCESET, this._typeReferenceBuilder.typeRef(ResourceSet.class));
      this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
      EList<JvmMember> _members_3 = it.getMembers();
      JvmField _field_3 = this._jvmTypesBuilder.toField(model, IModelQueryConstants.INJECTOR, this._typeReferenceBuilder.typeRef(Injector.class));
      this._jvmTypesBuilder.<JvmField>operator_add(_members_3, _field_3);
      EList<JvmMember> _members_4 = it.getMembers();
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it_1) -> {
        this._jvmTypesBuilder.setBody(it_1, model.getBody());
        EList<JvmTypeReference> _exceptions = it_1.getExceptions();
        JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Exception.class);
        this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeRef);
      };
      JvmOperation _method = this._jvmTypesBuilder.toMethod(model, "main", this._typeReferenceBuilder.typeRef(Void.TYPE), _function_1);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method);
      EList<XMethodDeclaration> _methods = model.getMethods();
      for (final XMethodDeclaration op : _methods) {
        EList<JvmMember> _members_5 = it.getMembers();
        String _name = op.getName();
        JvmTypeReference _elvis = null;
        JvmTypeReference _type = op.getType();
        if (_type != null) {
          _elvis = _type;
        } else {
          JvmTypeReference _inferredType = this._jvmTypesBuilder.inferredType();
          _elvis = _inferredType;
        }
        final Procedure1<JvmOperation> _function_2 = (JvmOperation it_1) -> {
          EList<JvmFormalParameter> _parameters = op.getParameters();
          for (final JvmFormalParameter p : _parameters) {
            EList<JvmFormalParameter> _parameters_1 = it_1.getParameters();
            JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(p, p.getName(), p.getParameterType());
            this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
          }
          this.copyAndFixTypeParameters(op.getTypeParameters(), it_1);
          this._jvmTypesBuilder.setBody(it_1, op.getBody());
        };
        JvmOperation _method_1 = this._jvmTypesBuilder.toMethod(op, _name, _elvis, _function_2);
        this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_1);
      }
    };
    acceptor.<JvmGenericType>accept(
      this._jvmTypesBuilder.toClass(model, (IModelQueryConstants.INFERRED_CLASS_NAME + postfix)), _function);
  }
  
  public void infer(final EObject model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    if (model instanceof Model) {
      _infer((Model)model, acceptor, isPrelinkingPhase);
      return;
    } else if (model != null) {
      _infer(model, acceptor, isPrelinkingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, acceptor, isPrelinkingPhase).toString());
    }
  }
}
