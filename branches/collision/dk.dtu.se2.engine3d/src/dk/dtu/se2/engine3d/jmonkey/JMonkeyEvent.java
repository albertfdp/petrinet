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

	public static JMonkeyEvent eventCopy(JMonkeyEvent baseObject) {
		JMonkeyEvent copy = null;
		if (baseObject instanceof JMonkeyMove) {
			copy = new JMonkeyMove(baseObject.getGeometryLabel(), ((JMonkeyMove) baseObject).getMotionEvent(), ((JMonkeyMove) baseObject).getEngine3D());
		} else if (baseObject instanceof JMonkeyAppear) {
			copy = new JMonkeyAppear(baseObject.getGeometryLabel(), ((JMonkeyAppear) baseObject).getAppearanceLabel());
		}
		
		return copy;
	}
}
