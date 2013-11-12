/**
 */
package geometry;

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
 *   <li>{@link geometry.Geometry#getGObjects <em>GObjects</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>GObjects</b></em>' containment reference list.
	 * The list contents are of type {@link geometry.GObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GObjects</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GObjects</em>' containment reference list.
	 * @see geometry.GeometryPackage#getGeometry_GObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<GObject> getGObjects();

} // Geometry
