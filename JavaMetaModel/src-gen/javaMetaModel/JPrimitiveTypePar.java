/**
 */
package javaMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JPrimitive Type Par</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.JPrimitiveTypePar#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see javaMetaModel.JavaMetaModelPackage#getJPrimitiveTypePar()
 * @model
 * @generated
 */
public interface JPrimitiveTypePar extends JParameter {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The literals are from the enumeration {@link javaMetaModel.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see javaMetaModel.PrimitiveType
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see javaMetaModel.JavaMetaModelPackage#getJPrimitiveTypePar_PrimitiveType()
	 * @model
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link javaMetaModel.JPrimitiveTypePar#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see javaMetaModel.PrimitiveType
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

} // JPrimitiveTypePar
