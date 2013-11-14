package dk.dtu.se2.simulator.petrinet.runtime;

import dk.dtu.se2.animation.Animation;

public class RTAnimation {
	
	/* The place unique id */
	private String id;
	
	/* The geometry label of that place */
	private String geometryLabel;
	
	/* The animation to run */
	private Animation animation;
	
	public RTAnimation() {}
	
	public RTAnimation(String id, String geometryLabel, Animation animation) {
		super();
		this.id = id;
		this.geometryLabel = geometryLabel;
		this.animation = animation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RTAnimation other = (RTAnimation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
