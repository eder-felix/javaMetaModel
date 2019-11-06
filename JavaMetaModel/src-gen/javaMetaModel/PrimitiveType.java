/**
 */
package javaMetaModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see javaMetaModel.JavaMetaModelPackage#getPrimitiveType()
 * @model
 * @generated
 */
public enum PrimitiveType implements Enumerator {
	/**
	 * The '<em><b>JByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	JBYTE(0, "JByte", "JByte"),

	/**
	 * The '<em><b>JShort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSHORT_VALUE
	 * @generated
	 * @ordered
	 */
	JSHORT(1, "JShort", "JShort"),

	/**
	 * The '<em><b>JInt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JINT_VALUE
	 * @generated
	 * @ordered
	 */
	JINT(2, "JInt", "JInt"),

	/**
	 * The '<em><b>JLong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JLONG_VALUE
	 * @generated
	 * @ordered
	 */
	JLONG(3, "JLong", "JLong"),

	/**
	 * The '<em><b>JChar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JCHAR_VALUE
	 * @generated
	 * @ordered
	 */
	JCHAR(4, "JChar", "JChar"),

	/**
	 * The '<em><b>JFloat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JFLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	JFLOAT(5, "JFloat", "JFloat"),

	/**
	 * The '<em><b>JDouble</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JDOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	JDOUBLE(6, "JDouble", "JDouble"),

	/**
	 * The '<em><b>JBoolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JBOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	JBOOLEAN(7, "JBoolean", "JBoolean");

	/**
	 * The '<em><b>JByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JBYTE
	 * @model name="JByte"
	 * @generated
	 * @ordered
	 */
	public static final int JBYTE_VALUE = 0;

	/**
	 * The '<em><b>JShort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSHORT
	 * @model name="JShort"
	 * @generated
	 * @ordered
	 */
	public static final int JSHORT_VALUE = 1;

	/**
	 * The '<em><b>JInt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JINT
	 * @model name="JInt"
	 * @generated
	 * @ordered
	 */
	public static final int JINT_VALUE = 2;

	/**
	 * The '<em><b>JLong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JLONG
	 * @model name="JLong"
	 * @generated
	 * @ordered
	 */
	public static final int JLONG_VALUE = 3;

	/**
	 * The '<em><b>JChar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JCHAR
	 * @model name="JChar"
	 * @generated
	 * @ordered
	 */
	public static final int JCHAR_VALUE = 4;

	/**
	 * The '<em><b>JFloat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JFLOAT
	 * @model name="JFloat"
	 * @generated
	 * @ordered
	 */
	public static final int JFLOAT_VALUE = 5;

	/**
	 * The '<em><b>JDouble</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JDOUBLE
	 * @model name="JDouble"
	 * @generated
	 * @ordered
	 */
	public static final int JDOUBLE_VALUE = 6;

	/**
	 * The '<em><b>JBoolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JBOOLEAN
	 * @model name="JBoolean"
	 * @generated
	 * @ordered
	 */
	public static final int JBOOLEAN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveType[] VALUES_ARRAY = new PrimitiveType[] { JBYTE, JSHORT, JINT, JLONG, JCHAR, JFLOAT,
			JDOUBLE, JBOOLEAN, };

	/**
	 * A public read-only list of all the '<em><b>Primitive Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveType get(int value) {
		switch (value) {
		case JBYTE_VALUE:
			return JBYTE;
		case JSHORT_VALUE:
			return JSHORT;
		case JINT_VALUE:
			return JINT;
		case JLONG_VALUE:
			return JLONG;
		case JCHAR_VALUE:
			return JCHAR;
		case JFLOAT_VALUE:
			return JFLOAT;
		case JDOUBLE_VALUE:
			return JDOUBLE;
		case JBOOLEAN_VALUE:
			return JBOOLEAN;
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
	private PrimitiveType(int value, String name, String literal) {
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

} //PrimitiveType
