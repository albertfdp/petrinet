package dk.dtu.se2.engine3d.jmonkey;

import geometry.BendPoint;
import geometry.GObject;
import geometry.InputPoint;
import geometry.Line;
import geometry.Point;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;

import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.PlayState;
import com.jme3.cinematic.events.CinematicEvent;
import com.jme3.cinematic.events.CinematicEventListener;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.font.BitmapText;
import com.jme3.font.Rectangle;
import com.jme3.font.BitmapFont.Align;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Spline;
import com.jme3.math.Vector2f;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Curve;
import com.jme3.system.AppSettings;
import com.jme3.texture.Texture;

import dk.dtu.se2.animation.Move;
import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DListener;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public class JMonkeyEngine extends SimpleApplication implements Engine3D,CinematicEventListener {
	
	private geometry.Geometry 	geometry;
	private Appearance 			appearance;
	private List<RTAnimation>	animations;
	
	/* The listener of the 3D Engine - the simulator*/
	private Engine3DListener listener;
	
	/* Events that need to be run */
	private HashMap<MotionEvent, String> events;
	
	/* Initial lines in the geometry */
	private HashMap<String, MotionPath> lines;
	
	private Random rand = new Random();
    private Rectangle boundingBox;
    private int highX = (int) Double.NEGATIVE_INFINITY, highY = (int) Double.NEGATIVE_INFINITY;
    private int lowX = (int) Double.POSITIVE_INFINITY, lowY = (int) Double.POSITIVE_INFINITY;
    
    
    private double timeAtSystemStart;
    private ArrayList<BitmapText> textFields;
    private ArrayList<BitmapText> infoText;
    private BitmapText hudText;
    
    private enum State {
    	PLAYING,
    	PAUSED,
    	RESETTING
    }
    
    private State engineState;
    
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
				Line line = (Line) object;
				Point start = line.getBegin();
				Point end = line.getEnd();
				EList<BendPoint> bendPoints = line.getBendPoints();
							
				Vector3f[] controlPoints = new Vector3f[3];
				int i=0;
				
				controlPoints[i++] = new Vector3f(start.getXLocation(), 0f, start.getYLocation());
				for (BendPoint bendPoint:bendPoints)
					controlPoints[i++] = new Vector3f(bendPoint.getXLocation(), 0f, bendPoint.getYLocation());
				
				controlPoints[i] = new Vector3f(end.getXLocation(), 0f, end.getYLocation());
				
				/* Create curve */
				Curve track = new Curve(new Spline(SplineType.CatmullRom, controlPoints, 0.5f, false), 1);
				track.setLineWidth(500);
				
				/* Create geometry */
				Geometry trackGeometry = new Geometry("Track", track); // create track geometry with curve shape   		
				
				/* Set "appearance" */
				Texture trackTex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); // create a texture
				Material trackMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
				trackMat.setTexture("ColorMap", trackTex);		// set the texture to the material
				trackMat.setColor("Color", ColorRGBA.Orange); // set the base color of the material   
				
				trackGeometry.setMaterial(trackMat); // apply the material to the geometry
				
				rootNode.attachChild(trackGeometry); // put this node in the scene, attached to the root node.
				
				/* Create motion path */
				MotionPath path = new MotionPath();
				
				path.setCycle(false); // make sure the path doesn't loop 
	       
				for(int j=0; j<=i; j++) {
					
					/* Find highest and lowest values of X to set the boundary */
					if(controlPoints[j].getX() > highX) highX = (int) controlPoints[j].getX();
					else if(controlPoints[j].getX() < lowX) lowX = (int) controlPoints[j].getX();
					
					/* Find highest and lowest values of Y to set the boundary */
					if(controlPoints[j].getY() > highY) highY = (int) controlPoints[j].getY();
					else if(controlPoints[j].getY() < lowY) lowY = (int) controlPoints[j].getY();
					
					path.addWayPoint(controlPoints[j]);
				}
				
				path.setPathSplineType(SplineType.CatmullRom);
				path.setCurveTension(0.5f);        
				
				/* Add the line label-motion path association to the lines HashMap */
				lines.put(line.getLabel(), path);
				
			} else if (object instanceof InputPoint) {
				
			}
		}
	}

	private void setUpAnimations() {
		
		/* Parse the list of animations and create a new MotionPath and MotionEvent for each of them */
		for(RTAnimation animation : animations) {
			if(animation instanceof Move) {
				
				/* Get the motion path corresponding to the current animation */
				MotionPath path = lines.get(animation.getGeometryLabel());
							
				/* Create token */
				Geometry token = new Geometry("Box", new Box(0.006f*boundingBox.width, 0.004f*boundingBox.width, 0.014f*boundingBox.width)); // create cube geometry from with box shape        
				
				Texture tokenTex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); // create a texture
				
				Material tokenMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
				tokenMat.setTexture("ColorMap", tokenTex);	// set the texture to the material
				tokenMat.setColor("Color", ColorRGBA.Blue); // set the base color of the material  
				
				token.setMaterial(tokenMat); // apply the material to the geometry
				
				rootNode.attachChild(token); // put this node in the scene, attached to the root
				
				/* Create motion event corresponding to the move animation */
				MotionEvent event = new MotionEvent(token, path, ((Move) animation).getSpeed(), LoopMode.DontLoop); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (don't loop).
				
				event.setDirectionType(MotionEvent.Direction.Path); // the spatial is always faced in the direction of the path while moving
				event.addListener(this); // add the JMonkeyEngine as a listener to all motion events
				events.put(event, animation.getGeometryLabel()); // add event to the list of events
				
				
			}
		}
		
	}
	
	private void setBoundingBox() {
		boundingBox = new Rectangle(lowX, lowY, highX-lowX, highY-lowY);
	}
	
	
	public void setupTextFields() {
	
		textFields = new ArrayList<BitmapText>();
		infoText = new ArrayList<BitmapText>();
		
		Collection<String> lineObjects = lines.keySet();
		int i=1;
		for (String lineObject : lineObjects) {
			   
    		BitmapText text = new BitmapText(guiFont, false);
    		text.setAlignment(Align.Left);
    		text.setLocalTranslation(5, text.getLineHeight() * (i+10), 0);
    		text.setText("This is text field " + lineObject);

    		textFields.add(text);
    		guiNode.attachChild(text);
    		
    		BitmapText text2 = new BitmapText(guiFont, false);
    		text2.setAlignment(Align.Left);
    		text2.setColor(ColorRGBA.White);
    		text2.setLocalTranslation(60, text2.getLineHeight() * (i+26), 0);
    		text2.setText(" ");

    		infoText.add(text);
    		guiNode.attachChild(text);
    	}
		    	
    	infoText.get(0).setText("Press 'p' to play & pause, press 'r' to reset - use '1' and '2' to add token animations to the queue");
	}
	
	private void setupCameraPosition() {
		
		float heightScaler = 1.1f;
			
		Vector3f camPos = new Vector3f(boundingBox.x + boundingBox.width/2, 
				(float)Math.tan(Math.toRadians(67.5f))*(boundingBox.width/2)*heightScaler, 
				boundingBox.y + boundingBox.height/2); // height is assuming 45 degree FOV. Angle used for calculation is 90 - (45/2) = 67.5
		cam.setLocation(camPos);
		
		Quaternion rotation = new Quaternion(0, (float)Math.cos(Math.toRadians(45)), -(float)Math.cos(Math.toRadians(45)), 0); // make camera look "down"
		cam.setRotation(rotation);
		
	}
	
 	@Override
	public void simpleInitApp() {
 		
 	// AP: setting up miscellaneous stuff
 			timeAtSystemStart = System.currentTimeMillis();
 			// AP: set the background color
 			viewPort.setBackgroundColor(ColorRGBA.Gray);
 			// AP: enable/disable camera fly - the ability to move the camera with keyboard and mouse
 			flyCam.setEnabled(false); 
 			flyCam.setMoveSpeed(25);
 		
 			// toggle statistics window in bottom left
 			setDisplayFps(false);
 			setDisplayStatView(false);
 			    	
 			// AP: setting up a hud text
 			hudText = new BitmapText(guiFont, false);          
 			hudText.setSize(guiFont.getCharSet().getRenderedSize());      // font size
 			hudText.setColor(ColorRGBA.White);                             // font color
 			hudText.setText("" + engineState);  
 			hudText.setSize(25);
 			hudText.setLocalTranslation(350, 580, 0); // position
 			guiNode.attachChild(hudText);    	
 			    	 			
 			inputManager.addMapping("1",  new KeyTrigger(KeyInput.KEY_1));
 			inputManager.addMapping("2",  new KeyTrigger(KeyInput.KEY_2));
 			inputManager.addMapping("3",  new KeyTrigger(KeyInput.KEY_3));
 			inputManager.addMapping("p",  new KeyTrigger(KeyInput.KEY_P));
 			inputManager.addMapping("r",  new KeyTrigger(KeyInput.KEY_R));
 			        
 			inputManager.addListener(actionListener, new String[]{"1"});
 			inputManager.addListener(actionListener, new String[]{"2"});
 			inputManager.addListener(actionListener, new String[]{"3"});
 			inputManager.addListener(actionListener, new String[]{"p"});
 			inputManager.addListener(actionListener, new String[]{"r"});
 			        
 			// AP: Run setups to prepare the layout of the paths etc.
 			this.setUpEnvironment();
 			this.setBoundingBox();
 			this.setUpAnimations();
 			this.setupTextFields();
 			this.setupCameraPosition();
 			        
 			this.engineState = State.PAUSED;
 			        
	}

	@Override
	public void init(geometry.Geometry geometry, Appearance appearance,
			List<RTAnimation> animations) {
		
		//--- This part removes the splash screen
    	this.setShowSettings(false);
    	AppSettings settings = new AppSettings(true);
    	settings.setResolution(800, 600);
    	settings.setBitsPerPixel(32);
    	this.setSettings(settings);
    	//---
		        
		this.geometry = geometry;
		this.appearance = appearance;
		this.animations = animations;
		
		this.start(); 
		}

	public void setEngine3DListener(Engine3DListener engine3DListener) {
		this.listener = engine3DListener;
	}
	
	
	@Override
	public void addToAnimationQueue(List<RTAnimation> animations) {
		// TODO Auto-generated method stub
		
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
	public void onStop(CinematicEvent ev) {
		
		this.listener.onAnimationFinished(events.get(ev));
	}

	
	
	private ActionListener actionListener = new ActionListener() {
		 
		public void onAction(String name, boolean keyPressed, float tpf) {
			
			if (name.equals("p") && !keyPressed) { 
				
				switch (engineState) {
				
				case PLAYING: 	for (MotionEvent event : events.keySet()) { // only pause the playing motionEvents
									
									PlayState playState = event.getPlayState();
									if (playState == PlayState.Playing)
										event.pause();
	        					}	
								engineState = State.PAUSED;
								break;
				
				case PAUSED: 	for (MotionEvent event : events.keySet()) { // only play the paused motionEvents
									
									PlayState playState = event.getPlayState();
									if (playState == PlayState.Paused)
										event.play();	
								}	
								engineState = State.PLAYING;
								break;
								
				case RESETTING:	// do nothing
								break;
								
				}
					
		    }
			
			if (name.equals("r") && !keyPressed) { 
				
				hudText.setText("Play state: " + engineState); 
				for (MotionEvent event : events.keySet()) {
					event.stop();
					// remove tokens
					// 
					// This needs to be done differently: it should load the original configuration and remove all tokens.
				}
				
				engineState = State.PAUSED; // perhaps the state should be 'stopped'
			}
			
//			if (name.equals("1") && !keyPressed) { 
//				
//				animationQueue.add(0); // adds the ID of the animation to the list 
//
//		    } 
//			if (name.equals("2") && !keyPressed) { 
//				
//				animationQueue.add(1); // adds the ID of the animation to the list
//				
//		    }
//			if (name.equals("3") && !keyPressed) {
//				
//				animationQueue.add(2); // adds the ID of the animation to the list
//
//		    }

		}
		
	};
}
