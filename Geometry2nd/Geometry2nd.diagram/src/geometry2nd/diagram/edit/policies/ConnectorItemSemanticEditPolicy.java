package geometry2nd.diagram.edit.policies;

import geometry2nd.diagram.edit.commands.ConnectorInCreateCommand;
import geometry2nd.diagram.edit.commands.ConnectorInReorientCommand;
import geometry2nd.diagram.edit.commands.ConnectorOutCreateCommand;
import geometry2nd.diagram.edit.commands.ConnectorOutReorientCommand;
import geometry2nd.diagram.edit.commands.LineBeginCreateCommand;
import geometry2nd.diagram.edit.commands.LineBeginReorientCommand;
import geometry2nd.diagram.edit.commands.LineEndCreateCommand;
import geometry2nd.diagram.edit.commands.LineEndReorientCommand;
import geometry2nd.diagram.edit.parts.ConnectorInEditPart;
import geometry2nd.diagram.edit.parts.ConnectorOutEditPart;
import geometry2nd.diagram.edit.parts.LineBeginEditPart;
import geometry2nd.diagram.edit.parts.LineEndEditPart;
import geometry2nd.diagram.part.Geometry2ndVisualIDRegistry;
import geometry2nd.diagram.providers.Geometry2ndElementTypes;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ConnectorItemSemanticEditPolicy extends
		Geometry2ndBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectorItemSemanticEditPolicy() {
		super(Geometry2ndElementTypes.Connector_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Geometry2ndVisualIDRegistry.getVisualID(incomingLink) == LineEndEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Geometry2ndVisualIDRegistry.getVisualID(incomingLink) == LineBeginEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (Geometry2ndVisualIDRegistry.getVisualID(outgoingLink) == ConnectorInEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (Geometry2ndVisualIDRegistry.getVisualID(outgoingLink) == ConnectorOutEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Geometry2ndElementTypes.ConnectorIn_4008 == req.getElementType()) {
			return getGEFWrapper(new ConnectorInCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Geometry2ndElementTypes.LineEnd_4006 == req.getElementType()) {
			return null;
		}
		if (Geometry2ndElementTypes.ConnectorOut_4009 == req.getElementType()) {
			return getGEFWrapper(new ConnectorOutCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Geometry2ndElementTypes.LineBegin_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Geometry2ndElementTypes.ConnectorIn_4008 == req.getElementType()) {
			return null;
		}
		if (Geometry2ndElementTypes.LineEnd_4006 == req.getElementType()) {
			return getGEFWrapper(new LineEndCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (Geometry2ndElementTypes.ConnectorOut_4009 == req.getElementType()) {
			return null;
		}
		if (Geometry2ndElementTypes.LineBegin_4007 == req.getElementType()) {
			return getGEFWrapper(new LineBeginCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConnectorInEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectorInReorientCommand(req));
		case LineEndEditPart.VISUAL_ID:
			return getGEFWrapper(new LineEndReorientCommand(req));
		case ConnectorOutEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectorOutReorientCommand(req));
		case LineBeginEditPart.VISUAL_ID:
			return getGEFWrapper(new LineBeginReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
