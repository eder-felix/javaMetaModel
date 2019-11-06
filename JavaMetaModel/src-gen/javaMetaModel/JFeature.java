/**
 */
package javaMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JFeature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.JFeature#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link javaMetaModel.JFeature#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link javaMetaModel.JFeature#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see javaMetaModel.JavaMetaModelPackage#getJFeature()
 * @model abstract="true"
 * @generated
 */
public interface JFeature extends JElement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link javaMetaModel.Vis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see javaMetaModel.Vis
	 * @see #setVisibility(Vis)
	 * @see javaMetaModel.JavaMetaModelPackage#getJFeature_Visibility()
	 * @model
	 * @generated
	 */
	Vis getVisibility();

	/**
	 * Sets the value of the '{@link javaMetaModel.JFeature#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see javaMetaModel.Vis
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Vis value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(boolean)
	 * @see javaMetaModel.JavaMetaModelPackage#getJFeature_IsStatic()
	 * @model
	 * @generated
	 */
	boolean isIsStatic();

	/**
	 * Sets the value of the '{@link javaMetaModel.JFeature#isIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #isIsStatic()
	 * @generated
	 */
	void setIsStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JClass#getJfeature <em>Jfeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(JClass)
	 * @see javaMetaModel.JavaMetaModelPackage#getJFeature_Owner()
	 * @see javaMetaModel.JClass#getJfeature
	 * @model opposite="jfeature" transient="false"
	 * @generated
	 */
	JClass getOwner();

	/**
	 * Sets the value of the '{@link javaMetaModel.JFeature#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(JClass value);

} // JFeature
