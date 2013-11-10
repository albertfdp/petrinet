package dk.dtu.se2.simulator.petrinet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.petrinet.ExtendedPetriNet;
import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.petrinet.Token;

/*
 * @author: Thibaud
 */
public class PetriNetEngine {
	
	private HashMap<Place, ArrayList<Token>> marking = new HashMap<Place, ArrayList<Token>>();
	private ArrayList<Transition> transitions;
	
	public List<Animation> init (PetriNetDoc petrinet) {
		return null;
	}
	
	public void fireTransitions() {
		
	}
	
	public void setMarker(Token token, Place place) {}
	
	public void createToken(Place place) {}

	
	
	private boolean isTransitionEnabled (Transition transition) {
		boolean isEnabled = false;
		
		
		return isEnabled;
	}
}
