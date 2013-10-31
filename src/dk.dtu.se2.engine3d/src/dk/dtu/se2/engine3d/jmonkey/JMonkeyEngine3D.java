package dk.dtu.se2.engine3d.jmonkey;

import geometry.Geometry;

import java.util.List;

import com.jme3.app.SimpleApplication;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.appearance.Appearance;
import dk.dtu.se2.engine3d.Engine3D;
import dk.dtu.se2.engine3d.Engine3DListener;

public class JMonkeyEngine3D extends SimpleApplication implements Engine3D {

	private Engine3DListener engine3DListener;
	
	@Override
	public void init(Geometry geometry, Appearance appearance) {
	}

	@Override
	public void animate(List<Animation> animations) {
		
		
		// when animation finished;
		this.engine3DListener.onAnimationFinished();
	}
	
	public void setEngine3DListener(Engine3DListener engine3DListener) {
		this.engine3DListener = engine3DListener;
	}

	@Override
	public void simpleInitApp() {
		
	}


}
