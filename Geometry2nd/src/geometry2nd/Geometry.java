/**
 */
package geometry2nd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry2nd.Geometry#getGObjects <em>GObjects</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry2nd.Geometry2ndPackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>GObjects</b></em>' containment reference list.
	 * The list contents are of type {@link geometry2nd.GObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GObjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GObjects</em>' containment reference list.
	 * @see geometry2nd.Geometry2ndPackage#getGeometry_GObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<GObject> getGObjects();

} // Geometry
