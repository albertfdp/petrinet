/**
 */
package animation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link animation.Animation#getAnimationObjects <em>Animation Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see animation.AnimationPackage#getAnimation()
 * @model
 * @generated
 */
public interface Animation extends EObject {
	/**
	 * Returns the value of the '<em><b>Animation Objects</b></em>' containment reference list.
	 * The list contents are of type {@link animation.AnimationObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Objects</em>' containment reference list.
	 * @see animation.AnimationPackage#getAnimation_AnimationObjects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnimationObject> getAnimationObjects();

} // Animation
