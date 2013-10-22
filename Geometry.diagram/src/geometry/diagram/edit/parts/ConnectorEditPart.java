package geometry.diagram.edit.parts;

import geometry.diagram.edit.policies.ConnectorItemSemanticEditPolicy;
import geometry.diagram.part.GeometryVisualIDRegistry;
import geometry.diagram.providers.GeometryElementTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class ConnectorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ConnectorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ConnectorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ConnectorFigure();
	}

	/**
	 * @generated
	 */
	public ConnectorFigure getPrimaryShape() {
		return (ConnectorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConnectorLabelEditPart) {
			((ConnectorLabelEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureConnectorLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConnectorLabelEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(GeometryVisualIDRegistry
				.getType(ConnectorLabelEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnSource() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				1);
		types.add(GeometryElementTypes.Line_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (targetEditPart instanceof geometry.diagram.edit.parts.ConnectorEditPart) {
			types.add(GeometryElementTypes.Line_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMATypesForTarget(
			IElementType relationshipType) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (relationshipType == GeometryElementTypes.Line_4001) {
			types.add(GeometryElementTypes.Connector_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMARelTypesOnTarget() {
		ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new ArrayList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/(
				1);
		types.add(GeometryElementTypes.Line_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/getMATypesForSource(
			IElementType relationshipType) {
		LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/types = new LinkedList/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
		if (relationshipType == GeometryElementTypes.Line_4001) {
			types.add(GeometryElementTypes.Connector_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ConnectorFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectorLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectorXLocationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectorYLocationFigure;

		/**
		 * @generated
		 */
		public ConnectorFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConnectorLabelFigure = new WrappingLabel();

			fFigureConnectorLabelFigure.setText("<...>");

			this.add(fFigureConnectorLabelFigure);

			fFigureConnectorXLocationFigure = new WrappingLabel();

			fFigureConnectorXLocationFigure.setText("<...>");

			this.add(fFigureConnectorXLocationFigure);

			fFigureConnectorYLocationFigure = new WrappingLabel();

			fFigureConnectorYLocationFigure.setText("<...>");

			this.add(fFigureConnectorYLocationFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectorLabelFigure() {
			return fFigureConnectorLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectorXLocationFigure() {
			return fFigureConnectorXLocationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectorYLocationFigure() {
			return fFigureConnectorYLocationFigure;
		}

	}

}
