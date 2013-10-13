/**
 */
package geometry_model;

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
 * @see geometry_model.Geometry_modelFactory
 * @model kind="package"
 * @generated
 */
public interface Geometry_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://geometry_model/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geometry_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Geometry_modelPackage eINSTANCE = geometry_model.impl.Geometry_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link geometry_model.impl.GeometryImpl <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_model.impl.GeometryImpl
	 * @see geometry_model.impl.Geometry_modelPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__EREFERENCE0 = 0;

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
	 * The meta object id for the '{@link geometry_model.impl.GObjectImpl <em>GObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_model.impl.GObjectImpl
	 * @see geometry_model.impl.Geometry_modelPackageImpl#getGObject()
	 * @generated
	 */
	int GOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOBJECT__NAME = 0;

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
	 * The meta object id for the '{@link geometry_model.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_model.impl.LineImpl
	 * @see geometry_model.impl.Geometry_modelPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__NAME = GOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__ID = GOBJECT__ID;

	/**
	 * The feature id for the '<em><b>Bend Point</b></em>' containment reference.
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
	 * The meta object id for the '{@link geometry_model.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_model.impl.PointImpl
	 * @see geometry_model.impl.Geometry_modelPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__NAME = GOBJECT__NAME;

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
	 * The meta object id for the '{@link geometry_model.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_model.impl.ConnectorImpl
	 * @see geometry_model.impl.Geometry_modelPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = POINT__NAME;

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
	 * The meta object id for the '{@link geometry_model.impl.InputPointImpl <em>Input Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_model.impl.InputPointImpl
	 * @see geometry_model.impl.Geometry_modelPackageImpl#getInputPoint()
	 * @generated
	 */
	int INPUT_POINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_POINT__NAME = POINT__NAME;

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
	 * The meta object id for the '{@link geometry_model.impl.BendPointImpl <em>Bend Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see geometry_model.impl.BendPointImpl
	 * @see geometry_model.impl.Geometry_modelPackageImpl#getBendPoint()
	 * @generated
	 */
	int BEND_POINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEND_POINT__NAME = POINT__NAME;

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
	 * Returns the meta object for class '{@link geometry_model.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see geometry_model.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for the containment reference list '{@link geometry_model.Geometry#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference0</em>'.
	 * @see geometry_model.Geometry#getEReference0()
	 * @see #getGeometry()
	 * @generated
	 */
	EReference getGeometry_EReference0();

	/**
	 * Returns the meta object for class '{@link geometry_model.GObject <em>GObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GObject</em>'.
	 * @see geometry_model.GObject
	 * @generated
	 */
	EClass getGObject();

	/**
	 * Returns the meta object for the attribute '{@link geometry_model.GObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see geometry_model.GObject#getName()
	 * @see #getGObject()
	 * @generated
	 */
	EAttribute getGObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link geometry_model.GObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see geometry_model.GObject#getId()
	 * @see #getGObject()
	 * @generated
	 */
	EAttribute getGObject_Id();

	/**
	 * Returns the meta object for class '{@link geometry_model.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see geometry_model.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference '{@link geometry_model.Line#getBendPoint <em>Bend Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bend Point</em>'.
	 * @see geometry_model.Line#getBendPoint()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_BendPoint();

	/**
	 * Returns the meta object for the reference '{@link geometry_model.Line#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Begin</em>'.
	 * @see geometry_model.Line#getBegin()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Begin();

	/**
	 * Returns the meta object for the reference '{@link geometry_model.Line#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see geometry_model.Line#getEnd()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_End();

	/**
	 * Returns the meta object for class '{@link geometry_model.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see geometry_model.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link geometry_model.Point#getXLocation <em>XLocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XLocation</em>'.
	 * @see geometry_model.Point#getXLocation()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_XLocation();

	/**
	 * Returns the meta object for the attribute '{@link geometry_model.Point#getYLocation <em>YLocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YLocation</em>'.
	 * @see geometry_model.Point#getYLocation()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_YLocation();

	/**
	 * Returns the meta object for class '{@link geometry_model.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see geometry_model.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link geometry_model.Connector#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out</em>'.
	 * @see geometry_model.Connector#getOut()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Out();

	/**
	 * Returns the meta object for the reference list '{@link geometry_model.Connector#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see geometry_model.Connector#getIn()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_In();

	/**
	 * Returns the meta object for class '{@link geometry_model.InputPoint <em>Input Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Point</em>'.
	 * @see geometry_model.InputPoint
	 * @generated
	 */
	EClass getInputPoint();

	/**
	 * Returns the meta object for class '{@link geometry_model.BendPoint <em>Bend Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bend Point</em>'.
	 * @see geometry_model.BendPoint
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
	Geometry_modelFactory getGeometry_modelFactory();

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
		 * The meta object literal for the '{@link geometry_model.impl.GeometryImpl <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_model.impl.GeometryImpl
		 * @see geometry_model.impl.Geometry_modelPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY__EREFERENCE0 = eINSTANCE.getGeometry_EReference0();

		/**
		 * The meta object literal for the '{@link geometry_model.impl.GObjectImpl <em>GObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_model.impl.GObjectImpl
		 * @see geometry_model.impl.Geometry_modelPackageImpl#getGObject()
		 * @generated
		 */
		EClass GOBJECT = eINSTANCE.getGObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOBJECT__NAME = eINSTANCE.getGObject_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOBJECT__ID = eINSTANCE.getGObject_Id();

		/**
		 * The meta object literal for the '{@link geometry_model.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_model.impl.LineImpl
		 * @see geometry_model.impl.Geometry_modelPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Bend Point</b></em>' containment reference feature.
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
		 * The meta object literal for the '{@link geometry_model.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_model.impl.PointImpl
		 * @see geometry_model.impl.Geometry_modelPackageImpl#getPoint()
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
		 * The meta object literal for the '{@link geometry_model.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_model.impl.ConnectorImpl
		 * @see geometry_model.impl.Geometry_modelPackageImpl#getConnector()
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
		 * The meta object literal for the '{@link geometry_model.impl.InputPointImpl <em>Input Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_model.impl.InputPointImpl
		 * @see geometry_model.impl.Geometry_modelPackageImpl#getInputPoint()
		 * @generated
		 */
		EClass INPUT_POINT = eINSTANCE.getInputPoint();

		/**
		 * The meta object literal for the '{@link geometry_model.impl.BendPointImpl <em>Bend Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see geometry_model.impl.BendPointImpl
		 * @see geometry_model.impl.Geometry_modelPackageImpl#getBendPoint()
		 * @generated
		 */
		EClass BEND_POINT = eINSTANCE.getBendPoint();

	}

} //Geometry_modelPackage