/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.xtext.mqrepl.modelQueryLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.mqrepl.modelQueryLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelQueryLanguageFactoryImpl extends EFactoryImpl implements ModelQueryLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ModelQueryLanguageFactory init()
  {
    try
    {
      ModelQueryLanguageFactory theModelQueryLanguageFactory = (ModelQueryLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/mqrepl/ModelQueryLanguage"); 
      if (theModelQueryLanguageFactory != null)
      {
        return theModelQueryLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ModelQueryLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelQueryLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ModelQueryLanguagePackage.MODEL: return createModel();
      case ModelQueryLanguagePackage.IMPORT: return createImport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelQueryLanguagePackage getModelQueryLanguagePackage()
  {
    return (ModelQueryLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ModelQueryLanguagePackage getPackage()
  {
    return ModelQueryLanguagePackage.eINSTANCE;
  }

} //ModelQueryLanguageFactoryImpl
