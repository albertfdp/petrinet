package dk.dtu.se2.simulator.petrinet.runtime;

import dk.dtu.se2.animation.Animation;

public class RTAnimation {
	
	/* The geometry label of that place */
	private String geometryLabel;
	
	/* The animation to run */
	private Animation animation;
	
	private boolean destroy;
	
	public RTAnimation() {}
	
	public RTAnimation(String geometryLabel, Animation animation, boolean destroy) {
		super();
		this.geometryLabel = geometryLabel;
		this.animation = animation;
		this.destroy = destroy;
	}

	public String getGeometryLabel() {
		return geometryLabel;
	}

	public void setGeometryLabel(String geometryLabel) {
		this.geometryLabel = geometryLabel;
	}

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RTAnimation [geometryLabel=" + geometryLabel + ", animation="
				+ animation + "]";
	}

	public boolean isDestroy() {
		return destroy;
	}

	public void setDestroy(boolean destroy) {
		this.destroy = destroy;
	}

	
	
}
