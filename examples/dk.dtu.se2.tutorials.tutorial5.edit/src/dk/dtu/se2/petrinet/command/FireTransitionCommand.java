package dk.dtu.se2.petrinet.command;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.se2.petrinet.Arc;
import dk.dtu.se2.petrinet.PetrinetFactory;
import dk.dtu.se2.petrinet.PetrinetPackage;
import dk.dtu.se2.petrinet.Place;

public class FireTransitionCommand extends CompoundCommand {

	protected Transition transition;
	
	public FireTransitionCommand (EditingDomain domain, Transition transition) {
		
		this.transition = transition;
		
		// iterate through all the incoming places and remove a token from them
		for (org.pnml.tools.epnk.pnmlcoremodel.Arc a : transition.getIn()) {
			if (a instanceof Arc) {
				Arc arc = (Arc) a;
				if (arc.getSource() instanceof Place) {
					Place source = (Place) arc.getSource();
					append(new RemoveCommand(domain, source, 
							PetrinetPackage.eINSTANCE.getPlace_Tokens(), source.getTokens().get(0)));
				}
			}
		}
		
		// give a token to each outgoing place
		for (org.pnml.tools.epnk.pnmlcoremodel.Arc a : transition.getOut()) {
			if (a instanceof Arc) {
				Arc arc = (Arc) a;
				if (arc.getTarget() instanceof Place) {
					Place target = (Place) arc.getTarget();
					append(new CreateChildCommand(domain, target, 
							PetrinetPackage.eINSTANCE.getPlace_Tokens(), PetrinetFactory.eINSTANCE.createToken(), null));
					
				}
			}
		}
		
	}
	
}
