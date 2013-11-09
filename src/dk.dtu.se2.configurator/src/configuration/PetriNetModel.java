/**
 */
package configuration;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.PetriNetModel#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getPetriNetModel()
 * @model
 * @generated
 */
public interface PetriNetModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri Net</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri Net</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net</em>' attribute.
	 * @see #setPetriNet(Resource)
	 * @see configuration.ConfigurationPackage#getPetriNetModel_PetriNet()
	 * @model transient="true"
	 * @generated
	 */
	Resource getPetriNet();

	/**
	 * Sets the value of the '{@link configuration.PetriNetModel#getPetriNet <em>Petri Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net</em>' attribute.
	 * @see #getPetriNet()
	 * @generated
	 */
	void setPetriNet(Resource value);

} // PetriNetModel
