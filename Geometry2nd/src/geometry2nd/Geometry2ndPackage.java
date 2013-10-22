/**
 */
package geometry2nd;

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
 * @see geometry2nd.Geometry2ndFactory
 * @model kind="package"
 * @generated
 */
public interface Geometry2ndPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry2nd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://geometry2nd/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geometry2nd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Geometry2ndPackage eINSTANCE = geometry2nd.impl.Geometry2ndPackageImpl.init();

	/**
	 * The meta object id for the '{@link geometry2nd.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry2nd.impl.GeometryImpl
	 * @see geometry2nd.impl.Geometry2ndPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>GObjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__GOBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link geometry2nd.impl.GObjectImpl <em>GObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry2nd.impl.GObjectImpl
	 * @see geometry2nd.impl.Geometry2ndPackageImpl#getGObject()
	 * @generated
	 */
	int GOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT__ID = 1;

	/**
	 * The number of structural features of the '<em>GObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link geometry2nd.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry2nd.impl.LineImpl
	 * @see geometry2nd.impl.Geometry2ndPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__LABEL = GOBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = GOBJECT__ID;

	/**
	 * The feature id for the '<em><b>Bend Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BEND_POINT = GOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BEGIN = GOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__END = GOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = GOBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = GOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link geometry2nd.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry2nd.impl.PointImpl
	 * @see geometry2nd.impl.Geometry2ndPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__LABEL = GOBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ID = GOBJECT__ID;

	/**
	 * The feature id for the '<em><b>XLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__XLOCATION = GOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__YLOCATION = GOBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = GOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = GOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link geometry2nd.impl.InputPointImpl <em>Input Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry2nd.impl.InputPointImpl
	 * @see geometry2nd.impl.Geometry2ndPackageImpl#getInputPoint()
	 * @generated
	 */
	int INPUT_POINT = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_POINT__LABEL = POINT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_POINT__ID = POINT__ID;

	/**
	 * The feature id for the '<em><b>XLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_POINT__XLOCATION = POINT__XLOCATION;

	/**
	 * The feature id for the '<em><b>YLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_POINT__YLOCATION = POINT__YLOCATION;

	/**
	 * The number of structural features of the '<em>Input Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_POINT_FEATURE_COUNT = POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_POINT_OPERATION_COUNT = POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link geometry2nd.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry2nd.impl.ConnectorImpl
	 * @see geometry2nd.impl.Geometry2ndPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__LABEL = POINT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = POINT__ID;

	/**
	 * The feature id for the '<em><b>XLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__XLOCATION = POINT__XLOCATION;

	/**
	 * The feature id for the '<em><b>YLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__YLOCATION = POINT__YLOCATION;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__OUT = POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__IN = POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link geometry2nd.impl.BendPointImpl <em>Bend Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry2nd.impl.BendPointImpl
	 * @see geometry2nd.impl.Geometry2ndPackageImpl#getBendPoint()
	 * @generated
	 */
	int BEND_POINT = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT__LABEL = POINT__LABEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT__ID = POINT__ID;

	/**
	 * The feature id for the '<em><b>XLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT__XLOCATION = POINT__XLOCATION;

	/**
	 * The feature id for the '<em><b>YLocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT__YLOCATION = POINT__YLOCATION;

	/**
	 * The number of structural features of the '<em>Bend Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT_FEATURE_COUNT = POINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bend Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT_OPERATION_COUNT = POINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link geometry2nd.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see geometry2nd.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry2nd.Geometry#getGObjects <em>GObjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GObjects</em>'.
	 * @see geometry2nd.Geometry#getGObjects()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_GObjects();

	/**
	 * Returns the meta object for class '{@link geometry2nd.GObject <em>GObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObject</em>'.
	 * @see geometry2nd.GObject
	 * @generated
	 */
	EClass getGObject();

	/**
	 * Returns the meta object for the attribute '{@link geometry2nd.GObject#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see geometry2nd.GObject#getLabel()
	 * @see #getGObject()
	 * @generated
	 */
	EAttribute getGObject_Label();

	/**
	 * Returns the meta object for the attribute '{@link geometry2nd.GObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see geometry2nd.GObject#getId()
	 * @see #getGObject()
	 * @generated
	 */
	EAttribute getGObject_Id();

	/**
	 * Returns the meta object for class '{@link geometry2nd.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see geometry2nd.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry2nd.Line#getBendPoint <em>Bend Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bend Point</em>'.
	 * @see geometry2nd.Line#getBendPoint()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_BendPoint();

	/**
	 * Returns the meta object for the reference '{@link geometry2nd.Line#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Begin</em>'.
	 * @see geometry2nd.Line#getBegin()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Begin();

	/**
	 * Returns the meta object for the reference '{@link geometry2nd.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see geometry2nd.Line#getEnd()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_End();

	/**
	 * Returns the meta object for class '{@link geometry2nd.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see geometry2nd.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link geometry2nd.Point#getXLocation <em>XLocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XLocation</em>'.
	 * @see geometry2nd.Point#getXLocation()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_XLocation();

	/**
	 * Returns the meta object for the attribute '{@link geometry2nd.Point#getYLocation <em>YLocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YLocation</em>'.
	 * @see geometry2nd.Point#getYLocation()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_YLocation();

	/**
	 * Returns the meta object for class '{@link geometry2nd.InputPoint <em>Input Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Point</em>'.
	 * @see geometry2nd.InputPoint
	 * @generated
	 */
	EClass getInputPoint();

	/**
	 * Returns the meta object for class '{@link geometry2nd.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see geometry2nd.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link geometry2nd.Connector#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see geometry2nd.Connector#getOut()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Out();

	/**
	 * Returns the meta object for the reference list '{@link geometry2nd.Connector#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see geometry2nd.Connector#getIn()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_In();

	/**
	 * Returns the meta object for class '{@link geometry2nd.BendPoint <em>Bend Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bend Point</em>'.
	 * @see geometry2nd.BendPoint
	 * @generated
	 */
	EClass getBendPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Geometry2ndFactory getGeometry2ndFactory();

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
		 * The meta object literal for the '{@link geometry2nd.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry2nd.impl.GeometryImpl
		 * @see geometry2nd.impl.Geometry2ndPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>GObjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__GOBJECTS = eINSTANCE.getGeometry_GObjects();

		/**
		 * The meta object literal for the '{@link geometry2nd.impl.GObjectImpl <em>GObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry2nd.impl.GObjectImpl
		 * @see geometry2nd.impl.Geometry2ndPackageImpl#getGObject()
		 * @generated
		 */
		EClass GOBJECT = eINSTANCE.getGObject();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOBJECT__LABEL = eINSTANCE.getGObject_Label();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOBJECT__ID = eINSTANCE.getGObject_Id();

		/**
		 * The meta object literal for the '{@link geometry2nd.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry2nd.impl.LineImpl
		 * @see geometry2nd.impl.Geometry2ndPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Bend Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__BEND_POINT = eINSTANCE.getLine_BendPoint();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__BEGIN = eINSTANCE.getLine_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__END = eINSTANCE.getLine_End();

		/**
		 * The meta object literal for the '{@link geometry2nd.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry2nd.impl.PointImpl
		 * @see geometry2nd.impl.Geometry2ndPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>XLocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__XLOCATION = eINSTANCE.getPoint_XLocation();

		/**
		 * The meta object literal for the '<em><b>YLocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__YLOCATION = eINSTANCE.getPoint_YLocation();

		/**
		 * The meta object literal for the '{@link geometry2nd.impl.InputPointImpl <em>Input Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry2nd.impl.InputPointImpl
		 * @see geometry2nd.impl.Geometry2ndPackageImpl#getInputPoint()
		 * @generated
		 */
		EClass INPUT_POINT = eINSTANCE.getInputPoint();

		/**
		 * The meta object literal for the '{@link geometry2nd.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry2nd.impl.ConnectorImpl
		 * @see geometry2nd.impl.Geometry2ndPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__OUT = eINSTANCE.getConnector_Out();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__IN = eINSTANCE.getConnector_In();

		/**
		 * The meta object literal for the '{@link geometry2nd.impl.BendPointImpl <em>Bend Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry2nd.impl.BendPointImpl
		 * @see geometry2nd.impl.Geometry2ndPackageImpl#getBendPoint()
		 * @generated
		 */
		EClass BEND_POINT = eINSTANCE.getBendPoint();

	}

} //Geometry2ndPackage
