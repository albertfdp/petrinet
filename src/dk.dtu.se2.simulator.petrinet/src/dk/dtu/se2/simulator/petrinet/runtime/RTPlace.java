package dk.dtu.se2.simulator.petrinet.runtime;

import java.util.ArrayList;

import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.petrinet.Token;

public class RTPlace {

	private Place place;
	private ArrayList<RToken> tokens;
	
	public RTPlace (Place place) {
		this.place = place;
		tokens = new ArrayList<RToken>();
		
		for (Token token : this.place.getTokens()) {
			tokens.add(new RToken());
		}
				
	}

	public ArrayList<RToken> getTokens() {
		return tokens;
	}

	public void setTokens(ArrayList<RToken> tokens) {
		this.tokens = tokens;
	}
	
	
	
}
