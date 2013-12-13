package dk.dtu.se2.engine3d;

import geometry.Geometry;
import appearance.Appearance;

import java.util.List;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public interface Engine3D {
	
	/**
	 * Initializes the 3D Engine with the given parameters
	 * @param geometry: The geometry of the Petri net
	 * @param appearance: The appearance containing each 3D Model and texture
	 * @param animations: All the possible animations in the Petri net on each place (Move, Appear)
	 */
	public void init (Geometry geometry, Appearance appearance, List<RTAnimation> animations);
	
	/**
	 * Sets the listener for this 3D Engine
	 * @param listener
	 */
	public void setEngine3DListener(Engine3DListener listener);
	
	/**
	 * Adds the given animations to the queue of animations to render in the 3D Engine
	 * @param animations
	 */
	public void addToAnimationQueue(List<RTAnimation> animations);
	
	/**
	 * Starts the engine
	 */
	public void startEngine();
	
	/**
	 * Removes a given token from the 3D Engine visualization
	 * @param id: The id of the token to remove
	 */
	public void destroyRepresentation(String id);
	
	/**
	 * Resets the 3D Engine to its initial state
	 */
	public void reset();

}
