/**
 */
package geometry2nd.impl;

import geometry2nd.Geometry2ndPackage;
import geometry2nd.Point;

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
 *   <li>{@link geometry2nd.impl.PointImpl#getXLocation <em>XLocation</em>}</li>
 *   <li>{@link geometry2nd.impl.PointImpl#getYLocation <em>YLocation</em>}</li>
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
	@Override
	protected EClass eStaticClass() {
		return Geometry2ndPackage.Literals.POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Geometry2ndPackage.POINT__XLOCATION, oldXLocation, xLocation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Geometry2ndPackage.POINT__YLOCATION, oldYLocation, yLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Geometry2ndPackage.POINT__XLOCATION:
				return getXLocation();
			case Geometry2ndPackage.POINT__YLOCATION:
				return getYLocation();
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
			case Geometry2ndPackage.POINT__XLOCATION:
				setXLocation((Integer)newValue);
				return;
			case Geometry2ndPackage.POINT__YLOCATION:
				setYLocation((Integer)newValue);
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
			case Geometry2ndPackage.POINT__XLOCATION:
				setXLocation(XLOCATION_EDEFAULT);
				return;
			case Geometry2ndPackage.POINT__YLOCATION:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Geometry2ndPackage.POINT__XLOCATION:
				return xLocation != XLOCATION_EDEFAULT;
			case Geometry2ndPackage.POINT__YLOCATION:
				return yLocation != YLOCATION_EDEFAULT;
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
		result.append(" (xLocation: ");
		result.append(xLocation);
		result.append(", yLocation: ");
		result.append(yLocation);
		result.append(')');
		return result.toString();
	}

} //PointImpl
