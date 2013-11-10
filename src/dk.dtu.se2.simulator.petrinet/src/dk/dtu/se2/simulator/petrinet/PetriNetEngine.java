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

/**
 * Petri net Engine responsible for the behaviour of the Runtime Petri net.
 * 
 * @author Thibaud
 * @generated NOT
 */
public class PetriNetEngine {
	
	private HashMap<Place, ArrayList<RTToken>> marking = new HashMap<Place, ArrayList<RTToken>>();
	private ArrayList<Transition> transitions = new ArrayList<Transition>();
	
	/**
	 * Initializes the Petri Net Engine with a Static Petrinet
	 * @param petrinet : The Petri net page
	 * @return A list of geometry label of places to animate in the 3D Engine
	 */
	public ArrayList<String> init (PetriNetDoc petrinet) {
		
		Iterator<Object> iterator = petrinet.getNet().get(0).getPage().get(0).getObject().iterator();
		ArrayList<String> animations = new ArrayList<String>();
		
		while (iterator.hasNext()) {
			//Iterate through all the objects in the Petri net
			
			Object item = iterator.next();
			if (item instanceof Transition) {
				//Add this transition to our set
				Transition newTransition = (Transition)item;
				this.transitions.add(newTransition);
			} else if (item instanceof Place) {
				//Add the place + its tokens to the marking
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
	
	/**
	 * Fires all the possible transitions in the petri net
	 * @return A list of the geometry labels of places to animate
	 */
	public ArrayList<String> fireTransitions() {
		ArrayList<String> animations = new ArrayList<String>();
		
		//Iterate through each transition
		for (Transition transition : transitions) {
			if (isTransitionEnabled(transition)) {
				//The transition is enabled, fire it and get its labels
				ArrayList<String> newAnimations = fireTransition(transition);
				animations.addAll(newAnimations);
			}
		}
		
		return animations;
	}
	
	/**
	 * Marks a token on a place as finished
	 * Chooses the first non finished token
	 * 
	 * @param place: The place on which a token has finished moving
	 */
	public void markTokenAsFinished(Place place) {
		//Search for the first non finished token and mark it.
		for (RTToken runtimeToken : marking.get(place) ) {
			if (!runtimeToken.isFinished()) {
				runtimeToken.setFinished(true);
				break;
			}
		}
	}
	
	/**
	 * Creates a token on a place
	 * @param place: The place on which the token is created
	 */
	public void createToken(Place place) {
		//Create a token and add it to the place
		RTToken newToken = new RTToken();
		marking.get(place).add(newToken);
		
	}

	/**
	 * Fires a single transition 
	 * @param transition The transition to be fired
	 * @return A list of geometry labels corresponding to the places to animate 
	 */
	private ArrayList<String> fireTransition(Transition transition) {
		ArrayList<String> transitionAnimations = new ArrayList<String>();
		//Iterate through each incoming place and remove ONE finished token.
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
		//Iterate through the outgoing places, add a token and add a geometry labels to
		//the set of animations
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
	
	/**
	 * Determines whether a transition is enabled
	 * @param transition: The transition to check
	 */
	private boolean isTransitionEnabled (Transition transition) {
		
		//Iterate through each incoming place, search if a token is finished
		//If no finished token is found, return false, otherwise continue
		//If a finished token is found in each incoming place, return true
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
