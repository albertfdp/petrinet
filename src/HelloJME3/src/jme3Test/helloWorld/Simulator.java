package jme3Test.helloWorld;

import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.PlayState;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.font.BitmapFont.Align;
import com.jme3.font.BitmapText;
import com.jme3.input.KeyInput;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;


public class Simulator extends SimpleApplication{
	
	public static void main(String[] args){
		Simulator app = new Simulator();
        app.start(); 
	}

	protected BitmapText hudText;
	protected BitmapText[] hudTexts = new BitmapText[50];
	
    protected double timeAtSystemStart;
    protected Geometry groundGeo;
 
    protected Geometry[] allTokens = new Geometry[100]; // This needs to be dynamic
    protected SObject[] allSObjects = new SObject[100]; // This needs to be dynamic
	protected MotionPath[] allMotionPaths = new MotionPath[100]; // This needs to be dynamic
	protected MotionEvent[] allMotionEvents = new MotionEvent[100]; // This needs to be dynamic
	
	
		
	
	public void setupSObjects() {
		
		// Take info from XML files and arrange it neatly into the allSObjects array
		//
		// insert XML parsing here
		//
		//
		
		// Temporary:
		allSObjects[0] = new SObject(new Vector2f(30, 10), new Vector2f(30, 30), new Vector2f(30, 50), false, "ID00", 5f);
		allSObjects[1] = new SObject(new Vector2f(30, 50), new Vector2f(10, 30), new Vector2f(30, 10), false, "ID01", 5f);
		allSObjects[2] = new SObject(new Vector2f(30, 50), new Vector2f(50, 30), new Vector2f(30, 10), false, "ID02", 5f);
	}
	
