package dk.dtu.se2.configuration;

import geometry.Geometry;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import dk.dtu.se2.appearance.Appearance;


public class Configuration {
	
	private static Configuration configuration;
	
	private static PetriNetDoc petriNet;
	
	private static Geometry geometry;
	
	private static Appearance appearance;
	
	public Configuration() {
		
	}
		
	public static Configuration getInstance() {
		if (configuration == null) {
			configuration = new Configuration();
		}
		return configuration;
	}
	
	private void parsePetriNet() {}
	
	private void parseGeometry() {}
	
	private void parseAppearance() {}

	
	public static PetriNetDoc getPetriNet() {
		return petriNet;
	}

	public static void setPetriNet(PetriNetDoc petriNet) {
		Configuration.petriNet = petriNet;
	}

	public static Geometry getGeometry() {
		return geometry;
	}
	
}
	
	
