package jme3Test.helloWorld;
 
import java.sql.Time;

import com.bulletphysics.linearmath.Transform;
import com.jme3.animation.LoopMode;
import com.jme3.app.SimpleApplication;
import com.jme3.bounding.BoundingVolume;
import com.jme3.cinematic.MotionPath;
import com.jme3.cinematic.events.MotionEvent;
import com.jme3.font.BitmapText;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Quad;
import com.jme3.system.Timer;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Spline.SplineType;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
 
/** Sample 1 - how to get started with the most simple JME 3 application.
 * Display a blue 3D cube and view from all sides by
 * moving the mouse and pressing the WASD keys. */
public class HelloJME3 extends SimpleApplication {
 
    public static void main(String[] args){
        HelloJME3 app = new HelloJME3();
        app.start(); // start the game
    }
  
    protected Geometry cubeGeo;
    protected Geometry cubeGeo2;
    protected Geometry cubeGeo3;
    protected Geometry groundGeo;
    
    protected BitmapText hudText;
    protected double timeAtSystemStart;
    
    @Override
    public void simpleInitApp() {
    	
    // AP: setting up miscellaneous stuff
    	timeAtSystemStart = System.currentTimeMillis();
    	// AP: set the background color
    	viewPort.setBackgroundColor(ColorRGBA.Gray);
    	// AP: disable camera fly - the ability to move the camera with keyboard and mouse
    	flyCam.setEnabled(true); 
    	flyCam.setMoveSpeed(10);
    	// AP: set camera position (off center)
    	Vector3f camPos = new Vector3f(0, 20, 20);
    	cam.setLocation(camPos);
    	// AP: make the camera look at the origin
    	Vector3f origin = new Vector3f(0, 0, 0);
    	cam.lookAt(origin, cam.getUp());
    	
    // AP: setting up a basic HUD
    	hudText = new BitmapText(guiFont, false);          
    	hudText.setSize(guiFont.getCharSet().getRenderedSize());      // font size
    	hudText.setColor(ColorRGBA.Blue);                             // font color
    	hudText.setText("You can write any string here");             // the text
    	hudText.setLocalTranslation(200, hudText.getLineHeight(), 0); // position
    	guiNode.attachChild(hudText);
    	
    	
    // AP: creating a cube with a texture 
    	
        // create cube geometry from with box shape
        cubeGeo = new Geometry("Box", new Box(0.25f, 0.10f, 0.5f));        
        // AP: create a material that can have a shader, a texture and a base color.
        Material cubeMat = new Material(assetManager,
          "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
        // AP: add a texture - note: it won't let me just write "Texture tex = ...", I have to specify it like this: "com.jme3.texture.Texture tex = ..."
        com.jme3.texture.Texture cubeTex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); 
        cubeMat.setTexture("ColorMap", cubeTex);
        // AP: set the base color
        cubeMat.setColor("Color", ColorRGBA.Blue);   
        // AP: apply the material to the geometry
        cubeGeo.setMaterial(cubeMat);             
        // make the cube appear in the scene
    
    // AP: creating a cube2 with a texture 
    	
        // create cube geometry from with box shape
        cubeGeo2 = new Geometry("Box", new Box(0.25f, 0.10f, 0.5f));        
        // AP: create a material that can have a shader, a texture and a base color.
        Material cube2Mat = new Material(assetManager,
          "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
        // AP: add a texture - note: it won't let me just write "Texture tex = ...", I have to specify it like this: "com.jme3.texture.Texture tex = ..."
        com.jme3.texture.Texture cube2Tex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); 
        cube2Mat.setTexture("ColorMap", cube2Tex);
        // AP: set the base color
        cube2Mat.setColor("Color", ColorRGBA.Green);   
        // AP: apply the material to the geometry
        cubeGeo2.setMaterial(cube2Mat);             
        // make the cube appear in the scene
        
    // AP: creating a cube3 with a texture 
    	
        // create cube geometry from with box shape
        cubeGeo3 = new Geometry("Box", new Box(0.25f, 0.10f, 0.5f));        
        // AP: create a material that can have a shader, a texture and a base color.
        Material cube3Mat = new Material(assetManager,
          "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material
        // AP: add a texture - note: it won't let me just write "Texture tex = ...", I have to specify it like this: "com.jme3.texture.Texture tex = ..."
        com.jme3.texture.Texture cube3Tex = assetManager.loadTexture("Interface/Logo/Monkey.jpg"); 
        cube3Mat.setTexture("ColorMap", cube3Tex);
        // AP: set the base color
        cube3Mat.setColor("Color", ColorRGBA.Magenta);   
        // AP: apply the material to the geometry
        cubeGeo3.setMaterial(cube3Mat);             
        // make the cube appear in the scene
        
    // AP: create ground with volume, because planes/Quads are stupid (e.g. transparent from below).
        float groundWidthX = 8;
        float groundHeightY = 1;
        float groundDepthZ = 8;
        groundGeo = new Geometry("Box", new Box(groundWidthX, groundHeightY, groundDepthZ)); 
        Material groundMat = new Material(assetManager, 
            	"Common/MatDefs/Misc/Unshaded.j3md");
        com.jme3.texture.Texture groundTex = assetManager.loadTexture("SE2_ground.jpg"); 
        groundMat.setTexture("ColorMap", groundTex);
        groundGeo.setMaterial(groundMat);
        groundGeo.setLocalTranslation(0, -groundHeightY, 0);
        
    // AP: attach all geometry to the root Node
        
        rootNode.attachChild(cubeGeo); // put this node in the scene
        rootNode.attachChild(cubeGeo2); // put this node in the scene
        //rootNode.attachChild(cubeGeo3); // put this node in the scene
        rootNode.attachChild(groundGeo);
        
        
    // AP: creating the motion path that contains all points and the paths between them.
        MotionPath path = new MotionPath(); // adding way points - they are like 
        path.setCycle(true); // this will connect the first and last way point 
       
    	path.addWayPoint(new Vector3f(6, 0.25f, 2));
    	path.addWayPoint(new Vector3f(0, 0.25f, 7));
    	path.addWayPoint(new Vector3f(-6, 0.25f, 2));
	
    	path.setPathSplineType(SplineType.CatmullRom);
        path.setCurveTension(1f);
        
        path.enableDebugShape(assetManager, rootNode); // AP: this is to make the path visible
        
        MotionEvent event = new MotionEvent(cubeGeo, path, 10, LoopMode.Cycle); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (cycle).
    	event.setDirectionType(MotionEvent.Direction.Path); // AP: The spatial always faces in the direction of the path while moving.
    	event.play(); // note that this event does not happen in the update function.
    	/*
    	MotionEvent event2 = new MotionEvent(cubeGeo2, path, 20, LoopMode.Cycle); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (cycle).
    	event2.setDirectionType(MotionEvent.Direction.Path); // AP: The spatial always faces in the direction of the path while moving.
    	event2.play(); // note that this event does not happen in the update function.
    	*/
        //----------------------------------------
        
        MotionPath path2 = new MotionPath(); // adding way points - they are like 
        path2.setCycle(true); // this will connect the first and last way point
         
        path2.addWayPoint(new Vector3f(-7, 0.25f, -2));
    	path2.addWayPoint(new Vector3f(0, 0.25f, 4));
    	path2.addWayPoint(new Vector3f(0, 0.25f, -4));
    	path2.addWayPoint(new Vector3f(7, 0.25f, -2));

    	path2.setPathSplineType(SplineType.CatmullRom);
        path2.setCurveTension(1f);
    	
    	path2.enableDebugShape(assetManager, rootNode); // AP: this is to make the path visible
    	
    	MotionEvent event2 = new MotionEvent(cubeGeo2, path2, 10, LoopMode.Cycle); // constructing the motion event with spatial (cubeGeo), the motion path (path), time (10 seconds) and loop mode (cycle).
    	event2.setDirectionType(MotionEvent.Direction.Path); // AP: The spatial always faces in the direction of the path while moving.
    	event2.play(); // note that this event does not happen in the update function.
    	
    	//----------------------------------------
    	
    	
    	// initialize start position of cubes
    	Vector3f startPos1 = new Vector3f(0f, 0.25f, 4f);
    	cubeGeo3.setLocalTranslation(startPos1);
    }
    
    @Override 
    public void simpleUpdate(float tpf) {
    	
    	double timeElapsedSinceStart = System.currentTimeMillis() - timeAtSystemStart;  	
    	hudText.setText("secs since start: " + timeElapsedSinceStart/1000);
    	
    	// start position
    	
    	
    	
    	
    	//cubeGeo3.move(1f * tpf, 0, 0);
    
    	//cubeGeo.setLocalTranslation(path.getWayPoint((int)((timeElapsedSinceStart/1000)%8)/2)); // jump from place to place	
    	
    }
    
    
    
    
    
}