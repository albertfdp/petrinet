package dk.dtu.se2.simulator.petrinet;

import java.util.HashMap;
import java.util.List;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.petrinet.ExtendedPetriNet;
import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.petrinet.Token;

public class PetriNetEngine {
	
	private HashMap<Place, Token> markers;
	
	public List<Animation> init (ExtendedPetriNet petrinet) {
		return null;
	}
	
	public void fireTransition() {}
	
	public void setMarker(Token token, Place place) {}
	
	public void createToken(Place place) {}

}
