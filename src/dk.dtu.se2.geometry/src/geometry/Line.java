/**
 */
package geometry;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.Line#getBendPoint <em>Bend Point</em>}</li>
 *   <li>{@link geometry.Line#getBegin <em>Begin</em>}</li>
 *   <li>{@link geometry.Line#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GObject {
	/**
	 * Returns the value of the '<em><b>Bend Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bend Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bend Point</em>' containment reference.
	 * @see #setBendPoint(BendPoint)
	 * @see geometry.GeometryPackage#getLine_BendPoint()
	 * @model containment="true"
	 * @generated
	 */
	BendPoint getBendPoint();

	/**
	 * Sets the value of the '{@link geometry.Line#getBendPoint <em>Bend Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bend Point</em>' containment reference.
	 * @see #getBendPoint()
	 * @generated
	 */
	void setBendPoint(BendPoint value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry.Connector#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' reference.
	 * @see #setBegin(Connector)
	 * @see geometry.GeometryPackage#getLine_Begin()
	 * @see geometry.Connector#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	Connector getBegin();

	/**
	 * Sets the value of the '{@link geometry.Line#getBegin <em>Begin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Connector value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry.Connector#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Connector)
	 * @see geometry.GeometryPackage#getLine_End()
	 * @see geometry.Connector#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	Connector getEnd();

	/**
	 * Sets the value of the '{@link geometry.Line#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Connector value);

} // Line
