/**
 */
package javaMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.JMethod#getJparameter <em>Jparameter</em>}</li>
 * </ul>
 *
 * @see javaMetaModel.JavaMetaModelPackage#getJMethod()
 * @model
 * @generated
 */
public interface JMethod extends JFeature {
	/**
	 * Returns the value of the '<em><b>Jparameter</b></em>' containment reference list.
	 * The list contents are of type {@link javaMetaModel.JParameter}.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JParameter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jparameter</em>' containment reference list.
	 * @see javaMetaModel.JavaMetaModelPackage#getJMethod_Jparameter()
	 * @see javaMetaModel.JParameter#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<JParameter> getJparameter();

} // JMethod
