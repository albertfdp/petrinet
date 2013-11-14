package geometry.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.BendpointRequest;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConnectionBendpointEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetConnectionBendpointsCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.requests.SetAllBendpointRequest;
import org.eclipse.gmf.runtime.diagram.ui.util.SelectInDiagramHelper;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.gef.ui.internal.editpolicies.LineMode;
import org.eclipse.gmf.runtime.notation.Edge;


public class LineBendpointEditPart extends ConnectionBendpointEditPolicy
{
	/*
	 *
	 * generated NOT
	 */
	@Override
	public Command getCommand(Request request) {
		
		return super.getCommand(request);
		/*else if(request instanceof BendpointRequest) {
			return getMoveMessageCommand((BendpointRequest)request);
		}
		return null;*/
	}
	
	
	/*
	 *
	 * generated NOT
	 */
	/*@Override
	protected Command getCreateBendpointCommand(BendpointRequest request) {
		int x = 1;
		int y = x;
		return super.getCreateBendpointCommand(request);
	}*/
}