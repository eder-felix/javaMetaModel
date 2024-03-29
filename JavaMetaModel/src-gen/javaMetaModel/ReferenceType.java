/**
 */
package javaMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reference Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see javaMetaModel.JavaMetaModelPackage#getReferenceType()
 * @model
 * @generated
 */
public enum ReferenceType implements Enumerator {
	/**
	 * The '<em><b>JClass Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JCLASS_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	JCLASS_TYPE(0, "JClassType", "JClassType"),

	/**
	 * The '<em><b>JInterface Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JINTERFACE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	JINTERFACE_TYPE(1, "JInterfaceType", "JInterfaceType"),

	/**
	 * The '<em><b>JArray Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JARRAY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	JARRAY_TYPE(2, "JArrayType", "JArrayType");

	/**
	 * The '<em><b>JClass Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JCLASS_TYPE
	 * @model name="JClassType"
	 * @generated
	 * @ordered
	 */
	public static final int JCLASS_TYPE_VALUE = 0;

	/**
	 * The '<em><b>JInterface Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JINTERFACE_TYPE
	 * @model name="JInterfaceType"
	 * @generated
	 * @ordered
	 */
	public static final int JINTERFACE_TYPE_VALUE = 1;

	/**
	 * The '<em><b>JArray Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JARRAY_TYPE
	 * @model name="JArrayType"
	 * @generated
	 * @ordered
	 */
	public static final int JARRAY_TYPE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceType[] VALUES_ARRAY = new ReferenceType[] { JCLASS_TYPE, JINTERFACE_TYPE,
			JARRAY_TYPE, };

	/**
	 * A public read-only list of all the '<em><b>Reference Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceType get(int value) {
		switch (value) {
		case JCLASS_TYPE_VALUE:
			return JCLASS_TYPE;
		case JINTERFACE_TYPE_VALUE:
			return JINTERFACE_TYPE;
		case JARRAY_TYPE_VALUE:
			return JARRAY_TYPE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReferenceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ReferenceType
