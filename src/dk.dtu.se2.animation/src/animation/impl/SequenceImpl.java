/**
 */
package animation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import animation.AnimationObject;
import animation.AnimationPackage;
import animation.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link animation.impl.SequenceImpl#getAnimations <em>Animations</em>}</li>
 *   <li>{@link animation.impl.SequenceImpl#getAnimationObjects <em>Animation Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends AnimationImpl implements Sequence {
	/**
	 * The cached value of the '{@link #getAnimations() <em>Animations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnimationObject> animations;

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
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnimationPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnimationObject> getAnimations() {
		if (animations == null) {
			animations = new EObjectContainmentEList<AnimationObject>(AnimationObject.class, this, AnimationPackage.SEQUENCE__ANIMATIONS);
		}
		return animations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnimationObject> getAnimationObjects() {
		if (animationObjects == null) {
			animationObjects = new EObjectContainmentEList<AnimationObject>(AnimationObject.class, this, AnimationPackage.SEQUENCE__ANIMATION_OBJECTS);
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
			case AnimationPackage.SEQUENCE__ANIMATIONS:
				return ((InternalEList<?>)getAnimations()).basicRemove(otherEnd, msgs);
			case AnimationPackage.SEQUENCE__ANIMATION_OBJECTS:
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
			case AnimationPackage.SEQUENCE__ANIMATIONS:
				return getAnimations();
			case AnimationPackage.SEQUENCE__ANIMATION_OBJECTS:
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
			case AnimationPackage.SEQUENCE__ANIMATIONS:
				getAnimations().clear();
				getAnimations().addAll((Collection<? extends AnimationObject>)newValue);
				return;
			case AnimationPackage.SEQUENCE__ANIMATION_OBJECTS:
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
			case AnimationPackage.SEQUENCE__ANIMATIONS:
				getAnimations().clear();
				return;
			case AnimationPackage.SEQUENCE__ANIMATION_OBJECTS:
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
			case AnimationPackage.SEQUENCE__ANIMATIONS:
				return animations != null && !animations.isEmpty();
			case AnimationPackage.SEQUENCE__ANIMATION_OBJECTS:
				return animationObjects != null && !animationObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
