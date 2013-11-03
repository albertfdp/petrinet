/**
 */
package dk.dtu.se2.tutorials.tutorial6.animation.animation.impl;

import dk.dtu.se2.tutorials.tutorial6.animation.animation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnimationFactoryImpl extends EFactoryImpl implements AnimationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnimationFactory init() {
		try {
			AnimationFactory theAnimationFactory = (AnimationFactory)EPackage.Registry.INSTANCE.getEFactory(AnimationPackage.eNS_URI);
			if (theAnimationFactory != null) {
				return theAnimationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnimationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnimationPackage.ANIMATION: return createAnimation();
			case AnimationPackage.SEQUENCE: return createSequence();
			case AnimationPackage.MOVE: return createMove();
			case AnimationPackage.SHOW: return createShow();
			case AnimationPackage.HIDE: return createHide();
			case AnimationPackage.STOP: return createStop();
			case AnimationPackage.ANIMATION_OBJECT: return createAnimationObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation createAnimation() {
		AnimationImpl animation = new AnimationImpl();
		return animation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Show createShow() {
		ShowImpl show = new ShowImpl();
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hide createHide() {
		HideImpl hide = new HideImpl();
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationObject createAnimationObject() {
		AnimationObjectImpl animationObject = new AnimationObjectImpl();
		return animationObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationPackage getAnimationPackage() {
		return (AnimationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnimationPackage getPackage() {
		return AnimationPackage.eINSTANCE;
	}

} //AnimationFactoryImpl
