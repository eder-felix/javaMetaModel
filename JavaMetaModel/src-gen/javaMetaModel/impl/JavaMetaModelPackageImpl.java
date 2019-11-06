/**
 */
package javaMetaModel.impl;

import javaMetaModel.Direction;
import javaMetaModel.JAttribute;
import javaMetaModel.JClass;
import javaMetaModel.JElement;
import javaMetaModel.JFeature;
import javaMetaModel.JField;
import javaMetaModel.JMethod;
import javaMetaModel.JPackage;
import javaMetaModel.JParameter;
import javaMetaModel.JPrimitiveTypePar;
import javaMetaModel.JReference;
import javaMetaModel.JReferenceTypePar;
import javaMetaModel.JavaMetaModelFactory;
import javaMetaModel.JavaMetaModelPackage;
import javaMetaModel.PrimitiveType;
import javaMetaModel.ReferenceType;
import javaMetaModel.Vis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaMetaModelPackageImpl extends EPackageImpl implements JavaMetaModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jPrimitiveTypeParEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jReferenceTypeParEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see javaMetaModel.JavaMetaModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaMetaModelPackageImpl() {
		super(eNS_URI, JavaMetaModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JavaMetaModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaMetaModelPackage init() {
		if (isInited)
			return (JavaMetaModelPackage) EPackage.Registry.INSTANCE.getEPackage(JavaMetaModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJavaMetaModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JavaMetaModelPackageImpl theJavaMetaModelPackage = registeredJavaMetaModelPackage instanceof JavaMetaModelPackageImpl
				? (JavaMetaModelPackageImpl) registeredJavaMetaModelPackage
				: new JavaMetaModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJavaMetaModelPackage.createPackageContents();

		// Initialize created meta-data
		theJavaMetaModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaMetaModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaMetaModelPackage.eNS_URI, theJavaMetaModelPackage);
		return theJavaMetaModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJElement() {
		return jElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJElement_Name() {
		return (EAttribute) jElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJMethod() {
		return jMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJMethod_Jparameter() {
		return (EReference) jMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJClass() {
		return jClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_IsAbstract() {
		return (EAttribute) jClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJClass_IsFinal() {
		return (EAttribute) jClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Jfeature() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_Owner() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_JsubClass() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJClass_JsuperClass() {
		return (EReference) jClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPackage() {
		return jPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJPackage_Jclass() {
		return (EReference) jPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJField() {
		return jFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAttribute() {
		return jAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAttribute_PrimitiveType() {
		return (EAttribute) jAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJReference() {
		return jReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJReference_RefType() {
		return (EAttribute) jReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJParameter() {
		return jParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJParameter_Direction() {
		return (EAttribute) jParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJParameter_Owner() {
		return (EReference) jParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJPrimitiveTypePar() {
		return jPrimitiveTypeParEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJPrimitiveTypePar_PrimitiveType() {
		return (EAttribute) jPrimitiveTypeParEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJReferenceTypePar() {
		return jReferenceTypeParEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJReferenceTypePar_RefType() {
		return (EAttribute) jReferenceTypeParEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJFeature() {
		return jFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJFeature_Visibility() {
		return (EAttribute) jFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJFeature_IsStatic() {
		return (EAttribute) jFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJFeature_Owner() {
		return (EReference) jFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVis() {
		return visEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveType() {
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceType() {
		return referenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMetaModelFactory getJavaMetaModelFactory() {
		return (JavaMetaModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		jElementEClass = createEClass(JELEMENT);
		createEAttribute(jElementEClass, JELEMENT__NAME);

		jMethodEClass = createEClass(JMETHOD);
		createEReference(jMethodEClass, JMETHOD__JPARAMETER);

		jClassEClass = createEClass(JCLASS);
		createEAttribute(jClassEClass, JCLASS__IS_ABSTRACT);
		createEAttribute(jClassEClass, JCLASS__IS_FINAL);
		createEReference(jClassEClass, JCLASS__JFEATURE);
		createEReference(jClassEClass, JCLASS__OWNER);
		createEReference(jClassEClass, JCLASS__JSUB_CLASS);
		createEReference(jClassEClass, JCLASS__JSUPER_CLASS);

		jPackageEClass = createEClass(JPACKAGE);
		createEReference(jPackageEClass, JPACKAGE__JCLASS);

		jFieldEClass = createEClass(JFIELD);

		jAttributeEClass = createEClass(JATTRIBUTE);
		createEAttribute(jAttributeEClass, JATTRIBUTE__PRIMITIVE_TYPE);

		jReferenceEClass = createEClass(JREFERENCE);
		createEAttribute(jReferenceEClass, JREFERENCE__REF_TYPE);

		jParameterEClass = createEClass(JPARAMETER);
		createEAttribute(jParameterEClass, JPARAMETER__DIRECTION);
		createEReference(jParameterEClass, JPARAMETER__OWNER);

		jPrimitiveTypeParEClass = createEClass(JPRIMITIVE_TYPE_PAR);
		createEAttribute(jPrimitiveTypeParEClass, JPRIMITIVE_TYPE_PAR__PRIMITIVE_TYPE);

		jReferenceTypeParEClass = createEClass(JREFERENCE_TYPE_PAR);
		createEAttribute(jReferenceTypeParEClass, JREFERENCE_TYPE_PAR__REF_TYPE);

		jFeatureEClass = createEClass(JFEATURE);
		createEAttribute(jFeatureEClass, JFEATURE__VISIBILITY);
		createEAttribute(jFeatureEClass, JFEATURE__IS_STATIC);
		createEReference(jFeatureEClass, JFEATURE__OWNER);

		// Create enums
		visEEnum = createEEnum(VIS);
		primitiveTypeEEnum = createEEnum(PRIMITIVE_TYPE);
		referenceTypeEEnum = createEEnum(REFERENCE_TYPE);
		directionEEnum = createEEnum(DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jMethodEClass.getESuperTypes().add(this.getJFeature());
		jClassEClass.getESuperTypes().add(this.getJElement());
		jPackageEClass.getESuperTypes().add(this.getJElement());
		jFieldEClass.getESuperTypes().add(this.getJFeature());
		jAttributeEClass.getESuperTypes().add(this.getJField());
		jReferenceEClass.getESuperTypes().add(this.getJField());
		jParameterEClass.getESuperTypes().add(this.getJElement());
		jPrimitiveTypeParEClass.getESuperTypes().add(this.getJParameter());
		jReferenceTypeParEClass.getESuperTypes().add(this.getJParameter());
		jFeatureEClass.getESuperTypes().add(this.getJElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(jElementEClass, JElement.class, "JElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, JElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jMethodEClass, JMethod.class, "JMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJMethod_Jparameter(), this.getJParameter(), this.getJParameter_Owner(), "jparameter", null, 0,
				-1, JMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jClassEClass, JClass.class, "JClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJClass_IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", null, 0, 1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJClass_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, JClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Jfeature(), this.getJFeature(), this.getJFeature_Owner(), "jfeature", null, 0, -1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_Owner(), this.getJPackage(), this.getJPackage_Jclass(), "owner", null, 0, 1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_JsubClass(), this.getJClass(), this.getJClass_JsuperClass(), "jsubClass", null, 0, -1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJClass_JsuperClass(), this.getJClass(), this.getJClass_JsubClass(), "jsuperClass", null, 0, 1,
				JClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jPackageEClass, JPackage.class, "JPackage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJPackage_Jclass(), this.getJClass(), this.getJClass_Owner(), "jclass", null, 0, -1,
				JPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jFieldEClass, JField.class, "JField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jAttributeEClass, JAttribute.class, "JAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJAttribute_PrimitiveType(), this.getPrimitiveType(), "primitiveType", null, 0, 1,
				JAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(jReferenceEClass, JReference.class, "JReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJReference_RefType(), ecorePackage.getEString(), "refType", null, 0, 1, JReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jParameterEClass, JParameter.class, "JParameter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJParameter_Direction(), this.getDirection(), "direction", null, 0, 1, JParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJParameter_Owner(), this.getJMethod(), this.getJMethod_Jparameter(), "owner", null, 0, 1,
				JParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jPrimitiveTypeParEClass, JPrimitiveTypePar.class, "JPrimitiveTypePar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJPrimitiveTypePar_PrimitiveType(), this.getPrimitiveType(), "primitiveType", null, 0, 1,
				JPrimitiveTypePar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(jReferenceTypeParEClass, JReferenceTypePar.class, "JReferenceTypePar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJReferenceTypePar_RefType(), ecorePackage.getEString(), "refType", null, 0, 1,
				JReferenceTypePar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(jFeatureEClass, JFeature.class, "JFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJFeature_Visibility(), this.getVis(), "visibility", null, 0, 1, JFeature.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJFeature_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, JFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJFeature_Owner(), this.getJClass(), this.getJClass_Jfeature(), "owner", null, 0, 1,
				JFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visEEnum, Vis.class, "Vis");
		addEEnumLiteral(visEEnum, Vis.PUBLIC);
		addEEnumLiteral(visEEnum, Vis.PRIVATE);
		addEEnumLiteral(visEEnum, Vis.PROTECTED);

		initEEnum(primitiveTypeEEnum, PrimitiveType.class, "PrimitiveType");
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JBYTE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JSHORT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JINT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JLONG);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JCHAR);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JFLOAT);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JDOUBLE);
		addEEnumLiteral(primitiveTypeEEnum, PrimitiveType.JBOOLEAN);

		initEEnum(referenceTypeEEnum, ReferenceType.class, "ReferenceType");
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.JCLASS_TYPE);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.JINTERFACE_TYPE);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.JARRAY_TYPE);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.INPUT);
		addEEnumLiteral(directionEEnum, Direction.RETURN);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaMetaModelPackageImpl
