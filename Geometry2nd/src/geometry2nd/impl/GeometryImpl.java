/**
 */
package geometry2nd.impl;

import geometry2nd.GObject;
import geometry2nd.Geometry;
import geometry2nd.Geometry2ndPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link geometry2nd.impl.GeometryImpl#getGObjects <em>GObjects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeometryImpl extends MinimalEObjectImpl.Container implements Geometry {
	/**
	 * The cached value of the '{@link #getGObjects() <em>GObjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<GObject> gObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Geometry2ndPackage.Literals.GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GObject> getGObjects() {
		if (gObjects == null) {
			gObjects = new EObjectContainmentEList<GObject>(GObject.class, this, Geometry2ndPackage.GEOMETRY__GOBJECTS);
		}
		return gObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Geometry2ndPackage.GEOMETRY__GOBJECTS:
				return ((InternalEList<?>)getGObjects()).basicRemove(otherEnd, msgs);
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
			case Geometry2ndPackage.GEOMETRY__GOBJECTS:
				return getGObjects();
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
			case Geometry2ndPackage.GEOMETRY__GOBJECTS:
				getGObjects().clear();
				getGObjects().addAll((Collection<? extends GObject>)newValue);
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
			case Geometry2ndPackage.GEOMETRY__GOBJECTS:
				getGObjects().clear();
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
			case Geometry2ndPackage.GEOMETRY__GOBJECTS:
				return gObjects != null && !gObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeometryImpl
