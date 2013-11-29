package dk.dtu.se2.engine3d.jmonkey;

import geometry.GObject;
import geometry.InputPoint;
import geometry.Line;
import geometry.Point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.EList;

import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.PlayState;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.font.BitmapFont.Align;
import com.jme3.font.BitmapText;
import com.jme3.font.Rectangle;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;
import com.jme3.shadow.DirectionalLightShadowRenderer;
import com.jme3.system.AppSettings;
import com.jme3.texture.Texture;
import com.jme3.util.SkyFactory;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DListener;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public class JMonkeyEngine3D extends SimpleApplication implements Engine3D {

	private Engine3DListener engine3DListener;
	private geometry.Geometry geometry; 
	private Appearance appearance;
	private HashMap <Animation, MotionEvent> animations;
	
	public double timeAtSystemStart;
	public Mesh testMesh = new Mesh();
	public Vector3f[] verts = new Vector3f[16];
	public Vector2f[] texCoord = new Vector2f[16];
	public int[] indices = new int[24];
	public Geometry groundGeo;
    public BitmapText hudText;
    public static ArrayList<Integer> animationQueue = new ArrayList<Integer>(); // holds all the animations that the Petri Net has asked the 3D Engine to play
    public ArrayList<Integer> listOfInts = new ArrayList<Integer>();
    public ArrayList<PlayState> previousAnimationStates = new ArrayList<PlayState>();
    public ArrayList<BitmapText> messageToPetriNet = new ArrayList<BitmapText>();
    public ArrayList<BitmapText> infoText = new ArrayList<BitmapText>();
    public ArrayList<BitmapText> allTextFields = new ArrayList<BitmapText>();
    public ArrayList<Spatial> allTokens = new ArrayList<Spatial>();
    public ArrayList<SObject> allSObjects = new ArrayList<SObject>();
    public static ArrayList<MotionEvent> allMotionEvents = new ArrayList<MotionEvent>();
    public double timeSinceLastTrigger;
    public double timeAtLastTrigger;
    public Random rand = new Random();
    public Rectangle boundingBox;
    
    public enum State {
    	PLAYING,
    	PAUSED,
    	RESETTING
    }
    
    public State engineState;
	
    /*
    public static void main(String[] args){
    	JMonkeyEngine3D app = new JMonkeyEngine3D();
    	
    	//--- This part removes the splash screen
    	app.setShowSettings(false);
    	AppSettings settings = new AppSettings(true);
    	settings.setResolution(800, 600);
    	settings.setBitsPerPixel(32);
    	app.setSettings(settings);
    	//---
    	
    	app.start();
	}
    */
    public void setupModelMeshes() {
    	
    	//System.out.println("Running setup of model meshes.");
    	
    	/*
    	Vector3f startPoint = new Vector3f(0, 1, -5); // some combinations of coordinates don't work: (1) when it is parallel to the x axis (angle = 0/180)
    	Vector3f endPoint =   new Vector3f(0, 1, 0 );	
    	float radius = 1;
    	double angle = Math.atan2((endPoint.z - startPoint.z), (endPoint.x - startPoint.x));
    	//angle = Math.toRadians(angle); // converting angle from deg to rad
    	System.out.println("Angle in rad: " + angle);
    	System.out.println("Angle in deg: " + Math.toDegrees(angle));
    	
    	// top side
    	verts[0] = new Vector3f((startPoint.x - radius)*(float)(Math.sin(angle)),  (startPoint.y + radius) , startPoint.z + ((startPoint.x - radius) * -((float)(Math.cos(angle))))   );
    	verts[1] = new Vector3f((startPoint.x + radius)*(float)(Math.sin(angle)),  (startPoint.y + radius) , startPoint.z + ((startPoint.x + radius) * -((float)(Math.cos(angle))))   );
    	verts[2] = new Vector3f((endPoint.x + radius)*(float)(Math.sin(angle)),    (endPoint.y + radius)   , endPoint.z +   ((startPoint.x + radius) * -((float)(Math.cos(angle))))   );
    	verts[3] = new Vector3f((endPoint.x - radius)*(float)(Math.sin(angle)),    (endPoint.y + radius)   , endPoint.z +   ((startPoint.x - radius) * -((float)(Math.cos(angle))))   );
    	
    	// 3--2
    	// |  |
    	// 0--1
    	
    	texCoord[0] = new Vector2f(0,0);
    	texCoord[0] = new Vector2f(1,0);
    	texCoord[0] = new Vector2f(1,1);
    	texCoord[0] = new Vector2f(0,1);
    	
    	indices[0] = 1; // defining triangle 1
    	indices[1] = 0; // 
    	indices[2] = 3; // 
    	
    	indices[3] = 3; // defining triangle 2
    	indices[4] = 2;
    	indices[5] = 1;
    	
    	// 3--2
    	// |  |
    	// 0--1
    	
    	testMesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Position , 3, BufferUtils.createFloatBuffer(verts));
    	testMesh.setBuffer(com.jme3.scene.VertexBuffer.Type.TexCoord,  2, BufferUtils.createFloatBuffer(texCoord));
    	testMesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index,     3, BufferUtils.createIntBuffer(indices));
    	
    	testMesh.updateBound();
    	
    	Geometry testMeshGeo = new Geometry("OurMesh", testMesh);
    	Material testMeshMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    	testMeshMat.setColor("Color", ColorRGBA.Blue);
    	testMeshGeo.setMaterial(testMeshMat);
    	
    	rootNode.attachChild(testMeshGeo);
    	*/
    }
    
    /**
     * TODO
     */
    public void setupSObjects() {
    	
    	
    	EList<GObject> gObjects = this.geometry.getGObjects();
		for (GObject gObject:gObjects) {
			if (gObject instanceof InputPoint) {
				InputPoint point = (InputPoint) gObject;
				allSObjects.add(new SObject(new Vector2f(point.getXLocation(), point.getYLocation()), 
											new Vector2f(point.getXLocation(), point.getYLocation()), 
											new Vector2f(point.getXLocation(), point.getYLocation()), 
											true, point.getLabel(), 0f)); // TODO: Handle InputPoint
			}
				
			else if(gObject instanceof Line) {
				Line line = (Line) gObject;
				Point start = line.getBegin();
				Point end = line.getEnd();
				Point bendPoint = line.getBendPoint();
				allSObjects.add(new SObject(new Vector2f(start.getXLocation(),     start.getYLocation()), 
											new Vector2f(bendPoint.getXLocation(), bendPoint.getYLocation()), 
											new Vector2f(end.getXLocation(),       end.getYLocation()), 
											false, line.getLabel(), 3f)); // TODO: Change the speed
			}
						
		}
		
    	
    	/*
    	// AP: for testing purposes
		allSObjects.add(new SObject(new Vector2f(0, 5 ), 
									new Vector2f(25, 80),
									new Vector2f(100, 105), 
									false, "test01", 3f));
		
		allSObjects.add(new SObject(new Vector2f(100, 105), 
									new Vector2f(75, 30),
									new Vector2f(0, 5), 
									false, "test02", 3f));
		
		*/
	}
	
	public void setupTokens() { // happens in the engine, gets information from the simulator (from the configuration file)
		
		// get info about token appearance from the simulator
		
		// Temporary:
		for (int index = 0; index < allSObjects.size() ; index++) { // create the same number of tokens as there are SObjects
			
			// AP: importing train object
			Spatial train = assetManager.loadModel("Models/train.obj");
			train.setShadowMode(com.jme3.renderer.queue.RenderQueue.ShadowMode.CastAndReceive);
			
	        Material trainMat = new Material(assetManager, "Common/MatDefs/Misc/ColoredTextured.j3md");
	        trainMat.setTexture("ColorMap", assetManager.loadTexture("Textures/trainTex.jpg"));
	        trainMat.setColor("Color", ColorRGBA.White);
	        train.setMaterial(trainMat);

	        // scaling the train
	     	train.scale(boundingBox.width * 0.006f);
	     	
	     	allTokens.add(train);
	     	rootNode.attachChild(train);
		}	
	}

	public void setupMotionEvents() { // happens in the engine
		
		// for the number of SObjects, do the following:

		for (int index = 0; index < allSObjects.size(); index++){
			
			MotionPath path = new MotionPath();
			
			path.setCycle(false); // this will make sure the path doesn't loop 
       
			path.addWayPoint(new Vector3f(allSObjects.get(index).getBegin().x, 0f, allSObjects.get(index).getBegin().y));
			path.addWayPoint(new Vector3f(allSObjects.get(index).getBend().x,  0f, allSObjects.get(index).getBend().y));
			path.addWayPoint(new Vector3f(allSObjects.get(index).getEnd().x,   0f, allSObjects.get(index).getEnd().y));

			path.setPathSplineType(SplineType.CatmullRom);
			path.setCurveTension(0.5f);        
			path.enableDebugShape(assetManager, rootNode); // AP: this is to make the path visible
			
			MotionEvent event = new MotionEvent(allTokens.get(index), path, allSObjects.get(index).getSpeed(), LoopMode.DontLoop); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (dont loop).
			event.setDirectionType(MotionEvent.Direction.Path); // AP: The spatial always faces in the direction of the path while moving.
			allMotionEvents.add(event);
		}
	}
	
	public void setupTextFields() {
		
		/*
		for (int index = 0; index < allSObjects.size(); index++) {
			   
    		BitmapText text = new BitmapText(guiFont, false);
    		text.setAlignment(Align.Left);
    		text.setLocalTranslation(5, text.getLineHeight() * (index+10), 0);
    		text.setText("This is text field " + Integer.toString(index));

    		allTextFields.add(text);
    		guiNode.attachChild(text);
    	}
		*/
		
		/*
		// AP: set up Petri net message "console"
    	for (int index = 0; index < 5; index++) {
			   
    		BitmapText text = new BitmapText(guiFont, false);
    		text.setAlignment(Align.Left);
    		if (index == 0)
    			text.setColor(ColorRGBA.White);
    		else
    			text.setColor(ColorRGBA.DarkGray);
    		text.setLocalTranslation(600, text.getLineHeight() * (index+10), 0);
    		text.setText("This is text field " + Integer.toString(index));

    		messageToPetriNet.add(text);
    		guiNode.attachChild(text);
    	}
    	*/
    	
		/*
    	// AP: set up text field for displaying misc info
    	for (int index = 0; index < allSObjects.size(); index++) {
			   
    		BitmapText text = new BitmapText(guiFont, false);
    		text.setAlignment(Align.Left);
    		text.setColor(ColorRGBA.White);
    		text.setLocalTranslation(60, text.getLineHeight() * (index+26), 0);
    		text.setText(" ");

    		infoText.add(text);
    		guiNode.attachChild(text);
    	}
    	*/
		
    	//infoText.get(0).setText("Press 'p' to play & pause, press 'r' to reset - use '1' and '2' to add token animations to the queue");
	}
    
	@Override
	public void addToAnimationQueue(List<RTAnimation> animations) {
		
		for (RTAnimation animation : animations) {
			for (SObject object : allSObjects) {
				if (object.getName().equals(animation.getGeometryLabel())) {
					animationQueue.add(allSObjects.indexOf(object)); // TODO: Change to object
				}
			}
		}
	}
	
	public void setEngine3DListener(Engine3DListener engine3DListener) {
		this.engine3DListener = engine3DListener;
	}
	
	@Override // referring to Geometry as geometry.Geometry to avoid confusing it with jMonkey Geometry
	public void init(geometry.Geometry geometry, Appearance appearance, List<RTAnimation> animations) { 	
		
		//--- This part removes the splash screen
    	this.setShowSettings(false);
    	AppSettings settings = new AppSettings(true);
    	settings.setResolution(800, 600);
    	settings.setBitsPerPixel(32);
    	this.setSettings(settings);
    	//---
		
		this.start();         
		this.geometry = geometry;
		this.appearance = appearance;
		
		
	}
	
	public void calculateBoundingBox() {
		
		int lowX = (int)allSObjects.get(0).getBegin().x;
		int lowY = (int)allSObjects.get(0).getBegin().y;
		int highX = (int)allSObjects.get(0).getBegin().x;
		int highY = (int)allSObjects.get(0).getBegin().y;
		
		
		// Find lowest and highest x and y
		for (int index = 0; index < allSObjects.size(); index++) {
			
			// find lowest x
			if ((int)allSObjects.get(index).getBegin().x < lowX)
				lowX = (int)allSObjects.get(index).getBegin().x;

			if ((int)allSObjects.get(index).getBend().x < lowX)  //will need to accept a list of bend points
				lowX = (int)allSObjects.get(index).getBend().x;
			
			if ((int)allSObjects.get(index).getEnd().x < lowX)
				lowX = (int)allSObjects.get(index).getEnd().x;
			
			//find lowest y
			if ((int)allSObjects.get(index).getBegin().y < lowY)
				lowY = (int)allSObjects.get(index).getBegin().y;

			if ((int)allSObjects.get(index).getBend().y < lowY)  //will need to accept a list of bend points
				lowY = (int)allSObjects.get(index).getBend().y;
	
			if ((int)allSObjects.get(index).getEnd().y < lowY)
				lowY = (int)allSObjects.get(index).getEnd().y;
			
			// find highest x
			if ((int)allSObjects.get(index).getBegin().x > highX)
				highX = (int)allSObjects.get(index).getBegin().x;

			if ((int)allSObjects.get(index).getBend().x > highX)  //will need to accept a list of bend points
				highX = (int)allSObjects.get(index).getBend().x;

			if ((int)allSObjects.get(index).getEnd().x > highX)
				highX = (int)allSObjects.get(index).getEnd().x;	
			
			// find highest y
			if ((int)allSObjects.get(index).getBegin().y > highY)
				highY = (int)allSObjects.get(index).getBegin().y;

			if ((int)allSObjects.get(index).getBend().y > highY)  //will need to accept a list of bend points
				highY = (int)allSObjects.get(index).getBend().y;

			if ((int)allSObjects.get(index).getEnd().y > highY)
				highY = (int)allSObjects.get(index).getEnd().y;	
		}
		
		boundingBox = new Rectangle(lowX, lowY, highX-lowX, highY-lowY);
		
	}
	
	public void setupCameraPosition() {
		
		
		float heightScaler = 1.1f;	
		Vector3f camPos = new Vector3f(boundingBox.x + boundingBox.width/2, 
				(float)Math.tan(Math.toRadians(67.5f))*(boundingBox.width/2)*heightScaler, 
				boundingBox.y + boundingBox.height/2); // height is assuming 45 degree FOV. Angle used for calculation is 90 - (45/2) = 67.5
		
		//Vector3f camPos = new Vector3f(205.67f, 61.72f, 188.71f); 
		
		cam.setLocation(camPos);
		
		//Quaternion rotation = new Quaternion(0.144f, 0.555f, -0.0987f, 0.8130f); // make camera look "down"
		Quaternion rotation = new Quaternion(0, (float)Math.cos(Math.toRadians(45)), (float)-Math.cos(Math.toRadians(45)), 0);
		cam.setRotation(rotation);
		
	}
	
	public void displayCameraPosition() {
		
		infoText.get(0).setText("Cam location:   " + cam.getLocation());
		infoText.get(1).setText("Cam quaternion: " + cam.getRotation());		
	}
	
	@Override
	public void simpleInitApp() {  // keep in mind that we don't have the size of the allSObjects list yet.

		// AP: Run setups to prepare the layout of the paths etc.
		setupModelMeshes();
		setupSObjects();
		calculateBoundingBox();
		setupTokens();
		setupMotionEvents();
		setupTextFields();
		setupCameraPosition();
		
	
		// AP: setting up miscellaneous stuff
		timeAtSystemStart = System.currentTimeMillis();
		// AP: set the background color
		viewPort.setBackgroundColor(ColorRGBA.Gray);
		// AP: enable/disable camera fly - the ability to move the camera with keyboard and mouse
		flyCam.setEnabled(true); 
		flyCam.setMoveSpeed(50);
		
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
        
        /*
        // box for testing shadows
        Geometry testBox = new Geometry("testBox", new Box(10, 10, 10));
        testBox.setShadowMode(com.jme3.renderer.queue.RenderQueue.ShadowMode.CastAndReceive);
        Material testBoxMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        testBoxMat.setTexture("ColorMap", assetManager.loadTexture("Textures/trainTex.jpg"));
        //testBoxMat.setColor("Color", ColorRGBA.White);
        
        testBox.setMaterial(testBoxMat);
        testBox.setLocalTranslation(boundingBox.width/2 + boundingBox.x, 10, boundingBox.height/2 + boundingBox.y);
        
        rootNode.attachChild(testBox);
        */
		
		// AP: setting up a hud text
		hudText = new BitmapText(guiFont, false);          
		hudText.setSize(guiFont.getCharSet().getRenderedSize());      // font size
		hudText.setColor(ColorRGBA.White);                             // font color
		hudText.setText("" + engineState);  
		hudText.setSize(25);
		hudText.setLocalTranslation(350, 580, 0); // position
		guiNode.attachChild(hudText);    	
		    	
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
		        

		engineState = State.PAUSED;
		        
		for (int index = 0; index < 5; index++) {
			listOfInts.add(-1);
		}
		        
		// initialize previous play state list
		for (int index = 0; index < allSObjects.size(); index++) {
			previousAnimationStates.add(PlayState.Stopped);
		}	
	}
	
	public void hideStoppedTokens() {
		
		for (int index = 0; index < allMotionEvents.size(); index++) {
			
			PlayState state = allMotionEvents.get(index).getPlayState();
			
			if (state == PlayState.Stopped) {
				// Hide token 
				// This is not the best way to hide the objects, but for now, it works.
				// This does save a little time, compared to making the object invisible, 
				// and then visible again when it is needed, since the motionEvent will
				// move the object automatically when it is needed again.
				allTokens.get(index).setLocalTranslation(0, -1000, 0);  
			}
			
		}
		
	}
	
	private ActionListener actionListener = new ActionListener() {
		 
		public void onAction(String name, boolean keyPressed, float tpf) {
			
			if (name.equals("p") && !keyPressed) { 
				
				switch (engineState) {
				
				case PLAYING: 	for (MotionEvent event : allMotionEvents) { // only pause the playing motionEvents
									
									PlayState playState = event.getPlayState();
									if (playState == PlayState.Playing)
										event.pause();
	        					}	
								engineState = State.PAUSED;
								break;
				
				case PAUSED: 	for (MotionEvent event : allMotionEvents) { // only play the paused motionEvents
									
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
				for (MotionEvent events : allMotionEvents) {
					events.stop();
					// remove tokens
					// 
					// This needs to be done differently: it should load the original configuration and remove all tokens.
				}
				
				engineState = State.PAUSED; // perhaps the state should be 'stopped'
			}
			
			if (name.equals("1") && !keyPressed) { 
				
				animationQueue.add(0); // adds the ID of the animation to the list 

		    } 
			if (name.equals("2") && !keyPressed) { 
				
				animationQueue.add(1); // adds the ID of the animation to the list
				
		    }
			if (name.equals("3") && !keyPressed) {
				
				animationQueue.add(2); // adds the ID of the animation to the list

		    }

		}
		
	};
	
	@Override 
    public void simpleUpdate(float tpf) {
		
		//displayCameraPosition();
		
		hideStoppedTokens();

		if (engineState == State.PLAYING)
			hudText.setColor(ColorRGBA.Green);
		else
			hudText.setColor(ColorRGBA.Red);
		
		hudText.setText("" + engineState);
		
		// play waiting animations
		if (engineState == State.PLAYING) {
			for (int index = 0; index < animationQueue.size(); index++) {
			
				PlayState state = allMotionEvents.get(animationQueue.get(index)).getPlayState();
			
				if (state == PlayState.Stopped) {
					allMotionEvents.get(animationQueue.get(index)).play();
				}
				if (state == PlayState.Playing) {
					allMotionEvents.get(animationQueue.get(index)).stop(); // if we need several tokens on one place, this is where it has to happen.
					allMotionEvents.get(animationQueue.get(index)).play(); // right now, it just restarts the animation.
				}
			}
			
			animationQueue.clear();
		}
		
		
		// check for recently finished animations
		for (int index = 0; index < allMotionEvents.size(); index++) {
			
			PlayState currentState = allMotionEvents.get(index).getPlayState();
			PlayState previousState = previousAnimationStates.get(index);
  		
			if (currentState != previousState) { // if the state changed
				
				if (currentState == PlayState.Stopped) {  // if the state has changed to Stopped
					
					listOfInts.add(0, index);
					//this.engine3DListener.onAnimationFinished(allSObjects.get(index).getName());
				}
			}
			
			previousAnimationStates.set(index, allMotionEvents.get(index).getPlayState());
		}
		
		
		/*
		// Debug: update petri net message console
		for (int index = 0; index < messageToPetriNet.size(); index++) {
					
			String number = listOfInts.get(index).toString();
			messageToPetriNet.get(index).setText("Animation finished in: " + number); 
							
		}
		*/
		
		/*
		// Debug: update the text fields that display the play state of each animation/MotionEvent
		for (int index = 0; index < allTextFields.size(); index++) {
			
			PlayState state = allMotionEvents.get(index).getPlayState();
			if (state == PlayState.Playing){
				allTextFields.get(index).setText(allSObjects.get(index).getName() + " : Playing");
			}
			if (state == PlayState.Paused){
				allTextFields.get(index).setText(allSObjects.get(index).getName() + " : Paused");
			}
			if (state == PlayState.Stopped){
				allTextFields.get(index).setText(allSObjects.get(index).getName() + " : Stopped");
			}
		}
		*/	
    }
	
}
