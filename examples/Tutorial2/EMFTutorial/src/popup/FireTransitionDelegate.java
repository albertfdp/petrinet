package popup;

import org.eclipse.core.internal.runtime.Activator;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import petrinet.*;

public class FireTransitionDelegate implements IObjectActionDelegate {

	private ISelection selection;

	@Override
	public void run(IAction action) {

		if (this.selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) this.selection;
			if (structuredSelection.getFirstElement() instanceof Transition) {
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

		this.selection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

		this.selection = targetPart.getSite().getPage().getSelection();
	}

	private boolean isTransitionEnabled(Transition transition) {

		if (transition.getIn().getSource() instanceof Place) {
			Place place = (Place) transition.getIn().getSource();
			if (place.getTokens().size() != 0) {
				return true;
			}
		}

		return false;
	}

	private void fireTransition(Transition transition) {
		Place source = (Place) transition.getIn().getSource();
		Place target = (Place) transition.getOut().getTarget();
		
		Token token = source.getTokens().get(0);
		target.getTokens().add(token);
		source.getTokens().remove(token);
		
	}

}
