/**
 */
package configuration;

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
 * @see configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://configuration/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.ConfigurationImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Petri Net Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PETRI_NET_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Geometry Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__GEOMETRY_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Appearance Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__APPEARANCE_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuration.impl.PetriNetModelImpl <em>Petri Net Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.PetriNetModelImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getPetriNetModel()
	 * @generated
	 */
	int PETRI_NET_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_MODEL__PETRI_NET = 0;

	/**
	 * The number of structural features of the '<em>Petri Net Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Petri Net Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuration.impl.GeometryModelImpl <em>Geometry Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.GeometryModelImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getGeometryModel()
	 * @generated
	 */
	int GEOMETRY_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_MODEL__GEOMETRY = 0;

	/**
	 * The number of structural features of the '<em>Geometry Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geometry Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuration.impl.AppearanceModelImpl <em>Appearance Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuration.impl.AppearanceModelImpl
	 * @see configuration.impl.ConfigurationPackageImpl#getAppearanceModel()
	 * @generated
	 */
	int APPEARANCE_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_MODEL__APPEARANCE = 0;

	/**
	 * The number of structural features of the '<em>Appearance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Appearance Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEARANCE_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see configuration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link configuration.Configuration#getPetriNetModel <em>Petri Net Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Petri Net Model</em>'.
	 * @see configuration.Configuration#getPetriNetModel()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_PetriNetModel();

	/**
	 * Returns the meta object for the containment reference '{@link configuration.Configuration#getGeometryModel <em>Geometry Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry Model</em>'.
	 * @see configuration.Configuration#getGeometryModel()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_GeometryModel();

	/**
	 * Returns the meta object for the containment reference '{@link configuration.Configuration#getAppearanceModel <em>Appearance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appearance Model</em>'.
	 * @see configuration.Configuration#getAppearanceModel()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_AppearanceModel();

	/**
	 * Returns the meta object for class '{@link configuration.PetriNetModel <em>Petri Net Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net Model</em>'.
	 * @see configuration.PetriNetModel
	 * @generated
	 */
	EClass getPetriNetModel();

	/**
	 * Returns the meta object for the attribute '{@link configuration.PetriNetModel#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Petri Net</em>'.
	 * @see configuration.PetriNetModel#getPetriNet()
	 * @see #getPetriNetModel()
	 * @generated
	 */
	EAttribute getPetriNetModel_PetriNet();

	/**
	 * Returns the meta object for class '{@link configuration.GeometryModel <em>Geometry Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Model</em>'.
	 * @see configuration.GeometryModel
	 * @generated
	 */
	EClass getGeometryModel();

	/**
	 * Returns the meta object for the attribute '{@link configuration.GeometryModel#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see configuration.GeometryModel#getGeometry()
	 * @see #getGeometryModel()
	 * @generated
	 */
	EAttribute getGeometryModel_Geometry();

	/**
	 * Returns the meta object for class '{@link configuration.AppearanceModel <em>Appearance Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appearance Model</em>'.
	 * @see configuration.AppearanceModel
	 * @generated
	 */
	EClass getAppearanceModel();

	/**
	 * Returns the meta object for the attribute '{@link configuration.AppearanceModel#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appearance</em>'.
	 * @see configuration.AppearanceModel#getAppearance()
	 * @see #getAppearanceModel()
	 * @generated
	 */
	EAttribute getAppearanceModel_Appearance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

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
		 * The meta object literal for the '{@link configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.ConfigurationImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Petri Net Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PETRI_NET_MODEL = eINSTANCE.getConfiguration_PetriNetModel();

		/**
		 * The meta object literal for the '<em><b>Geometry Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__GEOMETRY_MODEL = eINSTANCE.getConfiguration_GeometryModel();

		/**
		 * The meta object literal for the '<em><b>Appearance Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__APPEARANCE_MODEL = eINSTANCE.getConfiguration_AppearanceModel();

		/**
		 * The meta object literal for the '{@link configuration.impl.PetriNetModelImpl <em>Petri Net Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.PetriNetModelImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getPetriNetModel()
		 * @generated
		 */
		EClass PETRI_NET_MODEL = eINSTANCE.getPetriNetModel();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRI_NET_MODEL__PETRI_NET = eINSTANCE.getPetriNetModel_PetriNet();

		/**
		 * The meta object literal for the '{@link configuration.impl.GeometryModelImpl <em>Geometry Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.GeometryModelImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getGeometryModel()
		 * @generated
		 */
		EClass GEOMETRY_MODEL = eINSTANCE.getGeometryModel();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_MODEL__GEOMETRY = eINSTANCE.getGeometryModel_Geometry();

		/**
		 * The meta object literal for the '{@link configuration.impl.AppearanceModelImpl <em>Appearance Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuration.impl.AppearanceModelImpl
		 * @see configuration.impl.ConfigurationPackageImpl#getAppearanceModel()
		 * @generated
		 */
		EClass APPEARANCE_MODEL = eINSTANCE.getAppearanceModel();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEARANCE_MODEL__APPEARANCE = eINSTANCE.getAppearanceModel_Appearance();

	}

} //ConfigurationPackage
