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


/**
 * @author Monica
 *
 */

public class Simulator implements Engine3DListener {
	
	/*
	 * The three models connected in the configuration
	 * in order to run the simulation
	 */
	private PetriNetDoc petrinet;
	private Geometry geometry;
	private Appearance appearance;
	
	/*
	 * Instance of the Petri net Engine
	 */
	private PetriNetEngine petrinetEngine;
	
	/*
	 * List of runtime animations that are next to
	 * be played by the simulator
	 */
	private List<RTAnimation> nextAnimations;
	
	/*
	 * Instance of the 3D Engine
	 */
	private JMonkeyEngine engine3d;
	
		
	public Simulator (PetriNetDoc petrinet, Geometry geometry, Appearance appearance) {
		
//		logger.info("Starting Simulator");
		
		this.petrinet = petrinet;
		this.geometry = geometry;
		this.appearance = appearance;
		
		this.petrinetEngine = new PetriNetEngine();
		
		this.engine3d = new JMonkeyEngine();
		this.engine3d.init(geometry, appearance, this.petrinetEngine.getAllPossibleAnimations(petrinet));
		this.engine3d.setEngine3DListener(this);
		
		
	}

	@Override
	public void onStart() {
//		logger.info("onStart() ...");
		
		this.nextAnimations = this.petrinetEngine.init(petrinet);		
		this.engine3d.addToAnimationQueue(this.nextAnimations);
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
	public void onUserClick(String geometryLabel) {
		
		this.petrinetEngine.createToken(geometryLabel);
		this.nextAnimations = this.petrinetEngine.fireTransitions();
		this.engine3d.addToAnimationQueue(this.nextAnimations);
	}
	
	
	
}
