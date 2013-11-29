package geometry.diagram.edit.parts;


import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConnectionBendpointEditPolicy;



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