	public void setupTokens() {
		
		// Take info from XML files and arrange it neatly into the allTokens array
		//
		// insert XML parsing here
		//
		//
				
		// Temporary:
		for (int index = 0; index < 3; index++) {
		
			allTokens[index] = new Geometry("Box", new Box(0.25f, 0.10f, 0.5f)); // create cube geometry from with box shape        
	
			Texture tokenTex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); // create a texture
			
			Material tokenMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
			tokenMat.setTexture("ColorMap", tokenTex);
			tokenMat.setColor("Color", ColorRGBA.Blue); // set the base color   
			
			allTokens[index].setMaterial(tokenMat); // apply the material to the geometry           
			     
			rootNode.attachChild(allTokens[index]); // put this node in the scene, attached to the root.
		}
		
	}
	
	public void setupMotionEvents() {
		
		// for the number of SObjects, do the following:
			
		for (int index = 0; index < 3; index++) {
			allMotionPaths[index] = new MotionPath(); // adding way points
			allMotionPaths[index].setCycle(false); // this will make sure the path doesn't loop 
       
			allMotionPaths[index].addWayPoint(new Vector3f(allSObjects[index].begin.x, 0f, allSObjects[index].begin.y));
			allMotionPaths[index].addWayPoint(new Vector3f(allSObjects[index].bend.x,  0f, allSObjects[index].bend.y));
			allMotionPaths[index].addWayPoint(new Vector3f(allSObjects[index].end.x,   0f, allSObjects[index].end.y));

			allMotionPaths[index].setPathSplineType(SplineType.CatmullRom);
			allMotionPaths[index].setCurveTension(1f);        
			allMotionPaths[index].enableDebugShape(assetManager, rootNode); // AP: this is to make the path visible
        
			allMotionEvents[index] = new MotionEvent(allTokens[index], allMotionPaths[index], allSObjects[index].speed, LoopMode.DontLoop); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (dont loop).
			allMotionEvents[index].setDirectionType(MotionEvent.Direction.Path); // AP: The spatial always faces in the direction of the path while moving.
		}
	
	}
	
	

	@Override
	public void simpleInitApp() {

	    // AP: setting up miscellaneous stuff
	    	timeAtSystemStart = System.currentTimeMillis();
	    	// AP: set the background color
	    	viewPort.setBackgroundColor(ColorRGBA.Gray);
	    	// AP: disable camera fly - the ability to move the camera with keyboard and mouse
	    	flyCam.setEnabled(false); 
	    	flyCam.setMoveSpeed(15);
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
	    	hudText.setText("Press '1', '2' or '3' to trigger play/pause of token animations");    // the text
	    	hudText.setLocalTranslation(5, hudText.getLineHeight(), 0); // position
	    	guiNode.attachChild(hudText);
	    	
	    	for (int index = 0; index < 3; index++){
	    		hudTexts[index] = new BitmapText(guiFont, false);
	    		hudTexts[index].setAlignment(Align.Left);
	    		hudTexts[index].setLocalTranslation(5, hudTexts[index].getLineHeight() * (index+10), 0);
	    		hudTexts[index].setText("This is text field " + Integer.toString(index));
	    		
	    		guiNode.attachChild(hudTexts[index]);
	    	}
	    	
	    // AP: create ground with volume
	        float groundWidthX = 30;
	        float groundHeightY = 1;
	        float groundDepthZ = 30;
	        groundGeo = new Geometry("Box", new Box(groundWidthX, groundHeightY, groundDepthZ)); 
	        Material groundMat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
	        com.jme3.texture.Texture groundTex = assetManager.loadTexture("SE2_ground.jpg"); 
	        groundMat.setTexture("ColorMap", groundTex);
	        groundGeo.setMaterial(groundMat);
	        groundGeo.setLocalTranslation(groundWidthX, (-groundHeightY)-0.1f, groundDepthZ);
	        
	        rootNode.attachChild(groundGeo);

	        
	        inputManager.addMapping("1",  new KeyTrigger(KeyInput.KEY_1));
	        inputManager.addMapping("2",  new KeyTrigger(KeyInput.KEY_2));
	        inputManager.addMapping("3",  new KeyTrigger(KeyInput.KEY_3));
	        
	        inputManager.addListener(actionListener, new String[]{"1"});
	        inputManager.addListener(actionListener, new String[]{"2"});
	        inputManager.addListener(actionListener, new String[]{"3"});
	        
	   // AP: Run setups to prepare the layout of the paths etc.

	        setupSObjects();
	    	setupTokens();
	        setupMotionEvents();
	
	}
	
	private ActionListener actionListener = new ActionListener() {
		 
		public void onAction(String name, boolean keyPressed, float tpf) {
			
			if (name.equals("1") && !keyPressed) { // test?

		        PlayState state = allMotionEvents[0].getPlayState();
		        
		        if (state == PlayState.Playing)
		        	allMotionEvents[0].pause();
		        else
		        	allMotionEvents[0].play();
		    } 
			if (name.equals("2") && !keyPressed) { // test?
				
				PlayState state = allMotionEvents[1].getPlayState();
		        
		        if (state == PlayState.Playing)
		        	allMotionEvents[1].pause();
		        else
		        	allMotionEvents[1].play();
		    }
			if (name.equals("3") && !keyPressed) { // test?
				
				PlayState state = allMotionEvents[2].getPlayState();
		        
		        if (state == PlayState.Playing)
		        	allMotionEvents[2].pause();
		        else
		        	allMotionEvents[2].play();
		    }

		}
		
	};
	
	@Override 
    public void simpleUpdate(float tpf) {
    	//double timeElapsedSinceStart = System.currentTimeMillis() - timeAtSystemStart; // Time elapsed since program start. 
		
		
		for (int index = 0; index < 3; index++){
			
			PlayState state = allMotionEvents[index].getPlayState();
			if (state == PlayState.Playing){
				hudTexts[index].setText(allSObjects[index].name + " : Playing");
			}
			if (state == PlayState.Paused){
				hudTexts[index].setText(allSObjects[index].name + " : Paused");
			}
			if (state == PlayState.Stopped){
				hudTexts[index].setText(allSObjects[index].name + " : Stopped");
			}
		}
		

		
    }
	 
}
