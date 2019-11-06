/**
 */
package javaMetaModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see javaMetaModel.JavaMetaModelFactory
 * @model kind="package"
 * @generated
 */
public interface JavaMetaModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaMetaModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/javaMetaModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaMetaModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaMetaModelPackage eINSTANCE = javaMetaModel.impl.JavaMetaModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JElementImpl <em>JElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JElementImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJElement()
	 * @generated
	 */
	int JELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>JElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JFeatureImpl <em>JFeature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JFeatureImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJFeature()
	 * @generated
	 */
	int JFEATURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFEATURE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFEATURE__VISIBILITY = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFEATURE__IS_STATIC = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFEATURE__OWNER = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFEATURE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>JFeature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFEATURE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JMethodImpl <em>JMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JMethodImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJMethod()
	 * @generated
	 */
	int JMETHOD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__NAME = JFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__VISIBILITY = JFEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__IS_STATIC = JFEATURE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__OWNER = JFEATURE__OWNER;

	/**
	 * The feature id for the '<em><b>Jparameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD__JPARAMETER = JFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD_FEATURE_COUNT = JFEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JMETHOD_OPERATION_COUNT = JFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JClassImpl <em>JClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JClassImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJClass()
	 * @generated
	 */
	int JCLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__IS_ABSTRACT = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__IS_FINAL = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Jfeature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JFEATURE = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__OWNER = JELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jsub Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JSUB_CLASS = JELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Jsuper Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS__JSUPER_CLASS = JELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>JClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JCLASS_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JPackageImpl <em>JPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JPackageImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJPackage()
	 * @generated
	 */
	int JPACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Jclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE__JCLASS = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPACKAGE_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JFieldImpl <em>JField</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JFieldImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJField()
	 * @generated
	 */
	int JFIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__NAME = JFEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__VISIBILITY = JFEATURE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__IS_STATIC = JFEATURE__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD__OWNER = JFEATURE__OWNER;

	/**
	 * The number of structural features of the '<em>JField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD_FEATURE_COUNT = JFEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JField</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JFIELD_OPERATION_COUNT = JFEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JAttributeImpl <em>JAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JAttributeImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJAttribute()
	 * @generated
	 */
	int JATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__NAME = JFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__VISIBILITY = JFIELD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__IS_STATIC = JFIELD__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__OWNER = JFIELD__OWNER;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE__PRIMITIVE_TYPE = JFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE_FEATURE_COUNT = JFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JATTRIBUTE_OPERATION_COUNT = JFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JReferenceImpl <em>JReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JReferenceImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJReference()
	 * @generated
	 */
	int JREFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE__NAME = JFIELD__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE__VISIBILITY = JFIELD__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE__IS_STATIC = JFIELD__IS_STATIC;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE__OWNER = JFIELD__OWNER;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE__REF_TYPE = JFIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_FEATURE_COUNT = JFIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_OPERATION_COUNT = JFIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JParameterImpl <em>JParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JParameterImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJParameter()
	 * @generated
	 */
	int JPARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__NAME = JELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__DIRECTION = JELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER__OWNER = JELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_FEATURE_COUNT = JELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>JParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPARAMETER_OPERATION_COUNT = JELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JPrimitiveTypeParImpl <em>JPrimitive Type Par</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JPrimitiveTypeParImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJPrimitiveTypePar()
	 * @generated
	 */
	int JPRIMITIVE_TYPE_PAR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_TYPE_PAR__NAME = JPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_TYPE_PAR__DIRECTION = JPARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_TYPE_PAR__OWNER = JPARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_TYPE_PAR__PRIMITIVE_TYPE = JPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JPrimitive Type Par</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_TYPE_PAR_FEATURE_COUNT = JPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JPrimitive Type Par</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JPRIMITIVE_TYPE_PAR_OPERATION_COUNT = JPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.impl.JReferenceTypeParImpl <em>JReference Type Par</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.impl.JReferenceTypeParImpl
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJReferenceTypePar()
	 * @generated
	 */
	int JREFERENCE_TYPE_PAR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_TYPE_PAR__NAME = JPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_TYPE_PAR__DIRECTION = JPARAMETER__DIRECTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_TYPE_PAR__OWNER = JPARAMETER__OWNER;

	/**
	 * The feature id for the '<em><b>Ref Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_TYPE_PAR__REF_TYPE = JPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JReference Type Par</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_TYPE_PAR_FEATURE_COUNT = JPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>JReference Type Par</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JREFERENCE_TYPE_PAR_OPERATION_COUNT = JPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaMetaModel.Vis <em>Vis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.Vis
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getVis()
	 * @generated
	 */
	int VIS = 11;

	/**
	 * The meta object id for the '{@link javaMetaModel.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.PrimitiveType
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 12;

	/**
	 * The meta object id for the '{@link javaMetaModel.ReferenceType <em>Reference Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.ReferenceType
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 13;

	/**
	 * The meta object id for the '{@link javaMetaModel.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaMetaModel.Direction
	 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 14;

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JElement <em>JElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JElement</em>'.
	 * @see javaMetaModel.JElement
	 * @generated
	 */
	EClass getJElement();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see javaMetaModel.JElement#getName()
	 * @see #getJElement()
	 * @generated
	 */
	EAttribute getJElement_Name();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JMethod <em>JMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JMethod</em>'.
	 * @see javaMetaModel.JMethod
	 * @generated
	 */
	EClass getJMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link javaMetaModel.JMethod#getJparameter <em>Jparameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jparameter</em>'.
	 * @see javaMetaModel.JMethod#getJparameter()
	 * @see #getJMethod()
	 * @generated
	 */
	EReference getJMethod_Jparameter();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JClass <em>JClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JClass</em>'.
	 * @see javaMetaModel.JClass
	 * @generated
	 */
	EClass getJClass();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JClass#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see javaMetaModel.JClass#isIsAbstract()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JClass#isIsFinal <em>Is Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Final</em>'.
	 * @see javaMetaModel.JClass#isIsFinal()
	 * @see #getJClass()
	 * @generated
	 */
	EAttribute getJClass_IsFinal();

	/**
	 * Returns the meta object for the containment reference list '{@link javaMetaModel.JClass#getJfeature <em>Jfeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jfeature</em>'.
	 * @see javaMetaModel.JClass#getJfeature()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Jfeature();

	/**
	 * Returns the meta object for the container reference '{@link javaMetaModel.JClass#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see javaMetaModel.JClass#getOwner()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_Owner();

	/**
	 * Returns the meta object for the reference list '{@link javaMetaModel.JClass#getJsubClass <em>Jsub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Jsub Class</em>'.
	 * @see javaMetaModel.JClass#getJsubClass()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_JsubClass();

	/**
	 * Returns the meta object for the reference '{@link javaMetaModel.JClass#getJsuperClass <em>Jsuper Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Jsuper Class</em>'.
	 * @see javaMetaModel.JClass#getJsuperClass()
	 * @see #getJClass()
	 * @generated
	 */
	EReference getJClass_JsuperClass();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JPackage <em>JPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPackage</em>'.
	 * @see javaMetaModel.JPackage
	 * @generated
	 */
	EClass getJPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link javaMetaModel.JPackage#getJclass <em>Jclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jclass</em>'.
	 * @see javaMetaModel.JPackage#getJclass()
	 * @see #getJPackage()
	 * @generated
	 */
	EReference getJPackage_Jclass();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JField <em>JField</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JField</em>'.
	 * @see javaMetaModel.JField
	 * @generated
	 */
	EClass getJField();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JAttribute <em>JAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAttribute</em>'.
	 * @see javaMetaModel.JAttribute
	 * @generated
	 */
	EClass getJAttribute();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JAttribute#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see javaMetaModel.JAttribute#getPrimitiveType()
	 * @see #getJAttribute()
	 * @generated
	 */
	EAttribute getJAttribute_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JReference <em>JReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JReference</em>'.
	 * @see javaMetaModel.JReference
	 * @generated
	 */
	EClass getJReference();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JReference#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Type</em>'.
	 * @see javaMetaModel.JReference#getRefType()
	 * @see #getJReference()
	 * @generated
	 */
	EAttribute getJReference_RefType();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JParameter <em>JParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JParameter</em>'.
	 * @see javaMetaModel.JParameter
	 * @generated
	 */
	EClass getJParameter();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JParameter#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see javaMetaModel.JParameter#getDirection()
	 * @see #getJParameter()
	 * @generated
	 */
	EAttribute getJParameter_Direction();

	/**
	 * Returns the meta object for the container reference '{@link javaMetaModel.JParameter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see javaMetaModel.JParameter#getOwner()
	 * @see #getJParameter()
	 * @generated
	 */
	EReference getJParameter_Owner();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JPrimitiveTypePar <em>JPrimitive Type Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JPrimitive Type Par</em>'.
	 * @see javaMetaModel.JPrimitiveTypePar
	 * @generated
	 */
	EClass getJPrimitiveTypePar();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JPrimitiveTypePar#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see javaMetaModel.JPrimitiveTypePar#getPrimitiveType()
	 * @see #getJPrimitiveTypePar()
	 * @generated
	 */
	EAttribute getJPrimitiveTypePar_PrimitiveType();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JReferenceTypePar <em>JReference Type Par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JReference Type Par</em>'.
	 * @see javaMetaModel.JReferenceTypePar
	 * @generated
	 */
	EClass getJReferenceTypePar();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JReferenceTypePar#getRefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Type</em>'.
	 * @see javaMetaModel.JReferenceTypePar#getRefType()
	 * @see #getJReferenceTypePar()
	 * @generated
	 */
	EAttribute getJReferenceTypePar_RefType();

	/**
	 * Returns the meta object for class '{@link javaMetaModel.JFeature <em>JFeature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JFeature</em>'.
	 * @see javaMetaModel.JFeature
	 * @generated
	 */
	EClass getJFeature();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JFeature#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see javaMetaModel.JFeature#getVisibility()
	 * @see #getJFeature()
	 * @generated
	 */
	EAttribute getJFeature_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link javaMetaModel.JFeature#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see javaMetaModel.JFeature#isIsStatic()
	 * @see #getJFeature()
	 * @generated
	 */
	EAttribute getJFeature_IsStatic();

	/**
	 * Returns the meta object for the container reference '{@link javaMetaModel.JFeature#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see javaMetaModel.JFeature#getOwner()
	 * @see #getJFeature()
	 * @generated
	 */
	EReference getJFeature_Owner();

	/**
	 * Returns the meta object for enum '{@link javaMetaModel.Vis <em>Vis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vis</em>'.
	 * @see javaMetaModel.Vis
	 * @generated
	 */
	EEnum getVis();

	/**
	 * Returns the meta object for enum '{@link javaMetaModel.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see javaMetaModel.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the meta object for enum '{@link javaMetaModel.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reference Type</em>'.
	 * @see javaMetaModel.ReferenceType
	 * @generated
	 */
	EEnum getReferenceType();

	/**
	 * Returns the meta object for enum '{@link javaMetaModel.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see javaMetaModel.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaMetaModelFactory getJavaMetaModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JElementImpl <em>JElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JElementImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJElement()
		 * @generated
		 */
		EClass JELEMENT = eINSTANCE.getJElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JELEMENT__NAME = eINSTANCE.getJElement_Name();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JMethodImpl <em>JMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JMethodImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJMethod()
		 * @generated
		 */
		EClass JMETHOD = eINSTANCE.getJMethod();

		/**
		 * The meta object literal for the '<em><b>Jparameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JMETHOD__JPARAMETER = eINSTANCE.getJMethod_Jparameter();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JClassImpl <em>JClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JClassImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJClass()
		 * @generated
		 */
		EClass JCLASS = eINSTANCE.getJClass();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__IS_ABSTRACT = eINSTANCE.getJClass_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JCLASS__IS_FINAL = eINSTANCE.getJClass_IsFinal();

		/**
		 * The meta object literal for the '<em><b>Jfeature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__JFEATURE = eINSTANCE.getJClass_Jfeature();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__OWNER = eINSTANCE.getJClass_Owner();

		/**
		 * The meta object literal for the '<em><b>Jsub Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__JSUB_CLASS = eINSTANCE.getJClass_JsubClass();

		/**
		 * The meta object literal for the '<em><b>Jsuper Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JCLASS__JSUPER_CLASS = eINSTANCE.getJClass_JsuperClass();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JPackageImpl <em>JPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JPackageImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJPackage()
		 * @generated
		 */
		EClass JPACKAGE = eINSTANCE.getJPackage();

		/**
		 * The meta object literal for the '<em><b>Jclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPACKAGE__JCLASS = eINSTANCE.getJPackage_Jclass();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JFieldImpl <em>JField</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JFieldImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJField()
		 * @generated
		 */
		EClass JFIELD = eINSTANCE.getJField();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JAttributeImpl <em>JAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JAttributeImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJAttribute()
		 * @generated
		 */
		EClass JATTRIBUTE = eINSTANCE.getJAttribute();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JATTRIBUTE__PRIMITIVE_TYPE = eINSTANCE.getJAttribute_PrimitiveType();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JReferenceImpl <em>JReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JReferenceImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJReference()
		 * @generated
		 */
		EClass JREFERENCE = eINSTANCE.getJReference();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JREFERENCE__REF_TYPE = eINSTANCE.getJReference_RefType();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JParameterImpl <em>JParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JParameterImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJParameter()
		 * @generated
		 */
		EClass JPARAMETER = eINSTANCE.getJParameter();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPARAMETER__DIRECTION = eINSTANCE.getJParameter_Direction();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JPARAMETER__OWNER = eINSTANCE.getJParameter_Owner();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JPrimitiveTypeParImpl <em>JPrimitive Type Par</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JPrimitiveTypeParImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJPrimitiveTypePar()
		 * @generated
		 */
		EClass JPRIMITIVE_TYPE_PAR = eINSTANCE.getJPrimitiveTypePar();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JPRIMITIVE_TYPE_PAR__PRIMITIVE_TYPE = eINSTANCE.getJPrimitiveTypePar_PrimitiveType();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JReferenceTypeParImpl <em>JReference Type Par</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JReferenceTypeParImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJReferenceTypePar()
		 * @generated
		 */
		EClass JREFERENCE_TYPE_PAR = eINSTANCE.getJReferenceTypePar();

		/**
		 * The meta object literal for the '<em><b>Ref Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JREFERENCE_TYPE_PAR__REF_TYPE = eINSTANCE.getJReferenceTypePar_RefType();

		/**
		 * The meta object literal for the '{@link javaMetaModel.impl.JFeatureImpl <em>JFeature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.impl.JFeatureImpl
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getJFeature()
		 * @generated
		 */
		EClass JFEATURE = eINSTANCE.getJFeature();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFEATURE__VISIBILITY = eINSTANCE.getJFeature_Visibility();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JFEATURE__IS_STATIC = eINSTANCE.getJFeature_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JFEATURE__OWNER = eINSTANCE.getJFeature_Owner();

		/**
		 * The meta object literal for the '{@link javaMetaModel.Vis <em>Vis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.Vis
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getVis()
		 * @generated
		 */
		EEnum VIS = eINSTANCE.getVis();

		/**
		 * The meta object literal for the '{@link javaMetaModel.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.PrimitiveType
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link javaMetaModel.ReferenceType <em>Reference Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.ReferenceType
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getReferenceType()
		 * @generated
		 */
		EEnum REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '{@link javaMetaModel.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaMetaModel.Direction
		 * @see javaMetaModel.impl.JavaMetaModelPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //JavaMetaModelPackage
