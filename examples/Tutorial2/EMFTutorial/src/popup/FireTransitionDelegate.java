package popup;

import java.util.ArrayList;

import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import petrinet.*;

public class FireTransitionDelegate implements IObjectActionDelegate {

	//Private variable to store the current selected transition
	private ISelection selection;

	@Override
	public void run(IAction action) {

		if (this.selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) this.selection;
			if (structuredSelection.getFirstElement() instanceof Transition) {
				//The transition is the first element of the selection
				Transition transition = (Transition) structuredSelection
						.getFirstElement();

				if (isTransitionEnabled(transition)) {
					fireTransition(transition);
				}
			}

		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		//
		this.selection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

		this.selection = targetPart.getSite().getPage().getSelection();
	}

	private boolean isTransitionEnabled(Transition transition) {

		for (Arc arc : transition.getIn()) {
			Place place = (Place) arc.getSource();
			if (place.getTokens().size() == 0) {
				//If an incoming place hasn't got a token then the transition is not valid
				return false;
			}
		}

		return true;
	}

	private void fireTransition(Transition transition) {
		ArrayList<Token> tokens = new ArrayList<Token>();
		
		//Run through all the incoming places and remove a token from them
		for  (Arc arc : transition.getIn()) {
			Place source = (Place) arc.getSource();

			tokens.add(source.getTokens().remove(0));
		}
		//Give a token to each outgoing place
		for  (Arc arc : transition.getOut()) {
			Place target = (Place) arc.getTarget();
			target.getTokens().add(tokens.remove(0));
		}	
		
		//Clear the unused tokens of this transition (e.g: 3 tokens before, 2 tokens after.)
		tokens.clear();
	}

}
