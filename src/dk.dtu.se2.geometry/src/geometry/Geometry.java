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
 *   <li>{@link geometry.Geometry#getGObject <em>GObject</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>GObject</b></em>' containment reference list.
	 * The list contents are of type {@link geometry.GObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GObject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GObject</em>' containment reference list.
	 * @see geometry.GeometryPackage#getGeometry_GObject()
	 * @model type="geometry.GObject" containment="true"
	 * @generated
	 */
	EList getGObject();

} // Geometry
