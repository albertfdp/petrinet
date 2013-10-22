/**
 */
package geometry2nd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry2nd.Connector#getOut <em>Out</em>}</li>
 *   <li>{@link geometry2nd.Connector#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry2nd.Geometry2ndPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Point {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link geometry2nd.Line}.
	 * It is bidirectional and its opposite is '{@link geometry2nd.Line#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see geometry2nd.Geometry2ndPackage#getConnector_Out()
	 * @see geometry2nd.Line#getBegin
	 * @model opposite="begin"
	 * @generated
	 */
	EList<Line> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link geometry2nd.Line}.
	 * It is bidirectional and its opposite is '{@link geometry2nd.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see geometry2nd.Geometry2ndPackage#getConnector_In()
	 * @see geometry2nd.Line#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	EList<Line> getIn();

} // Connector
