/**
 */
package dk.dtu.se2.petrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.pnmlcoremodel.impl.PetriNetTypeImpl;

import dk.dtu.se2.petrinet.ExtendedPetriNet;
import dk.dtu.se2.petrinet.PetrinetPackage;
import dk.dtu.se2.tutorials.tutorial6.animation.language.AnimationParser;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ExtendedPetriNetImpl extends PetriNetTypeImpl implements ExtendedPetriNet {
	
	/** @generated NOT **/
	final AnimationParser animationParser;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Albert, Thibaud
	 */
	public ExtendedPetriNetImpl() {
		super();
		this.animationParser = new AnimationParser();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.EXTENDED_PETRI_NET;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Albert, Thibaud
	 */
	@Override
	public String toString() {
		return "ExtendedPetriNet";
	}

} //ExtendedPetriNetImpl
