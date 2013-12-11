/**
 */
package dk.dtu.se2.animation.impl;

import dk.dtu.se2.animation.AnimationPackage;
import dk.dtu.se2.animation.Appear;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appear</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.se2.animation.impl.AppearImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link dk.dtu.se2.animation.impl.AppearImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppearImpl extends AnimationImpl implements Appear {
	/**
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected String geometry = GEOMETRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppearance() <em>Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected static final String APPEARANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected String appearance = APPEARANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.APPEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(String newGeometry) {
		String oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.APPEAR__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppearance() {
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(String newAppearance) {
		String oldAppearance = appearance;
		appearance = newAppearance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnimationPackage.APPEAR__APPEARANCE, oldAppearance, appearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnimationPackage.APPEAR__GEOMETRY:
				return getGeometry();
			case AnimationPackage.APPEAR__APPEARANCE:
				return getAppearance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnimationPackage.APPEAR__GEOMETRY:
				setGeometry((String)newValue);
				return;
			case AnimationPackage.APPEAR__APPEARANCE:
				setAppearance((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AnimationPackage.APPEAR__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
				return;
			case AnimationPackage.APPEAR__APPEARANCE:
				setAppearance(APPEARANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AnimationPackage.APPEAR__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
			case AnimationPackage.APPEAR__APPEARANCE:
				return APPEARANCE_EDEFAULT == null ? appearance != null : !APPEARANCE_EDEFAULT.equals(appearance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (geometry: ");
		result.append(geometry);
		result.append(", appearance: ");
		result.append(appearance);
		result.append(')');
		return result.toString();
	}

} //AppearImpl
