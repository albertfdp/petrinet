package dk.dtu.se2.simulator.petrinet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Object;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.simulator.petrinet.runtime.RTToken;

/*
 * @author Thibaud
 * @generated NOT
 */
public class PetriNetEngine {
	
	private HashMap<Place, ArrayList<RTToken>> marking = new HashMap<Place, ArrayList<RTToken>>();
	private ArrayList<Transition> transitions;
	
	public ArrayList<String> init (PetriNetDoc petrinet) {
		
		Iterator<Object> iterator = petrinet.getNet().get(0).getPage().get(0).getObject().iterator();
		ArrayList<String> animations = new ArrayList<String>();
		
		while (iterator.hasNext()) {
			Object item = iterator.next();
			if (item instanceof Transition) {
				Transition newTransition = (Transition)item;
				this.transitions.add(newTransition);
			} else if (item instanceof Place) {
				Place newPlace = (Place)item;
				ArrayList<RTToken> tokens = new ArrayList<RTToken>();
				for (int i = 0; i < newPlace.getTokens().size(); i++) {
					RTToken runtimeToken = new RTToken();
					tokens.add(runtimeToken);
					animations.add(newPlace.getGeometryLabel().getText());
				}
				marking.put(newPlace, tokens);
			}
		}
		
		return animations;
	}
	
	public ArrayList<String> fireTransitions() {
		ArrayList<String> animations = new ArrayList<String>();
		
		for (Transition transition : transitions) {
			if (isTransitionEnabled(transition)) {
				ArrayList<String> newAnimations = fireTransition(transition);
				animations.addAll(newAnimations);
			}
		}
		
		return animations;
	}
	
	public void markTokenAsFinished(Place place) {
		for (RTToken runtimeToken : marking.get(place) ) {
			if (!runtimeToken.isFinished()) {
				runtimeToken.setFinished(true);
				break;
			}
		}
	}
	
	public void createToken(Place place) {
		RTToken newToken = new RTToken();
		marking.get(place).add(newToken);
		
	}

	private ArrayList<String> fireTransition(Transition transition) {
		ArrayList<String> transitionAnimations = new ArrayList<String>();
		
		for (Arc arc: transition.getIn()) {
			if (arc.getSource() instanceof Place) {
				Place place = (Place)arc.getSource();
				for (RTToken runtimeToken : marking.get(place)) {
					if (runtimeToken.isFinished()) {
						marking.get(place).remove(runtimeToken);
						break;
					}
				}
			}
		}
		for (Arc arc: transition.getOut()) {
			if (arc.getTarget() instanceof Place) {
				Place place = (Place)arc.getTarget();
				RTToken newToken = new RTToken();
				marking.get(place).add(newToken);
				transitionAnimations.add(place.getGeometryLabel().getText());
			}
		}
		
		return transitionAnimations;
	}
	
	private boolean isTransitionEnabled (Transition transition) {
		
		for (Arc arc : transition.getIn()) {
			boolean atLeastOneToken = false;
			if (arc.getSource() instanceof Place) {
				Place place = (Place)arc.getSource();
				for (RTToken runtimeToken : marking.get(place)) {
					if (runtimeToken.isFinished()) {
						atLeastOneToken = true;
					}
				}
			}
			if (!atLeastOneToken) {
				return false;
			}
		}
		return true;
	}
}
