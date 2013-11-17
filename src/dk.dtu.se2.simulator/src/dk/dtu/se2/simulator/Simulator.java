package dk.dtu.se2.simulator;


import geometry.Geometry;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3DListener;
import dk.dtu.se2.engine3d.jmonkey.JMonkeyEngine;
//import dk.dtu.se2.engine3d.jmonkey.JMonkeyEngine3D;
import dk.dtu.se2.simulator.petrinet.PetriNetEngine;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;


public class Simulator implements Engine3DListener {
	
	private PetriNetDoc petrinet;
	private Geometry geometry;
	private Appearance appearance;
	
	private PetriNetEngine petrinetEngine;
	
	private List<RTAnimation> nextAnimations;
	
	private JMonkeyEngine engine3d;
		
	public Simulator (PetriNetDoc petrinet, Geometry geometry, Appearance appearance) {
		
		this.petrinet = petrinet;
		this.geometry = geometry;
		this.appearance = appearance;
		
		this.petrinetEngine = new PetriNetEngine();
		
		this.nextAnimations = this.petrinetEngine.init(petrinet);
		
//		JMonkeyEngine3D jmon = new JMonkeyEngine3D();
//		jmon.init(geometry, appearance, this.petrinetEngine.getAllPossibleAnimations(petrinet));
//		jmon.setEngine3DListener(this);
//		jmon.addToAnimationQueue(this.nextAnimations);
		
		engine3d = new JMonkeyEngine();
		engine3d.init(geometry, appearance, this.petrinetEngine.getAllPossibleAnimations(petrinet));
		engine3d.setEngine3DListener(this);
		engine3d.addToAnimationQueue(this.nextAnimations);		
	}

	@Override
	public void onStart() {
		
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
		System.out.println("Animation finished on: " + geometryLabel);
		
		this.petrinetEngine.markTokenAsFinished(geometryLabel);
		this.nextAnimations = this.petrinetEngine.fireTransitions();
		this.engine3d.addToAnimationQueue(this.nextAnimations);
	}

	@Override
	public void onUserClick() {
		// TODO Auto-generated method stub
		
	}
	
	
}
