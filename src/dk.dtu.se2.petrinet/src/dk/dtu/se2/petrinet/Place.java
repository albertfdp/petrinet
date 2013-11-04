/**
 */
package dk.dtu.se2.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.se2.petrinet.Place#getGeometryLabel <em>Geometry Label</em>}</li>
 *   <li>{@link dk.dtu.se2.petrinet.Place#getAnimationLabel <em>Animation Label</em>}</li>
 *   <li>{@link dk.dtu.se2.petrinet.Place#getAppearanceLabel <em>Appearance Label</em>}</li>
 *   <li>{@link dk.dtu.se2.petrinet.Place#getTokens <em>Tokens</em>}</li>
 *   <li>{@link dk.dtu.se2.petrinet.Place#getInputPlaceLabel <em>Input Place Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.se2.petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends org.pnml.tools.epnk.pnmlcoremodel.Place {
	/**
	 * Returns the value of the '<em><b>Geometry Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Label</em>' containment reference.
	 * @see #setGeometryLabel(GeometryLabel)
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getPlace_GeometryLabel()
	 * @model containment="true"
	 * @generated
	 */
	GeometryLabel getGeometryLabel();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.petrinet.Place#getGeometryLabel <em>Geometry Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Label</em>' containment reference.
	 * @see #getGeometryLabel()
	 * @generated
	 */
	void setGeometryLabel(GeometryLabel value);

	/**
	 * Returns the value of the '<em><b>Animation Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Label</em>' containment reference.
	 * @see #setAnimationLabel(AnimationLabel)
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getPlace_AnimationLabel()
	 * @model containment="true"
	 * @generated
	 */
	AnimationLabel getAnimationLabel();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.petrinet.Place#getAnimationLabel <em>Animation Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation Label</em>' containment reference.
	 * @see #getAnimationLabel()
	 * @generated
	 */
	void setAnimationLabel(AnimationLabel value);

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
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getPlace_AppearanceLabel()
	 * @model containment="true"
	 * @generated
	 */
	AppearanceLabel getAppearanceLabel();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.petrinet.Place#getAppearanceLabel <em>Appearance Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appearance Label</em>' containment reference.
	 * @see #getAppearanceLabel()
	 * @generated
	 */
	void setAppearanceLabel(AppearanceLabel value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.se2.petrinet.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getPlace_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Input Place Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Place Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Place Label</em>' containment reference.
	 * @see #setInputPlaceLabel(InputPlace)
	 * @see dk.dtu.se2.petrinet.PetrinetPackage#getPlace_InputPlaceLabel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputPlace getInputPlaceLabel();

	/**
	 * Sets the value of the '{@link dk.dtu.se2.petrinet.Place#getInputPlaceLabel <em>Input Place Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Place Label</em>' containment reference.
	 * @see #getInputPlaceLabel()
	 * @generated
	 */
	void setInputPlaceLabel(InputPlace value);

} // Place
