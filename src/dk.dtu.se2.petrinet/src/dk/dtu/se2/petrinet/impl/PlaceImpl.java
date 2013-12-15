/**
 */
package dk.dtu.se2.petrinet.impl;

import dk.dtu.se2.petrinet.AnimationLabel;
import dk.dtu.se2.petrinet.GeometryLabel;
import dk.dtu.se2.petrinet.InputPlace;
import dk.dtu.se2.petrinet.PetrinetPackage;
import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.petrinet.Token;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.se2.petrinet.impl.PlaceImpl#getGeometryLabel <em>Geometry Label</em>}</li>
 *   <li>{@link dk.dtu.se2.petrinet.impl.PlaceImpl#getAnimationLabel <em>Animation Label</em>}</li>
 *   <li>{@link dk.dtu.se2.petrinet.impl.PlaceImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link dk.dtu.se2.petrinet.impl.PlaceImpl#getInputPlaceLabel <em>Input Place Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.PlaceImpl implements Place {
	/**
	 * The cached value of the '{@link #getGeometryLabel() <em>Geometry Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryLabel()
	 * @generated
	 * @ordered
	 */
	protected GeometryLabel geometryLabel;

	/**
	 * The cached value of the '{@link #getAnimationLabel() <em>Animation Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationLabel()
	 * @generated
	 * @ordered
	 */
	protected AnimationLabel animationLabel;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getInputPlaceLabel() <em>Input Place Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPlaceLabel()
	 * @generated
	 * @ordered
	 */
	protected InputPlace inputPlaceLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryLabel getGeometryLabel() {
		return geometryLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometryLabel(GeometryLabel newGeometryLabel, NotificationChain msgs) {
		GeometryLabel oldGeometryLabel = geometryLabel;
		geometryLabel = newGeometryLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__GEOMETRY_LABEL, oldGeometryLabel, newGeometryLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryLabel(GeometryLabel newGeometryLabel) {
		if (newGeometryLabel != geometryLabel) {
			NotificationChain msgs = null;
			if (geometryLabel != null)
				msgs = ((InternalEObject)geometryLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.PLACE__GEOMETRY_LABEL, null, msgs);
			if (newGeometryLabel != null)
				msgs = ((InternalEObject)newGeometryLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.PLACE__GEOMETRY_LABEL, null, msgs);
			msgs = basicSetGeometryLabel(newGeometryLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__GEOMETRY_LABEL, newGeometryLabel, newGeometryLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationLabel getAnimationLabel() {
		return animationLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnimationLabel(AnimationLabel newAnimationLabel, NotificationChain msgs) {
		AnimationLabel oldAnimationLabel = animationLabel;
		animationLabel = newAnimationLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__ANIMATION_LABEL, oldAnimationLabel, newAnimationLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationLabel(AnimationLabel newAnimationLabel) {
		if (newAnimationLabel != animationLabel) {
			NotificationChain msgs = null;
			if (animationLabel != null)
				msgs = ((InternalEObject)animationLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.PLACE__ANIMATION_LABEL, null, msgs);
			if (newAnimationLabel != null)
				msgs = ((InternalEObject)newAnimationLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.PLACE__ANIMATION_LABEL, null, msgs);
			msgs = basicSetAnimationLabel(newAnimationLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__ANIMATION_LABEL, newAnimationLabel, newAnimationLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, PetrinetPackage.PLACE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPlace getInputPlaceLabel() {
		return inputPlaceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPlaceLabel(InputPlace newInputPlaceLabel, NotificationChain msgs) {
		InputPlace oldInputPlaceLabel = inputPlaceLabel;
		inputPlaceLabel = newInputPlaceLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__INPUT_PLACE_LABEL, oldInputPlaceLabel, newInputPlaceLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPlaceLabel(InputPlace newInputPlaceLabel) {
		if (newInputPlaceLabel != inputPlaceLabel) {
			NotificationChain msgs = null;
			if (inputPlaceLabel != null)
				msgs = ((InternalEObject)inputPlaceLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.PLACE__INPUT_PLACE_LABEL, null, msgs);
			if (newInputPlaceLabel != null)
				msgs = ((InternalEObject)newInputPlaceLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.PLACE__INPUT_PLACE_LABEL, null, msgs);
			msgs = basicSetInputPlaceLabel(newInputPlaceLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__INPUT_PLACE_LABEL, newInputPlaceLabel, newInputPlaceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.PLACE__GEOMETRY_LABEL:
				return basicSetGeometryLabel(null, msgs);
			case PetrinetPackage.PLACE__ANIMATION_LABEL:
				return basicSetAnimationLabel(null, msgs);
			case PetrinetPackage.PLACE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.PLACE__INPUT_PLACE_LABEL:
				return basicSetInputPlaceLabel(null, msgs);
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
			case PetrinetPackage.PLACE__GEOMETRY_LABEL:
				return getGeometryLabel();
			case PetrinetPackage.PLACE__ANIMATION_LABEL:
				return getAnimationLabel();
			case PetrinetPackage.PLACE__TOKENS:
				return getTokens();
			case PetrinetPackage.PLACE__INPUT_PLACE_LABEL:
				return getInputPlaceLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetrinetPackage.PLACE__GEOMETRY_LABEL:
				setGeometryLabel((GeometryLabel)newValue);
				return;
			case PetrinetPackage.PLACE__ANIMATION_LABEL:
				setAnimationLabel((AnimationLabel)newValue);
				return;
			case PetrinetPackage.PLACE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case PetrinetPackage.PLACE__INPUT_PLACE_LABEL:
				setInputPlaceLabel((InputPlace)newValue);
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
			case PetrinetPackage.PLACE__GEOMETRY_LABEL:
				setGeometryLabel((GeometryLabel)null);
				return;
			case PetrinetPackage.PLACE__ANIMATION_LABEL:
				setAnimationLabel((AnimationLabel)null);
				return;
			case PetrinetPackage.PLACE__TOKENS:
				getTokens().clear();
				return;
			case PetrinetPackage.PLACE__INPUT_PLACE_LABEL:
				setInputPlaceLabel((InputPlace)null);
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
			case PetrinetPackage.PLACE__GEOMETRY_LABEL:
				return geometryLabel != null;
			case PetrinetPackage.PLACE__ANIMATION_LABEL:
				return animationLabel != null;
			case PetrinetPackage.PLACE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case PetrinetPackage.PLACE__INPUT_PLACE_LABEL:
				return inputPlaceLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
