/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet.Petrinet#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet.PetrinetPackage#getPetrinet()
 * @model
 * @generated
 */
public interface Petrinet extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.PObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetrinet_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<PObject> getObjects();

} // Petrinet
