package geometry.diagram.edit.policies;

import geometry.diagram.providers.GeometryElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

// TODO: Auto-generated Javadoc
/**
 * The Class LineItemSemanticEditPolicy.
 *
 * @generated
 */
public class LineItemSemanticEditPolicy extends
		GeometryBaseItemSemanticEditPolicy {

	/**
	 * Instantiates a new line item semantic edit policy.
	 *
	 * @generated
	 */
	public LineItemSemanticEditPolicy() {
		super(GeometryElementTypes.Line_4001);
	}

	/**
	 * Gets the destroy element command.
	 *
	 * @param req the req
	 * @return the destroy element command
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
