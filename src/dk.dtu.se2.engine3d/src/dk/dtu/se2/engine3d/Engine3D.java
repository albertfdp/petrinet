package dk.dtu.se2.engine3d;

import geometry.Geometry;

import java.util.List;

import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public interface Engine3D {
	
	public void init (Geometry geometry, Appearance appearance, List<RTAnimation> animations);
	
	public void addToAnimationQueue(List<RTAnimation> animations);

}
