package dk.dtu.se2.engine3d;

import dk.dtu.se2.engine3d.jmonkey.JMonkeyEngine;
//import dk.dtu.se2.engine3d.jmonkey.JMonkeyEngine3D;

/**
 * A factory for creating Engine3D objects.
 * 
 * @author albert
 */
public class Engine3DFactory {
	
	public final static String JMONKEY = "jMonkey";
	
	/**
	 * Gets the 3D engine.
	 *
	 * @return the engine
	 */
	public static Engine3D getEngine3D(String engineName) {
		if (engineName.equals(JMONKEY)) {
			return new JMonkeyEngine();
		}
			
		else
			// FIXME
			return new JMonkeyEngine();
	}

}
