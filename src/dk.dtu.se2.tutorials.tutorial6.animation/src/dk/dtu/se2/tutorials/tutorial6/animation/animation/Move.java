/**
 */
package dk.dtu.se2.tutorials.tutorial6.animation.animation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.tutorials.tutorial6.animation.animation.Move#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationPackage#getMove()
 * @model
 * @generated
 */
public interface Move extends AnimationObject {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(String)
	 * @see dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationPackage#getMove_Speed()
	 * @model
	 * @generated
	 */
	String getSpeed();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.tutorials.tutorial6.animation.animation.Move#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(String value);

} // Move
