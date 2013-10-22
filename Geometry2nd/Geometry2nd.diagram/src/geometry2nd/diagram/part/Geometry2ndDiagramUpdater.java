package geometry2nd.diagram.part;

import geometry2nd.Connector;
import geometry2nd.GObject;
import geometry2nd.Geometry;
import geometry2nd.Geometry2ndPackage;
import geometry2nd.Line;
import geometry2nd.diagram.edit.parts.BendPointEditPart;
import geometry2nd.diagram.edit.parts.ConnectorEditPart;
import geometry2nd.diagram.edit.parts.ConnectorInEditPart;
import geometry2nd.diagram.edit.parts.ConnectorOutEditPart;
import geometry2nd.diagram.edit.parts.GeometryEditPart;
import geometry2nd.diagram.edit.parts.InputPointEditPart;
import geometry2nd.diagram.edit.parts.LineBeginEditPart;
import geometry2nd.diagram.edit.parts.LineEndEditPart;
import geometry2nd.diagram.providers.Geometry2ndElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Geometry2ndDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Geometry2ndNodeDescriptor> getSemanticChildren(View view) {
		switch (Geometry2ndVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndNodeDescriptor> getGeometry_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList<Geometry2ndNodeDescriptor> result = new LinkedList<Geometry2ndNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGObjects().iterator(); it
				.hasNext();) {
			GObject childElement = (GObject) it.next();
			int visualID = Geometry2ndVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new Geometry2ndNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputPointEditPart.VISUAL_ID) {
				result.add(new Geometry2ndNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BendPointEditPart.VISUAL_ID) {
				result.add(new Geometry2ndNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getContainedLinks(View view) {
		switch (Geometry2ndVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2003ContainedLinks(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001ContainedLinks(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getIncomingLinks(View view) {
		switch (Geometry2ndVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2003IncomingLinks(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001IncomingLinks(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getOutgoingLinks(View view) {
		switch (Geometry2ndVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2003OutgoingLinks(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001OutgoingLinks(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getGeometry_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getInputPoint_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getBendPoint_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getConnector_2003ContainedLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<Geometry2ndLinkDescriptor> result = new LinkedList<Geometry2ndLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_In_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_Out_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getInputPoint_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getBendPoint_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getConnector_2003IncomingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Geometry2ndLinkDescriptor> result = new LinkedList<Geometry2ndLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Line_End_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Line_Begin_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getInputPoint_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getBendPoint_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Geometry2ndLinkDescriptor> getIncomingFeatureModelFacetLinks_Line_End_4006(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Geometry2ndLinkDescriptor> result = new LinkedList<Geometry2ndLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Geometry2ndPackage.eINSTANCE
					.getLine_End()) {
				result.add(new Geometry2ndLinkDescriptor(setting.getEObject(),
						target, Geometry2ndElementTypes.LineEnd_4006,
						LineEndEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Geometry2ndLinkDescriptor> getIncomingFeatureModelFacetLinks_Line_Begin_4007(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Geometry2ndLinkDescriptor> result = new LinkedList<Geometry2ndLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Geometry2ndPackage.eINSTANCE
					.getLine_Begin()) {
				result.add(new Geometry2ndLinkDescriptor(setting.getEObject(),
						target, Geometry2ndElementTypes.LineBegin_4007,
						LineBeginEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Geometry2ndLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connector_In_4008(
			Connector source) {
		LinkedList<Geometry2ndLinkDescriptor> result = new LinkedList<Geometry2ndLinkDescriptor>();
		for (Iterator<?> destinations = source.getIn().iterator(); destinations
				.hasNext();) {
			Line destination = (Line) destinations.next();
			result.add(new Geometry2ndLinkDescriptor(source, destination,
					Geometry2ndElementTypes.ConnectorIn_4008,
					ConnectorInEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Geometry2ndLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connector_Out_4009(
			Connector source) {
		LinkedList<Geometry2ndLinkDescriptor> result = new LinkedList<Geometry2ndLinkDescriptor>();
		for (Iterator<?> destinations = source.getOut().iterator(); destinations
				.hasNext();) {
			Line destination = (Line) destinations.next();
			result.add(new Geometry2ndLinkDescriptor(source, destination,
					Geometry2ndElementTypes.ConnectorOut_4009,
					ConnectorOutEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Geometry2ndLinkDescriptor> getConnector_2003OutgoingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<Geometry2ndLinkDescriptor> result = new LinkedList<Geometry2ndLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_In_4008(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_Out_4009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Geometry2ndNodeDescriptor> getSemanticChildren(View view) {
			return Geometry2ndDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Geometry2ndLinkDescriptor> getContainedLinks(View view) {
			return Geometry2ndDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Geometry2ndLinkDescriptor> getIncomingLinks(View view) {
			return Geometry2ndDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Geometry2ndLinkDescriptor> getOutgoingLinks(View view) {
			return Geometry2ndDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
