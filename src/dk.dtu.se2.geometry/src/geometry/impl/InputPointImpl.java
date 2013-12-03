/**
 */
package geometry.impl;

import geometry.GeometryPackage;
import geometry.InputPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry.impl.InputPointImpl#getAppearanceLabel <em>Appearance Label</em>}</li>
 *   <li>{@link geometry.impl.InputPointImpl#getTokenAppearanceLabel <em>Token Appearance Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputPointImpl extends PointImpl implements InputPoint {
	/**
	 * The default value of the '{@link #getAppearanceLabel() <em>Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String APPEARANCE_LABEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAppearanceLabel() <em>Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceLabel()
	 * @generated
	 * @ordered
	 */
	protected String appearanceLabel = APPEARANCE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenAppearanceLabel() <em>Token Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenAppearanceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_APPEARANCE_LABEL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTokenAppearanceLabel() <em>Token Appearance Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenAppearanceLabel()
	 * @generated
	 * @ordered
	 */
	protected String tokenAppearanceLabel = TOKEN_APPEARANCE_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.INPUT_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppearanceLabel() {
		return appearanceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearanceLabel(String newAppearanceLabel) {
		String oldAppearanceLabel = appearanceLabel;
		appearanceLabel = newAppearanceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.INPUT_POINT__APPEARANCE_LABEL, oldAppearanceLabel, appearanceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenAppearanceLabel() {
		return tokenAppearanceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenAppearanceLabel(String newTokenAppearanceLabel) {
		String oldTokenAppearanceLabel = tokenAppearanceLabel;
		tokenAppearanceLabel = newTokenAppearanceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.INPUT_POINT__TOKEN_APPEARANCE_LABEL, oldTokenAppearanceLabel, tokenAppearanceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeometryPackage.INPUT_POINT__APPEARANCE_LABEL:
				return getAppearanceLabel();
			case GeometryPackage.INPUT_POINT__TOKEN_APPEARANCE_LABEL:
				return getTokenAppearanceLabel();
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
			case GeometryPackage.INPUT_POINT__APPEARANCE_LABEL:
				setAppearanceLabel((String)newValue);
				return;
			case GeometryPackage.INPUT_POINT__TOKEN_APPEARANCE_LABEL:
				setTokenAppearanceLabel((String)newValue);
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
			case GeometryPackage.INPUT_POINT__APPEARANCE_LABEL:
				setAppearanceLabel(APPEARANCE_LABEL_EDEFAULT);
				return;
			case GeometryPackage.INPUT_POINT__TOKEN_APPEARANCE_LABEL:
				setTokenAppearanceLabel(TOKEN_APPEARANCE_LABEL_EDEFAULT);
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
			case GeometryPackage.INPUT_POINT__APPEARANCE_LABEL:
				return APPEARANCE_LABEL_EDEFAULT == null ? appearanceLabel != null : !APPEARANCE_LABEL_EDEFAULT.equals(appearanceLabel);
			case GeometryPackage.INPUT_POINT__TOKEN_APPEARANCE_LABEL:
				return TOKEN_APPEARANCE_LABEL_EDEFAULT == null ? tokenAppearanceLabel != null : !TOKEN_APPEARANCE_LABEL_EDEFAULT.equals(tokenAppearanceLabel);
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
		result.append(" (appearanceLabel: ");
		result.append(appearanceLabel);
		result.append(", tokenAppearanceLabel: ");
		result.append(tokenAppearanceLabel);
		result.append(')');
		return result.toString();
	}

} //InputPointImpl
