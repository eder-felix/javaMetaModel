/**
 */
package javaMetaModel.impl;

import java.util.Collection;

import javaMetaModel.JClass;
import javaMetaModel.JFeature;
import javaMetaModel.JPackage;
import javaMetaModel.JavaMetaModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link javaMetaModel.impl.JClassImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link javaMetaModel.impl.JClassImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link javaMetaModel.impl.JClassImpl#getJfeature <em>Jfeature</em>}</li>
 *   <li>{@link javaMetaModel.impl.JClassImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link javaMetaModel.impl.JClassImpl#getJsubClass <em>Jsub Class</em>}</li>
 *   <li>{@link javaMetaModel.impl.JClassImpl#getJsuperClass <em>Jsuper Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JClassImpl extends JElementImpl implements JClass {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinal = IS_FINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getJfeature() <em>Jfeature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJfeature()
	 * @generated
	 * @ordered
	 */
	protected EList<JFeature> jfeature;

	/**
	 * The cached value of the '{@link #getJsubClass() <em>Jsub Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsubClass()
	 * @generated
	 * @ordered
	 */
	protected EList<JClass> jsubClass;

	/**
	 * The cached value of the '{@link #getJsuperClass() <em>Jsuper Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJsuperClass()
	 * @generated
	 * @ordered
	 */
	protected JClass jsuperClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaMetaModelPackage.Literals.JCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMetaModelPackage.JCLASS__IS_ABSTRACT,
					oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinal() {
		return isFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinal(boolean newIsFinal) {
		boolean oldIsFinal = isFinal;
		isFinal = newIsFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMetaModelPackage.JCLASS__IS_FINAL, oldIsFinal,
					isFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JFeature> getJfeature() {
		if (jfeature == null) {
			jfeature = new EObjectContainmentWithInverseEList<JFeature>(JFeature.class, this,
					JavaMetaModelPackage.JCLASS__JFEATURE, JavaMetaModelPackage.JFEATURE__OWNER);
		}
		return jfeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JPackage getOwner() {
		if (eContainerFeatureID() != JavaMetaModelPackage.JCLASS__OWNER)
			return null;
		return (JPackage) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(JPackage newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwner, JavaMetaModelPackage.JCLASS__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(JPackage newOwner) {
		if (newOwner != eInternalContainer()
				|| (eContainerFeatureID() != JavaMetaModelPackage.JCLASS__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this, JavaMetaModelPackage.JPACKAGE__JCLASS,
						JPackage.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMetaModelPackage.JCLASS__OWNER, newOwner,
					newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JClass> getJsubClass() {
		if (jsubClass == null) {
			jsubClass = new EObjectWithInverseResolvingEList<JClass>(JClass.class, this,
					JavaMetaModelPackage.JCLASS__JSUB_CLASS, JavaMetaModelPackage.JCLASS__JSUPER_CLASS);
		}
		return jsubClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass getJsuperClass() {
		if (jsuperClass != null && jsuperClass.eIsProxy()) {
			InternalEObject oldJsuperClass = (InternalEObject) jsuperClass;
			jsuperClass = (JClass) eResolveProxy(oldJsuperClass);
			if (jsuperClass != oldJsuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaMetaModelPackage.JCLASS__JSUPER_CLASS,
							oldJsuperClass, jsuperClass));
			}
		}
		return jsuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JClass basicGetJsuperClass() {
		return jsuperClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJsuperClass(JClass newJsuperClass, NotificationChain msgs) {
		JClass oldJsuperClass = jsuperClass;
		jsuperClass = newJsuperClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JavaMetaModelPackage.JCLASS__JSUPER_CLASS, oldJsuperClass, newJsuperClass);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJsuperClass(JClass newJsuperClass) {
		if (newJsuperClass != jsuperClass) {
			NotificationChain msgs = null;
			if (jsuperClass != null)
				msgs = ((InternalEObject) jsuperClass).eInverseRemove(this, JavaMetaModelPackage.JCLASS__JSUB_CLASS,
						JClass.class, msgs);
			if (newJsuperClass != null)
				msgs = ((InternalEObject) newJsuperClass).eInverseAdd(this, JavaMetaModelPackage.JCLASS__JSUB_CLASS,
						JClass.class, msgs);
			msgs = basicSetJsuperClass(newJsuperClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaMetaModelPackage.JCLASS__JSUPER_CLASS,
					newJsuperClass, newJsuperClass));
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
		case JavaMetaModelPackage.JCLASS__JFEATURE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJfeature()).basicAdd(otherEnd, msgs);
		case JavaMetaModelPackage.JCLASS__OWNER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwner((JPackage) otherEnd, msgs);
		case JavaMetaModelPackage.JCLASS__JSUB_CLASS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getJsubClass()).basicAdd(otherEnd, msgs);
		case JavaMetaModelPackage.JCLASS__JSUPER_CLASS:
			if (jsuperClass != null)
				msgs = ((InternalEObject) jsuperClass).eInverseRemove(this, JavaMetaModelPackage.JCLASS__JSUB_CLASS,
						JClass.class, msgs);
			return basicSetJsuperClass((JClass) otherEnd, msgs);
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
		case JavaMetaModelPackage.JCLASS__JFEATURE:
			return ((InternalEList<?>) getJfeature()).basicRemove(otherEnd, msgs);
		case JavaMetaModelPackage.JCLASS__OWNER:
			return basicSetOwner(null, msgs);
		case JavaMetaModelPackage.JCLASS__JSUB_CLASS:
			return ((InternalEList<?>) getJsubClass()).basicRemove(otherEnd, msgs);
		case JavaMetaModelPackage.JCLASS__JSUPER_CLASS:
			return basicSetJsuperClass(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case JavaMetaModelPackage.JCLASS__OWNER:
			return eInternalContainer().eInverseRemove(this, JavaMetaModelPackage.JPACKAGE__JCLASS, JPackage.class,
					msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JavaMetaModelPackage.JCLASS__IS_ABSTRACT:
			return isIsAbstract();
		case JavaMetaModelPackage.JCLASS__IS_FINAL:
			return isIsFinal();
		case JavaMetaModelPackage.JCLASS__JFEATURE:
			return getJfeature();
		case JavaMetaModelPackage.JCLASS__OWNER:
			return getOwner();
		case JavaMetaModelPackage.JCLASS__JSUB_CLASS:
			return getJsubClass();
		case JavaMetaModelPackage.JCLASS__JSUPER_CLASS:
			if (resolve)
				return getJsuperClass();
			return basicGetJsuperClass();
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
		case JavaMetaModelPackage.JCLASS__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case JavaMetaModelPackage.JCLASS__IS_FINAL:
			setIsFinal((Boolean) newValue);
			return;
		case JavaMetaModelPackage.JCLASS__JFEATURE:
			getJfeature().clear();
			getJfeature().addAll((Collection<? extends JFeature>) newValue);
			return;
		case JavaMetaModelPackage.JCLASS__OWNER:
			setOwner((JPackage) newValue);
			return;
		case JavaMetaModelPackage.JCLASS__JSUB_CLASS:
			getJsubClass().clear();
			getJsubClass().addAll((Collection<? extends JClass>) newValue);
			return;
		case JavaMetaModelPackage.JCLASS__JSUPER_CLASS:
			setJsuperClass((JClass) newValue);
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
		case JavaMetaModelPackage.JCLASS__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case JavaMetaModelPackage.JCLASS__IS_FINAL:
			setIsFinal(IS_FINAL_EDEFAULT);
			return;
		case JavaMetaModelPackage.JCLASS__JFEATURE:
			getJfeature().clear();
			return;
		case JavaMetaModelPackage.JCLASS__OWNER:
			setOwner((JPackage) null);
			return;
		case JavaMetaModelPackage.JCLASS__JSUB_CLASS:
			getJsubClass().clear();
			return;
		case JavaMetaModelPackage.JCLASS__JSUPER_CLASS:
			setJsuperClass((JClass) null);
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
		case JavaMetaModelPackage.JCLASS__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case JavaMetaModelPackage.JCLASS__IS_FINAL:
			return isFinal != IS_FINAL_EDEFAULT;
		case JavaMetaModelPackage.JCLASS__JFEATURE:
			return jfeature != null && !jfeature.isEmpty();
		case JavaMetaModelPackage.JCLASS__OWNER:
			return getOwner() != null;
		case JavaMetaModelPackage.JCLASS__JSUB_CLASS:
			return jsubClass != null && !jsubClass.isEmpty();
		case JavaMetaModelPackage.JCLASS__JSUPER_CLASS:
			return jsuperClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinal: ");
		result.append(isFinal);
		result.append(')');
		return result.toString();
	}

} //JClassImpl
