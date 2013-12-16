/**
 */
package appearance;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.SampleClass#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getSampleClass()
 * @model
 * @generated
 */
public interface SampleClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * The default value is <code>"01-01-2000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see appearance.AppearancePackage#getSampleClass_Date()
	 * @model default="01-01-2000"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link appearance.SampleClass#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // SampleClass
