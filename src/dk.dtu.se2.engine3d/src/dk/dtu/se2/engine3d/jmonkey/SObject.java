package dk.dtu.se2.engine3d.jmonkey;

import com.jme3.math.Vector2f;

public class SObject {
	
	private Vector2f begin;	
	private Vector2f end;
	private Vector2f bend;
	private boolean inputPoint; 
	private String name; 
	private float speed; 
	
	public SObject (Vector2f _begin, Vector2f _bend, Vector2f _end, boolean _inputPoint, String _name, float _speed) {
		
		begin = _begin;	//
		end = _end; //
		bend = _bend; //new Vector2f (((begin.x + end.x) /2f), ((begin.y + end.y)/2f)); // The midpoint between begin and end
		inputPoint = _inputPoint; // is this an inputPoint or not?
		name = _name; // example: "L1" or "L2"
		speed = _speed; // seconds it will take for the token to move along the path	
	}

	public Vector2f getBegin() {
		return begin;
	}

	public void setBegin(Vector2f begin) {
		this.begin = begin;
	}

	public Vector2f getEnd() {
		return end;
	}

	public void setEnd(Vector2f end) {
		this.end = end;
	}

	public Vector2f getBend() {
		return bend;
	}

	public void setBend(Vector2f bend) {
		this.bend = bend;
	}

	public boolean isInputPoint() {
		return inputPoint;
	}

	public void setInputPoint(boolean inputPoint) {
		this.inputPoint = inputPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	
}
