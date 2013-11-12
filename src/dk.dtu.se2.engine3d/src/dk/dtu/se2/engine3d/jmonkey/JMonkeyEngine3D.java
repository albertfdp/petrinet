package dk.dtu.se2.engine3d.jmonkey;


import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;



import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.bounding.BoundingVolume.Type;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.PlayState;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.font.BitmapFont.Align;
import com.jme3.font.BitmapText;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Box;
import com.jme3.scene.VertexBuffer;
import com.jme3.system.AppSettings;
import com.jme3.texture.Texture;
import com.jme3.util.BufferUtils;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DListener;

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
    public ArrayList<BitmapText> allTextFields = new ArrayList<BitmapText>();
    public ArrayList<Geometry> allTokens = new ArrayList<Geometry>();
    public ArrayList<SObject> allSObjects = new ArrayList<SObject>();
    public static ArrayList<MotionEvent> allMotionEvents = new ArrayList<MotionEvent>();
    public double timeSinceLastTrigger;
    public double timeAtLastTrigger;
    public Random rand = new Random();
    
    public enum State {
    	PLAYING,
    	PAUSED,
    	RESETTING
    }
    
    public State engineState;
	
//    public static void main(String[] args){
//    	JMonkeyEngine3D app = new JMonkeyEngine3D();
//    	
//    	//--- This part removes the splash screen
//    	app.setShowSettings(false);
//    	AppSettings settings = new AppSettings(true);
//    	settings.setResolution(800, 600);
//    	settings.setBitsPerPixel(32);
//    	app.setSettings(settings);
//    	//---
//    	
//    	app.start();
//	}
    
    public void setupModelMeshes() {
    	
    	System.out.println("Running setup of model meshes.");
    	
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
    
    public void setupSObjects() {
		
		// Take info from XML files and arrange it neatly into the allSObjects array
		//
		// insert XML parsing here
		//
		//
		
		// Temporary:
		allSObjects.add(new SObject(new Vector2f(30, 10), new Vector2f(30, 30), new Vector2f(30, 50), false, "ID00", 2f)); // need to calculate the time of the animation based on the speed (in this case: 2f should be changed to something else)
		allSObjects.add(new SObject(new Vector2f(30, 50), new Vector2f(10, 30), new Vector2f(30, 10), false, "ID01", 2f));
		allSObjects.add(new SObject(new Vector2f(30, 50), new Vector2f(50, 30), new Vector2f(30, 10), false, "ID02", 2f));
	}
	
	public void setupTokens() { // happens in the engine, gets information from the simulator (from the configuration file)
		
		// get info about token appearance from the simulator
		
		// Temporary:
		for (int index = 0; index < allSObjects.size() ; index++) { // create the same number of tokens as there are SObjects
		
			Geometry token = new Geometry("Box", new Box(0.25f, 0.10f, 0.5f)); // create cube geometry from with box shape        
	
			Texture tokenTex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); // create a texture
			
			Material tokenMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
			tokenMat.setTexture("ColorMap", tokenTex);
			tokenMat.setColor("Color", ColorRGBA.Blue); // set the base color   
			
			token.setMaterial(tokenMat); // apply the material to the geometry
			
			allTokens.add(token);
			rootNode.attachChild(token); // put this node in the scene, attached to the root.
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
			path.setCurveTension(1f);        
			path.enableDebugShape(assetManager, rootNode); // AP: this is to make the path visible
			
			MotionEvent event = new MotionEvent(allTokens.get(index), path, allSObjects.get(index).getSpeed(), LoopMode.DontLoop); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (dont loop).
			event.setDirectionType(MotionEvent.Direction.Path); // AP: The spatial always faces in the direction of the path while moving.
			allMotionEvents.add(event);
		}
	}
	
	public void setupTextFields() {
		
		for (int index = 0; index < allSObjects.size(); index++) {
			   
    		BitmapText text = new BitmapText(guiFont, false);
    		text.setAlignment(Align.Left);
    		text.setLocalTranslation(5, text.getLineHeight() * (index+10), 0);
    		text.setText("This is text field " + Integer.toString(index));

    		allTextFields.add(text);
    		guiNode.attachChild(text);
    	}
		
		// AP: set up Petri net message "console"
    	for (int index = 0; index < 5; index++) {
			   
    		BitmapText text = new BitmapText(guiFont, false);
    		text.setAlignment(Align.Left);
    		if (index == 0)
    			text.setColor(ColorRGBA.White);
    		else
    			text.setColor(ColorRGBA.DarkGray);
    		text.setLocalTranslation(450, text.getLineHeight() * (index+10), 0);
    		text.setText("This is text field " + Integer.toString(index));

    		messageToPetriNet.add(text);
    		guiNode.attachChild(text);
    	}
	}
    
	@Override
	public void addToAnimationQueue(String geometryLabel) {
		
		for (SObject object : allSObjects) {
			
			if (object.getName() == geometryLabel) {
				animationQueue.add(allSObjects.indexOf(object));
			}
		}
	}
	
	public void setEngine3DListener(Engine3DListener engine3DListener) {
		this.engine3DListener = engine3DListener;
	}
	
	@Override // referring to Geometry as geometry.Geometry to avoid confusing it with jMonkey Geometry
	public void init(geometry.Geometry geometry, Appearance appearance, List<Animation> animations) { 	
		
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
	
	@Override
	public void simpleInitApp() {  // keep in mind that we don't have the size of the allSObjects list yet.

		// AP: setting up miscellaneous stuff
		timeAtSystemStart = System.currentTimeMillis();
		// AP: set the background color
		viewPort.setBackgroundColor(ColorRGBA.Gray);
		// AP: disable camera fly - the ability to move the camera with keyboard and mouse
		flyCam.setEnabled(false); 
		flyCam.setMoveSpeed(25);
		// AP: set camera position (off center)
		Vector3f camPos = new Vector3f(0, 90, 30);
		cam.setLocation(camPos);
		// AP: make the camera look at the center
		cam.lookAt(new Vector3f(30, 0, 30), cam.getUp());
		// toggle statistics window in bottom left
		setDisplayFps(false);
		setDisplayStatView(false);
		    	
		// AP: setting up a hud text
		hudText = new BitmapText(guiFont, false);          
		hudText.setSize(guiFont.getCharSet().getRenderedSize());      // font size
		hudText.setColor(ColorRGBA.White);                             // font color
		hudText.setText("Play state: " + engineState);    // the text
		hudText.setLocalTranslation(5, hudText.getLineHeight(), 0); // position
		guiNode.attachChild(hudText);    	
		    	
		// AP: create ground with volume
		float groundWidthX  = 30;
		float groundHeightY = 1;
		float groundDepthZ  = 30;
		groundGeo = new Geometry("Box", new Box(groundWidthX, groundHeightY, groundDepthZ)); 
		Material groundMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		Texture groundTex = assetManager.loadTexture("SE2_ground.jpg"); 
		groundMat.setTexture("ColorMap", groundTex);
		groundGeo.setMaterial(groundMat);
		groundGeo.setLocalTranslation(groundWidthX, (-groundHeightY)-0.1f, groundDepthZ);
		        
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
		        
		// AP: Run setups to prepare the layout of the paths etc.
		setupModelMeshes();
		setupSObjects();
		setupTokens();
		setupMotionEvents();
		setupTextFields();
		        
		engineState = State.PAUSED;
		        
		for (int index = 0; index < 5; index++) {
			listOfInts.add(-1);
		}
		        
		// initialize previous play state list
		for (int index = 0; index < allSObjects.size(); index++) {
			previousAnimationStates.add(PlayState.Stopped);
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
    	
		double timeElapsedSinceStart = System.currentTimeMillis() - timeAtSystemStart; // Time elapsed since program start. 
		
		timeSinceLastTrigger += timeElapsedSinceStart - timeAtLastTrigger;
		
		// add a random motion event to the animation queue
		if ((timeElapsedSinceStart/1000)%5 == 0 && timeSinceLastTrigger/1000 > 0.1f) { // do this every 5 seconds
			
			int randomNum = rand.nextInt(3);
			
			if (randomNum == 0) {
				addToAnimationQueue("ID00");
			}
			if (randomNum == 1) {
				addToAnimationQueue("ID01");
			}
			if (randomNum == 2) {
				addToAnimationQueue("ID02");
			}
			
			timeAtLastTrigger = timeElapsedSinceStart; // we need to ensure that some time has passed before running this function again, otherwise we might get (time%5 == 0) true several times in a row.
			timeSinceLastTrigger = 0;
		}
		
		// update play state HUD
		hudText.setText("Press 'p' to play/pause, press 'r' to reset - " + engineState + " - time: " + timeElapsedSinceStart/1000);  
		
		
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
		
		
		// Debug: update petri net message console
		for (int index = 0; index < messageToPetriNet.size(); index++) {
					
			String number = listOfInts.get(index).toString();
			messageToPetriNet.get(index).setText("Animation finished in: " + number); 
							
		}
		
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
    }
	
}
