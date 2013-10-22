package geometry2nd.diagram.edit.policies;

import geometry2nd.diagram.providers.Geometry2ndElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ConnectorOutItemSemanticEditPolicy extends
		Geometry2ndBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectorOutItemSemanticEditPolicy() {
		super(Geometry2ndElementTypes.ConnectorOut_4009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
