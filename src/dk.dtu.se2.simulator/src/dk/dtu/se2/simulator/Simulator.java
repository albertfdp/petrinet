package dk.dtu.se2.simulator;


import geometry.Geometry;

import java.util.List;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DFactory;
import dk.dtu.se2.petrinet.ExtendedPetriNet;
import dk.dtu.se2.simulator.petrinet.PetriNetEngine;


public class Simulator {
	
	private ExtendedPetriNet petrinet;
	private Geometry geometry;
	private Appearance appearance;
	
	private PetriNetEngine petrinetEngine;
	
	Engine3D engine;
	
	public Simulator (ExtendedPetriNet petrinet, Geometry geometry, Appearance appearance) {
		
		this.petrinet = petrinet;
		this.geometry = geometry;
		this.appearance = appearance;
		
		this.petrinetEngine = new PetriNetEngine();
	}
	
	
	public void startSimulation() {
		
		List<Animation> animations = petrinetEngine.init(petrinet);
		engine = Engine3DFactory.getEngine3D(Engine3DFactory.JMONKEY);
		
		engine.init(geometry, appearance);
	}
	
	
}
