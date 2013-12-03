/**
 */
package appearance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AObject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link appearance.AObject#getLabel <em>Label</em>}</li>
 *   <li>{@link appearance.AObject#getObject3D <em>Object3 D</em>}</li>
 *   <li>{@link appearance.AObject#getTexture <em>Texture</em>}</li>
 * </ul>
 * </p>
 *
 * @see appearance.AppearancePackage#getAObject()
 * @model
 * @generated
 */
public interface AObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see appearance.AppearancePackage#getAObject_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link appearance.AObject#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Object3 D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object3 D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object3 D</em>' attribute.
	 * @see #setObject3D(String)
	 * @see appearance.AppearancePackage#getAObject_Object3D()
	 * @model
	 * @generated
	 */
	String getObject3D();

	/**
	 * Sets the value of the '{@link appearance.AObject#getObject3D <em>Object3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object3 D</em>' attribute.
	 * @see #getObject3D()
	 * @generated
	 */
	void setObject3D(String value);

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' attribute.
	 * @see #setTexture(String)
	 * @see appearance.AppearancePackage#getAObject_Texture()
	 * @model default=""
	 * @generated
	 */
	String getTexture();

	/**
	 * Sets the value of the '{@link appearance.AObject#getTexture <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' attribute.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(String value);

} // AObject
