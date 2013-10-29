package popup;

import java.util.ArrayList;

import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import commands.FireTransitionCommand;

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
		//Get the domain
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(transition);
		//Fire transitions with commands
		domain.getCommandStack().execute(new FireTransitionCommand(domain, transition));
		
	}

}
