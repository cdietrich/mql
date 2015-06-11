/**
 */
package org.eclipse.xtext.mqrepl.modelQueryLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.mqrepl.modelQueryLanguage.ModelQueryLanguagePackage;
import org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMethod Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMethodDeclarationImpl extends MinimalEObjectImpl.Container implements XMethodDeclaration
{
  /**
   * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeParameters()
   * @generated
   * @ordered
   */
  protected EList<JvmTypeParameter> typeParameters;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<JvmFormalParameter> parameters;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected XExpression body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMethodDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelQueryLanguagePackage.Literals.XMETHOD_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmTypeParameter> getTypeParameters()
  {
    if (typeParameters == null)
    {
      typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE_PARAMETERS);
    }
    return typeParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelQueryLanguagePackage.XMETHOD_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JvmFormalParameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, ModelQueryLanguagePackage.XMETHOD_DECLARATION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(XExpression newBody, NotificationChain msgs)
  {
    XExpression oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(XExpression newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE_PARAMETERS:
        return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE_PARAMETERS:
        return getTypeParameters();
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE:
        return getType();
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__NAME:
        return getName();
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__PARAMETERS:
        return getParameters();
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE_PARAMETERS:
        getTypeParameters().clear();
        getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends JvmFormalParameter>)newValue);
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY:
        setBody((XExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE_PARAMETERS:
        getTypeParameters().clear();
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE:
        setType((JvmTypeReference)null);
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__PARAMETERS:
        getParameters().clear();
        return;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY:
        setBody((XExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE_PARAMETERS:
        return typeParameters != null && !typeParameters.isEmpty();
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__TYPE:
        return type != null;
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case ModelQueryLanguagePackage.XMETHOD_DECLARATION__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //XMethodDeclarationImpl
