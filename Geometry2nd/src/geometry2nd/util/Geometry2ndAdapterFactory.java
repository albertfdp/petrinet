/**
 */
package geometry2nd.util;

import geometry2nd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see geometry2nd.Geometry2ndPackage
 * @generated
 */
public class Geometry2ndAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Geometry2ndPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry2ndAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Geometry2ndPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Geometry2ndSwitch<Adapter> modelSwitch =
		new Geometry2ndSwitch<Adapter>() {
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter caseGObject(GObject object) {
				return createGObjectAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseInputPoint(InputPoint object) {
				return createInputPointAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseBendPoint(BendPoint object) {
				return createBendPointAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link geometry2nd.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see geometry2nd.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link geometry2nd.GObject <em>GObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see geometry2nd.GObject
	 * @generated
	 */
	public Adapter createGObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link geometry2nd.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see geometry2nd.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link geometry2nd.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see geometry2nd.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link geometry2nd.InputPoint <em>Input Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see geometry2nd.InputPoint
	 * @generated
	 */
	public Adapter createInputPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link geometry2nd.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see geometry2nd.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link geometry2nd.BendPoint <em>Bend Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see geometry2nd.BendPoint
	 * @generated
	 */
	public Adapter createBendPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Geometry2ndAdapterFactory
