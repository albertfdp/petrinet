/**
 */
package dk.dtu.se2.animation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appear</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.animation.Appear#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link dk.dtu.se2.animation.Appear#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.animation.AnimationPackage#getAppear()
 * @model
 * @generated
 */
public interface Appear extends Animation {
	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' attribute.
	 * @see #setGeometry(String)
	 * @see dk.dtu.se2.animation.AnimationPackage#getAppear_Geometry()
	 * @model
	 * @generated
	 */
	String getGeometry();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.animation.Appear#getGeometry <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' attribute.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(String value);

	/**
	 * Returns the value of the '<em><b>Appearance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance</em>' attribute.
	 * @see #setAppearance(String)
	 * @see dk.dtu.se2.animation.AnimationPackage#getAppear_Appearance()
	 * @model
	 * @generated
	 */
	String getAppearance();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.animation.Appear#getAppearance <em>Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance</em>' attribute.
	 * @see #getAppearance()
	 * @generated
	 */
	void setAppearance(String value);

} // Appear
