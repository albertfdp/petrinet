/**
 */
package dk.dtu.se2.tutorials.tutorial6.animation.animation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationObject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationPackage#getAnimationObject()
 * @model
 * @generated
 */
public interface AnimationObject extends Animation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationPackage#getAnimationObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AnimationObject
