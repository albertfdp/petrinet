package dk.dtu.se2.engine3d.jmonkey;

import geometry.BendPoint;
import geometry.GObject;
import geometry.InputPoint;
import geometry.Line;
import geometry.Point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import appearance.AObject;
import appearance.Appearance;

import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AppState;
import com.jme3.cinematic.Cinematic;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.collision.CollisionResult;
import com.jme3.collision.CollisionResults;
import com.jme3.font.Rectangle;
import com.jme3.input.MouseInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.MouseButtonTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Ray;
import com.jme3.math.Spline;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector2f;
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
import de.lessvoid.nifty.screen.ScreenController;
import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.animation.Appear;
import dk.dtu.se2.animation.Move;
import dk.dtu.se2.animation.Sequence;
import dk.dtu.se2.animation.Stop;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DListener;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public class JMonkeyEngine extends SimpleApplication implements Engine3D {
	
	/* Geometry and Appearance models, plus list of all possible animations */
	private geometry.Geometry 	geometry;
	private Appearance 			appearance;
	private List<RTAnimation>	animations;
	
	/* NiftyDisplay, Nifty object and ScreenController for the GUI of the Start/Pause/Reset buttons */
	private NiftyJmeDisplay 	niftyDisplay; 
	private Nifty 				nifty;
	private ScreenController 	screenController;
	
	
	/* The listener of the 3D Engine - the simulator */
	private Engine3DListener listener;
	
	private Node inputPlaces;
	
	/*  Mapping between all the possible events in the Petri net and their geometry label */
	private HashMap<String, JMonkeyEvent> events;
	
	/* Queue of the events that are to be run next */
	private LinkedList<JMonkeyEvent> eventsQueue;
	
	/* Queue of tokens to be destroyed */
	private HashMap<String, LinkedList<Spatial>> tokenQueue;
	
	/* Mapping between lines and tokens appearances */
	private HashMap<String, String> tokenAppearances;
	
	/*  Mapping each token to a specific id (String) and its animation rendering in the visualisation*/
	private HashMap<String, JMonkeyEvent> allRenderedEvents;
	
	/*  Mapping between a specific id for a token and all the token it collides with */
	private HashMap<String, ArrayList<String>> allCollisions;
	
	/* Mapping between geometry labels of lines and JMonkey motion paths */
	private HashMap<String, MotionPath> lines;
	
	/* Mapping between geometry labels of input places and JMonkey spatial */
	private HashMap<String, Spatial> inputs;
	
    private Rectangle boundingBox;
    private int highX = (int) Double.NEGATIVE_INFINITY, highY = (int) Double.NEGATIVE_INFINITY;
    private int lowX = (int) Double.POSITIVE_INFINITY, lowY = (int) Double.POSITIVE_INFINITY;
    
    private Geometry groundGeo;
         
    private enum State {
    	PLAYING,
    	PAUSED,
    	STOPPED
    }
    
    private State engineState;
    	
	private void setUpEnvironment() {
		
		/* 
		 * Get the list of geometry objects from the geometry model
		 */
		EList<GObject> gObjects = this.geometry.getGObjects();
				
		/*
		 * For each geometry object check whether it is a Line or an InputPoint and create their 
		 * corresponding jMonkey geometry object  
		 */
		for (GObject object : gObjects) {
			if (object instanceof Line) { // GObject is a line
				
				/* Cast GObject to line and get:
				 * -- start and end points 
				 * -- list of bend points 
				 * -- appearance label 
				 * -- token appearance label  TO BE DONE
				 */
				Line line = (Line) object;
				Point start = line.getBegin();
				Point end = line.getEnd();
				EList<BendPoint> bendPoints = line.getBendPoints();
				String appearanceLabel = line.getAppearanceLabel();
				
				/*
				 * Get the appearance object corresponding to the line's appearance label
				 */
				AObject appearanceObject = this.appearance.getAObjectByLabel(appearanceLabel);
				String texture = appearanceObject.getTexture();
				tokenAppearances.put(line.getLabel(), "train"); //line.getTokenAppearanceLabel);
				
				/*
				 * Transform the EList of bend points to and ArrayList of Vector3f control points 
				 * in order to create the Catmull Rom curve
				 */
				ArrayList<Vector3f> controlPoints = new ArrayList<Vector3f>();
				
				controlPoints.add(new Vector3f(start.getXLocation(), 0f, start.getYLocation())); // start point
				
				for (BendPoint bendPoint:bendPoints) // bend points
					controlPoints.add(new Vector3f(bendPoint.getXLocation(), 0f, bendPoint.getYLocation())); 
				
				controlPoints.add(new Vector3f(end.getXLocation(), 0f, end.getYLocation())); // end point
				
				/* Create CatmullRom curve */
				Curve track = new Curve(new Spline(SplineType.CatmullRom, controlPoints, 0.5f, false), 10);
				track.setLineWidth(500);
				
				/* Create jMonkey geometry object for the track based on the CatmullRom curve */
				Geometry trackGeometry = new Geometry(line.getLabel(), track);   		
				
				
				/* Set the appearance to the jMonkey track geometry */
				
//				Texture trackTex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); // create a texture
				
				Texture trackTex = assetManager.loadTexture(texture); 
				Material trackMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
				trackMat.setTexture("ColorMap", trackTex);		// set the texture to the material
				trackMat.setColor("Color", ColorRGBA.Orange); // set the base color of the material   
				
				trackGeometry.setMaterial(trackMat); // apply the material to the geometry
				Node node = new Node(line.getLabel());
				node.attachChild(trackGeometry);
				rootNode.attachChild(node); // put this node in the scene, attached to the root node.
				
				/* Create motion path along the CatMullRom curve */
				MotionPath path = new MotionPath();
				
				path.setCycle(false); // make sure the path doesn't loop 
				
				for(Vector3f controlPoint : controlPoints) {
					
					/* Find highest and lowest values of X to set the boundary */
					if(controlPoint.getX() > highX) highX = (int) controlPoint.getX();
					else if(controlPoint.getX() < lowX) lowX = (int) controlPoint.getX();
					
					/* Find highest and lowest values of Y to set the boundary */
					if(controlPoint.getY() > highY) highY = (int) controlPoint.getZ();
					else if(controlPoint.getY() < lowY) lowY = (int) controlPoint.getZ();
					
					path.addWayPoint(controlPoint); // add way points to the path 
				}
				
				path.setPathSplineType(SplineType.CatmullRom); // set path type
				path.setCurveTension(0.5f);        
				
				/* Add the line label-motion path association to the lines HashMap */
				lines.put(line.getLabel(), path);
				
			} else if (object instanceof InputPoint) { // GObject is an InputPoint
				
				/*
				 * Cast GObject and get:
				 * -- x location
				 * -- y location
				 */
				InputPoint inputPoint = (InputPoint) object;
				int x = inputPoint.getXLocation();
				int y = inputPoint.getYLocation();
				String appearanceLabel = inputPoint.getAppearanceLabel();
				
				/*
				 * Get the appearance object corresponding to the input place's appearance label
				 */
				AObject appearanceObject = this.appearance.getAObjectByLabel(appearanceLabel);
				String texture = appearanceObject.getTexture();
				
				//Change this with the real geometry
				Spatial inputObject = assetManager.loadModel(appearanceObject.getObject3D());
				inputObject.setName(inputPoint.getLabel());
				inputObject.setShadowMode(com.jme3.renderer.queue.RenderQueue.ShadowMode.CastAndReceive);
				Material inputMat = new Material(assetManager, "Common/MatDefs/Misc/ColoredTextured.j3md");  // create a simple material
				inputMat.setTexture("ColorMap", assetManager.loadTexture(texture));	// set the texture to the material
				inputMat.setColor("Color", ColorRGBA.White); // set the base color of the material  
				
				inputObject.setMaterial(inputMat); // apply the material to the geometry
				
				inputObject.setLocalTranslation(new Vector3f(x,0f,y));
				
		        //Attach the geometry to input places node
		        inputPlaces.attachChild(inputObject);
		        
		        /* Add the input place label-spatial association to the inputs HashMap */
				inputs.put(inputPoint.getLabel(), inputObject);
			}
		}
	}

	private void setUpAnimations() {
		int tokensNr = 0;

		/* Parse the list of animations and create a new MotionPath and MotionEvent for each of them */
		for(RTAnimation RTanimation : animations) {
			
			/* Get geometry label of the runtime animation */
			String geometryLabel = RTanimation.getGeometryLabel();
			
			/* Get animation of the runtime animation */ 
			Animation animation = RTanimation.getAnimation();
			
			if(animation instanceof Move) {
				
				/* Create token as a jMonkey spatial*/
				String tokenAppearance = this.tokenAppearances.get(geometryLabel);
				AObject tokenAppearanceObject = this.appearance.getAObjectByLabel(tokenAppearance);
								
//				Spatial token = assetManager.loadModel("Models/train.obj");
				Spatial token = assetManager.loadModel(tokenAppearanceObject.getObject3D());
				token.setName("t"+ tokensNr);
				tokensNr++;
				token.setShadowMode(com.jme3.renderer.queue.RenderQueue.ShadowMode.CastAndReceive);
				token.addControl(new TokenControl());
						
				Material tokenMat = new Material(assetManager, "Common/MatDefs/Misc/ColoredTextured.j3md");  // create a simple material
//				tokenMat.setTexture("ColorMap", assetManager.loadTexture("Textures/trainTex.jpg"));	// set the texture to the material
				tokenMat.setTexture("ColorMap", assetManager.loadTexture(tokenAppearanceObject.getTexture()));	
				tokenMat.setColor("Color", ColorRGBA.White); // set the base color of the material  
				
				token.setMaterial(tokenMat); // apply the material to the geometry

				// scaling the train
		     	token.scale(boundingBox.width * 0.006f);
		     	
				//rootNode.attachChild(token); // put this node in the scene, attached to the root
				
				/* Get the motion path corresponding to the current animation */
				MotionPath path = new MotionPath();
				path = lines.get(geometryLabel);
				
				Vector3f endWayPoint = path.getWayPoint(path.getNbWayPoints()-1);
				
				/* Create motion event and JMonkeyMove event corresponding to the move animation */
				MotionEvent motionEvent = new MotionEvent(token, path, 10, LoopMode.DontLoop);
				motionEvent.setSpeed(((Move) animation).getSpeed());
				motionEvent.setDirectionType(MotionEvent.Direction.Path); // the spatial is always faced in the direction of the path while moving
								
				JMonkeyEvent event = new JMonkeyMove(geometryLabel, motionEvent, this); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (don't loop).
				((JMonkeyMove) event).setEndWayPoint(endWayPoint);
				motionEvent.addListener((JMonkeyMove) event); // add the JMonkeyEngine as a listener to all motion events				
				
				events.put(geometryLabel, event);
				
				this.tokenQueue.put(geometryLabel, new LinkedList<Spatial>());

				
			} else if (animation instanceof Appear) {
				/* Create JMonkey appear event */
				JMonkeyEvent event = new JMonkeyAppear(geometryLabel, ((Appear) animation).getAppearance());
				
				events.put(geometryLabel, event);
				
				
			} else if (animation instanceof Sequence) {
				
			} else if (animation instanceof Stop) {
				
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
				//groundMat.setColor("Color", ColorRGBA.Brown);
				Texture groundTex = assetManager.loadTexture("Textures/ground.jpg"); 
				groundMat.setTexture("ColorMap", groundTex);
				groundGeo.setMaterial(groundMat);
				groundGeo.setLocalTranslation((boundingBox.width/2) + boundingBox.x, (-groundHeightY)-0.1f, (boundingBox.height/2) + boundingBox.y);
				        
				rootNode.attachChild(groundGeo);

	}
	private void setBoundingBox() {
		
		boundingBox = new Rectangle(lowX, lowY, highX-lowX, highY-lowY);
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
 		
 	// AP: set the background color
 			viewPort.setBackgroundColor(ColorRGBA.Gray);
 	// AP: enable/disable camera fly - the ability to move the camera with keyboard and mouse
 			flyCam.setEnabled(false); 
 			flyCam.setMoveSpeed(50);
 			
 	// AP: toggle statistics window in bottom left
 			setDisplayFps(false);
 			setDisplayStatView(false);
 		 			     	         	    
 	 /* Create a new NiftyDisplay for the Start/Pause/Reset buttons GUI */
 			this.niftyDisplay = new NiftyJmeDisplay(assetManager, 
 													inputManager,
 													audioRenderer,
 													guiViewPort);
 			
 	 /* Create a new NiftyGUI object */ 
 			this.nifty = this.niftyDisplay.getNifty();
 	/* 	Set Nifty GUI to ignore keyboard events so that they are only handles by jMonkey */	
 			this.nifty.setIgnoreKeyboardEvents(true);
 			
 	/* Initialize the controller for the buttons screen */
 			this.screenController = new NiftyButtonsScreen("data", this);
 			stateManager.attach((AppState) this.screenController);
 			
 	/* Read the XML and initialize the custom ScreenController */
 			this.nifty.fromXml("GUI/NiftyButtons.xml", "start", this.screenController);
 			this.nifty.setDebugOptionPanelColors(false);
 			 		 			        
 	/* Attach the Nifty display to the GUI view port as a processor */
 	        guiViewPort.addProcessor(niftyDisplay);
 	        
 	        reset();
 	        
	}
 	
 	private void scaleInputPlaces() {
 		for (Spatial spatial:inputs.values())
 			spatial.scale(boundingBox.width * 0.02f);
 	}
 	
 	@Override
 	public void reset() {
 		System.out.println("Reset method");
 		
 	/* Initialize all lists, queues and hash maps */
 		this.lines = new HashMap<String, MotionPath>();
		this.events = new HashMap<String, JMonkeyEvent>();
		this.eventsQueue = new LinkedList<JMonkeyEvent>();
		this.tokenQueue = new HashMap<String, LinkedList<Spatial>>();
		this.tokenAppearances = new HashMap<String, String>();
		this.inputs = new HashMap<String, Spatial>();

	/* Initialize the data structures used to keep track of the current animations*/
		this.allCollisions = new HashMap<String, ArrayList<String>>();
		this.allRenderedEvents = new HashMap<String, JMonkeyEvent>();

		
	/* Pause simulation when the window loses focus */
		this.setPauseOnLostFocus(false);
		
	/* Attaching the input places node to the root node */
		this.inputPlaces = new Node("InputPlaces");
		rootNode.attachChild(inputPlaces);
 		
    /* Run setups to prepare: 
     * -- the light
     * -- the environment (all 3D objects according to the geometry and appearance info)
     * -- the bounding box
     * -- the all possible animations
     * -- the position of the camera ( according to the bounding box)
     * -- the key events 
     */
        this.setUpLight();
        this.setUpEnvironment();
        this.setBoundingBox();
        this.scaleInputPlaces();
        this.setUpGround();
		this.setUpAnimations();
		this.setUpCameraPosition();
		this.setupKeyMappings();
				
	/* Set the state of the engine to STOPPED */
		this.engineState = State.STOPPED;
		
		
 	}

 	private void setupKeyMappings() {

			inputManager.addMapping("Click", new MouseButtonTrigger(MouseInput.BUTTON_LEFT));
			inputManager.addMapping("CameraControl", new MouseButtonTrigger(MouseInput.BUTTON_RIGHT));
						        
			inputManager.addListener(actionListener, new String[]{"Click"});
			inputManager.addListener(actionListener, new String[]{"CameraControl"});
						
			inputManager.setCursorVisible(true);
 	}
 	
	@Override
	public void init(geometry.Geometry geometry, Appearance appearance,
			List<RTAnimation> animations) {
		
		/* This part removes the splash screen */
    	this.setShowSettings(false);
    	AppSettings settings = new AppSettings(true);
    	settings.setResolution(800, 600);
    	settings.setBitsPerPixel(32);
    	this.setSettings(settings);
    	
		/* Initialize the simulation models */        
		this.geometry = geometry;
		this.appearance = appearance;
		this.animations = animations;
			
	}

	@Override
	public void setEngine3DListener(Engine3DListener engine3DListener) {
		this.listener = engine3DListener;
	}
	
	
	@Override
	public void addToAnimationQueue(List<RTAnimation> animations) {
		
		for (RTAnimation animation : animations) {
			//Getting the geometry label of the line on which the token has effect
			String geometryLabel = animation.getGeometryLabel();
			JMonkeyEvent clonedEventToQueue;
			
			if (animation.getAnimation() instanceof Move) {
				//Getting the Motion Path and the Spatial
				MotionPath pathToClone = lines.get(geometryLabel);
				MotionPath clonedPath = this.cloneMotionPath(pathToClone);
				String modelName = tokenAppearances.get(geometryLabel);
				
				//Cloning the MotionEvent
				Spatial newSpatial = assetManager.loadModel(this.appearance.getAObjectByLabel(modelName).getObject3D());
				JMonkeyEvent eventToClone = events.get(geometryLabel);
				clonedEventToQueue = JMonkeyEvent.moveEvent(eventToClone, clonedPath, newSpatial);
				newSpatial.setName(String.valueOf(clonedEventToQueue.getId()));
				
				//Set the ID of the Event
				clonedEventToQueue.setId(animation.getId());
				
				//Attaching the spatial token to the rootnode and playing the event
				rootNode.attachChild(newSpatial);
				allRenderedEvents.put(clonedEventToQueue.getId(), clonedEventToQueue);
				allCollisions.put(clonedEventToQueue.getId(), new ArrayList<String>());
				((JMonkeyMove)clonedEventToQueue).play();
				
				
			} else {
				JMonkeyEvent eventToQueue = events.get(geometryLabel);
				clonedEventToQueue = JMonkeyEvent.appearCopy(eventToQueue);

				//Adding the new event to the queue
				eventsQueue.add(clonedEventToQueue);			
			}			
			
			System.out.println("Animation added to queue: " + animation.getGeometryLabel());
		}
	}
	
	/**
	 * 
	 * @param path: The path to clone
	 * @return A deep-copy of motion path with the same waypoints
	 */
	private MotionPath cloneMotionPath(MotionPath path) {
		
		MotionPath newPath = new MotionPath();
		newPath.setCycle(false); // make sure the path doesn't loop 
		Iterator<Vector3f> waypoints = path.iterator();
		
		while(waypoints.hasNext()) {
			
			newPath.addWayPoint(waypoints.next()); // add way points to the path 
		}
		
		newPath.setPathSplineType(SplineType.CatmullRom); // set path type
		newPath.setCurveTension(0.5f);    
		
		return newPath;
	}

	
	public void onStop(JMonkeyMove event) {	
		
//		MotionEvent motionEvent = event.getMotionEvent();
//		System.out.println(motionEvent.getPlayState());
//		
//		Spatial token = motionEvent.getSpatial();		
//		this.tokenQueue.get(event.getGeometryLabel()).add(token);
//		
//		this.allRenderedEvents.;
//		
		this.listener.onAnimationFinished(event.getGeometryLabel());
	}

	@Override 
    public void simpleUpdate(float tpf) {
				
		/* Play waiting animations */
		if (engineState == State.PLAYING) {
			
			while (!eventsQueue.isEmpty()) { // while there are events waiting to be run in the queue
				/* Get event from queue*/
				JMonkeyEvent eventToRun = eventsQueue.pop();
				
				if (eventToRun instanceof JMonkeyMove) {
					/* Cast JMonkeyEvent to JMonkeyMove*/
					JMonkeyMove moveEventToRun = (JMonkeyMove) eventToRun;
					
					System.out.println(moveEventToRun.getGeometryLabel() + " => " + moveEventToRun.getMotionEvent().getSpatial().getName());
					
					rootNode.attachChild(moveEventToRun.getMotionEvent().getSpatial());
					
					if(moveEventToRun!=null) {
						
						moveEventToRun.getMotionEvent().play();
						
						System.out.println("Event to run: "+moveEventToRun.getGeometryLabel());
					}
					
					
						
				}
				
				else if (eventToRun instanceof JMonkeyAppear) {
					/* Cast JMonkeyEvent to JMonkeyAppear */
					JMonkeyAppear appearEventToRun = (JMonkeyAppear) eventToRun;
					
					Spatial inputObject = inputs.get(appearEventToRun.getGeometryLabel());
					
					/*
					 * Get the appearance object corresponding to the input place's appearance label
					 */
					AObject appearanceObject = this.appearance.getAObjectByLabel(appearEventToRun.getAppearanceLabel());
					String texture = appearanceObject.getTexture();
					
					/* Create new material according to the appearance of the event*/
					Material inputMat = new Material(assetManager, "Common/MatDefs/Misc/ColoredTextured.j3md");  // create a simple material
					inputMat.setTexture("ColorMap", assetManager.loadTexture(texture));	// set the texture to the material
					inputMat.setColor("Color", ColorRGBA.Blue); // set the base color of the material  
					inputObject.setMaterial(inputMat);
					
					System.out.println("Appear event");
										
				}
				
				//Here detect the collisions and stuff
			}

		}							
    }

	private void playAnimations() {
		for (JMonkeyEvent event: allRenderedEvents.values()) {
			((JMonkeyMove) event).play();
		}
	}
	
	private void pauseAnimations() {
		for (JMonkeyEvent event: allRenderedEvents.values()) {
			((JMonkeyMove) event).pause();
		}
	}
	
	private void stopAnimations() {
		//Stop all the moves
		for (JMonkeyEvent event: allRenderedEvents.values()) {
			((JMonkeyMove) event).stop();
		}
		//Clear the data structure
		allRenderedEvents.clear();
		allCollisions.clear();
	}
	
	public void onStartButtonPressed () {
		
		System.out.println("Start button..." + engineState);
		
		switch (engineState) {
		
		case PLAYING: 	this.pauseAnimations();
						engineState = State.PAUSED;
						break;
		
		case PAUSED: 	this.playAnimations();
						engineState = State.PLAYING;
						break;
						
		case STOPPED: 	this.listener.onStart();
						engineState = State.PLAYING;
						break;
						
		}
	}
	
	public void onResetButtonPressed () {
		
		System.out.println("Resetting...");
		
		this.stopAnimations();
		this.engineState = State.STOPPED;
		this.rootNode.detachAllChildren();
		this.guiNode.detachAllChildren();
		this.inputManager.clearMappings();
		this.listener.onReset();
		
	}
	private ActionListener actionListener = new ActionListener() {
		 
		public void onAction(String name, boolean keyPressed, float tpf) {
			
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
		        // 2. Aim the ray from mouse location to cam direction.
		        Vector2f click2d = inputManager.getCursorPosition();
		        Vector3f click3d = cam.getWorldCoordinates(new Vector2f(click2d.x, click2d.y), 0f).clone();
		        Vector3f dir = cam.getWorldCoordinates(new Vector2f(click2d.x, click2d.y), 1f).subtractLocal(click3d).normalizeLocal();
		        
		        Ray ray = new Ray(click3d, dir);
		        // 3. Collect intersections between Ray and Input Places in results list.
		        inputPlaces.collideWith(ray, results);
		        // 4. Get the closest collision (which is the object we clicked on)
		        if (results.size() > 0) {
		        	CollisionResult hitPlace = results.getClosestCollision();
			        String inputPlaceId = hitPlace.getGeometry().getName();
		
			        //Call the simulator to add a token on this place
			        listener.onUserClick(inputPlaceId);
		        }
		        
			}
		}
		
	};

	@Override
	public void destroyRepresentation(String id) {
//		if (this.tokenQueue.containsKey(geometryLabel)) {
//			Spatial spatial = this.tokenQueue.get(geometryLabel).pop();
//			
//			rootNode.detachChild(spatial);
//		}
		//Get the destroyed event, stop it and remove its spatial from the visualisation
		if (allRenderedEvents.containsKey(id)) {
			JMonkeyMove event = (JMonkeyMove) this.allRenderedEvents.get(id);
			event.stop();
			rootNode.detachChild(event.getSpatial());
			System.out.println("Destroying token : " + event.getSpatial().getName() + " with ID: " + id);
			
			allRenderedEvents.remove(id);
			allCollisions.remove(id);
		}
		
	}

	@Override
	public void startEngine() {
		/* 
		 * Start jMonkey application - the simpleInitApp() function is called 
		 */
		this.start();
	}

}