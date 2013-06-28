/**
 */
package org.eclipse.xtext.mqrepl.modelQueryLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.ModelQueryLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface ModelQueryLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "modelQueryLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/mqrepl/ModelQueryLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "modelQueryLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ModelQueryLanguagePackage eINSTANCE = org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelQueryLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelImpl
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__METHODS = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BODY = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl <em>XMethod Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getXMethodDeclaration()
   * @generated
   */
  int XMETHOD_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMETHOD_DECLARATION__TYPE_PARAMETERS = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMETHOD_DECLARATION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMETHOD_DECLARATION__NAME = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMETHOD_DECLARATION__PARAMETERS = 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMETHOD_DECLARATION__BODY = 4;

  /**
   * The number of structural features of the '<em>XMethod Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XMETHOD_DECLARATION_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getMethods()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Methods();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.Model#getBody()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration <em>XMethod Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XMethod Declaration</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration
   * @generated
   */
  EClass getXMethodDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getTypeParameters <em>Type Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getTypeParameters()
   * @see #getXMethodDeclaration()
   * @generated
   */
  EReference getXMethodDeclaration_TypeParameters();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getType()
   * @see #getXMethodDeclaration()
   * @generated
   */
  EReference getXMethodDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getName()
   * @see #getXMethodDeclaration()
   * @generated
   */
  EAttribute getXMethodDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getParameters()
   * @see #getXMethodDeclaration()
   * @generated
   */
  EReference getXMethodDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.XMethodDeclaration#getBody()
   * @see #getXMethodDeclaration()
   * @generated
   */
  EReference getXMethodDeclaration_Body();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ModelQueryLanguageFactory getModelQueryLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelImpl
     * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__METHODS = eINSTANCE.getModel_Methods();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BODY = eINSTANCE.getModel_Body();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl <em>XMethod Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.XMethodDeclarationImpl
     * @see org.eclipse.xtext.mqrepl.modelQueryLanguage.impl.ModelQueryLanguagePackageImpl#getXMethodDeclaration()
     * @generated
     */
    EClass XMETHOD_DECLARATION = eINSTANCE.getXMethodDeclaration();

    /**
     * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XMETHOD_DECLARATION__TYPE_PARAMETERS = eINSTANCE.getXMethodDeclaration_TypeParameters();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XMETHOD_DECLARATION__TYPE = eINSTANCE.getXMethodDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XMETHOD_DECLARATION__NAME = eINSTANCE.getXMethodDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XMETHOD_DECLARATION__PARAMETERS = eINSTANCE.getXMethodDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XMETHOD_DECLARATION__BODY = eINSTANCE.getXMethodDeclaration_Body();

  }

} //ModelQueryLanguagePackage
