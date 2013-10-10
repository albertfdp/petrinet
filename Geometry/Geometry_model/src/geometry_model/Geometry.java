/**
 */
package geometry_model;

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
 *   <li>{@link geometry_model.Geometry#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry_model.Geometry_modelPackage#getGeometry()
 * @model
 * @generated
 */
public interface Geometry extends EObject {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' containment reference list.
	 * The list contents are of type {@link geometry_model.GObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' containment reference list.
	 * @see geometry_model.Geometry_modelPackage#getGeometry_EReference0()
	 * @model containment="true"
	 * @generated
	 */
	EList<GObject> getEReference0();

} // Geometry
