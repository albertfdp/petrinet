package dk.dtu.se2.simulator.petrinet.runtime;

import java.util.ArrayList;

import dk.dtu.se2.petrinet.Place;

public class RTPlace {

	private Place place;
	private ArrayList<RTToken> tokens;
	
	public RTPlace (Place place) {
		this.place = place;
		tokens = new ArrayList<RTToken>();
		
		for (int i = 0; i < this.place.getTokens().size(); i++) {
			tokens.add(new RTToken());
		}
				
	}

	public ArrayList<RTToken> getTokens() {
		return tokens;
	}

	public void setTokens(ArrayList<RTToken> tokens) {
		this.tokens = tokens;
	}
	
	
	
}
