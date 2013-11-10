package dk.dtu.se2.simulator.petrinet.runtime;

public class RToken {
	
	private boolean finished;
	
	public RToken () {
		this.finished = false;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	

}
