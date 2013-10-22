/**
 */
package geometry2nd.impl;

import geometry2nd.*;

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
public class Geometry2ndFactoryImpl extends EFactoryImpl implements Geometry2ndFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Geometry2ndFactory init() {
		try {
			Geometry2ndFactory theGeometry2ndFactory = (Geometry2ndFactory)EPackage.Registry.INSTANCE.getEFactory(Geometry2ndPackage.eNS_URI);
			if (theGeometry2ndFactory != null) {
				return theGeometry2ndFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Geometry2ndFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry2ndFactoryImpl() {
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
			case Geometry2ndPackage.GEOMETRY: return createGeometry();
			case Geometry2ndPackage.GOBJECT: return createGObject();
			case Geometry2ndPackage.LINE: return createLine();
			case Geometry2ndPackage.POINT: return createPoint();
			case Geometry2ndPackage.INPUT_POINT: return createInputPoint();
			case Geometry2ndPackage.CONNECTOR: return createConnector();
			case Geometry2ndPackage.BEND_POINT: return createBendPoint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGeometry() {
		GeometryImpl geometry = new GeometryImpl();
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GObject createGObject() {
		GObjectImpl gObject = new GObjectImpl();
		return gObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPoint createInputPoint() {
		InputPointImpl inputPoint = new InputPointImpl();
		return inputPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BendPoint createBendPoint() {
		BendPointImpl bendPoint = new BendPointImpl();
		return bendPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry2ndPackage getGeometry2ndPackage() {
		return (Geometry2ndPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Geometry2ndPackage getPackage() {
		return Geometry2ndPackage.eINSTANCE;
	}

} //Geometry2ndFactoryImpl
