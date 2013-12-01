/**
 */
package appearance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appearance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.Appearance#getAObjects <em>AObjects</em>}</li>
 *   <li>{@link appearance.Appearance#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getAppearance()
 * @model
 * @generated
 */
public interface Appearance extends EObject {
	/**
	 * Returns the value of the '<em><b>AObjects</b></em>' containment reference list.
	 * The list contents are of type {@link appearance.AObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AObjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AObjects</em>' containment reference list.
	 * @see appearance.AppearancePackage#getAppearance_AObjects()
	 * @model containment="true"
	 * @generated
	 */
	EList<AObject> getAObjects();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see appearance.AppearancePackage#getAppearance_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link appearance.Appearance#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Appearance
