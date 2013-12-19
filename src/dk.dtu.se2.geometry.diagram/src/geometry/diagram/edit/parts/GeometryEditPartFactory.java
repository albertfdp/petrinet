package geometry.diagram.edit.parts;

import geometry.diagram.part.GeometryVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating GeometryEditPart objects.
 *
 * @generated
 */
public class GeometryEditPartFactory implements EditPartFactory {

	/**
	 * Creates a new GeometryEditPart object.
	 *
	 * @param context the context
	 * @param model the model
	 * @return the edits the part
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GeometryVisualIDRegistry.getVisualID(view)) {

			case GeometryEditPart.VISUAL_ID:
				return new GeometryEditPart(view);

			case ConnectorEditPart.VISUAL_ID:
				return new ConnectorEditPart(view);

			case ConnectorLabelEditPart.VISUAL_ID:
				return new ConnectorLabelEditPart(view);

			case InputPointEditPart.VISUAL_ID:
				return new InputPointEditPart(view);

			case InputPointLabelAppearanceLabelEditPart.VISUAL_ID:
				return new InputPointLabelAppearanceLabelEditPart(view);

			case LineEditPart.VISUAL_ID:
				return new LineEditPart(view);

			case LineLabelAppearanceLabelTokEditPart.VISUAL_ID:
				return new LineLabelAppearanceLabelTokEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * Creates a new GeometryEditPart object.
	 *
	 * @param context the context
	 * @param model the model
	 * @return the edits the part
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * Gets the text cell editor locator.
	 *
	 * @param source the source
	 * @return the text cell editor locator
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
