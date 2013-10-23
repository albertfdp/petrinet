package geometry.diagram.edit.policies;

import geometry.GeometryPackage;
import geometry.diagram.edit.parts.BendPointEditPart;
import geometry.diagram.edit.parts.ConnectorEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.InputPointEditPart;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.part.GeometryDiagramUpdater;
import geometry.diagram.part.GeometryLinkDescriptor;
import geometry.diagram.part.GeometryNodeDescriptor;
import geometry.diagram.part.GeometryVisualIDRegistry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

/**
 * @generated
 */
public class GeometryCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		List/*[?]*/c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	/**
	 * @generated
	 */
	protected EStructuralFeature getFeatureToSynchronize() {
		return GeometryPackage.eINSTANCE.getGeometry_GObject();
	}

	/**
	 * @generated
	 */

	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList/*[org.eclipse.emf.ecore.EObject]*/result = new LinkedList/*[org.eclipse.emf.ecore.EObject]*/();
		List/*[geometry.diagram.part.GeometryNodeDescriptor]*/childDescriptors = GeometryDiagramUpdater
				.getGeometry_1000SemanticChildren(viewObject);
		for (Iterator/*[geometry.diagram.part.GeometryNodeDescriptor]*/it = childDescriptors
				.iterator(); it.hasNext();) {
			GeometryNodeDescriptor d = (GeometryNodeDescriptor) it.next();
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(
			Collection/*[org.eclipse.emf.ecore.EObject]*/semanticChildren,
			final View view) {
		return isMyDiagramElement(view)
				&& !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = GeometryVisualIDRegistry.getVisualID(view);
		return visualID == ConnectorEditPart.VISUAL_ID
				|| visualID == InputPointEditPart.VISUAL_ID
				|| visualID == BendPointEditPart.VISUAL_ID;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/createdViews = new LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/();
		List/*[geometry.diagram.part.GeometryNodeDescriptor]*/childDescriptors = GeometryDiagramUpdater
				.getGeometry_1000SemanticChildren((View) getHost().getModel());
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/orphaned = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		// we care to check only views we recognize as ours
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/knownViewChildren = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = getViewChildren()
				.iterator(); it.hasNext();) {
			View v = (View) it.next();
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator/*[geometry.diagram.part.GeometryNodeDescriptor]*/descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			GeometryNodeDescriptor next = (GeometryNodeDescriptor) descriptorsIterator
					.next();
			String hint = GeometryVisualIDRegistry.getType(next.getVisualID());
			LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/perfectMatch = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/(); // both semanticElement and hint match that of NodeDescriptor
			for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = getViewChildren()
					.iterator(); it.hasNext();) {
				View childView = (View) it.next();
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList/*[org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor]*/viewDescriptors = new ArrayList/*[org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor]*/(
				childDescriptors.size());
		for (Iterator/*[geometry.diagram.part.GeometryNodeDescriptor]*/it = childDescriptors
				.iterator(); it.hasNext();) {
			GeometryNodeDescriptor next = (GeometryNodeDescriptor) it.next();
			String hint = GeometryVisualIDRegistry.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, false,
					host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(
					new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);

			List/*[org.eclipse.core.runtime.IAdaptable]*/nl = (List/*[org.eclipse.core.runtime.IAdaptable]*/) request
					.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection/*[org.eclipse.core.runtime.IAdaptable]*/createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.core.runtime.IAdaptable]*/refreshConnections() {
		Domain2Notation domain2NotationMap = new Domain2Notation();
		Collection/*[geometry.diagram.part.GeometryLinkDescriptor]*/linkDescriptors = collectAllLinks(
				getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = GeometryVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator/*[geometry.diagram.part.GeometryLinkDescriptor]*/linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				GeometryLinkDescriptor nextLinkDescriptor = (GeometryLinkDescriptor) linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection/*[geometry.diagram.part.GeometryLinkDescriptor]*/collectAllLinks(
			View view, Domain2Notation domain2NotationMap) {
		if (!GeometryEditPart.MODEL_ID.equals(GeometryVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/result = new LinkedList/*[geometry.diagram.part.GeometryLinkDescriptor]*/();
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(GeometryDiagramUpdater
						.getGeometry_1000ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case ConnectorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(GeometryDiagramUpdater
						.getConnector_2002ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case InputPointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(GeometryDiagramUpdater
						.getInputPoint_2001ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case BendPointEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(GeometryDiagramUpdater
						.getBendPoint_2003ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		case LineEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(GeometryDiagramUpdater
						.getLine_4001ContainedLinks(view));
			}
			domain2NotationMap.putView(view.getElement(), view);
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.core.runtime.IAdaptable]*/createConnections(
			Collection/*[geometry.diagram.part.GeometryLinkDescriptor]*/linkDescriptors,
			Domain2Notation domain2NotationMap) {
		LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/adapters = new LinkedList/*[org.eclipse.core.runtime.IAdaptable]*/();
		for (Iterator/*[geometry.diagram.part.GeometryLinkDescriptor]*/it = linkDescriptors
				.iterator(); it.hasNext();) {
			GeometryLinkDescriptor nextLinkDescriptor = (GeometryLinkDescriptor) it
					.next();
			EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor,
					domain2NotationMap);
			EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor,
					domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					GeometryVisualIDRegistry.getType(nextLinkDescriptor
							.getVisualID()), ViewUtil.APPEND, false,
					((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Domain2Notation domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry()
					.get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private EditPart getSourceEditPart(UpdaterLinkDescriptor descriptor,
			Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getSource(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private EditPart getTargetEditPart(UpdaterLinkDescriptor descriptor,
			Domain2Notation domain2NotationMap) {
		return getEditPart(descriptor.getDestination(), domain2NotationMap);
	}

	/**
	 * @generated
	 */
	protected final EditPart getHintedEditPart(EObject domainModelElement,
			Domain2Notation domain2NotationMap, int hintVisualId) {
		View view = (View) domain2NotationMap.getHinted(domainModelElement,
				GeometryVisualIDRegistry.getType(hintVisualId));
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry()
					.get(view);
		}
		return null;
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("serial")
	protected static class Domain2Notation extends HashMap/*[org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View]*/{
		/**
		 * @generated
		 */
		public boolean containsDomainElement(EObject domainElement) {
			return this.containsKey(domainElement);
		}

		/**
		 * @generated
		 */
		public View getHinted(EObject domainEObject, String hint) {
			return (View) this.get(domainEObject);
		}

		/**
		 * @generated
		 */
		public void putView(EObject domainElement, View view) {
			if (!containsKey(view.getElement())) {
				this.put(domainElement, view);
			}
		}

	}
}
