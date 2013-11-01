package geometry.diagram.part;

import geometry.Connector;
import geometry.GObject;
import geometry.Geometry;
import geometry.GeometryPackage;
import geometry.Line;
import geometry.diagram.edit.parts.BendPointEditPart;
import geometry.diagram.edit.parts.ConnectorEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.InputPointEditPart;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.providers.GeometryElementTypes;

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

/**
 * @generated
 */
public class GeometryDiagramUpdater {

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryNodeDescriptor]*/getSemanticChildren(
			View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryNodeDescriptor]*/getGeometry_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList/*[geometry.diagram.part.GeometryNodeDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getGObject().iterator(); it
				.hasNext();) {
			GObject childElement = (GObject) it.next();
			int visualID = GeometryVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new GeometryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InputPointEditPart.VISUAL_ID) {
				result.add(new GeometryNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == BendPointEditPart.VISUAL_ID) {
				result.add(new GeometryNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getContainedLinks(
			View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2002ContainedLinks(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001ContainedLinks(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2003ContainedLinks(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getIncomingLinks(
			View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2002IncomingLinks(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001IncomingLinks(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2003IncomingLinks(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getOutgoingLinks(
			View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2002OutgoingLinks(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001OutgoingLinks(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2003OutgoingLinks(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getGeometry_1000ContainedLinks(
			View view) {
		Geometry modelElement = (Geometry) view.getElement();
		LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_Line_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getInputPoint_2001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getConnector_2002ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getBendPoint_2003ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getLine_4001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getInputPoint_2001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getConnector_2002IncomingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_Line_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getBendPoint_2003IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getLine_4001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getInputPoint_2001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getConnector_2002OutgoingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/();
		result.addAll(getOutgoingTypeModelFacetLinks_Line_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getBendPoint_2003OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[geometry.diagram.part.GeometryLinkDescriptor]*/getLine_4001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection/*[geometry.diagram.part.GeometryLinkDescriptor]*/getContainedTypeModelFacetLinks_Line_4001(
			Geometry container) {
		LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/();
		for (Iterator/*[?]*/links = container.getGObject().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Line) {
				continue;
			}
			Line link = (Line) linkObject;
			if (LineEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connector dst = link.getEnd();
			Connector src = link.getBegin();
			result.add(new GeometryLinkDescriptor(src, dst, link,
					GeometryElementTypes.Line_4001, LineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[geometry.diagram.part.GeometryLinkDescriptor]*/getIncomingTypeModelFacetLinks_Line_4001(
			Connector target,
			Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences) {
		LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/();
		Collection/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/settings = (Collection) crossReferences
				.get(target);
		for (Iterator/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/it = settings
				.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != GeometryPackage.eINSTANCE
					.getLine_End()
					|| false == setting.getEObject() instanceof Line) {
				continue;
			}
			Line link = (Line) setting.getEObject();
			if (LineEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connector src = link.getBegin();
			result.add(new GeometryLinkDescriptor(src, target, link,
					GeometryElementTypes.Line_4001, LineEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[geometry.diagram.part.GeometryLinkDescriptor]*/getOutgoingTypeModelFacetLinks_Line_4001(
			Connector source) {
		Geometry container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Geometry) {
				container = (Geometry) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/();
		for (Iterator/*[?]*/links = container.getGObject().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Line) {
				continue;
			}
			Line link = (Line) linkObject;
			if (LineEditPart.VISUAL_ID != GeometryVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Connector dst = link.getEnd();
			Connector src = link.getBegin();
			if (src != source) {
				continue;
			}
			result.add(new GeometryLinkDescriptor(src, dst, link,
					GeometryElementTypes.Line_4001, LineEditPart.VISUAL_ID));
		}
		return result;
	}

}
