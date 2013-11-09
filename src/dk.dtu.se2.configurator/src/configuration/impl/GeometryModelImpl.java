/**
 */
package configuration.impl;

import configuration.ConfigurationPackage;
import configuration.GeometryModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.GeometryModelImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryModelImpl extends MinimalEObjectImpl.Container implements GeometryModel {
	/**
	 * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected static final Resource GEOMETRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected Resource geometry = GEOMETRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.GEOMETRY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometry(Resource newGeometry) {
		Resource oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GEOMETRY_MODEL__GEOMETRY, oldGeometry, geometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.GEOMETRY_MODEL__GEOMETRY:
				return getGeometry();
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
			case ConfigurationPackage.GEOMETRY_MODEL__GEOMETRY:
				setGeometry((Resource)newValue);
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
			case ConfigurationPackage.GEOMETRY_MODEL__GEOMETRY:
				setGeometry(GEOMETRY_EDEFAULT);
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
			case ConfigurationPackage.GEOMETRY_MODEL__GEOMETRY:
				return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
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
		result.append(')');
		return result.toString();
	}

} //GeometryModelImpl
