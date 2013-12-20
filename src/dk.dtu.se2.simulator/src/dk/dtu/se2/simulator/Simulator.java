package dk.dtu.se2.simulator;


import geometry.Geometry;

import java.util.ArrayList;
import java.util.List;

import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;

import appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DFactory;
import dk.dtu.se2.engine3d.Engine3DListener;
import dk.dtu.se2.simulator.petrinet.PetriNetEngine;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;


/**
 * @authors: Albert, Monica
 *
 */

public class Simulator implements Engine3DListener {
	
	private static final boolean DEBUG_MODE = true;
	
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
	private Engine3D engine3d;
		
	/**
	 * Constructor
	 * @param petrinet
	 * @param geometry
	 * @param appearance
	 */
	public Simulator (PetriNetDoc petrinet, Geometry geometry, Appearance appearance) {
				
		/* Models initialization */
		this.petrinet = petrinet;
		this.geometry = geometry;
		this.appearance = appearance;
		
		/* Get 3D engine using the Engine 3D Factory */
		this.engine3d = Engine3DFactory.getEngine3D("jMonkey");
		
		/* Petri net engine initialization and list of first 
		 * animations to be run
		 */
		this.petrinetEngine = new PetriNetEngine();
		this.nextAnimations = this.petrinetEngine.init(petrinet);
		
		/* 3D engine initialization */
		this.engine3d.init(geometry, appearance, 
				this.petrinetEngine.getAllPossibleAnimations(petrinet));
		
		/* Start 3D engine */
		this.engine3d.startEngine();
		
		/* Add the simulator as a listener of the 3D engine */
		this.engine3d.setEngine3DListener(this);
	}

	/**
	 * Function called when the "Start" button is pressed in the simulation
	 */
	@Override
	public void onStart() {
		this.engine3d.addToAnimationQueue(this.nextAnimations);
	}


	/**
	 * Function called when the "Reset" button is pressed in the simulation
	 */
	@Override
	public void onReset() {
		this.nextAnimations = this.petrinetEngine.init(petrinet);
		this.engine3d.init(geometry, appearance, this.petrinetEngine.getAllPossibleAnimations(petrinet));
		this.engine3d.setEngine3DListener(this);
		this.engine3d.reset();
	}


	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		
	}


	/**
	 * Function called when the "Start" an event stopped in the simulation
	 */
	@Override
	public void onAnimationFinished(String geometryLabel) {
		if (DEBUG_MODE) {
			System.out.println("Animation finished on: " + geometryLabel);
		}
		
		this.petrinetEngine.markTokenAsFinished(geometryLabel);
		this.nextAnimations = this.petrinetEngine.fireTransitions();
		
		ArrayList<RTAnimation> tokensToBeDestroyed = new ArrayList<RTAnimation>();
		for (RTAnimation animation : this.nextAnimations) {
			if (animation.isDestroy()) {
				this.engine3d.destroyRepresentation(animation.getId());
				tokensToBeDestroyed.add(animation);
			}
		}
		this.nextAnimations.removeAll(tokensToBeDestroyed);
		
		for (RTAnimation animation : this.nextAnimations) {
			if (DEBUG_MODE) {
				System.out.println("Next animation: " + animation.getGeometryLabel() + " " + animation.getAnimation().toString());
			}
		}
		
		this.engine3d.addToAnimationQueue(this.nextAnimations);
	}
	
	/**
	 * Function called when the user clicks on an input point
	 * @param geometryLabel
	 */
	@Override
	public void onUserClick(String geometryLabel) {
		if (DEBUG_MODE) {
			System.out.println("User click on: " + geometryLabel);
		}
		
		this.petrinetEngine.createToken(geometryLabel);
		this.nextAnimations = this.petrinetEngine.fireTransitions();
		
		ArrayList<RTAnimation> tokensToBeDestroyed = new ArrayList<RTAnimation>();
		for (RTAnimation animation : this.nextAnimations) {
			if (animation.isDestroy()) {
				this.engine3d.destroyRepresentation(animation.getId());
				tokensToBeDestroyed.add(animation);
			}
		}
		this.nextAnimations.removeAll(tokensToBeDestroyed);
		
		for (RTAnimation animation : this.nextAnimations) {
			if (DEBUG_MODE) {
				System.out.println("Next animation: " + animation.getGeometryLabel() + " " + animation.getAnimation().toString());
			}
		}
		
		this.engine3d.addToAnimationQueue(this.nextAnimations);
		
		//Fire it twice so that new tokens can be fired.
		this.nextAnimations = this.petrinetEngine.fireTransitions();
		
		tokensToBeDestroyed = new ArrayList<RTAnimation>();
		for (RTAnimation animation : this.nextAnimations) {
			if (animation.isDestroy()) {
				this.engine3d.destroyRepresentation(animation.getId());
				tokensToBeDestroyed.add(animation);
			}
		}
		this.nextAnimations.removeAll(tokensToBeDestroyed);
		
		for (RTAnimation animation : this.nextAnimations) {
			if (DEBUG_MODE) {
				System.out.println("Next animation: " + animation.getGeometryLabel() + " " + animation.getAnimation().toString());
			}
		}
		
		this.engine3d.addToAnimationQueue(this.nextAnimations);
	}	
	
	
}
