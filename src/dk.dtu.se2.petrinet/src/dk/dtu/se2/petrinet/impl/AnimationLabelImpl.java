/**
 */
package dk.dtu.se2.petrinet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.pnml.tools.epnk.helpers.NetFunctions;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetType;
import org.pnml.tools.epnk.structuredpntypemodel.impl.StructuredLabelImpl;

import animation.Animation;
import dk.dtu.se2.petrinet.AnimationLabel;
import dk.dtu.se2.petrinet.PetrinetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animation Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnimationLabelImpl extends StructuredLabelImpl implements AnimationLabel {
	
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
