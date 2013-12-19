package dk.dtu.se2.configuration.action;

import static org.junit.Assert.assertFalse;

import java.util.ArrayList;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.junit.Before;
import org.junit.Test;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import configuration.Configuration;
import dk.dtu.se2.simulator.petrinet.PetriNetEngine;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;
import dk.dtu.se2.test.RunTests;

/**
 * @author Albert
 */

public class StartTest implements IObjectActionDelegate {
	
	private static PetriNetDoc petrinet;
	private static PetriNetEngine petriNetEngine;
	
	//	Private variable storing the currently selected configuration file
	private static Configuration selectedConfiguration;
	

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
			RunTests.start();
		}
		
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}
	
	private boolean isEnabled() {
		return selectedConfiguration != null;
	}
	
	@Before
	public void init(){		
		petrinet = selectedConfiguration.getPetrinet();
		System.out.println(petrinet.getNet().get(0).getPage().get(0).getObject().toString());
		petriNetEngine = new PetriNetEngine();
	}
	
	@Test
	public void testGetAllPossibleAnimations() {
		System.out.println(petrinet.getNet().get(0).getPage().get(0).getObject().toString());
		ArrayList<RTAnimation> animations = petriNetEngine.init(petrinet);
		for (RTAnimation animation : animations) {
			System.out.println("an" +  animation.toString());
		}
	}
//
//	@Test
//	public void testFireTransitions() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMarkTokenAsFinished() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCreateToken() {
//		fail("Not yet implemented");
//	}
	
 
}
