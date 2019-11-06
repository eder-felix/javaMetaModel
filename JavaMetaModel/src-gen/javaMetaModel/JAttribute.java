/**
 */
package javaMetaModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.JAttribute#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 *
 * @see javaMetaModel.JavaMetaModelPackage#getJAttribute()
 * @model
 * @generated
 */
public interface JAttribute extends JField {
	/**
	 * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
	 * The literals are from the enumeration {@link javaMetaModel.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Type</em>' attribute.
	 * @see javaMetaModel.PrimitiveType
	 * @see #setPrimitiveType(PrimitiveType)
	 * @see javaMetaModel.JavaMetaModelPackage#getJAttribute_PrimitiveType()
	 * @model
	 * @generated
	 */
	PrimitiveType getPrimitiveType();

	/**
	 * Sets the value of the '{@link javaMetaModel.JAttribute#getPrimitiveType <em>Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Type</em>' attribute.
	 * @see javaMetaModel.PrimitiveType
	 * @see #getPrimitiveType()
	 * @generated
	 */
	void setPrimitiveType(PrimitiveType value);

} // JAttribute
