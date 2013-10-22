package dk.dtu.se2.petrinet.actions.popup.actions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.se2.petrinet.Arc;
import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.petrinet.command.FireTransitionCommand;


public class SimulatePetriNet implements IObjectActionDelegate {

	private Shell shell;
	
	private Transition selectedTransition;
	
	/**
	 * Constructor for {@link SimulatePetriNet}.
	 */
	public SimulatePetriNet() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selectedTransition != null && canFireTransition(selectedTransition)) {
			fireTransition(selectedTransition);
		} else {
			MessageDialog.openInformation(
					shell,
					"Petri Net simulator plugin",
					"Fire transition cannot be executed.");
		}		
	}
	
	private boolean canFireTransition (Transition transition) {
		
		EList<org.pnml.tools.epnk.pnmlcoremodel.Arc> arcs = transition.getIn();
		for (org.pnml.tools.epnk.pnmlcoremodel.Arc arc : arcs) {
			if (arc instanceof Arc) {
				Arc petriNetArc = (Arc) arc;
				Place place = (Place) petriNetArc.getSource();
				if (place.getTokens().isEmpty()) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	private void fireTransition (Transition transition) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(transition);	
		domain.getCommandStack().execute(new FireTransitionCommand(domain, transition));
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.size() == 1 && structuredSelection.getFirstElement() instanceof Transition) {
				selectedTransition = (Transition) structuredSelection.getFirstElement();
			} else {
				selectedTransition = null;
			}
		}
	}

}
