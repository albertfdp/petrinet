package commands;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import petrinet.Arc;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Token;
import petrinet.Transition;

/*
 * @tr: This class is used to implement a command for firing a transition
 */
public class FireTransitionCommand extends CompoundCommand {

	protected Transition transition;

	/*
	 * Use this constructor to create the command
	 * @param domain: The Editing Domain
	 * @param transition: The transition to be fired
	 */
	public FireTransitionCommand(EditingDomain domain, Transition transition) {

		this.transition = transition;

		// Run through all the incoming places and remove a token from them
		for (Arc arc : transition.getIn()) {
			Place source = (Place) arc.getSource();

			//Here we create a Remove Command to remove one token from each source
			append(new RemoveCommand(domain, source,
					PetrinetPackage.eINSTANCE.getPlace_Tokens(), source
							.getTokens().get(0)));
		}
		// Give a token to each outgoing place
		for (Arc arc : transition.getOut()) {
			Place target = (Place) arc.getTarget();
			Token token = PetrinetFactory.eINSTANCE.createToken();
			
			//Here we create a CreateChildCommand to add a token to each target
			append(new CreateChildCommand(domain, target,
					PetrinetPackage.eINSTANCE.getPlace_Tokens(), token, null));
		}
	}
}
