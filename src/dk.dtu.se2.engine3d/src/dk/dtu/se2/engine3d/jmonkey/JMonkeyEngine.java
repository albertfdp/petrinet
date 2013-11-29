package dk.dtu.se2.engine3d.jmonkey;


import geometry.BendPoint;
import geometry.GObject;
import geometry.InputPoint;
import geometry.Line;
import geometry.Point;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AppState;
import com.jme3.cinematic.Cinematic;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.PlayState;
import com.jme3.cinematic.events.CinematicEvent;
import com.jme3.cinematic.events.CinematicEventListener;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.collision.CollisionResult;
import com.jme3.collision.CollisionResults;
import com.jme3.font.BitmapFont.Align;
import com.jme3.font.BitmapText;
import com.jme3.font.Rectangle;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Ray;
import com.jme3.math.Spline;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector3f;
import com.jme3.niftygui.NiftyJmeDisplay;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Curve;
import com.jme3.shadow.DirectionalLightShadowRenderer;
import com.jme3.system.AppSettings;
import com.jme3.texture.Texture;
import com.jme3.util.SkyFactory;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import dk.dtu.se2.animation.Move;
import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DListener;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public class JMonkeyEngine extends SimpleApplication implements Engine3D, CinematicEventListener{
	
	/*
	 * Geometry and Appearance models, plus all possible animations
	 */
	private geometry.Geometry 	geometry;
	private Appearance 			appearance;
	private List<RTAnimation>	animations;
	
	private NiftyJmeDisplay 	niftyDisplay; 
	private Nifty 				nifty;
	private ScreenController 	screenController;
	
	
	/* The listener of the 3D Engine - the simulator */
	private Engine3DListener listener;
	
	private Node inputPlaces;
	
	/* 
	 * Mapping between all the possible events 
	 * in the Petri net and their geometry label
	 */
	private HashMap<String, JMonkeyEvent> events;
	
	/* Queue of the events that are to be run next */
	private LinkedList<JMonkeyEvent> eventsQueue;
	
	/* 
	 * Movie script of all the events currently 
	 * running in the simulation
	 */
	private Cinematic eventsRunning;
	
	/* Initial lines in the geometry */
	private HashMap<String, MotionPath> lines;
	
    private Rectangle boundingBox;
    
    private int highX = (int) Double.NEGATIVE_INFINITY, highY = (int) Double.NEGATIVE_INFINITY;
    private int lowX = (int) Double.POSITIVE_INFINITY, lowY = (int) Double.POSITIVE_INFINITY;
    
  //  private int highX, highY, lowX, lowY;
    private Geometry groundGeo;
    private double timeAtSystemStart;
    private ArrayList<BitmapText> textFields;
    private ArrayList<BitmapText> infoText;
    private BitmapText hudText;
    
    private enum State {
    	PLAYING,
    	PAUSED,
    	RESETTING,
    	STOPPED
    }
    
    private State engineState;

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
					
					// Commented out for debugging purposes.
					
					// Find highest and lowest values of X to set the boundary 
					if(controlPoints[j].getX() > highX) highX = (int) controlPoints[j].getX();
					else if(controlPoints[j].getX() < lowX) lowX = (int) controlPoints[j].getX();
					
					// Find highest and lowest values of Y to set the boundary
					if(controlPoints[j].getZ() > highY) highY = (int) controlPoints[j].getZ();
					else if(controlPoints[j].getZ() < lowY) lowY = (int) controlPoints[j].getZ();
					
					
					path.addWayPoint(controlPoints[j]);
				}
				
				
				path.setPathSplineType(SplineType.CatmullRom);
				path.setCurveTension(0.5f);        
				
				/* Add the line label-motion path association to the lines HashMap */
				lines.put(line.getLabel(), path);
				
			} else if (object instanceof InputPoint) {
				
				InputPoint inputPoint = (InputPoint) object;
				
				int x = inputPoint.getXLocation();
				int y = inputPoint.getYLocation();
				
				//Change this with the real geometry
				Box b = new Box(5, 5, 5);
				
				Geometry geom = new Geometry(object.getLabel(), b);
				geom.setLocalTranslation(new Vector3f(x,0f,y));
				Material mat = new Material(assetManager,
				          "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
		        mat.setColor("Color", ColorRGBA.Blue);   // set color of material to blue
		        geom.setMaterial(mat);   
		        //Attach the geometry to input places node
		        inputPlaces.attachChild(geom);
				
			}
		}
	}

	private void setUpAnimations() {
		
		/* Create token */
		Spatial token = assetManager.loadModel("Models/train.obj");
		token.setShadowMode(com.jme3.renderer.queue.RenderQueue.ShadowMode.CastAndReceive);
				
		Material tokenMat = new Material(assetManager, "Common/MatDefs/Misc/ColoredTextured.j3md");  // create a simple material
		tokenMat.setTexture("ColorMap", assetManager.loadTexture("Textures/trainTex.jpg"));	// set the texture to the material
		tokenMat.setColor("Color", ColorRGBA.White); // set the base color of the material  
		
		token.setMaterial(tokenMat); // apply the material to the geometry

		// scaling the train
     	token.scale(boundingBox.width * 0.006f);
     	
		rootNode.attachChild(token); // put this node in the scene, attached to the root
		/* Parse the list of animations and create a new MotionPath and MotionEvent for each of them */
		for(RTAnimation animation : animations) {
			System.out.println(animation.getClass());
			if(animation.getAnimation() instanceof Move) {
				
				/* Get the motion path corresponding to the current animation */
				MotionPath path = new MotionPath();
				path = lines.get(animation.getGeometryLabel());
								
				
				/* Create motion event corresponding to the move animation */
				JMonkeyEvent event = new JMonkeyEvent(animation.getGeometryLabel(), token, path, 10, LoopMode.DontLoop); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (don't loop).
				event.setSpeed(((Move) animation.getAnimation()).getSpeed());
				event.setDirectionType(MotionEvent.Direction.Path); // the spatial is always faced in the direction of the path while moving
				event.addListener(this); // add the JMonkeyEngine as a listener to all motion events
				events.put(animation.getGeometryLabel(), event);
			}
		}
				
	}
	
	private void setUpLight() {
		// AP: setting up skybox
				rootNode.attachChild(SkyFactory.createSky(
			            assetManager, "Textures/Sky/Bright/BrightSky.dds", false));
			
				// toggle statistics window in bottom left
				setDisplayFps(false);
				setDisplayStatView(false);
				
		        // AP: adding light - remember to get materials with shader
		        DirectionalLight sun = new DirectionalLight();
		        sun.setDirection(new Vector3f(-0.5f,-0.5f,-0.5f).normalizeLocal());
		        //sun.setDirection(cam.getDirection());
		        sun.setColor(ColorRGBA.Red);
		        rootNode.addLight(sun);        
		        
		        // Drop shadows 
		        final int SHADOWMAP_SIZE=1024;
		        DirectionalLightShadowRenderer dlsr = new DirectionalLightShadowRenderer(assetManager, SHADOWMAP_SIZE, 3);
		        dlsr.setLight(sun);
		        viewPort.addProcessor(dlsr);
	}
	
	private void setUpGround() {
		
		// AP: create ground with volume
		float groundWidthX  = (boundingBox.width/2) * 1.1f;
		float groundHeightY = 1;
		float groundDepthZ  = (boundingBox.height/2) * 1.1f;
		groundGeo = new Geometry("Box", new Box(groundWidthX, groundHeightY, groundDepthZ));
		groundGeo.setShadowMode(com.jme3.renderer.queue.RenderQueue.ShadowMode.CastAndReceive);
		Material groundMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		Texture groundTex = assetManager.loadTexture("Textures/ground.jpg"); 
		groundMat.setTexture("ColorMap", groundTex);
		groundGeo.setMaterial(groundMat);
		groundGeo.setLocalTranslation((boundingBox.width/2) + boundingBox.x, (-groundHeightY)-0.1f, (boundingBox.height/2) + boundingBox.y);
				        
		rootNode.attachChild(groundGeo);

	}
	private void setBoundingBox() {
		
		boundingBox = new Rectangle(lowX, lowY, highX-lowX, highY-lowY);
	}
	
	
	public void setUpTextFields() {
		
		/*
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
    	*/
	}
	
	private void setUpCameraPosition() {
		
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
 			flyCam.setMoveSpeed(100);

 		
 			//Attaching the input places node to the root node
 			this.inputPlaces = new Node("InputPlaces");
 			rootNode.attachChild(inputPlaces);
 		
 			// Toggle statistics window in bottom left
 			setDisplayFps(false);
 			setDisplayStatView(false);
 			    	
 			// AP: setting up a hud text
 			hudText = new BitmapText(guiFont, false);          
 			hudText.setSize(guiFont.getCharSet().getRenderedSize());   // font size
 			hudText.setColor(ColorRGBA.White);                        // font color
 			hudText.setText("" + engineState);  
 			hudText.setSize(25);
 			hudText.setLocalTranslation(350, 580, 0); // position
 			guiNode.attachChild(hudText);    	
 	        
 	// AP: Run setups to prepare the layout of the paths etc.
 	        this.setUpLight();
 	        this.setUpEnvironment();
 	        this.setBoundingBox();
 	        this.setUpGround();
 			this.setUpAnimations();
 			this.setUpTextFields();
 			this.setUpCameraPosition();

 		 	this.setupKeyMappings();
 			
 			
 			this.niftyDisplay = new NiftyJmeDisplay(assetManager, 
 													inputManager,
 													audioRenderer,
 													guiViewPort);
 			
 			// Create a new NiftyGUI object 
 			this.nifty = this.niftyDisplay.getNifty();
 			// Read the XML and initialize the custom ScreenController
 			this.nifty.fromXml("GUI/NiftyButtons.xml", "start");
 			this.nifty.setDebugOptionPanelColors(false);
 			
// 			this.screenController = this.nifty.getCurrentScreen().getScreenController();
// 			stateManager.attach((AppState) this.screenController);
 		 			        
 			// Attach the Nifty display to the GUI view port as a processor
 	        guiViewPort.addProcessor(niftyDisplay);
 	        
 			this.engineState = State.STOPPED;
 			
 			this.listener.onStart();	
 			
 			inputManager.setCursorVisible(true);
	}

 	private void setupKeyMappings() {

			inputManager.addMapping("1",  new KeyTrigger(KeyInput.KEY_1));
			inputManager.addMapping("2",  new KeyTrigger(KeyInput.KEY_2));
			inputManager.addMapping("3",  new KeyTrigger(KeyInput.KEY_3));
			inputManager.addMapping("p",  new KeyTrigger(KeyInput.KEY_P));
			inputManager.addMapping("r",  new KeyTrigger(KeyInput.KEY_R));
			inputManager.addMapping("Click", new MouseButtonTrigger(MouseInput.BUTTON_LEFT));
			inputManager.addMapping("CameraControl", new MouseButtonTrigger(MouseInput.BUTTON_RIGHT));
			        
			inputManager.addListener(actionListener, new String[]{"1"});
			inputManager.addListener(actionListener, new String[]{"2"});
			inputManager.addListener(actionListener, new String[]{"3"});
			inputManager.addListener(actionListener, new String[]{"p"});
			inputManager.addListener(actionListener, new String[]{"r"});
			inputManager.addListener(actionListener, new String[]{"Click"});
			inputManager.addListener(actionListener, new String[]{"CameraControl"});
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
		
		this.lines = new HashMap<String, MotionPath>();
		this.events = new HashMap<String, JMonkeyEvent>();
		this.eventsQueue = new LinkedList<JMonkeyEvent>();
		
		this.eventsRunning = new Cinematic(this.rootNode, 10);
		stateManager.attach(eventsRunning);
		
		this.setPauseOnLostFocus(false);
		this.start(); 
		
		}

	public void setEngine3DListener(Engine3DListener engine3DListener) {
		this.listener = engine3DListener;
	}
	
	
	@Override
	public void addToAnimationQueue(List<RTAnimation> animations) {
		for (RTAnimation animation : animations) {
			JMonkeyEvent eventToQueue = events.get(animation.getGeometryLabel());
			eventsQueue.add(eventToQueue);
			
			System.out.println("Animation added to queue: " + animation.getGeometryLabel());
		}
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
		
		this.listener.onAnimationFinished(((JMonkeyEvent) ev).getGeometryLabel());
		this.eventsRunning.removeCinematicEvent(ev);
		
		System.out.println(ev.getPlayState());
	}

	@Override 
    public void simpleUpdate(float tpf) {

		if (engineState == State.PLAYING)
			hudText.setColor(ColorRGBA.Green);
		else
			hudText.setColor(ColorRGBA.Red);
		
		hudText.setText("" + engineState);
		
		/* Play waiting animations */
		if (engineState == State.PLAYING) {
			
			while (!eventsQueue.isEmpty()) {
				MotionEvent eventToRun = eventsQueue.pop();
				if(eventToRun!=null) 
					eventsRunning.addCinematicEvent(0, eventToRun);
			}
			
			eventsRunning.play();
		}
							
    }
	
	
	private ActionListener actionListener = new ActionListener() {
		 
		public void onAction(String name, boolean keyPressed, float tpf) {
			
			if (name.equals("p") && !keyPressed) { 
				
				switch (engineState) {
				
				case PLAYING: 	eventsRunning.pause();
								engineState = State.PAUSED;
								break;
				
				case PAUSED: 	eventsRunning.play();
								engineState = State.PLAYING;
								break;
								
				case RESETTING:	// do nothing
								break;
								
				case STOPPED: 	engineState = State.PLAYING;
								break;
								
				}
					
		    }
			
			if (name.equals("r") && !keyPressed) { 
				
				hudText.setText("Play state: " + engineState); 
				for (MotionEvent event : eventsQueue) {
					if(event!=null) event.stop();
					// remove tokens
					// 
					// This needs to be done differently: it should load the original configuration and remove all tokens.
				}
				
				engineState = State.PAUSED; // perhaps the state should be 'stopped'
			}
			
			
			//Enable the camera control by the mouse
			if (name.equals("CameraControl") && keyPressed) {
				flyCam.setEnabled(true);
			}

			//Disable the camera control back
			if (name.equals("CameraControl") && !keyPressed) {
				flyCam.setEnabled(false);
			}
			
			if (name.equals("Click") && !keyPressed) {
				// 1. Reset results list.
		        CollisionResults results = new CollisionResults();
		        // 2. Aim the ray from cam loc to cam direction.
		        Ray ray = new Ray(cam.getLocation(), cam.getDirection());
		        // 3. Collect intersections between Ray and Input Places in results list.
		        inputPlaces.collideWith(ray, results);
		        // 4. Get the closest collision
		        if (results.size() > 0) {
		        	CollisionResult hitPlace = results.getClosestCollision();
			        String inputPlaceId = hitPlace.getGeometry().getName();
			        listener.onUserClick(inputPlaceId);
		        }
		        
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
