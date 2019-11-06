/**
 */
package javaMetaModel.util;

import javaMetaModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see javaMetaModel.JavaMetaModelPackage
 * @generated
 */
public class JavaMetaModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaMetaModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMetaModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaMetaModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaMetaModelSwitch<Adapter> modelSwitch = new JavaMetaModelSwitch<Adapter>() {
		@Override
		public Adapter caseJElement(JElement object) {
			return createJElementAdapter();
		}

		@Override
		public Adapter caseJMethod(JMethod object) {
			return createJMethodAdapter();
		}

		@Override
		public Adapter caseJClass(JClass object) {
			return createJClassAdapter();
		}

		@Override
		public Adapter caseJPackage(JPackage object) {
			return createJPackageAdapter();
		}

		@Override
		public Adapter caseJField(JField object) {
			return createJFieldAdapter();
		}

		@Override
		public Adapter caseJAttribute(JAttribute object) {
			return createJAttributeAdapter();
		}

		@Override
		public Adapter caseJReference(JReference object) {
			return createJReferenceAdapter();
		}

		@Override
		public Adapter caseJParameter(JParameter object) {
			return createJParameterAdapter();
		}

		@Override
		public Adapter caseJPrimitiveTypePar(JPrimitiveTypePar object) {
			return createJPrimitiveTypeParAdapter();
		}

		@Override
		public Adapter caseJReferenceTypePar(JReferenceTypePar object) {
			return createJReferenceTypeParAdapter();
		}

		@Override
		public Adapter caseJFeature(JFeature object) {
			return createJFeatureAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JElement
	 * @generated
	 */
	public Adapter createJElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JMethod
	 * @generated
	 */
	public Adapter createJMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JClass
	 * @generated
	 */
	public Adapter createJClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JPackage
	 * @generated
	 */
	public Adapter createJPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JField <em>JField</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JField
	 * @generated
	 */
	public Adapter createJFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JAttribute <em>JAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JAttribute
	 * @generated
	 */
	public Adapter createJAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JReference <em>JReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JReference
	 * @generated
	 */
	public Adapter createJReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JParameter
	 * @generated
	 */
	public Adapter createJParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JPrimitiveTypePar <em>JPrimitive Type Par</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JPrimitiveTypePar
	 * @generated
	 */
	public Adapter createJPrimitiveTypeParAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JReferenceTypePar <em>JReference Type Par</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JReferenceTypePar
	 * @generated
	 */
	public Adapter createJReferenceTypeParAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaMetaModel.JFeature <em>JFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaMetaModel.JFeature
	 * @generated
	 */
	public Adapter createJFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaMetaModelAdapterFactory
