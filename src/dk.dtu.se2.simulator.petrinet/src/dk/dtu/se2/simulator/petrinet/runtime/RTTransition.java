package dk.dtu.se2.simulator.petrinet.runtime;

import java.util.ArrayList;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.se2.petrinet.Place;

/*
 * @author Thibaud
 * @generated NOT
 * 
 * 
 */



public class RTTransition {
	
	ArrayList<RTPlace> sources;
	ArrayList<RTPlace> targets;
	ArrayList<String> transitionFiredAnimations;
	
	public RTTransition(Transition transition) {
		
		this.transitionFiredAnimations = new ArrayList<String>();
		
		for(Arc incomingArc : transition.getIn()) {
			if (incomingArc instanceof Place) {
				Place incomingPlace = (Place)incomingArc.getSource();
				RTPlace runtimePlace = new RTPlace(incomingPlace);
				sources.add(runtimePlace);
			}
		}
		for(Arc outgoingArc : transition.getOut()) {
			if (outgoingArc instanceof Place) {
				Place outgoingPlace = (Place)outgoingArc.getTarget();
				RTPlace runtimePlace = new RTPlace(outgoingPlace);
				targets.add(runtimePlace);
				transitionFiredAnimations
			}
		}
		
		
		
		
	}

	public fireTransition() {
		
	}
	
	private boolean isTransitionEnabled() {
		
	}
}
