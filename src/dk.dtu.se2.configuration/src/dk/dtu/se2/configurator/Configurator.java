package dk.dtu.se2.configurator;

import geometry.Geometry;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.simulator.Simulator;


public class Configurator {
	
	private static Configurator configuration;
	
	private static PetriNetDoc petriNet;
	
	private static Geometry geometry;
	
	private static Appearance appearance;
	
	public Configurator() {
		Simulator simulator = new Simulator(petriNet, geometry, appearance);
		simulator.onStart();
	}
		
	public static Configurator getInstance() {
		if (configuration == null) {
			configuration = new Configurator();
		}
		return configuration;
	}
	
	private void parsePetriNet() {}
	
	private void parseGeometry() {}
	
	private void parseAppearance() {}

	
	public PetriNetDoc getPetriNet() {
		return petriNet;
	}

	public void setPetriNet(PetriNetDoc petriNet) {
		Configurator.petriNet = petriNet;
	}

	public Geometry getGeometry() {
		return geometry;
	}
	
}
	
	
