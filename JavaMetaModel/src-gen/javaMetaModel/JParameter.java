/**
 */
package javaMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.JParameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link javaMetaModel.JParameter#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see javaMetaModel.JavaMetaModelPackage#getJParameter()
 * @model abstract="true"
 * @generated
 */
public interface JParameter extends JElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link javaMetaModel.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see javaMetaModel.Direction
	 * @see #setDirection(Direction)
	 * @see javaMetaModel.JavaMetaModelPackage#getJParameter_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link javaMetaModel.JParameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see javaMetaModel.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JMethod#getJparameter <em>Jparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(JMethod)
	 * @see javaMetaModel.JavaMetaModelPackage#getJParameter_Owner()
	 * @see javaMetaModel.JMethod#getJparameter
	 * @model opposite="jparameter" transient="false"
	 * @generated
	 */
	JMethod getOwner();

	/**
	 * Sets the value of the '{@link javaMetaModel.JParameter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(JMethod value);

} // JParameter
