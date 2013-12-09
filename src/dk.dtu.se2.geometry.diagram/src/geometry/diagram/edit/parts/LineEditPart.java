package geometry.diagram.edit.parts;

import geometry.diagram.edit.policies.LineItemSemanticEditPolicy;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class LineEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public LineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new LineItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LineLabelAppearanceLabelTokEditPart) {
			((LineLabelAppearanceLabelTokEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureName());
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
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LineLabelAppearanceLabelTokEditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new LineFigure();
	}

	/**
	 * @generated
	 */
	public LineFigure getPrimaryShape() {
		return (LineFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class LineFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureName;

		/**
		 * @generated NOT
		 * @Mikko_Tuulio
		 */
		public LineFigure() {
			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureName = new WrappingLabel();

			fFigureName.setText("<...>");

			this.add(fFigureName);

		}

		/**
		 * @generated NOT
		 * @Mikko_Tuulio
		 */
		private RotatableDecoration createTargetDecoration() {
			PolygonDecoration df = new PolygonDecoration();
			df.setFill(true);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureName() {
			return fFigureName;
		}

		/**
		 * @generated NOT
		 * @Mikko_Tuulio
		 */
		@Override
		public PointList getSmoothPoints(boolean calculateAppox) {
			// TODO Auto-generated method stub

			// Set how many smooth points there should be between each control point
			double smoothness = (double) 100;
			PointList smoothPoints = calculateCatmullromPointList(
					this.getPoints(), smoothness);
			return smoothPoints;
		}

		/**
		 * @generated NOT
		 * @Mikko_Tuulio
		 */
		private PointList calculateCatmullromPointList(PointList points,
				double smoothness) {
			PointList catmullromPoints = new PointList(); //This isn't correct, me thinks.

			//If the point list consists of only two points, list of smooth points is the same as list of control points
			if (2 == points.size()) {
				//Add first and last points of control points list to smooth points list
				catmullromPoints.addPoint(points.getFirstPoint());
				catmullromPoints.addPoint(points.getLastPoint());

				return catmullromPoints;
			}

			//Initialize values
			Point newPoint = null;
			double tStep = 1 / smoothness;

			//Loop trough all the points in point list. Depending on the method this might not be needed
			for (int i = 0; i < points.size() - 1; i++) {
				//Add control points to smooth points, except the last one
				catmullromPoints.addPoint(points.getPoint(i));

				//Loop trough steps at the length of smoothness.
				for (double t = tStep; t < 1; t = t + tStep) {
					//If the first segment  of line is being calculated, new control point needs to be created before the first one
					if (i == 0)
						newPoint = calculatePoint(
								extrapolatePoint(points.getPoint(i + 1),
										points.getPoint(i)),
								points.getPoint(i), points.getPoint(i + 1),
								points.getPoint(i + 2), t);

					//If the last segment  of line is being calculated, new control point needs to be created after the last one
					else if (i == points.size() - 2)
						newPoint = calculatePoint(
								points.getPoint(i - 1),
								points.getPoint(i),
								points.getPoint(i + 1),
								extrapolatePoint(points.getPoint(i),
										points.getPoint(i + 1)), t);

					//Calculate new point from nearby points and time step
					else
						newPoint = calculatePoint(points.getPoint(i - 1),
								points.getPoint(i), points.getPoint(i + 1),
								points.getPoint(i + 2), t);

					//Add new point to the list of smooth points.
					catmullromPoints.addPoint(newPoint);
				}
			}

			//Add last control point to list of smooth points.
			catmullromPoints.addPoint(points.getLastPoint());
			return catmullromPoints;
		}

		/**
		 * @generated NOT
		 * @Mikko_Tuulio
		 */
		private Point calculatePoint(Point p0, Point p1, Point p2, Point p3,
				double t) {
			Point point = new Point(); //This isn't correct, me thinks.

			point.x = (int) (0.5 * (p0.x * (-t + 2 * (t * t) - (t * t * t))
					+ p1.x * (2 - 5 * (t * t) + 3 * (t * t * t)) + p2.x
					* (t + 4 * (t * t) - 3 * (t * t * t)) + p3.x
					* (-(t * t) + (t * t * t))));
			point.y = (int) (0.5 * (p0.y * (-t + 2 * (t * t) - (t * t * t))
					+ p1.y * (2 - 5 * (t * t) + 3 * (t * t * t)) + p2.y
					* (t + 4 * (t * t) - 3 * (t * t * t)) + p3.y
					* (-(t * t) + (t * t * t))));

			return point;
		}

		/**
		 * @generated NOT
		 * @Mikko_Tuulio
		 */
		private Point extrapolatePoint(Point p1, Point p2) {
			Point point = new Point(); //This isn't correct, me thinks.
			point.x = (p2.x - p1.x) + p1.x;
			point.y = (p2.y - p1.y) + p1.y;
			return point;
		}
	}

}
