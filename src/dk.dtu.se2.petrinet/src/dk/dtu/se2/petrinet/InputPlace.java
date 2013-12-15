/**
 */
package dk.dtu.se2.petrinet;

import org.pnml.tools.epnk.pnmlcoremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.petrinet.InputPlace#isText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.petrinet.PetrinetPackage#getInputPlace()
 * @model
 * @generated
 */
public interface InputPlace extends Attribute {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(boolean)
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getInputPlace_Text()
	 * @model
	 * @generated
	 */
	boolean isText();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.petrinet.InputPlace#isText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #isText()
	 * @generated
	 */
	void setText(boolean value);

} // InputPlace
