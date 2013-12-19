package geometry.diagram.part;

import geometry.Geometry;
import geometry.GeometryPackage;
import geometry.diagram.edit.parts.ConnectorEditPart;
import geometry.diagram.edit.parts.ConnectorLabelEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.InputPointEditPart;
import geometry.diagram.edit.parts.InputPointLabelAppearanceLabelEditPart;
import geometry.diagram.edit.parts.InputPointLabelEditPart;
import geometry.diagram.edit.parts.LineEditPart;

import geometry.diagram.edit.parts.LineLabelAppearanceLabelTokEditPart;
import geometry.diagram.edit.parts.LineLabelEditPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

// TODO: Auto-generated Javadoc
/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GeometryVisualIDRegistry {

	/** The Constant DEBUG_KEY. @generated */
	private static final String DEBUG_KEY = "dk.dtu.se2.geometry.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * Gets the visual id.
	 *
	 * @param view the view
	 * @return the visual id
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
		return geometry.diagram.part.GeometryVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * Gets the model id.
	 *
	 * @param view the view
	 * @return the model id
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
	 * Gets the visual id.
	 *
	 * @param type the type
	 * @return the visual id
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GeometryDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * Gets the type.
	 *
	 * @param visualID the visual id
	 * @return the type
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * Gets the diagram visual id.
	 *
	 * @param domainElement the domain element
	 * @return the diagram visual id
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GeometryPackage.eINSTANCE.getGeometry().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Geometry) domainElement)) {
			return GeometryEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * Gets the node visual id.
	 *
	 * @param containerView the container view
	 * @param domainElement the domain element
	 * @return the node visual id
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = geometry.diagram.part.GeometryVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = geometry.diagram.part.GeometryVisualIDRegistry
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
			if (GeometryPackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			if (GeometryPackage.eINSTANCE.getInputPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return InputPointEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * Can create node.
	 *
	 * @param containerView the container view
	 * @param nodeVisualID the node visual id
	 * @return true, if successful
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = geometry.diagram.part.GeometryVisualIDRegistry
				.getModelID(containerView);
		if (!GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GeometryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = geometry.diagram.part.GeometryVisualIDRegistry
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
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (ConnectorLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPointEditPart.VISUAL_ID:
			if (InputPointLabelAppearanceLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LineEditPart.VISUAL_ID:
			if (LineLabelAppearanceLabelTokEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * Gets the link with class visual id.
	 *
	 * @param domainElement the domain element
	 * @return the link with class visual id
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GeometryPackage.eINSTANCE.getLine().isSuperTypeOf(
				domainElement.eClass())) {
			return LineEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @param element the element
	 * @return true, if is diagram
	 * @generated
	 */
	private static boolean isDiagram(Geometry element) {
		return true;
	}

	/**
	 * Check node visual id.
	 *
	 * @param containerView the container view
	 * @param domainElement the domain element
	 * @param candidate the candidate
	 * @return true, if successful
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
	 * Checks if is compartment visual id.
	 *
	 * @param visualID the visual id
	 * @return true, if is compartment visual id
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * Checks if is semantic leaf visual id.
	 *
	 * @param visualID the visual id
	 * @return true, if is semantic leaf visual id
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case GeometryEditPart.VISUAL_ID:
			return false;
		case ConnectorEditPart.VISUAL_ID:
		case InputPointEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/** The Constant TYPED_INSTANCE. @generated */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		
		/**
		 * Gets the visual id.
		 *
		 * @param view the view
		 * @return the visual id
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return geometry.diagram.part.GeometryVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * Gets the model id.
		 *
		 * @param view the view
		 * @return the model id
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return geometry.diagram.part.GeometryVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * Gets the node visual id.
		 *
		 * @param containerView the container view
		 * @param domainElement the domain element
		 * @return the node visual id
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return geometry.diagram.part.GeometryVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * Check node visual id.
		 *
		 * @param containerView the container view
		 * @param domainElement the domain element
		 * @param candidate the candidate
		 * @return true, if successful
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return geometry.diagram.part.GeometryVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * Checks if is compartment visual id.
		 *
		 * @param visualID the visual id
		 * @return true, if is compartment visual id
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return geometry.diagram.part.GeometryVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * Checks if is semantic leaf visual id.
		 *
		 * @param visualID the visual id
		 * @return true, if is semantic leaf visual id
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return geometry.diagram.part.GeometryVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
