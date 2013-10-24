/**
 */
package geometry;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry.Connector#getOut <em>Out</em>}</li>
 *   <li>{@link geometry.Connector#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry.GeometryPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Point {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link geometry.Line}.
	 * It is bidirectional and its opposite is '{@link geometry.Line#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see geometry.GeometryPackage#getConnector_Out()
	 * @see geometry.Line#getBegin
	 * @model type="geometry.Line" opposite="begin"
	 * @generated
	 */
	EList getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link geometry.Line}.
	 * It is bidirectional and its opposite is '{@link geometry.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see geometry.GeometryPackage#getConnector_In()
	 * @see geometry.Line#getEnd
	 * @model type="geometry.Line" opposite="end"
	 * @generated
	 */
	EList getIn();

} // Connector
