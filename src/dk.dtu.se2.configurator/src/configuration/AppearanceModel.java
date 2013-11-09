/**
 */
package configuration;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appearance Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.AppearanceModel#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getAppearanceModel()
 * @model
 * @generated
 */
public interface AppearanceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' attribute.
	 * @see #setAppearance(Resource)
	 * @see configuration.ConfigurationPackage#getAppearanceModel_Appearance()
	 * @model transient="true"
	 * @generated
	 */
	Resource getAppearance();

	/**
	 * Sets the value of the '{@link configuration.AppearanceModel#getAppearance <em>Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' attribute.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(Resource value);

} // AppearanceModel
