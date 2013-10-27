/**
 */
package geometry.impl;

import geometry.GeometryPackage;
import geometry.Point;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry.impl.PointImpl#getXLocation <em>XLocation</em>}</li>
 *   <li>{@link geometry.impl.PointImpl#getYLocation <em>YLocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointImpl extends GObjectImpl implements Point {
	/**
	 * The default value of the '{@link #getXLocation() <em>XLocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int XLOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXLocation() <em>XLocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLocation()
	 * @generated
	 * @ordered
	 */
	protected int xLocation = XLOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYLocation() <em>YLocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLocation()
	 * @generated
	 * @ordered
	 */
	protected static final int YLOCATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYLocation() <em>YLocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLocation()
	 * @generated
	 * @ordered
	 */
	protected int yLocation = YLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXLocation() {
		return xLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXLocation(int newXLocation) {
		int oldXLocation = xLocation;
		xLocation = newXLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.POINT__XLOCATION, oldXLocation, xLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYLocation() {
		return yLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYLocation(int newYLocation) {
		int oldYLocation = yLocation;
		yLocation = newYLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.POINT__YLOCATION, oldYLocation, yLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeometryPackage.POINT__XLOCATION:
				return new Integer(getXLocation());
			case GeometryPackage.POINT__YLOCATION:
				return new Integer(getYLocation());
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeometryPackage.POINT__XLOCATION:
				setXLocation(((Integer)newValue).intValue());
				return;
			case GeometryPackage.POINT__YLOCATION:
				setYLocation(((Integer)newValue).intValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeometryPackage.POINT__XLOCATION:
				setXLocation(XLOCATION_EDEFAULT);
				return;
			case GeometryPackage.POINT__YLOCATION:
				setYLocation(YLOCATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeometryPackage.POINT__XLOCATION:
				return xLocation != XLOCATION_EDEFAULT;
			case GeometryPackage.POINT__YLOCATION:
				return yLocation != YLOCATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xLocation: ");
		result.append(xLocation);
		result.append(", yLocation: ");
		result.append(yLocation);
		result.append(')');
		return result.toString();
	}

} //PointImpl