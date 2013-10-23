package geometry.diagram.edit.policies;

import geometry.diagram.edit.commands.BendPointCreateCommand;
import geometry.diagram.edit.commands.ConnectorCreateCommand;
import geometry.diagram.edit.commands.InputPointCreateCommand;
import geometry.diagram.providers.GeometryElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class GeometryItemSemanticEditPolicy extends
		GeometryBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GeometryItemSemanticEditPolicy() {
		super(GeometryElementTypes.Geometry_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GeometryElementTypes.Connector_2002 == req.getElementType()) {
			return getGEFWrapper(new ConnectorCreateCommand(req));
		}
		if (GeometryElementTypes.InputPoint_2001 == req.getElementType()) {
			return getGEFWrapper(new InputPointCreateCommand(req));
		}
		if (GeometryElementTypes.BendPoint_2003 == req.getElementType()) {
			return getGEFWrapper(new BendPointCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
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
