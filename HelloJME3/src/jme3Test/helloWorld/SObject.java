package jme3Test.helloWorld;

import com.jme3.math.Vector2f;

public class SObject {
	
	Vector2f begin;	
	Vector2f end;
	Vector2f bend;
	boolean inputPoint; 
	String name; 
	float speed; 
	
	public SObject (Vector2f _begin, Vector2f _bend, Vector2f _end, boolean _inputPoint, String _name, float _speed) {
		
		begin = _begin;	//
		end = _end; //
		bend = _bend; //new Vector2f (((begin.x + end.x) /2f), ((begin.y + end.y)/2f)); // The midpoint between begin and end
		inputPoint = _inputPoint; // is this an inputPoint or not?
		name = _name; // example: "L1" or "L2"
		speed = _speed; // seconds it will take for the token to move along the path	
	}
	
}
