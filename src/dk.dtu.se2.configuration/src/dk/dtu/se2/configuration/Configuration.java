package dk.dtu.se2.configuration;

import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.petrinet.ExtendedPetriNet;
import geometry.Geometry;

public class Configuration {
	
	private Geometry geometry;
	private Appearance appearance;
	private ExtendedPetriNet petrinet;
	
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public Appearance getAppearance() {
		return appearance;
	}
	public void setAppearance(Appearance appearance) {
		this.appearance = appearance;
	}
	public ExtendedPetriNet getPetrinet() {
		return petrinet;
	}
	public void setPetrinet(ExtendedPetriNet petrinet) {
		this.petrinet = petrinet;
	}

}
