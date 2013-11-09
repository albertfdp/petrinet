/**
 */
package configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.Configuration#getPetriNetModel <em>Petri Net Model</em>}</li>
 *   <li>{@link configuration.Configuration#getGeometryModel <em>Geometry Model</em>}</li>
 *   <li>{@link configuration.Configuration#getAppearanceModel <em>Appearance Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri Net Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri Net Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net Model</em>' containment reference.
	 * @see #setPetriNetModel(PetriNetModel)
	 * @see configuration.ConfigurationPackage#getConfiguration_PetriNetModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PetriNetModel getPetriNetModel();

	/**
	 * Sets the value of the '{@link configuration.Configuration#getPetriNetModel <em>Petri Net Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net Model</em>' containment reference.
	 * @see #getPetriNetModel()
	 * @generated
	 */
	void setPetriNetModel(PetriNetModel value);

	/**
	 * Returns the value of the '<em><b>Geometry Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Model</em>' containment reference.
	 * @see #setGeometryModel(GeometryModel)
	 * @see configuration.ConfigurationPackage#getConfiguration_GeometryModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeometryModel getGeometryModel();

	/**
	 * Sets the value of the '{@link configuration.Configuration#getGeometryModel <em>Geometry Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Model</em>' containment reference.
	 * @see #getGeometryModel()
	 * @generated
	 */
	void setGeometryModel(GeometryModel value);

	/**
	 * Returns the value of the '<em><b>Appearance Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Model</em>' containment reference.
	 * @see #setAppearanceModel(AppearanceModel)
	 * @see configuration.ConfigurationPackage#getConfiguration_AppearanceModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AppearanceModel getAppearanceModel();

	/**
	 * Sets the value of the '{@link configuration.Configuration#getAppearanceModel <em>Appearance Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Model</em>' containment reference.
	 * @see #getAppearanceModel()
	 * @generated
	 */
	void setAppearanceModel(AppearanceModel value);

} // Configuration
