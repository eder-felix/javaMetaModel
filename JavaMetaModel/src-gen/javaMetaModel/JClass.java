/**
 */
package javaMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.JClass#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link javaMetaModel.JClass#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link javaMetaModel.JClass#getJfeature <em>Jfeature</em>}</li>
 *   <li>{@link javaMetaModel.JClass#getOwner <em>Owner</em>}</li>
 *   <li>{@link javaMetaModel.JClass#getJsubClass <em>Jsub Class</em>}</li>
 *   <li>{@link javaMetaModel.JClass#getJsuperClass <em>Jsuper Class</em>}</li>
 * </ul>
 *
 * @see javaMetaModel.JavaMetaModelPackage#getJClass()
 * @model
 * @generated
 */
public interface JClass extends JElement {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see javaMetaModel.JavaMetaModelPackage#getJClass_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link javaMetaModel.JClass#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Final</em>' attribute.
	 * @see #setIsFinal(boolean)
	 * @see javaMetaModel.JavaMetaModelPackage#getJClass_IsFinal()
	 * @model
	 * @generated
	 */
	boolean isIsFinal();

	/**
	 * Sets the value of the '{@link javaMetaModel.JClass#isIsFinal <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final</em>' attribute.
	 * @see #isIsFinal()
	 * @generated
	 */
	void setIsFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Jfeature</b></em>' containment reference list.
	 * The list contents are of type {@link javaMetaModel.JFeature}.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JFeature#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jfeature</em>' containment reference list.
	 * @see javaMetaModel.JavaMetaModelPackage#getJClass_Jfeature()
	 * @see javaMetaModel.JFeature#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<JFeature> getJfeature();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JPackage#getJclass <em>Jclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(JPackage)
	 * @see javaMetaModel.JavaMetaModelPackage#getJClass_Owner()
	 * @see javaMetaModel.JPackage#getJclass
	 * @model opposite="jclass" transient="false"
	 * @generated
	 */
	JPackage getOwner();

	/**
	 * Sets the value of the '{@link javaMetaModel.JClass#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(JPackage value);

	/**
	 * Returns the value of the '<em><b>Jsub Class</b></em>' reference list.
	 * The list contents are of type {@link javaMetaModel.JClass}.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JClass#getJsuperClass <em>Jsuper Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsub Class</em>' reference list.
	 * @see javaMetaModel.JavaMetaModelPackage#getJClass_JsubClass()
	 * @see javaMetaModel.JClass#getJsuperClass
	 * @model opposite="jsuperClass"
	 * @generated
	 */
	EList<JClass> getJsubClass();

	/**
	 * Returns the value of the '<em><b>Jsuper Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JClass#getJsubClass <em>Jsub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jsuper Class</em>' reference.
	 * @see #setJsuperClass(JClass)
	 * @see javaMetaModel.JavaMetaModelPackage#getJClass_JsuperClass()
	 * @see javaMetaModel.JClass#getJsubClass
	 * @model opposite="jsubClass"
	 * @generated
	 */
	JClass getJsuperClass();

	/**
	 * Sets the value of the '{@link javaMetaModel.JClass#getJsuperClass <em>Jsuper Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jsuper Class</em>' reference.
	 * @see #getJsuperClass()
	 * @generated
	 */
	void setJsuperClass(JClass value);

} // JClass
