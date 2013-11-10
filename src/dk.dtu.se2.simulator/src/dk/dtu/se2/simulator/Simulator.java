package dk.dtu.se2.simulator;


import java.util.ArrayList;
import java.util.List;

import geometry.Geometry;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DListener;
import dk.dtu.se2.engine3d.jmonkey.JMonkeyEngine3D;
import dk.dtu.se2.simulator.petrinet.PetriNetEngine;


public class Simulator implements Engine3DListener {
	
	private PetriNetDoc petrinet;
	private Geometry geometry;
	private Appearance appearance;
	
	private PetriNetEngine petrinetEngine;
	
	Engine3D engine;
	
	public Simulator (PetriNetDoc petrinet, Geometry geometry, Appearance appearance) {
		
		this.petrinet = petrinet;
		this.geometry = geometry;
		this.appearance = appearance;
		
		this.petrinetEngine = new PetriNetEngine();
			
	}

	@Override
	public void onStart() {
		
		this.petrinetEngine.init(petrinet);
		
		List<Animation> animations = new ArrayList<Animation>();
		
		JMonkeyEngine3D jmon = new JMonkeyEngine3D();
		jmon.init(geometry, appearance, animations);
	}


	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onAnimationFinished(String geometryLabel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUserClick() {
		// TODO Auto-generated method stub
		
	}
	
	
}
