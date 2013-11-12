/**
 */
package geometry.impl;

import geometry.BendPoint;
import geometry.Connector;
import geometry.GeometryPackage;
import geometry.Line;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry.impl.LineImpl#getBendPoint <em>Bend Point</em>}</li>
 *   <li>{@link geometry.impl.LineImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link geometry.impl.LineImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends GObjectImpl implements Line {
	/**
	 * The cached value of the '{@link #getBendPoint() <em>Bend Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendPoint()
	 * @generated
	 * @ordered
	 */
	protected BendPoint bendPoint;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected Connector begin;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Connector end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BendPoint getBendPoint() {
		return bendPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBendPoint(BendPoint newBendPoint, NotificationChain msgs) {
		BendPoint oldBendPoint = bendPoint;
		bendPoint = newBendPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometryPackage.LINE__BEND_POINT, oldBendPoint, newBendPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBendPoint(BendPoint newBendPoint) {
		if (newBendPoint != bendPoint) {
			NotificationChain msgs = null;
			if (bendPoint != null)
				msgs = ((InternalEObject)bendPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.LINE__BEND_POINT, null, msgs);
			if (newBendPoint != null)
				msgs = ((InternalEObject)newBendPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.LINE__BEND_POINT, null, msgs);
			msgs = basicSetBendPoint(newBendPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.LINE__BEND_POINT, newBendPoint, newBendPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBegin() {
		if (begin != null && begin.eIsProxy()) {
			InternalEObject oldBegin = (InternalEObject)begin;
			begin = (Connector)eResolveProxy(oldBegin);
			if (begin != oldBegin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeometryPackage.LINE__BEGIN, oldBegin, begin));
			}
		}
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegin(Connector newBegin, NotificationChain msgs) {
		Connector oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometryPackage.LINE__BEGIN, oldBegin, newBegin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(Connector newBegin) {
		if (newBegin != begin) {
			NotificationChain msgs = null;
			if (begin != null)
				msgs = ((InternalEObject)begin).eInverseRemove(this, GeometryPackage.CONNECTOR__OUT, Connector.class, msgs);
			if (newBegin != null)
				msgs = ((InternalEObject)newBegin).eInverseAdd(this, GeometryPackage.CONNECTOR__OUT, Connector.class, msgs);
			msgs = basicSetBegin(newBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.LINE__BEGIN, newBegin, newBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Connector)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeometryPackage.LINE__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Connector newEnd, NotificationChain msgs) {
		Connector oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometryPackage.LINE__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Connector newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, GeometryPackage.CONNECTOR__IN, Connector.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, GeometryPackage.CONNECTOR__IN, Connector.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.LINE__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryPackage.LINE__BEGIN:
				if (begin != null)
					msgs = ((InternalEObject)begin).eInverseRemove(this, GeometryPackage.CONNECTOR__OUT, Connector.class, msgs);
				return basicSetBegin((Connector)otherEnd, msgs);
			case GeometryPackage.LINE__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, GeometryPackage.CONNECTOR__IN, Connector.class, msgs);
				return basicSetEnd((Connector)otherEnd, msgs);
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
			case GeometryPackage.LINE__BEND_POINT:
				return basicSetBendPoint(null, msgs);
			case GeometryPackage.LINE__BEGIN:
				return basicSetBegin(null, msgs);
			case GeometryPackage.LINE__END:
				return basicSetEnd(null, msgs);
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
			case GeometryPackage.LINE__BEND_POINT:
				return getBendPoint();
			case GeometryPackage.LINE__BEGIN:
				if (resolve) return getBegin();
				return basicGetBegin();
			case GeometryPackage.LINE__END:
				if (resolve) return getEnd();
				return basicGetEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeometryPackage.LINE__BEND_POINT:
				setBendPoint((BendPoint)newValue);
				return;
			case GeometryPackage.LINE__BEGIN:
				setBegin((Connector)newValue);
				return;
			case GeometryPackage.LINE__END:
				setEnd((Connector)newValue);
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
			case GeometryPackage.LINE__BEND_POINT:
				setBendPoint((BendPoint)null);
				return;
			case GeometryPackage.LINE__BEGIN:
				setBegin((Connector)null);
				return;
			case GeometryPackage.LINE__END:
				setEnd((Connector)null);
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
			case GeometryPackage.LINE__BEND_POINT:
				return bendPoint != null;
			case GeometryPackage.LINE__BEGIN:
				return begin != null;
			case GeometryPackage.LINE__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
