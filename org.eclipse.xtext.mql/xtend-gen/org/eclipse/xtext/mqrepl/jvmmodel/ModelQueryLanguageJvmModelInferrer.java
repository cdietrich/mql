package org.eclipse.xtext.mqrepl.jvmmodel;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.mqrepl.IModelQueryConstants;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.Model;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelQueryLanguageJvmModelInferrer extends AbstractModelInferrer {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private TypeReferences _typeReferences;
  
  protected void _infer(final Model model, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
        public void apply(final JvmGenericType it) {
          {
            EList<JvmMember> _members = it.getMembers();
            JvmTypeReference _typeForName = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(org.eclipse.xtext.resource.IResourceDescriptions.class, model);
            JvmField _field = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toField(model, IModelQueryConstants.INDEX, _typeForName);
            CollectionExtensions.<JvmField>operator_add(_members, _field);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmTypeReference _typeForName_1 = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(org.eclipse.emf.ecore.resource.ResourceSet.class, model);
            JvmField _field_1 = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toField(model, IModelQueryConstants.RESOURCESET, _typeForName_1);
            CollectionExtensions.<JvmField>operator_add(_members_1, _field_1);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmTypeReference _typeForName_2 = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(com.google.inject.Injector.class, model);
            JvmField _field_2 = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toField(model, IModelQueryConstants.INJECTOR, _typeForName_2);
            CollectionExtensions.<JvmField>operator_add(_members_2, _field_2);
            EList<JvmMember> _members_3 = it.getMembers();
            JvmTypeReference _typeForName_3 = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(Void.TYPE, model);
            final Procedure1<JvmOperation> _function = new Procedure1<JvmOperation>() {
                public void apply(final JvmOperation it) {
                  {
                    XBlockExpression _body = model.getBody();
                    ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _body);
                    EList<JvmTypeReference> _exceptions = it.getExceptions();
                    JvmTypeReference _typeForName = ModelQueryLanguageJvmModelInferrer.this._typeReferences.getTypeForName(java.lang.Exception.class, model);
                    CollectionExtensions.<JvmTypeReference>operator_add(_exceptions, _typeForName);
                  }
                }
              };
            JvmOperation _method = ModelQueryLanguageJvmModelInferrer.this._jvmTypesBuilder.toMethod(model, "main", _typeForName_3, _function);
            CollectionExtensions.<JvmOperation>operator_add(_members_3, _method);
          }
        }
      };
    JvmGenericType _class = this._jvmTypesBuilder.toClass(model, IModelQueryConstants.INFERRED_CLASS_NAME, _function);
    acceptor.accept(_class);
  }
  
  public void infer(final EObject model, final IAcceptor<JvmDeclaredType> acceptor, final boolean isPrelinkingPhase) {
    if (model instanceof Model) {
      _infer((Model)model, acceptor, isPrelinkingPhase);
    } else if (model != null) {
      _infer(model, acceptor, isPrelinkingPhase);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, acceptor, isPrelinkingPhase).toString());
    }
  }
}
