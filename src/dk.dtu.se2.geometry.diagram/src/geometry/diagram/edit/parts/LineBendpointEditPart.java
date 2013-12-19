package geometry.diagram.edit.parts;


import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConnectionBendpointEditPolicy;



// TODO: Auto-generated Javadoc
/**
 * The Class LineBendpointEditPart.
 */
public class LineBendpointEditPart extends ConnectionBendpointEditPolicy
{
	/*
	 * generated NOT
	 * @Mikko_Tuulio
	 * Truth to be told I don't even remember why and what this was supposed to do.
	 */
	@Override
	public Command getCommand(Request request) {
		
		return super.getCommand(request);
		/*else if(request instanceof BendpointRequest) {
			return getMoveMessageCommand((BendpointRequest)request);
		}
		return null;*/
	}
}