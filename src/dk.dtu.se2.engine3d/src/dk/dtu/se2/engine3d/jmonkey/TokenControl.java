package dk.dtu.se2.engine3d.jmonkey;

import java.io.IOException;

import com.jme3.export.JmeExporter;
import com.jme3.export.JmeImporter;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.renderer.ViewPort;
import com.jme3.scene.Spatial;
import com.jme3.scene.control.Control;

public class TokenControl implements Control{
	
	public void setLocation (Vector3f wayPoint, Spatial spatial) {
		spatial.setLocalTranslation(wayPoint);
	}

	@Override
	public void read(JmeImporter arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void write(JmeExporter arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Control cloneForSpatial(Spatial arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void render(RenderManager arg0, ViewPort arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpatial(Spatial arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float arg0) {
		// TODO Auto-generated method stub
		
	}

}
