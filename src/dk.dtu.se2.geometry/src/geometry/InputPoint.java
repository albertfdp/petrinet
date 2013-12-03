/**
 */
package geometry;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.InputPoint#getAppearanceLabel <em>Appearance Label</em>}</li>
 *   <li>{@link geometry.InputPoint#getTokenAppearanceLabel <em>Token Appearance Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getInputPoint()
 * @model
 * @generated
 */
public interface InputPoint extends Point {

	/**
	 * Returns the value of the '<em><b>Appearance Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Label</em>' attribute.
	 * @see #setAppearanceLabel(String)
	 * @see geometry.GeometryPackage#getInputPoint_AppearanceLabel()
	 * @model
	 * @generated
	 */
	String getAppearanceLabel();

	/**
	 * Sets the value of the '{@link geometry.InputPoint#getAppearanceLabel <em>Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Label</em>' attribute.
	 * @see #getAppearanceLabel()
	 * @generated
	 */
	void setAppearanceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Token Appearance Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Appearance Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Appearance Label</em>' attribute.
	 * @see #setTokenAppearanceLabel(String)
	 * @see geometry.GeometryPackage#getInputPoint_TokenAppearanceLabel()
	 * @model
	 * @generated
	 */
	String getTokenAppearanceLabel();

	/**
	 * Sets the value of the '{@link geometry.InputPoint#getTokenAppearanceLabel <em>Token Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Appearance Label</em>' attribute.
	 * @see #getTokenAppearanceLabel()
	 * @generated
	 */
	void setTokenAppearanceLabel(String value);
} // InputPoint
