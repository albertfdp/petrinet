package geometry2nd.diagram.part;

import geometry2nd.Geometry;
import geometry2nd.Geometry2ndPackage;
import geometry2nd.diagram.edit.parts.BendPointEditPart;
import geometry2nd.diagram.edit.parts.BendPointLabelEditPart;
import geometry2nd.diagram.edit.parts.ConnectorEditPart;
import geometry2nd.diagram.edit.parts.ConnectorLabelEditPart;
import geometry2nd.diagram.edit.parts.GeometryEditPart;
import geometry2nd.diagram.edit.parts.InputPointEditPart;
import geometry2nd.diagram.edit.parts.InputPointLabelEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Geometry2ndVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Geometry2nd.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (GeometryEditPart.MODEL_ID.equals(view.getType())) {
				return GeometryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Geometry2ndDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Geometry2ndPackage.eINSTANCE.getGeometry().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Geometry) domainElement)) {
			return GeometryEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GeometryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GeometryEditPart.VISUAL_ID:
			if (Geometry2ndPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			if (Geometry2ndPackage.eINSTANCE.getInputPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPointEditPart.VISUAL_ID;
			}
			if (Geometry2ndPackage.eINSTANCE.getBendPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return BendPointEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GeometryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GeometryEditPart.VISUAL_ID:
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (BendPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (ConnectorLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPointEditPart.VISUAL_ID:
			if (InputPointLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case BendPointEditPart.VISUAL_ID:
			if (BendPointLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Geometry element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GeometryEditPart.VISUAL_ID:
			return false;
		case InputPointEditPart.VISUAL_ID:
		case BendPointEditPart.VISUAL_ID:
		case ConnectorEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return geometry2nd.diagram.part.Geometry2ndVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
