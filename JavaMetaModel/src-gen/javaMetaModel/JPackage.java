/**
 */
package javaMetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.JPackage#getJclass <em>Jclass</em>}</li>
 * </ul>
 *
 * @see javaMetaModel.JavaMetaModelPackage#getJPackage()
 * @model
 * @generated
 */
public interface JPackage extends JElement {
	/**
	 * Returns the value of the '<em><b>Jclass</b></em>' containment reference list.
	 * The list contents are of type {@link javaMetaModel.JClass}.
	 * It is bidirectional and its opposite is '{@link javaMetaModel.JClass#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jclass</em>' containment reference list.
	 * @see javaMetaModel.JavaMetaModelPackage#getJPackage_Jclass()
	 * @see javaMetaModel.JClass#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<JClass> getJclass();

} // JPackage
