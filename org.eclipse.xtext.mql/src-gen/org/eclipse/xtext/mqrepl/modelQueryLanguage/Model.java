/**
 */
package org.eclipse.xtext.mqrepl.modelQueryLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XBlockExpression;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.ModelQueryLanguagePackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.ModelQueryLanguagePackage#getModel_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.ModelQueryLanguagePackage#getModel_Methods()
   * @model containment="true"
   * @generated
   */
  EList<XMethodDeclaration> getMethods();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(XBlockExpression)
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.ModelQueryLanguagePackage#getModel_Body()
   * @model containment="true"
   * @generated
   */
  XBlockExpression getBody();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(XBlockExpression value);

} // Model
