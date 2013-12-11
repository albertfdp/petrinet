/**
 */
package dk.dtu.se2.petrinet;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredLabel;

import dk.dtu.se2.animation.Animation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.petrinet.AnimationLabel#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.petrinet.PetrinetPackage#getAnimationLabel()
 * @model
 * @generated
 */
public interface AnimationLabel extends StructuredLabel {

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(Animation)
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getAnimationLabel_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Animation getStructure();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.petrinet.AnimationLabel#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Animation value);
	
	
} // AnimationLabel
