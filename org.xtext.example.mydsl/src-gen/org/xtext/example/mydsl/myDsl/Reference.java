/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Reference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReference_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Reference#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

} // Reference
