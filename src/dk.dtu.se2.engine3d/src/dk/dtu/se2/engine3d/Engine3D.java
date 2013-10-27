package dk.dtu.se2.engine3d;

import geometry.Geometry;

import java.util.List;

import dk.dtu.se2.animation.Animation;
import dk.dtu.se2.appearance.Appearance;

public interface Engine3D {
	
	public void init (Geometry geometry, Appearance appearance);
	
	public void onStart();
	
	public void onPause();
	
	public void onStop();
	
	public void onUserClick();
	
	public void animate(List<Animation> animations);
	
	public void onAnimationFinished(Animation animation);

}