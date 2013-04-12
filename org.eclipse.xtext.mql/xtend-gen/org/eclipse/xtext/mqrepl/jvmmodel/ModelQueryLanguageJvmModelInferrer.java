package org.eclipse.xtext.mqrepl.jvmmodel;

import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.mqrepl.IModelQueryConstants;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Model;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelQueryLanguageJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  @Extension
  private TypeReferences _typeReferences;
  
  protected void _infer(final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPrelinkingPhase) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          EList<JvmMember> _members = it.getMembers();
          JvmTypeReference _typeForName = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(IResourceDescriptions.class, model);
          JvmField _field = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toField(model, IModelQueryConstants.INDEX, _typeForName);
          ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members, _field);
          EList<JvmMember> _members_1 = it.getMembers();
          JvmTypeReference _typeForName_1 = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(ResourceSet.class, model);
          JvmField _field_1 = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toField(model, IModelQueryConstants.RESOURCESET, _typeForName_1);
          ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_1, _field_1);
          EList<JvmMember> _members_2 = it.getMembers();
          JvmTypeReference _typeForName_2 = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(Injector.class, model);
          JvmField _field_2 = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toField(model, IModelQueryConstants.INJECTOR, _typeForName_2);
          ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_2, _field_2);
          EList<JvmMember> _members_3 = it.getMembers();
          JvmTypeReference _typeForName_3 = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, model);
          final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
              public void apply(final JvmOperation it) {
                XBlockExpression _body = model.getBody();
                ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                EList<JvmTypeReference> _exceptions = it.getExceptions();
                JvmTypeReference _typeForName = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(Exception.class, model);
                ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_exceptions, _typeForName);
              }
            };
          JvmOperation _method = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toMethod(model, "main", _typeForName_3, _function);
          ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.<JvmMember>operator_add(_members_3, _method);
        }
      };
    JvmGenericType _class = this._jvmTypesBuilder.toClass(model, IModelQueryConstants.INFERRED_CLASS_NAME, _function);
    acceptor.<JvmGenericType>accept(_class);
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
