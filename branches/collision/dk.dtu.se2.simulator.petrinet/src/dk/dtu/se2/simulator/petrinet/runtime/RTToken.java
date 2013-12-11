package dk.dtu.se2.simulator.petrinet.runtime;

public class RTToken {
	
	private boolean finished;
	
	public RTToken () {
		this.finished = false;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	

}
