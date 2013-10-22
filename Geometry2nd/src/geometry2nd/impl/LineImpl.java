/**
 */
package geometry2nd.impl;

import geometry2nd.BendPoint;
import geometry2nd.Connector;
import geometry2nd.Geometry2ndPackage;
import geometry2nd.Line;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry2nd.impl.LineImpl#getBendPoint <em>Bend Point</em>}</li>
 *   <li>{@link geometry2nd.impl.LineImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link geometry2nd.impl.LineImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends GObjectImpl implements Line {
	/**
	 * The cached value of the '{@link #getBendPoint() <em>Bend Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBendPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<BendPoint> bendPoint;

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
		return Geometry2ndPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BendPoint> getBendPoint() {
		if (bendPoint == null) {
			bendPoint = new EObjectContainmentEList<BendPoint>(BendPoint.class, this, Geometry2ndPackage.LINE__BEND_POINT);
		}
		return bendPoint;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Geometry2ndPackage.LINE__BEGIN, oldBegin, begin));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Geometry2ndPackage.LINE__BEGIN, oldBegin, newBegin);
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
				msgs = ((InternalEObject)begin).eInverseRemove(this, Geometry2ndPackage.CONNECTOR__OUT, Connector.class, msgs);
			if (newBegin != null)
				msgs = ((InternalEObject)newBegin).eInverseAdd(this, Geometry2ndPackage.CONNECTOR__OUT, Connector.class, msgs);
			msgs = basicSetBegin(newBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Geometry2ndPackage.LINE__BEGIN, newBegin, newBegin));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Geometry2ndPackage.LINE__END, oldEnd, end));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Geometry2ndPackage.LINE__END, oldEnd, newEnd);
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
				msgs = ((InternalEObject)end).eInverseRemove(this, Geometry2ndPackage.CONNECTOR__IN, Connector.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, Geometry2ndPackage.CONNECTOR__IN, Connector.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Geometry2ndPackage.LINE__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Geometry2ndPackage.LINE__BEGIN:
				if (begin != null)
					msgs = ((InternalEObject)begin).eInverseRemove(this, Geometry2ndPackage.CONNECTOR__OUT, Connector.class, msgs);
				return basicSetBegin((Connector)otherEnd, msgs);
			case Geometry2ndPackage.LINE__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, Geometry2ndPackage.CONNECTOR__IN, Connector.class, msgs);
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
			case Geometry2ndPackage.LINE__BEND_POINT:
				return ((InternalEList<?>)getBendPoint()).basicRemove(otherEnd, msgs);
			case Geometry2ndPackage.LINE__BEGIN:
				return basicSetBegin(null, msgs);
			case Geometry2ndPackage.LINE__END:
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
			case Geometry2ndPackage.LINE__BEND_POINT:
				return getBendPoint();
			case Geometry2ndPackage.LINE__BEGIN:
				if (resolve) return getBegin();
				return basicGetBegin();
			case Geometry2ndPackage.LINE__END:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Geometry2ndPackage.LINE__BEND_POINT:
				getBendPoint().clear();
				getBendPoint().addAll((Collection<? extends BendPoint>)newValue);
				return;
			case Geometry2ndPackage.LINE__BEGIN:
				setBegin((Connector)newValue);
				return;
			case Geometry2ndPackage.LINE__END:
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
			case Geometry2ndPackage.LINE__BEND_POINT:
				getBendPoint().clear();
				return;
			case Geometry2ndPackage.LINE__BEGIN:
				setBegin((Connector)null);
				return;
			case Geometry2ndPackage.LINE__END:
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
			case Geometry2ndPackage.LINE__BEND_POINT:
				return bendPoint != null && !bendPoint.isEmpty();
			case Geometry2ndPackage.LINE__BEGIN:
				return begin != null;
			case Geometry2ndPackage.LINE__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
