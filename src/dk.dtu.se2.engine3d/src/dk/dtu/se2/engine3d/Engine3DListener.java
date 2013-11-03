package dk.dtu.se2.engine3d;

/**
 * The listener interface for receiving engine3D events.
 * The class that is interested in processing a engine3D
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addEngine3DListener<code> method. When
 * the engine3D event occurs, that object's appropriate
 * method is invoked.
 *
 * @see Engine3DEvent
 */
public interface Engine3DListener {
	
	
	/**
	 * Callback function being called when the user clicks on 
	 * start button to start the simulation. The class implementing
	 * this interface should provide the list of animations to be 
	 * run after this call.
	 */
	public void onStart();
	
	/**
	 * On pause.
	 */
	public void onPause();
	
	/**
	 * On stop.
	 */
	public void onStop();
	
	/**
	 * On user click.
	 */
	public void onUserClick();
	
	/**
	 * On animation finished.
	 */
	public void onAnimationFinished(String geometryLabel);
	
		
}
