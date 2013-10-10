/**
 */
package geometry_model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link geometry_model.Connector#getOut <em>Out</em>}</li>
 *   <li>{@link geometry_model.Connector#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see geometry_model.Geometry_modelPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Point {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link geometry_model.Line}.
	 * It is bidirectional and its opposite is '{@link geometry_model.Line#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see geometry_model.Geometry_modelPackage#getConnector_Out()
	 * @see geometry_model.Line#getBegin
	 * @model opposite="begin"
	 * @generated
	 */
	EList<Line> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link geometry_model.Line}.
	 * It is bidirectional and its opposite is '{@link geometry_model.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see geometry_model.Geometry_modelPackage#getConnector_In()
	 * @see geometry_model.Line#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	EList<Line> getIn();

} // Connector
