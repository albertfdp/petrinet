package dk.dtu.se2.simulator.petrinet.runtime;

import java.util.concurrent.atomic.AtomicInteger;

public class RTToken {
	
	private boolean finished;
	
	private static AtomicInteger nextId = new AtomicInteger(0);
	
	private String id;
	
	public RTToken () {
		this.finished = false;
		this.id = this.getFirstUnusedId();
	}
	
	public String getId() {
		return id;
	}
	
	public String getFirstUnusedId () {
		int firstUnusedId = nextId.getAndIncrement();
		return String.valueOf(firstUnusedId);
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	

}
