package dk.dtu.se2.engine3d.jmonkey;

/**
 * @author Monica
 *
 */
public class JMonkeyAppear extends JMonkeyEvent{
	
	private String appearanceLabel;

	public JMonkeyAppear(String geometryLabel, String appearanceLabel) {
		super(geometryLabel);
		this.appearanceLabel = appearanceLabel;
	}

	public String getAppearanceLabel() {
		return appearanceLabel;
	}

	public void setAppearanceLabel(String appearanceLabel) {
		this.appearanceLabel = appearanceLabel;
	}
	
}
