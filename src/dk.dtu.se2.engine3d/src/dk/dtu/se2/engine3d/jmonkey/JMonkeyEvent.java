package dk.dtu.se2.engine3d.jmonkey;


/**
 * @author Monica
 *
 */
public class JMonkeyEvent {
	
	private String geometryLabel;
		
	public JMonkeyEvent(String geometryLabel) {
		super();
		this.geometryLabel = geometryLabel;
	}

	public String getGeometryLabel() {
		return geometryLabel;
	}

	public void setGeometryLabel(String geometryLabel) {
		this.geometryLabel = geometryLabel;
	}
	
}
