/**
 */
package appearance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see appearance.AppearanceFactory
 * @model kind="package"
 * @generated
 */
public interface AppearancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "appearance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://appearance/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "appearance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppearancePackage eINSTANCE = appearance.impl.AppearancePackageImpl.init();

	/**
	 * The meta object id for the '{@link appearance.impl.AppearanceImpl <em>Appearance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.AppearanceImpl
	 * @see appearance.impl.AppearancePackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 0;

	/**
	 * The feature id for the '<em><b>AObjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__AOBJECTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE__ID = 1;

	/**
	 * The number of structural features of the '<em>Appearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Appearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link appearance.impl.AObjectImpl <em>AObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see appearance.impl.AObjectImpl
	 * @see appearance.impl.AppearancePackageImpl#getAObject()
	 * @generated
	 */
	int AOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Object3 D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__OBJECT3_D = 1;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT__TEXTURE = 2;

	/**
	 * The number of structural features of the '<em>AObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AOBJECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link appearance.Appearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance</em>'.
	 * @see appearance.Appearance
	 * @generated
	 */
	EClass getAppearance();

	/**
	 * Returns the meta object for the containment reference list '{@link appearance.Appearance#getAObjects <em>AObjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AObjects</em>'.
	 * @see appearance.Appearance#getAObjects()
	 * @see #getAppearance()
	 * @generated
	 */
	EReference getAppearance_AObjects();

	/**
	 * Returns the meta object for the attribute '{@link appearance.Appearance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see appearance.Appearance#getId()
	 * @see #getAppearance()
	 * @generated
	 */
	EAttribute getAppearance_Id();

	/**
	 * Returns the meta object for class '{@link appearance.AObject <em>AObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AObject</em>'.
	 * @see appearance.AObject
	 * @generated
	 */
	EClass getAObject();

	/**
	 * Returns the meta object for the attribute '{@link appearance.AObject#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see appearance.AObject#getLabel()
	 * @see #getAObject()
	 * @generated
	 */
	EAttribute getAObject_Label();

	/**
	 * Returns the meta object for the attribute '{@link appearance.AObject#getObject3D <em>Object3 D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object3 D</em>'.
	 * @see appearance.AObject#getObject3D()
	 * @see #getAObject()
	 * @generated
	 */
	EAttribute getAObject_Object3D();

	/**
	 * Returns the meta object for the attribute '{@link appearance.AObject#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see appearance.AObject#getTexture()
	 * @see #getAObject()
	 * @generated
	 */
	EAttribute getAObject_Texture();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppearanceFactory getAppearanceFactory();

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
		 * The meta object literal for the '{@link appearance.impl.AppearanceImpl <em>Appearance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.AppearanceImpl
		 * @see appearance.impl.AppearancePackageImpl#getAppearance()
		 * @generated
		 */
		EClass APPEARANCE = eINSTANCE.getAppearance();

		/**
		 * The meta object literal for the '<em><b>AObjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPEARANCE__AOBJECTS = eINSTANCE.getAppearance_AObjects();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE__ID = eINSTANCE.getAppearance_Id();

		/**
		 * The meta object literal for the '{@link appearance.impl.AObjectImpl <em>AObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see appearance.impl.AObjectImpl
		 * @see appearance.impl.AppearancePackageImpl#getAObject()
		 * @generated
		 */
		EClass AOBJECT = eINSTANCE.getAObject();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AOBJECT__LABEL = eINSTANCE.getAObject_Label();

		/**
		 * The meta object literal for the '<em><b>Object3 D</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AOBJECT__OBJECT3_D = eINSTANCE.getAObject_Object3D();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AOBJECT__TEXTURE = eINSTANCE.getAObject_Texture();

	}

} //AppearancePackage
