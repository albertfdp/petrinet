package geometry.diagram.notationtransfer;

import java.util.Vector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.transaction.NotificationFilter;
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

import geometry.GeometryFactory;
import geometry.Point;
import geometry.BendPoint;
import geometry.impl.InputPointImpl;
import geometry.impl.ConnectorImpl;
import geometry.impl.BendPointImpl;
import geometry.impl.LineImpl;

import org.eclipse.gmf.runtime.notation.impl.RelativeBendpointsImpl;


public class PositionListener extends EContentAdapter {
	
	private NotificationFilter ModifiedFilter;
	
	/**
	 * @generated NOT
	 */
	public PositionListener() {
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
	
	/**
	 * @generated NOT
	 */
	private void updateLine(ENotificationImpl eNotification, EObject eNotifier, LineImpl lineImpl, Edge edge)
	{	
		//Object object = ((RelativeBendpoints)edge.getBendpoints()).getPoints().get(1);
		int amount = ((RelativeBendpoints)edge.getBendpoints()).getPoints().size();
		// Is array<RelativeBendpoint> bigger than lineImpl.getBendPoint():
		if(lineImpl.getBendPoints().size() + 2 == amount && amount > 2)
			updateBendPoints(lineImpl, edge);
		else if(lineImpl.getBendPoints().size() + 2 < amount && amount > 2)
			addBendPoint(lineImpl, edge);
		else if(lineImpl.getBendPoints().size() + 2 > amount && amount >= 2)
			removeBendPoint(lineImpl, edge);
		return;
	}
	
	/**
	 * @generated NOT
	 */
	private void updateBendPoints(LineImpl lineImpl, Edge edge)
	{
		for(int i = 1; i < ((RelativeBendpoints)edge.getBendpoints()).getPoints().size() - 1; i++)
		{
			Vector<Integer> loc =  calculateAbsoluteLocationAtIndex(i, lineImpl, edge);
			
			if(loc.get(0) != lineImpl.getBendPoints().get(i-1).getXLocation() || loc.get(0) != lineImpl.getBendPoints().get(i-1).getYLocation())
			{
				lineImpl.getBendPoints().get(i-1).setXLocation(loc.get(0));
				lineImpl.getBendPoints().get(i-1).setYLocation(loc.get(1));
				return;
			}
		}
		return;
	}
	
	/**
	 * @generated NOT
	 */
	private void addBendPoint(LineImpl lineImpl, Edge edge)
	{
		//TODO: Make finding x and y locations of relative bendpoint into a function, if you feel like it.
		if(lineImpl.getBendPoints().size() == 0)
		{
			Vector<Integer> loc =  calculateAbsoluteLocationAtIndex(1, lineImpl, edge);			
			
			createBendPointAtIndex(0, loc.get(0), loc.get(1), lineImpl);
			return;
		}
		
		for(int i = 1; i < ((RelativeBendpoints)edge.getBendpoints()).getPoints().size() - 1; i++)
		{
			Vector<Integer> loc =  calculateAbsoluteLocationAtIndex(i, lineImpl, edge);
			
			if(i > lineImpl.getBendPoints().size())
			{
				createBendPointAtIndex(lineImpl.getBendPoints().size(), loc.get(0), loc.get(1), lineImpl);
				return;
			}
				
			else if(loc.get(0) != lineImpl.getBendPoints().get(i-1).getXLocation() || loc.get(1) != lineImpl.getBendPoints().get(i-1).getYLocation())
			{
				createBendPointAtIndex(i - 1, loc.get(0), loc.get(1), lineImpl);
				return;
			}
			
		}
	}
	
	/**
	 * @generated NOT
	 */
	private void removeBendPoint(LineImpl lineImpl, Edge edge)
	{
		if(((RelativeBendpoints)edge.getBendpoints()).getPoints().size() == 2)
		{
			lineImpl.getBendPoints().remove(0);
			return;
		}
		
		else
		{
			for(int i = 1; i < ((RelativeBendpoints)edge.getBendpoints()).getPoints().size() - 1; i++)
			{
				Vector<Integer> loc =  calculateAbsoluteLocationAtIndex(i, lineImpl, edge);
				
				if(loc.get(0) != lineImpl.getBendPoints().get(i-1).getXLocation() || loc.get(1) != lineImpl.getBendPoints().get(i-1).getYLocation())
				{
					lineImpl.getBendPoints().remove(i - 1);
					return;
				}
			}
		}
		
		lineImpl.getBendPoints().remove(lineImpl.getBendPoints().size() - 1);
		return;
	}
	
	/**
	 * @generated NOT
	 */
	private void createBendPointAtIndex(int ind, int x, int y, LineImpl lineImpl)
	{
		BendPoint bendPoint = GeometryFactory.eINSTANCE.createBendPoint();
		bendPoint.setXLocation(x);
		bendPoint.setYLocation(y);
		bendPoint.setLabel(lineImpl.getLabel() + "_Bendpoint");
		lineImpl.getBendPoints().add(ind, bendPoint);
	}
	
	
	private void removeBendPointAtIndex(int ind, LineImpl lineImpl)
	{
		lineImpl.getBendPoints().remove(ind);
		return;
	}
	/**
	 * @generated NOT
	 */
	private Vector<Integer> calculateAbsoluteLocationAtIndex(int index, LineImpl lineImpl, Edge edge)
	{
		Object object = ((RelativeBendpoints)edge.getBendpoints()).getPoints().get(index);
		int x = lineImpl.getBegin().getXLocation() + ((RelativeBendpoint) object).getSourceX();
		int y = lineImpl.getBegin().getYLocation() + ((RelativeBendpoint) object).getSourceY();
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(x);
		vector.add(y);
		
		return vector;
	}
}
	
