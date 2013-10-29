/**
 */
package dk.dtu.se2.petrinet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.petrinet.Token#getAppearanceLabel <em>Appearance Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.petrinet.PetrinetPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends Attribute {
	/**
	 * Returns the value of the '<em><b>Appearance Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appearance Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appearance Label</em>' containment reference.
	 * @see #setAppearanceLabel(AppearanceLabel)
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getToken_AppearanceLabel()
	 * @model containment="true"
	 * @generated
	 */
	AppearanceLabel getAppearanceLabel();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.petrinet.Token#getAppearanceLabel <em>Appearance Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Label</em>' containment reference.
	 * @see #getAppearanceLabel()
	 * @generated
	 */
	void setAppearanceLabel(AppearanceLabel value);

} // Token
