/**
 */
package configuration;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see configuration.ConfigurationPackage
 * @generated
 */
public interface ConfigurationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationFactory eINSTANCE = configuration.impl.ConfigurationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Petri Net Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Net Model</em>'.
	 * @generated
	 */
	PetriNetModel createPetriNetModel();

	/**
	 * Returns a new object of class '<em>Geometry Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geometry Model</em>'.
	 * @generated
	 */
	GeometryModel createGeometryModel();

	/**
	 * Returns a new object of class '<em>Appearance Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appearance Model</em>'.
	 * @generated
	 */
	AppearanceModel createAppearanceModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigurationPackage getConfigurationPackage();

} //ConfigurationFactory
