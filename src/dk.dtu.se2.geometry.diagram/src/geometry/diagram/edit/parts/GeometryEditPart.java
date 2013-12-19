package geometry.diagram.edit.parts;

import geometry.diagram.edit.policies.GeometryCanonicalEditPolicy;
import geometry.diagram.edit.policies.GeometryItemSemanticEditPolicy;
import geometry.diagram.part.GeometryVisualIDRegistry;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryEditPart.
 *
 * @generated
 */
public class GeometryEditPart extends DiagramEditPart {

	/** The Constant MODEL_ID. @generated */
	public final static String MODEL_ID = "Geometry"; //$NON-NLS-1$

	/** The Constant VISUAL_ID. @generated */
	public static final int VISUAL_ID = 1000;

	/**
	 * Instantiates a new geometry edit part.
	 *
	 * @param view the view
	 * @generated
	 */
	public GeometryEditPart(View view) {
		super(view);
	}

	/**
	 * Creates the default edit policies.
	 *
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new GeometryItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new GeometryCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						GeometryVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
