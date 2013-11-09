/**
 */
package configuration.impl;

import configuration.ConfigurationPackage;
import configuration.PetriNetModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.PetriNetModelImpl#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetModelImpl extends MinimalEObjectImpl.Container implements PetriNetModel {
	/**
	 * The default value of the '{@link #getPetriNet() <em>Petri Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriNet()
	 * @generated
	 * @ordered
	 */
	protected static final Resource PETRI_NET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPetriNet() <em>Petri Net</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriNet()
	 * @generated
	 * @ordered
	 */
	protected Resource petriNet = PETRI_NET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PETRI_NET_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getPetriNet() {
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetriNet(Resource newPetriNet) {
		Resource oldPetriNet = petriNet;
		petriNet = newPetriNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PETRI_NET_MODEL__PETRI_NET, oldPetriNet, petriNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.PETRI_NET_MODEL__PETRI_NET:
				return getPetriNet();
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
			case ConfigurationPackage.PETRI_NET_MODEL__PETRI_NET:
				setPetriNet((Resource)newValue);
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
			case ConfigurationPackage.PETRI_NET_MODEL__PETRI_NET:
				setPetriNet(PETRI_NET_EDEFAULT);
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
			case ConfigurationPackage.PETRI_NET_MODEL__PETRI_NET:
				return PETRI_NET_EDEFAULT == null ? petriNet != null : !PETRI_NET_EDEFAULT.equals(petriNet);
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
		result.append(" (petriNet: ");
		result.append(petriNet);
		result.append(')');
		return result.toString();
	}

} //PetriNetModelImpl
