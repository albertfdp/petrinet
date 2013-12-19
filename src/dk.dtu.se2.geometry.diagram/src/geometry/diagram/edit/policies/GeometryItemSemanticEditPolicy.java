package geometry.diagram.edit.policies;

import geometry.diagram.edit.commands.ConnectorCreateCommand;
import geometry.diagram.edit.commands.InputPointCreateCommand;
import geometry.diagram.providers.GeometryElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryItemSemanticEditPolicy.
 *
 * @generated
 */
public class GeometryItemSemanticEditPolicy extends
		GeometryBaseItemSemanticEditPolicy {

	/**
	 * Instantiates a new geometry item semantic edit policy.
	 *
	 * @generated
	 */
	public GeometryItemSemanticEditPolicy() {
		super(GeometryElementTypes.Geometry_1000);
	}

	/**
	 * Gets the creates the command.
	 *
	 * @param req the req
	 * @return the creates the command
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GeometryElementTypes.Connector_2001 == req.getElementType()) {
			return getGEFWrapper(new ConnectorCreateCommand(req));
		}
		if (GeometryElementTypes.InputPoint_2002 == req.getElementType()) {
			return getGEFWrapper(new InputPointCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * Gets the duplicate command.
	 *
	 * @param req the req
	 * @return the duplicate command
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * The Class DuplicateAnythingCommand.
	 *
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * Instantiates a new duplicate anything command.
		 *
		 * @param editingDomain the editing domain
		 * @param req the req
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
