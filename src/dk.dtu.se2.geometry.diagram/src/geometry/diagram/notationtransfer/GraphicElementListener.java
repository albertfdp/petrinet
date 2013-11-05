package geometry.diagram.notationtransfer;

import java.util.List;
import java.util.ArrayList;

import org.eclipse.draw2d.Connection;
//import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.NotationFactory;

import geometry.Point;
import geometry.BendPoint;
import geometry.Connector;
import geometry.impl.PointImpl;
import geometry.impl.InputPointImpl;
import geometry.impl.ConnectorImpl;
import geometry.impl.BendPointImpl;
import geometry.impl.LineImpl;

import org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl;


public class GraphicElementListener extends EContentAdapter {
	
	private NotificationFilter ModifiedFilter;
	
	/**
	 * @generated NOT
	 */
	public GraphicElementListener() {
		ModifiedFilter = NotificationFilter.createEventTypeFilter(Notification.SET).or(NotificationFilter.createEventTypeFilter(Notification.UNSET)).or(NotificationFilter.createEventTypeFilter(Notification.ADD)).or(NotificationFilter.createEventTypeFilter(Notification.REMOVE));
	}
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
			
			if (NotationPackage.eINSTANCE.getLocation().isSuperTypeOf(eNotifier.eClass()))
				updateNodeBounds(eNotification, eNotifier);
			
			else if (eNotifier instanceof RelativeBendpointsImpl)
			{
				EObject object = eNotifier.eContainer();
				if (object instanceof Edge) 
				{
					Edge edge = (Edge) object;
					object = edge.getElement();
					if (object != null && object instanceof LineImpl) 
					{
						LineImpl lineImpl = (LineImpl) object;
						updateLine(eNotification, eNotifier, lineImpl, edge);
					}
				}
			}
		}
	}
	
	
	/**
	 * @generated NOT
	 */
	private void updateNodeBounds(ENotificationImpl eNotification, EObject eNotifier) {
		View view = (View) eNotifier.eContainer();
		EObject modelElement = view.getElement();
	    updateNodeBounds(view, modelElement);
	}
	
	/**
	 * @generated NOT
	 */
	private void updateNodeBounds(View view, EObject modelElement) {
		if(view instanceof org.eclipse.gmf.runtime.notation.Node)
		{
			org.eclipse.gmf.runtime.notation.Node viewNode = (org.eclipse.gmf.runtime.notation.Node) view;
			if (modelElement instanceof InputPointImpl)
			{
				Object modelNode = (InputPointImpl) modelElement;
				Location newPosition = getNodePosition(viewNode);
				if(modelNode instanceof Point)
				{
					modelNode = (geometry.Point) modelNode;
					((geometry.Point) modelNode).setXLocation(newPosition.getX());
					((geometry.Point) modelNode).setYLocation(newPosition.getY());
				}
			}
			
			else if (modelElement instanceof BendPointImpl)
			{
				Object modelNode = (BendPointImpl) modelElement;
				Location newPosition = getNodePosition(viewNode);
				if(modelNode instanceof Point)
				{
					modelNode = (geometry.Point) modelNode;
					((geometry.Point) modelNode).setXLocation(newPosition.getX());
					((geometry.Point) modelNode).setYLocation(newPosition.getY());
				}
			}
			
			else if (modelElement instanceof ConnectorImpl)
			{
				Object modelNode = (ConnectorImpl) modelElement;
				Location newPosition = getNodePosition(viewNode);
				if(modelNode instanceof Point)
				{
					modelNode = (geometry.Point) modelNode;
					((geometry.Point) modelNode).setXLocation(newPosition.getX());
					((geometry.Point) modelNode).setYLocation(newPosition.getY());
				}
			}
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
	
	private void updateLine(ENotificationImpl eNotification, EObject eNotifier, LineImpl lineImpl, Edge edge)
	{	
		Object object = ((RelativeBendpoints)edge.getBendpoints()).getPoints().get(1);	
		
		if(object instanceof RelativeBendpoint)
		{
			object = (RelativeBendpoint) object;
			int x = ((RelativeBendpoint) object).getSourceX();
			int y = ((RelativeBendpoint) object).getSourceY();
			Point point = null;
			//point.setXLocation(x);
			//point.setYLocation(y);
			return;
		}
		/*
		if(lineImpl.getBendPoint() instanceof BendPoint)
		{
			
			RelativeBendpoints bendpoints = NotationFactory.eINSTANCE.createRelativeBendpoints();
		
			edge.setBendpoints(bendpoints);
			List<RelativeBendpoint> points = new ArrayList<RelativeBendpoint>();
			
			int sourcex = lineImpl.getBendPoint().getXLocation() - lineImpl.getBegin().getXLocation();
			int sourcey = lineImpl.getBendPoint().getYLocation() - lineImpl.getBegin().getYLocation();
			
			int targetx = lineImpl.getBendPoint().getXLocation() - lineImpl.get
			
			RelativeBendpoint bendPoint = new RelativeBendpoint(1, 2, 3, 4);
			points.add(bendPoint);
			    
			bendpoints.setPoints(points);
			edge.setBendpoints(bendpoints);
		}*/
		return;
	}
}
	
