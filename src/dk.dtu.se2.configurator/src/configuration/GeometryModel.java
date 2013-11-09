/**
 */
package configuration;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuration.GeometryModel#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuration.ConfigurationPackage#getGeometryModel()
 * @model
 * @generated
 */
public interface GeometryModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(Resource)
	 * @see configuration.ConfigurationPackage#getGeometryModel_Geometry()
	 * @model transient="true"
	 * @generated
	 */
	Resource getGeometry();

	/**
	 * Sets the value of the '{@link configuration.GeometryModel#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(Resource value);

} // GeometryModel
