/**
 */
package animation.impl;

import animation.Animation;
import animation.AnimationObject;
import animation.AnimationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link animation.impl.AnimationImpl#getAnimationObjects <em>Animation Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimationImpl extends MinimalEObjectImpl.Container implements Animation {
	/**
	 * The cached value of the '{@link #getAnimationObjects() <em>Animation Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<AnimationObject> animationObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.ANIMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnimationObject> getAnimationObjects() {
		if (animationObjects == null) {
			animationObjects = new EObjectContainmentEList<AnimationObject>(AnimationObject.class, this, AnimationPackage.ANIMATION__ANIMATION_OBJECTS);
		}
		return animationObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnimationPackage.ANIMATION__ANIMATION_OBJECTS:
				return ((InternalEList<?>)getAnimationObjects()).basicRemove(otherEnd, msgs);
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
			case AnimationPackage.ANIMATION__ANIMATION_OBJECTS:
				return getAnimationObjects();
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
			case AnimationPackage.ANIMATION__ANIMATION_OBJECTS:
				getAnimationObjects().clear();
				getAnimationObjects().addAll((Collection<? extends AnimationObject>)newValue);
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
			case AnimationPackage.ANIMATION__ANIMATION_OBJECTS:
				getAnimationObjects().clear();
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
			case AnimationPackage.ANIMATION__ANIMATION_OBJECTS:
				return animationObjects != null && !animationObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnimationImpl
