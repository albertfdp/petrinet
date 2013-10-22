/**
 */
package geometry2nd.impl;

import geometry2nd.Connector;
import geometry2nd.Geometry2ndPackage;
import geometry2nd.Line;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry2nd.impl.ConnectorImpl#getOut <em>Out</em>}</li>
 *   <li>{@link geometry2nd.impl.ConnectorImpl#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends PointImpl implements Connector {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> out;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> in;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Geometry2ndPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getOut() {
		if (out == null) {
			out = new EObjectWithInverseResolvingEList<Line>(Line.class, this, Geometry2ndPackage.CONNECTOR__OUT, Geometry2ndPackage.LINE__BEGIN);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getIn() {
		if (in == null) {
			in = new EObjectWithInverseResolvingEList<Line>(Line.class, this, Geometry2ndPackage.CONNECTOR__IN, Geometry2ndPackage.LINE__END);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Geometry2ndPackage.CONNECTOR__OUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOut()).basicAdd(otherEnd, msgs);
			case Geometry2ndPackage.CONNECTOR__IN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Geometry2ndPackage.CONNECTOR__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
			case Geometry2ndPackage.CONNECTOR__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
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
			case Geometry2ndPackage.CONNECTOR__OUT:
				return getOut();
			case Geometry2ndPackage.CONNECTOR__IN:
				return getIn();
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
			case Geometry2ndPackage.CONNECTOR__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends Line>)newValue);
				return;
			case Geometry2ndPackage.CONNECTOR__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Line>)newValue);
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
			case Geometry2ndPackage.CONNECTOR__OUT:
				getOut().clear();
				return;
			case Geometry2ndPackage.CONNECTOR__IN:
				getIn().clear();
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
			case Geometry2ndPackage.CONNECTOR__OUT:
				return out != null && !out.isEmpty();
			case Geometry2ndPackage.CONNECTOR__IN:
				return in != null && !in.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
