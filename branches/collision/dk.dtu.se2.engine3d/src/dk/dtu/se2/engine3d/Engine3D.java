package dk.dtu.se2.engine3d;

import geometry.Geometry;
import appearance.Appearance;

import java.util.List;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public interface Engine3D {
	
	public void init (Geometry geometry, Appearance appearance, List<RTAnimation> animations);
	
	public void setEngine3DListener(Engine3DListener listener);
	
	public void addToAnimationQueue(List<RTAnimation> animations);
	
	public void startEngine();
	
	public void destroyRepresentation(String geometryLabel);
	
	public void reset();

}
