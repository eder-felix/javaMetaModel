/**
 */
package javaMetaModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see javaMetaModel.JavaMetaModelPackage
 * @generated
 */
public interface JavaMetaModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaMetaModelFactory eINSTANCE = javaMetaModel.impl.JavaMetaModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JElement</em>'.
	 * @generated
	 */
	JElement createJElement();

	/**
	 * Returns a new object of class '<em>JMethod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JMethod</em>'.
	 * @generated
	 */
	JMethod createJMethod();

	/**
	 * Returns a new object of class '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JClass</em>'.
	 * @generated
	 */
	JClass createJClass();

	/**
	 * Returns a new object of class '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPackage</em>'.
	 * @generated
	 */
	JPackage createJPackage();

	/**
	 * Returns a new object of class '<em>JAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JAttribute</em>'.
	 * @generated
	 */
	JAttribute createJAttribute();

	/**
	 * Returns a new object of class '<em>JReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JReference</em>'.
	 * @generated
	 */
	JReference createJReference();

	/**
	 * Returns a new object of class '<em>JPrimitive Type Par</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JPrimitive Type Par</em>'.
	 * @generated
	 */
	JPrimitiveTypePar createJPrimitiveTypePar();

	/**
	 * Returns a new object of class '<em>JReference Type Par</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JReference Type Par</em>'.
	 * @generated
	 */
	JReferenceTypePar createJReferenceTypePar();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaMetaModelPackage getJavaMetaModelPackage();

} //JavaMetaModelFactory
