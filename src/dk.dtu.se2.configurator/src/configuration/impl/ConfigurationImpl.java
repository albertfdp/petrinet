/**
 */
package configuration.impl;

import configuration.AppearanceModel;
import configuration.Configuration;
import configuration.ConfigurationPackage;
import configuration.GeometryModel;
import configuration.PetriNetModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuration.impl.ConfigurationImpl#getPetriNetModel <em>Petri Net Model</em>}</li>
 *   <li>{@link configuration.impl.ConfigurationImpl#getGeometryModel <em>Geometry Model</em>}</li>
 *   <li>{@link configuration.impl.ConfigurationImpl#getAppearanceModel <em>Appearance Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationImpl extends MinimalEObjectImpl.Container implements Configuration {
	/**
	 * The cached value of the '{@link #getPetriNetModel() <em>Petri Net Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriNetModel()
	 * @generated
	 * @ordered
	 */
	protected PetriNetModel petriNetModel;

	/**
	 * The cached value of the '{@link #getGeometryModel() <em>Geometry Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryModel()
	 * @generated
	 * @ordered
	 */
	protected GeometryModel geometryModel;

	/**
	 * The cached value of the '{@link #getAppearanceModel() <em>Appearance Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceModel()
	 * @generated
	 * @ordered
	 */
	protected AppearanceModel appearanceModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetModel getPetriNetModel() {
		return petriNetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetriNetModel(PetriNetModel newPetriNetModel, NotificationChain msgs) {
		PetriNetModel oldPetriNetModel = petriNetModel;
		petriNetModel = newPetriNetModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL, oldPetriNetModel, newPetriNetModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetriNetModel(PetriNetModel newPetriNetModel) {
		if (newPetriNetModel != petriNetModel) {
			NotificationChain msgs = null;
			if (petriNetModel != null)
				msgs = ((InternalEObject)petriNetModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL, null, msgs);
			if (newPetriNetModel != null)
				msgs = ((InternalEObject)newPetriNetModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL, null, msgs);
			msgs = basicSetPetriNetModel(newPetriNetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL, newPetriNetModel, newPetriNetModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryModel getGeometryModel() {
		return geometryModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryModel(GeometryModel newGeometryModel, NotificationChain msgs) {
		GeometryModel oldGeometryModel = geometryModel;
		geometryModel = newGeometryModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL, oldGeometryModel, newGeometryModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryModel(GeometryModel newGeometryModel) {
		if (newGeometryModel != geometryModel) {
			NotificationChain msgs = null;
			if (geometryModel != null)
				msgs = ((InternalEObject)geometryModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL, null, msgs);
			if (newGeometryModel != null)
				msgs = ((InternalEObject)newGeometryModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL, null, msgs);
			msgs = basicSetGeometryModel(newGeometryModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL, newGeometryModel, newGeometryModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceModel getAppearanceModel() {
		return appearanceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearanceModel(AppearanceModel newAppearanceModel, NotificationChain msgs) {
		AppearanceModel oldAppearanceModel = appearanceModel;
		appearanceModel = newAppearanceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL, oldAppearanceModel, newAppearanceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearanceModel(AppearanceModel newAppearanceModel) {
		if (newAppearanceModel != appearanceModel) {
			NotificationChain msgs = null;
			if (appearanceModel != null)
				msgs = ((InternalEObject)appearanceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL, null, msgs);
			if (newAppearanceModel != null)
				msgs = ((InternalEObject)newAppearanceModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL, null, msgs);
			msgs = basicSetAppearanceModel(newAppearanceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL, newAppearanceModel, newAppearanceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL:
				return basicSetPetriNetModel(null, msgs);
			case ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL:
				return basicSetGeometryModel(null, msgs);
			case ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL:
				return basicSetAppearanceModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL:
				return getPetriNetModel();
			case ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL:
				return getGeometryModel();
			case ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL:
				return getAppearanceModel();
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
			case ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL:
				setPetriNetModel((PetriNetModel)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL:
				setGeometryModel((GeometryModel)newValue);
				return;
			case ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL:
				setAppearanceModel((AppearanceModel)newValue);
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
			case ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL:
				setPetriNetModel((PetriNetModel)null);
				return;
			case ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL:
				setGeometryModel((GeometryModel)null);
				return;
			case ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL:
				setAppearanceModel((AppearanceModel)null);
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
			case ConfigurationPackage.CONFIGURATION__PETRI_NET_MODEL:
				return petriNetModel != null;
			case ConfigurationPackage.CONFIGURATION__GEOMETRY_MODEL:
				return geometryModel != null;
			case ConfigurationPackage.CONFIGURATION__APPEARANCE_MODEL:
				return appearanceModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
