package geometry2nd.diagram.edit.parts;

import geometry2nd.diagram.part.Geometry2ndVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Geometry2ndEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Geometry2ndVisualIDRegistry.getVisualID(view)) {

			case GeometryEditPart.VISUAL_ID:
				return new GeometryEditPart(view);

			case ConnectorEditPart.VISUAL_ID:
				return new ConnectorEditPart(view);

			case ConnectorLabelEditPart.VISUAL_ID:
				return new ConnectorLabelEditPart(view);

			case InputPointEditPart.VISUAL_ID:
				return new InputPointEditPart(view);

			case InputPointLabelEditPart.VISUAL_ID:
				return new InputPointLabelEditPart(view);

			case BendPointEditPart.VISUAL_ID:
				return new BendPointEditPart(view);

			case BendPointLabelEditPart.VISUAL_ID:
				return new BendPointLabelEditPart(view);

			case ConnectorInEditPart.VISUAL_ID:
				return new ConnectorInEditPart(view);

			case LineEndEditPart.VISUAL_ID:
				return new LineEndEditPart(view);

			case ConnectorOutEditPart.VISUAL_ID:
				return new ConnectorOutEditPart(view);

			case LineBeginEditPart.VISUAL_ID:
				return new LineBeginEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
