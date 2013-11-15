package dk.dtu.se2.engine3d.jmonkey;

import geometry.GObject;
import geometry.InputPoint;
import geometry.Line;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Spline;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Curve;

import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public class JMonkeyEngine extends SimpleApplication implements Engine3D {
	
	private geometry.Geometry geometry;
	private Appearance appearance;
	
	/* Events that need to be run */
	private List<MotionEvent> events;
	
	private HashMap<Line, Curve> lines;
	
	public static void main (String [] args) {
		JMonkeyEngine jMonkeyEngine = new JMonkeyEngine();
		jMonkeyEngine.setDisplayStatView(false);;
		jMonkeyEngine.start();
	}
	
	private void setUpEnvironment() {
		EList<GObject> gObjects = this.geometry.getGObjects();
		for (GObject object : gObjects) {
			if (object instanceof Line) {
				
				/**
				 * TODO: create curve, associate it to geometry, set appearance
				 */
				
			} else if (object instanceof InputPoint) {
				
			}
		}
	}

	@Override
	public void simpleInitApp() {
	}

	@Override
	public void init(geometry.Geometry geometry, Appearance appearance,
			List<RTAnimation> animations) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToAnimationQueue(List<RTAnimation> animations) {
		// TODO Auto-generated method stub
		
	}

}
