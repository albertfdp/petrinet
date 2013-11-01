package geometry.diagram.notationtransfer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.NotationFactory;


public class GraphicElementListener extends EContentAdapter {
	
	private NotificationFilter ModifiedFilter;
	
	/**
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) 
	{
		if (notification.getNotifier() instanceof EObject)
			super.notifyChanged(notification);

		if (ModifiedFilter.matches(notification) && (notification instanceof ENotificationImpl) && (notification.getNotifier() instanceof EObject)) 
		{
			ENotificationImpl eNotification = (ENotificationImpl) notification;
			EObject eNotifier = (EObject) eNotification.getNotifier();
			
			if (eNotifier instanceof Node)
			{
				View view = (View) eNotifier;
				updateNodeBounds(view, eNotifier);
			}
		}
	}
	
	
	/**
	 * @generated NOT
	 */
	private void updateNodeBounds(View view, EObject eNotifier) {
		if(view instanceof org.eclipse.gmf.runtime.notation.Node)
		{
			org.eclipse.gmf.runtime.notation.Node viewNode = (org.eclipse.gmf.runtime.notation.Node) view;
			
			Location newPosition = getNodePosition(viewNode);
		}
	}
	
	
	/**
	 * @generated NOT
	 */
	private Location getNodePosition(Node viewNode) 
	{
		Location location = NotationFactory.eINSTANCE.createLocation();
		LayoutConstraint layout = viewNode.getLayoutConstraint();
		
		if(layout instanceof Bounds)
		{
			Bounds bound = (Bounds) layout;
			
			location.setX(bound.getX());
			location.setY(bound.getY());
		}
		else if (layout instanceof Location)
		{
			Location viewLocation = (Location) layout;
			
			location.setX(viewLocation.getX());
			location.setY(viewLocation.getY());
		}
		return location;
	}
}
	
