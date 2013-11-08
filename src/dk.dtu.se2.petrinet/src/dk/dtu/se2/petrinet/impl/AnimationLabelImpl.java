/**
 */
package dk.dtu.se2.petrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl;

import animation.Animation;
import dk.dtu.se2.petrinet.AnimationLabel;
import dk.dtu.se2.petrinet.PetrinetPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.se2.petrinet.impl.AnimationLabelImpl#getStructure <em>Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnimationLabelImpl extends StructuredLabelImpl implements AnimationLabel {
	
	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Animation structure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimationLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.ANIMATION_LABEL;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Animation getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(Animation newStructure, NotificationChain msgs) {
		Animation oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ANIMATION_LABEL__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Animation newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.ANIMATION_LABEL__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetrinetPackage.ANIMATION_LABEL__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ANIMATION_LABEL__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetrinetPackage.ANIMATION_LABEL__STRUCTURE:
				return basicSetStructure(null, msgs);
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
			case PetrinetPackage.ANIMATION_LABEL__STRUCTURE:
				return getStructure();
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
			case PetrinetPackage.ANIMATION_LABEL__STRUCTURE:
				setStructure((Animation)newValue);
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
			case PetrinetPackage.ANIMATION_LABEL__STRUCTURE:
				setStructure((Animation)null);
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
			case PetrinetPackage.ANIMATION_LABEL__STRUCTURE:
				return structure != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Parse a structured label according to the defined language.
	 * @generated NOT
	 * @author thibaud
	 */
	@Override
	public EObject parse(String input) {
		
		Animation result = null;
		
		if (input != null) {
			PetriNetType petriNetType = NetFunctions.getPetriNetType(this);
			if (petriNetType instanceof ExtendedPetriNetImpl) {
				ExtendedPetriNetImpl epni = (ExtendedPetriNetImpl) petriNetType;
				if (epni.animationParser != null) {
					return epni.animationParser.parse(input);
				}
			}			
		}
		
		return result;
		
	}

} //AnimationLabelImpl
