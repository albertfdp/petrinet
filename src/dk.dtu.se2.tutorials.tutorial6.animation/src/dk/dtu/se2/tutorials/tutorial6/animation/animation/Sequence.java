/**
 */
package dk.dtu.se2.tutorials.tutorial6.animation.animation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.tutorials.tutorial6.animation.animation.Sequence#getAnimations <em>Animations</em>}</li>
 *   <li>{@link dk.dtu.se2.tutorials.tutorial6.animation.animation.Sequence#getAnimationObjects <em>Animation Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Animation {
	/**
	 * Returns the value of the '<em><b>Animations</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations</em>' containment reference list.
	 * @see dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationPackage#getSequence_Animations()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<AnimationObject> getAnimations();

	/**
	 * Returns the value of the '<em><b>Animation Objects</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Objects</em>' containment reference list.
	 * @see dk.dtu.se2.tutorials.tutorial6.animation.animation.AnimationPackage#getSequence_AnimationObjects()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<AnimationObject> getAnimationObjects();

} // Sequence
