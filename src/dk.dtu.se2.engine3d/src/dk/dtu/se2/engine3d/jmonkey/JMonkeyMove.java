package dk.dtu.se2.engine3d.jmonkey;

import com.jme3.cinematic.events.CinematicEvent;
import com.jme3.cinematic.events.CinematicEventListener;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;


/**
 * @author Monica
 *
 */
public class JMonkeyMove extends JMonkeyEvent implements CinematicEventListener{
	
	private MotionEvent 	motionEvent;
	private JMonkeyEngine	engine3D;
	private Vector3f		endWayPoint;
	private Vector3f		startWayPoint;

	public JMonkeyMove(String geometryLabel, MotionEvent motionEvent, JMonkeyEngine engine3D) {
		super(geometryLabel);
		this.motionEvent = motionEvent;
		this.engine3D = engine3D;
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

	public void setMotionEvent(MotionEvent motionEvent) {
		this.motionEvent = motionEvent;
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
		
		//Spatial token = this.motionEvent.getSpatial();
		//token.getControl(TokenControl.class).setLocation(this.endWayPoint, token);
		//token.rotate(0, 90, 0);
		
		engine3D.onStop(this);
	}
	
	
}
