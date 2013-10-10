/**
 */
package geometry_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry_model.Point#getXLocation <em>XLocation</em>}</li>
 *   <li>{@link geometry_model.Point#getYLocation <em>YLocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry_model.Geometry_modelPackage#getPoint()
 * @model
 * @generated
 */
public interface Point extends GObject {
	/**
	 * Returns the value of the '<em><b>XLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XLocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLocation</em>' attribute.
	 * @see #setXLocation(int)
	 * @see geometry_model.Geometry_modelPackage#getPoint_XLocation()
	 * @model
	 * @generated
	 */
	int getXLocation();

	/**
	 * Sets the value of the '{@link geometry_model.Point#getXLocation <em>XLocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLocation</em>' attribute.
	 * @see #getXLocation()
	 * @generated
	 */
	void setXLocation(int value);

	/**
	 * Returns the value of the '<em><b>YLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YLocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YLocation</em>' attribute.
	 * @see #setYLocation(int)
	 * @see geometry_model.Geometry_modelPackage#getPoint_YLocation()
	 * @model
	 * @generated
	 */
	int getYLocation();

	/**
	 * Sets the value of the '{@link geometry_model.Point#getYLocation <em>YLocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YLocation</em>' attribute.
	 * @see #getYLocation()
	 * @generated
	 */
	void setYLocation(int value);

} // Point
