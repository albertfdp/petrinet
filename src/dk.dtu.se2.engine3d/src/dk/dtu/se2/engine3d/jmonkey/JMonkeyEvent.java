package dk.dtu.se2.engine3d.jmonkey;

import com.jme3.animation.LoopMode;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.scene.Spatial;

public class JMonkeyEvent extends MotionEvent{
	
	private String geometryLabel;

	public String getGeometryLabel() {
		return geometryLabel;
	}

	public void setGeometryLabel(String geometryLabel) {
		this.geometryLabel = geometryLabel;
	}

	public JMonkeyEvent() {
		super();
	}

	public JMonkeyEvent(String geometryLabel, Spatial spatial, MotionPath path,
			float initialDuration, LoopMode loopMode) {
		super(spatial, path, initialDuration, loopMode);
		this.geometryLabel = geometryLabel;
	}
	
	
	
	
}
