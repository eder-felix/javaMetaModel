/**
 */
package javaMetaModel.impl;

import java.util.Collection;

import javaMetaModel.JClass;
import javaMetaModel.JPackage;
import javaMetaModel.JavaMetaModelPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.impl.JPackageImpl#getJclass <em>Jclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JPackageImpl extends JElementImpl implements JPackage {
	/**
	 * The cached value of the '{@link #getJclass() <em>Jclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJclass()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> jclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMetaModelPackage.Literals.JPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getJclass() {
		if (jclass == null) {
			jclass = new EObjectContainmentWithInverseEList<JClass>(JClass.class, this,
					JavaMetaModelPackage.JPACKAGE__JCLASS, JavaMetaModelPackage.JCLASS__OWNER);
		}
		return jclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaMetaModelPackage.JPACKAGE__JCLASS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJclass()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JavaMetaModelPackage.JPACKAGE__JCLASS:
			return ((InternalEList<?>) getJclass()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavaMetaModelPackage.JPACKAGE__JCLASS:
			return getJclass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JavaMetaModelPackage.JPACKAGE__JCLASS:
			getJclass().clear();
			getJclass().addAll((Collection<? extends JClass>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JavaMetaModelPackage.JPACKAGE__JCLASS:
			getJclass().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JavaMetaModelPackage.JPACKAGE__JCLASS:
			return jclass != null && !jclass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JPackageImpl
