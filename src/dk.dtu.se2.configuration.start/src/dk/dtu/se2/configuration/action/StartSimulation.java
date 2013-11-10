package dk.dtu.se2.configuration.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import configuration.Configuration;
import dk.dtu.se2.simulator.Simulator;

/**
 * @author Monica
 */

public class StartSimulation implements IObjectActionDelegate {

//	Constructor
	public StartSimulation() {
		super();
	}
	
//	Private variable storing the currently selected configuration file
	private Configuration selectedConfiguration;
	
//	The simulator object to be started from the configuration file with the StartSimulation action
	private Simulator simulator;

	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
		selectedConfiguration = null;
		
		if(selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			if(structuredSelection.size() == 1 &&
					structuredSelection.getFirstElement() instanceof Configuration) {
				selectedConfiguration = (Configuration) structuredSelection.getFirstElement();
			}
		}
		
		action.setEnabled(isEnabled());
	}


	@Override
	public void run(IAction action) {
		if(isEnabled()) {
			
//			Initialize the simulator with the Petri net, Geometry and Appearance models
			simulator = new Simulator (selectedConfiguration.getPetrinet(), 
									   selectedConfiguration.getGeometry(),
									   null);
//			Start simulation
			simulator.onStart();
			
		}
		
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	private boolean isEnabled() {
		return this.selectedConfiguration != null;
	}
 
}
