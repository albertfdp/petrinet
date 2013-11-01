/**
 */
package animation;

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
 * @see animation.AnimationFactory
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
	AnimationPackage eINSTANCE = animation.impl.AnimationPackageImpl.init();

	/**
	 * The meta object id for the '{@link animation.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animation.impl.AnimationImpl
	 * @see animation.impl.AnimationPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 0;

	/**
	 * The feature id for the '<em><b>Animation Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__ANIMATION_OBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link animation.impl.AnimationObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animation.impl.AnimationObjectImpl
	 * @see animation.impl.AnimationPackageImpl#getAnimationObject()
	 * @generated
	 */
	int ANIMATION_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OBJECT__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link animation.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animation.impl.MoveImpl
	 * @see animation.impl.AnimationPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__LABEL = ANIMATION_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SPEED = ANIMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = ANIMATION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = ANIMATION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link animation.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animation.impl.ShowImpl
	 * @see animation.impl.AnimationPackageImpl#getShow()
	 * @generated
	 */
	int SHOW = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__LABEL = ANIMATION_OBJECT__LABEL;

	/**
	 * The number of structural features of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_FEATURE_COUNT = ANIMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_OPERATION_COUNT = ANIMATION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link animation.impl.HideImpl <em>Hide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animation.impl.HideImpl
	 * @see animation.impl.AnimationPackageImpl#getHide()
	 * @generated
	 */
	int HIDE = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__LABEL = ANIMATION_OBJECT__LABEL;

	/**
	 * The number of structural features of the '<em>Hide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_FEATURE_COUNT = ANIMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_OPERATION_COUNT = ANIMATION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link animation.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see animation.impl.StopImpl
	 * @see animation.impl.AnimationPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__LABEL = ANIMATION_OBJECT__LABEL;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = ANIMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = ANIMATION_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link animation.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see animation.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the containment reference list '{@link animation.Animation#getAnimationObjects <em>Animation Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animation Objects</em>'.
	 * @see animation.Animation#getAnimationObjects()
	 * @see #getAnimation()
	 * @generated
	 */
	EReference getAnimation_AnimationObjects();

	/**
	 * Returns the meta object for class '{@link animation.AnimationObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see animation.AnimationObject
	 * @generated
	 */
	EClass getAnimationObject();

	/**
	 * Returns the meta object for the attribute '{@link animation.AnimationObject#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see animation.AnimationObject#getLabel()
	 * @see #getAnimationObject()
	 * @generated
	 */
	EAttribute getAnimationObject_Label();

	/**
	 * Returns the meta object for class '{@link animation.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see animation.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link animation.Move#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see animation.Move#getSpeed()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Speed();

	/**
	 * Returns the meta object for class '{@link animation.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see animation.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for class '{@link animation.Hide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide</em>'.
	 * @see animation.Hide
	 * @generated
	 */
	EClass getHide();

	/**
	 * Returns the meta object for class '{@link animation.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see animation.Stop
	 * @generated
	 */
	EClass getStop();

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
		 * The meta object literal for the '{@link animation.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animation.impl.AnimationImpl
		 * @see animation.impl.AnimationPackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Animation Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMATION__ANIMATION_OBJECTS = eINSTANCE.getAnimation_AnimationObjects();

		/**
		 * The meta object literal for the '{@link animation.impl.AnimationObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animation.impl.AnimationObjectImpl
		 * @see animation.impl.AnimationPackageImpl#getAnimationObject()
		 * @generated
		 */
		EClass ANIMATION_OBJECT = eINSTANCE.getAnimationObject();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION_OBJECT__LABEL = eINSTANCE.getAnimationObject_Label();

		/**
		 * The meta object literal for the '{@link animation.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animation.impl.MoveImpl
		 * @see animation.impl.AnimationPackageImpl#getMove()
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
		 * The meta object literal for the '{@link animation.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animation.impl.ShowImpl
		 * @see animation.impl.AnimationPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '{@link animation.impl.HideImpl <em>Hide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animation.impl.HideImpl
		 * @see animation.impl.AnimationPackageImpl#getHide()
		 * @generated
		 */
		EClass HIDE = eINSTANCE.getHide();

		/**
		 * The meta object literal for the '{@link animation.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see animation.impl.StopImpl
		 * @see animation.impl.AnimationPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

	}

} //AnimationPackage
