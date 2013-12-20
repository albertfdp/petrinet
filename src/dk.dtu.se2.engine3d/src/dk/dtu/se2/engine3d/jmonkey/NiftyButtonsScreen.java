package dk.dtu.se2.engine3d.jmonkey;

import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.AbstractAppState;
import com.jme3.app.state.AppStateManager;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

/**
 * 
 * @author Monica
 *
 */

public class NiftyButtonsScreen extends AbstractAppState implements ScreenController {
	 
	  private Nifty nifty;
	  private Screen screen;
	  private SimpleApplication app;
	  private JMonkeyEngine engine3D;
	 
	  /** custom methods 
	 * @param jMonkeyEngine */ 
	 
	  public NiftyButtonsScreen(String data, JMonkeyEngine jMonkeyEngine) { 
	    /** Your custom constructor, can accept arguments */ 
		  this.engine3D = jMonkeyEngine;
	  } 
	 
	  /** Nifty GUI ScreenControl methods */ 
	 
	  public void bind(Nifty nifty, Screen screen) {
	    this.nifty = nifty;
	    this.screen = screen;
	  }
	 
	  public void onStartScreen() { }
	 
	  public void onEndScreen() { }
	 
	  /** jME3 AppState methods */ 
	 
	  @Override
	  public void initialize(AppStateManager stateManager, Application app) {
	    super.initialize(stateManager, app);
	    this.app=(SimpleApplication)app;
	  }
	 
	  @Override
	  public void update(float tpf) { 
	    /** jME update loop! */ 
	  }
	 
	  public void startPetrinet() {
		  this.engine3D.onStartButtonPressed();  
	  }
	  
	  public void resetPetrinet() {
		  this.engine3D.onResetButtonPressed();
	  }
	  
 	}
