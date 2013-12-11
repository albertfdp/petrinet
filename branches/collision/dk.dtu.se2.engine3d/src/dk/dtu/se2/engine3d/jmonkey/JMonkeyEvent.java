package dk.dtu.se2.engine3d.jmonkey;

import java.util.concurrent.atomic.AtomicInteger;

import com.jme3.animation.LoopMode;
import com.jme3.asset.AssetManager;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.scene.Spatial;

import dk.dtu.se2.animation.Move;



import com.jme3.animation.LoopMode;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.scene.Spatial;


/**
 * @author Monica
 *
 */
public class JMonkeyEvent {
	
	
	//An id for the JMonkeyEvent
	private String id;
	
	//The geometry label
	private String geometryLabel;
	
	public JMonkeyEvent(String geometryLabel) {
		super();
		this.geometryLabel = geometryLabel;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public String getGeometryLabel() {
		return geometryLabel;
	}

	public void setGeometryLabel(String geometryLabel) {
		this.geometryLabel = geometryLabel;
	}

	public static JMonkeyEvent appearCopy(JMonkeyEvent baseObject) {
		JMonkeyAppear copy = new JMonkeyAppear(baseObject.getGeometryLabel(), ((JMonkeyAppear) baseObject).getAppearanceLabel());
		return copy;
		
	}
	
	public static JMonkeyEvent moveEvent(JMonkeyEvent baseObject, MotionPath newPath, Spatial spatialToCopy) {
		MotionEvent oldMotionEvent = ((JMonkeyMove) baseObject).getMotionEvent();
		
		//Cloning the old motion event 
		MotionEvent newMotionEvent = new MotionEvent(spatialToCopy, newPath, 10, LoopMode.DontLoop);
		newMotionEvent.setSpeed(oldMotionEvent.getSpeed());
		newMotionEvent.setDirectionType(MotionEvent.Direction.Path);
		
		//Copying the JMonkeyMove
		JMonkeyMove copy = new JMonkeyMove(baseObject.getGeometryLabel(), newMotionEvent, ((JMonkeyMove) baseObject).getEngine3D());
		copy.setEndWayPoint( newPath.getWayPoint( newPath.getNbWayPoints()-1) );
		newMotionEvent.addListener(copy); // add the JMonkeyEngine as a listener to all motion events	

		return copy;
		
	}	
}
