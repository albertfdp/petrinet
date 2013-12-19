package geometry.diagram.edit.commands;

import geometry.Connector;
import geometry.Geometry;
import geometry.Line;
import geometry.diagram.edit.policies.GeometryBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

// TODO: Auto-generated Javadoc
/**
 * The Class LineReorientCommand.
 *
 * @generated
 */
public class LineReorientCommand extends EditElementCommand {

	/** The reorient direction. @generated */
	private final int reorientDirection;

	/** The old end. @generated */
	private final EObject oldEnd;

	/** The new end. @generated */
	private final EObject newEnd;

	/**
	 * Instantiates a new line reorient command.
	 *
	 * @param request the request
	 * @generated
	 */
	public LineReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * Can execute.
	 *
	 * @return true, if successful
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Line) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * Can reorient source.
	 *
	 * @return true, if successful
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Connector && newEnd instanceof Connector)) {
			return false;
		}
		Connector target = getLink().getEnd();
		if (!(getLink().eContainer() instanceof Geometry)) {
			return false;
		}
		Geometry container = (Geometry) getLink().eContainer();
		return GeometryBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistLine_4001(container, getLink(), getNewSource(), target);
	}

	/**
	 * Can reorient target.
	 *
	 * @return true, if successful
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Connector && newEnd instanceof Connector)) {
			return false;
		}
		Connector source = getLink().getBegin();
		if (!(getLink().eContainer() instanceof Geometry)) {
			return false;
		}
		Geometry container = (Geometry) getLink().eContainer();
		return GeometryBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistLine_4001(container, getLink(), source, getNewTarget());
	}

	/**
	 * Do execute with result.
	 *
	 * @param monitor the monitor
	 * @param info the info
	 * @return the command result
	 * @throws ExecutionException the execution exception
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * Reorient source.
	 *
	 * @return the command result
	 * @throws ExecutionException the execution exception
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setBegin(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * Reorient target.
	 *
	 * @return the command result
	 * @throws ExecutionException the execution exception
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setEnd(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * Gets the link.
	 *
	 * @return the link
	 * @generated
	 */
	protected Line getLink() {
		return (Line) getElementToEdit();
	}

	/**
	 * Gets the old source.
	 *
	 * @return the old source
	 * @generated
	 */
	protected Connector getOldSource() {
		return (Connector) oldEnd;
	}

	/**
	 * Gets the new source.
	 *
	 * @return the new source
	 * @generated
	 */
	protected Connector getNewSource() {
		return (Connector) newEnd;
	}

	/**
	 * Gets the old target.
	 *
	 * @return the old target
	 * @generated
	 */
	protected Connector getOldTarget() {
		return (Connector) oldEnd;
	}

	/**
	 * Gets the new target.
	 *
	 * @return the new target
	 * @generated
	 */
	protected Connector getNewTarget() {
		return (Connector) newEnd;
	}
}
