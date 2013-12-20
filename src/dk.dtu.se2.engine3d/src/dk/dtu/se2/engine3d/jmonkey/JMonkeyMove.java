package dk.dtu.se2.engine3d.jmonkey;

import com.jme3.animation.LoopMode;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.CinematicEvent;
import com.jme3.cinematic.events.CinematicEventListener;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;


/**
 * The JMonkeyMove class shall be used to animate a single token along a path 
 * @author Monica, Thibaud
 *
 */
public class JMonkeyMove implements CinematicEventListener{
	
	private MotionEvent 	motionEvent;
	private JMonkeyEngine	engine3D;
	private Vector3f		endWayPoint;
	private Vector3f		startWayPoint;
	
	//An id for the JMonkeyEvent
		private String id;
		
		//The geometry label
		private String geometryLabel;

	/**
	 * Creates a JMonkeyMove using
	 * @param geometryLabel: The geometry label of the line on which the event takes place
	 * @param motionEvent: The Motion event of the animation
	 * @param engine3D: The Engine 3D responsible for this animation
	 */
	public JMonkeyMove(String geometryLabel, MotionEvent motionEvent, JMonkeyEngine engine3D) {
		this.geometryLabel = geometryLabel;
		this.motionEvent = motionEvent;
		this.engine3D = engine3D;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Vector3f getEndWayPoint() {
		return endWayPoint;
	}

	public Vector3f getStartWayPoint() {
		return startWayPoint;
	}

	public void setEndWayPoint(Vector3f endWayPoint) {
		this.endWayPoint = endWayPoint;
	}
	
	public void setStartWayPoint(Vector3f startWayPoint) {
		this.startWayPoint = startWayPoint;
	}
	
	public void play() {
		this.motionEvent.play();
	}
	
	public void pause() {
		this.motionEvent.pause();
	}
	
	public void stop() {
		this.motionEvent.stop();
	}

	public Spatial getSpatial() {
		return motionEvent.getSpatial();
	}

	public MotionEvent getMotionEvent() {
		return motionEvent;
	}
	
	public JMonkeyEngine getEngine3D() {
		return engine3D;
	}

	public String getGeometryLabel() {
		return geometryLabel;
	}
	
	public void setMotionEvent(MotionEvent motionEvent) {
		this.motionEvent = motionEvent;
	}
	
	/**
	 * Clones a JMonkeyMove event
	 * @param baseObject: The JMonkeyMove object to copy
	 * @param newPath: The new path on which the move will take place
	 * @param spatial: The new spatial 
	 * @return A JMonkeyMove that is a copy of the baseObject
	 */
	public static JMonkeyMove moveEvent(JMonkeyMove baseObject, MotionPath newPath, Spatial spatial) {
		MotionEvent oldMotionEvent = baseObject.getMotionEvent();
		
		//Cloning the old motion event 
		MotionEvent newMotionEvent = new MotionEvent(spatial, newPath, 10, LoopMode.DontLoop);
		newMotionEvent.setSpeed(oldMotionEvent.getSpeed());
		newMotionEvent.setDirectionType(MotionEvent.Direction.Path);
		
		//Copying the JMonkeyMove
		JMonkeyMove copy = new JMonkeyMove(baseObject.getGeometryLabel(), newMotionEvent, ((JMonkeyMove) baseObject).getEngine3D());
		copy.setEndWayPoint( newPath.getWayPoint( newPath.getNbWayPoints()-1) );
		newMotionEvent.addListener(copy); // add the JMonkeyEngine as a listener to all motion events	

		return copy;
	}	

	@Override
	public void onPause(CinematicEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlay(CinematicEvent event) {
		
	}

	@Override
	public void onStop(CinematicEvent event) {
		this.engine3D.onStop(this);
	}
	
	
}
