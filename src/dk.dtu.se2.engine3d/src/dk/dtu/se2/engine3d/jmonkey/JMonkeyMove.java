package dk.dtu.se2.engine3d.jmonkey;

import com.jme3.cinematic.events.CinematicEvent;
import com.jme3.cinematic.events.CinematicEventListener;
import com.jme3.cinematic.events.MotionEvent;


/**
 * @author Monica
 *
 */
public class JMonkeyMove extends JMonkeyEvent implements CinematicEventListener{
	
	private MotionEvent 	motionEvent;
	private JMonkeyEngine	engine3D;

	public JMonkeyMove(String geometryLabel, MotionEvent motionEvent, JMonkeyEngine engine3D) {
		super(geometryLabel);
		this.motionEvent = motionEvent;
		this.engine3D = engine3D;
	}

	public MotionEvent getMotionEvent() {
		return motionEvent;
	}

	public void setMotionEvent(MotionEvent motionEvent) {
		this.motionEvent = motionEvent;
	}

	@Override
	public void onPause(CinematicEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlay(CinematicEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStop(CinematicEvent event) {
		engine3D.onStop(this);
	}
	
}
