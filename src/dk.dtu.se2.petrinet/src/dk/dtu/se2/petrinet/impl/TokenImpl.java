/**
 */
package dk.dtu.se2.petrinet.impl;

import dk.dtu.se2.petrinet.AppearanceLabel;
import dk.dtu.se2.petrinet.PetrinetPackage;
import dk.dtu.se2.petrinet.Token;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.pnml.tools.epnk.pnmlcoremodel.impl.AttributeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.se2.petrinet.impl.TokenImpl#getAppearanceLabel <em>Appearance Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenImpl extends AttributeImpl implements Token {
	/**
	 * The cached value of the '{@link #getAppearanceLabel() <em>Appearance Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppearanceLabel()
	 * @generated
	 * @ordered
	 */
	protected AppearanceLabel appearanceLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppearanceLabel getAppearanceLabel() {
		return appearanceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppearanceLabel(AppearanceLabel newAppearanceLabel, NotificationChain msgs) {
		AppearanceLabel oldAppearanceLabel = appearanceLabel;
		appearanceLabel = newAppearanceLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.TOKEN__APPEARANCE_LABEL, oldAppearanceLabel, newAppearanceLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppearanceLabel(AppearanceLabel newAppearanceLabel) {
		if (newAppearanceLabel != appearanceLabel) {
			NotificationChain msgs = null;
			if (appearanceLabel != null)
				msgs = ((InternalEObject)appearanceLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.TOKEN__APPEARANCE_LABEL, null, msgs);
			if (newAppearanceLabel != null)
				msgs = ((InternalEObject)newAppearanceLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.TOKEN__APPEARANCE_LABEL, null, msgs);
			msgs = basicSetAppearanceLabel(newAppearanceLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.TOKEN__APPEARANCE_LABEL, newAppearanceLabel, newAppearanceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.TOKEN__APPEARANCE_LABEL:
				return basicSetAppearanceLabel(null, msgs);
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
			case PetrinetPackage.TOKEN__APPEARANCE_LABEL:
				return getAppearanceLabel();
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
			case PetrinetPackage.TOKEN__APPEARANCE_LABEL:
				setAppearanceLabel((AppearanceLabel)newValue);
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
			case PetrinetPackage.TOKEN__APPEARANCE_LABEL:
				setAppearanceLabel((AppearanceLabel)null);
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
			case PetrinetPackage.TOKEN__APPEARANCE_LABEL:
				return appearanceLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //TokenImpl
