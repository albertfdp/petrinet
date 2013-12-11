/**
 */
package appearance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see appearance.AppearancePackage
 * @generated
 */
public interface AppearanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppearanceFactory eINSTANCE = appearance.impl.AppearanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Appearance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appearance</em>'.
	 * @generated
	 */
	Appearance createAppearance();

	/**
	 * Returns a new object of class '<em>AObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AObject</em>'.
	 * @generated
	 */
	AObject createAObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppearancePackage getAppearancePackage();

} //AppearanceFactory
