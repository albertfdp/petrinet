/**
 */
package dk.dtu.se2.animation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.dtu.se2.animation.AnimationFactory
 * @model kind="package"
 * @generated
 */
public interface AnimationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "animation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://animation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "animation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnimationPackage eINSTANCE = dk.dtu.se2.animation.impl.AnimationPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.se2.animation.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.animation.impl.AnimationImpl
	 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 0;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.animation.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.animation.impl.MoveImpl
	 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SPEED = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = ANIMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.animation.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.animation.impl.StopImpl
	 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 2;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = ANIMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.se2.animation.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.animation.impl.SequenceImpl
	 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 3;

	/**
	 * The feature id for the '<em><b>Animations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ANIMATIONS = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = ANIMATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link dk.dtu.se2.animation.impl.AppearImpl <em>Appear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.se2.animation.impl.AppearImpl
	 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getAppear()
	 * @generated
	 */
	int APPEAR = 4;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEAR__GEOMETRY = ANIMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Appearance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEAR__APPEARANCE = ANIMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Appear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEAR_FEATURE_COUNT = ANIMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Appear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPEAR_OPERATION_COUNT = ANIMATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.animation.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see dk.dtu.se2.animation.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.animation.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see dk.dtu.se2.animation.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.animation.Move#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see dk.dtu.se2.animation.Move#getSpeed()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Speed();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.animation.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see dk.dtu.se2.animation.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.animation.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see dk.dtu.se2.animation.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.se2.animation.Sequence#getAnimations <em>Animations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animations</em>'.
	 * @see dk.dtu.se2.animation.Sequence#getAnimations()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Animations();

	/**
	 * Returns the meta object for class '{@link dk.dtu.se2.animation.Appear <em>Appear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appear</em>'.
	 * @see dk.dtu.se2.animation.Appear
	 * @generated
	 */
	EClass getAppear();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.animation.Appear#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geometry</em>'.
	 * @see dk.dtu.se2.animation.Appear#getGeometry()
	 * @see #getAppear()
	 * @generated
	 */
	EAttribute getAppear_Geometry();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.se2.animation.Appear#getAppearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appearance</em>'.
	 * @see dk.dtu.se2.animation.Appear#getAppearance()
	 * @see #getAppear()
	 * @generated
	 */
	EAttribute getAppear_Appearance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnimationFactory getAnimationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.dtu.se2.animation.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.animation.impl.AnimationImpl
		 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.animation.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.animation.impl.MoveImpl
		 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__SPEED = eINSTANCE.getMove_Speed();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.animation.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.animation.impl.StopImpl
		 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.animation.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.animation.impl.SequenceImpl
		 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Animations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ANIMATIONS = eINSTANCE.getSequence_Animations();

		/**
		 * The meta object literal for the '{@link dk.dtu.se2.animation.impl.AppearImpl <em>Appear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.se2.animation.impl.AppearImpl
		 * @see dk.dtu.se2.animation.impl.AnimationPackageImpl#getAppear()
		 * @generated
		 */
		EClass APPEAR = eINSTANCE.getAppear();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEAR__GEOMETRY = eINSTANCE.getAppear_Geometry();

		/**
		 * The meta object literal for the '<em><b>Appearance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPEAR__APPEARANCE = eINSTANCE.getAppear_Appearance();

	}

} //AnimationPackage
