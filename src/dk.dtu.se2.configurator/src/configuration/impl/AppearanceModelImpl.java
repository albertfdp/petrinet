/**
 */
package configuration.impl;

import configuration.AppearanceModel;
import configuration.ConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appearance Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.AppearanceModelImpl#getAppearance <em>Appearance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppearanceModelImpl extends MinimalEObjectImpl.Container implements AppearanceModel {
	/**
	 * The default value of the '{@link #getAppearance() <em>Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected static final Resource APPEARANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearance()
	 * @generated
	 * @ordered
	 */
	protected Resource appearance = APPEARANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppearanceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.APPEARANCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAppearance() {
		return appearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearance(Resource newAppearance) {
		Resource oldAppearance = appearance;
		appearance = newAppearance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.APPEARANCE_MODEL__APPEARANCE, oldAppearance, appearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.APPEARANCE_MODEL__APPEARANCE:
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
			case ConfigurationPackage.APPEARANCE_MODEL__APPEARANCE:
				setAppearance((Resource)newValue);
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
			case ConfigurationPackage.APPEARANCE_MODEL__APPEARANCE:
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
			case ConfigurationPackage.APPEARANCE_MODEL__APPEARANCE:
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
		result.append(" (appearance: ");
		result.append(appearance);
		result.append(')');
		return result.toString();
	}

} //AppearanceModelImpl
