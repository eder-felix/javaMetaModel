/**
 */
package javaMetaModel.util;

import javaMetaModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see javaMetaModel.JavaMetaModelPackage
 * @generated
 */
public class JavaMetaModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMetaModelSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case JavaMetaModelPackage.JELEMENT: {
			JElement jElement = (JElement) theEObject;
			T result = caseJElement(jElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JMETHOD: {
			JMethod jMethod = (JMethod) theEObject;
			T result = caseJMethod(jMethod);
			if (result == null)
				result = caseJFeature(jMethod);
			if (result == null)
				result = caseJElement(jMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JCLASS: {
			JClass jClass = (JClass) theEObject;
			T result = caseJClass(jClass);
			if (result == null)
				result = caseJElement(jClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JPACKAGE: {
			JPackage jPackage = (JPackage) theEObject;
			T result = caseJPackage(jPackage);
			if (result == null)
				result = caseJElement(jPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JFIELD: {
			JField jField = (JField) theEObject;
			T result = caseJField(jField);
			if (result == null)
				result = caseJFeature(jField);
			if (result == null)
				result = caseJElement(jField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JATTRIBUTE: {
			JAttribute jAttribute = (JAttribute) theEObject;
			T result = caseJAttribute(jAttribute);
			if (result == null)
				result = caseJField(jAttribute);
			if (result == null)
				result = caseJFeature(jAttribute);
			if (result == null)
				result = caseJElement(jAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JREFERENCE: {
			JReference jReference = (JReference) theEObject;
			T result = caseJReference(jReference);
			if (result == null)
				result = caseJField(jReference);
			if (result == null)
				result = caseJFeature(jReference);
			if (result == null)
				result = caseJElement(jReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JPARAMETER: {
			JParameter jParameter = (JParameter) theEObject;
			T result = caseJParameter(jParameter);
			if (result == null)
				result = caseJElement(jParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JPRIMITIVE_TYPE_PAR: {
			JPrimitiveTypePar jPrimitiveTypePar = (JPrimitiveTypePar) theEObject;
			T result = caseJPrimitiveTypePar(jPrimitiveTypePar);
			if (result == null)
				result = caseJParameter(jPrimitiveTypePar);
			if (result == null)
				result = caseJElement(jPrimitiveTypePar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JREFERENCE_TYPE_PAR: {
			JReferenceTypePar jReferenceTypePar = (JReferenceTypePar) theEObject;
			T result = caseJReferenceTypePar(jReferenceTypePar);
			if (result == null)
				result = caseJParameter(jReferenceTypePar);
			if (result == null)
				result = caseJElement(jReferenceTypePar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JavaMetaModelPackage.JFEATURE: {
			JFeature jFeature = (JFeature) theEObject;
			T result = caseJFeature(jFeature);
			if (result == null)
				result = caseJElement(jFeature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJElement(JElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJMethod(JMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJClass(JClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPackage(JPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JField</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JField</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJField(JField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJAttribute(JAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJReference(JReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJParameter(JParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JPrimitive Type Par</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JPrimitive Type Par</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJPrimitiveTypePar(JPrimitiveTypePar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JReference Type Par</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JReference Type Par</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJReferenceTypePar(JReferenceTypePar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JFeature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JFeature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJFeature(JFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JavaMetaModelSwitch
