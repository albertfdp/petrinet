/**
 */
package geometry2nd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry2nd.Line#getBendPoint <em>Bend Point</em>}</li>
 *   <li>{@link geometry2nd.Line#getBegin <em>Begin</em>}</li>
 *   <li>{@link geometry2nd.Line#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry2nd.Geometry2ndPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends GObject {
	/**
	 * Returns the value of the '<em><b>Bend Point</b></em>' containment reference list.
	 * The list contents are of type {@link geometry2nd.BendPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bend Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bend Point</em>' containment reference list.
	 * @see geometry2nd.Geometry2ndPackage#getLine_BendPoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<BendPoint> getBendPoint();

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry2nd.Connector#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' reference.
	 * @see #setBegin(Connector)
	 * @see geometry2nd.Geometry2ndPackage#getLine_Begin()
	 * @see geometry2nd.Connector#getOut
	 * @model opposite="out"
	 * @generated
	 */
	Connector getBegin();

	/**
	 * Sets the value of the '{@link geometry2nd.Line#getBegin <em>Begin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Connector value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link geometry2nd.Connector#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Connector)
	 * @see geometry2nd.Geometry2ndPackage#getLine_End()
	 * @see geometry2nd.Connector#getIn
	 * @model opposite="in"
	 * @generated
	 */
	Connector getEnd();

	/**
	 * Sets the value of the '{@link geometry2nd.Line#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Connector value);

} // Line
