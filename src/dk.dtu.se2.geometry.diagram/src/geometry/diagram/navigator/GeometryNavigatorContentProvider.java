package geometry.diagram.navigator;

import geometry.diagram.edit.parts.ConnectorEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.InputPointEditPart;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.part.GeometryVisualIDRegistry;
import geometry.diagram.part.Messages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryNavigatorContentProvider.
 *
 * @generated
 */
public class GeometryNavigatorContentProvider implements ICommonContentProvider {

	/** The Constant EMPTY_ARRAY. @generated */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/** The my viewer. @generated */
	private Viewer myViewer;

	/** The my editing domain. @generated */
	private AdapterFactoryEditingDomain myEditingDomain;

	/** The my workspace synchronizer. @generated */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/** The my viewer refresh runnable. @generated */
	private Runnable myViewerRefreshRunnable;

	/**
	 * Instantiates a new geometry navigator content provider.
	 *
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public GeometryNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * Dispose.
	 *
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * Input changed.
	 *
	 * @param viewer the viewer
	 * @param oldInput the old input
	 * @param newInput the new input
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * Unload all resources.
	 *
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * Async refresh.
	 *
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * Gets the elements.
	 *
	 * @param inputElement the input element
	 * @return the elements
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * Restore state.
	 *
	 * @param aMemento the a memento
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * Save state.
	 *
	 * @param aMemento the a memento
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * Inits the.
	 *
	 * @param aConfig the a config
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * Gets the children.
	 *
	 * @param parentElement the parent element
	 * @return the children
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<GeometryNavigatorItem> result = new ArrayList<GeometryNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, GeometryEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof GeometryNavigatorGroup) {
			GeometryNavigatorGroup group = (GeometryNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem navigatorItem = (GeometryNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * Gets the view children.
	 *
	 * @param view the view
	 * @param parentElement the parent element
	 * @return the view children
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {

		case GeometryEditPart.VISUAL_ID: {
			LinkedList<GeometryAbstractNavigatorItem> result = new LinkedList<GeometryAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			GeometryNavigatorGroup links = new GeometryNavigatorGroup(
					Messages.NavigatorGroupName_Geometry_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GeometryVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					GeometryVisualIDRegistry
							.getType(InputPointEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					GeometryVisualIDRegistry.getType(LineEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case ConnectorEditPart.VISUAL_ID: {
			LinkedList<GeometryAbstractNavigatorItem> result = new LinkedList<GeometryAbstractNavigatorItem>();
			Node sv = (Node) view;
			GeometryNavigatorGroup incominglinks = new GeometryNavigatorGroup(
					Messages.NavigatorGroupName_Connector_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GeometryNavigatorGroup outgoinglinks = new GeometryNavigatorGroup(
					Messages.NavigatorGroupName_Connector_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					GeometryVisualIDRegistry.getType(LineEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					GeometryVisualIDRegistry.getType(LineEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LineEditPart.VISUAL_ID: {
			LinkedList<GeometryAbstractNavigatorItem> result = new LinkedList<GeometryAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			GeometryNavigatorGroup target = new GeometryNavigatorGroup(
					Messages.NavigatorGroupName_Line_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			GeometryNavigatorGroup source = new GeometryNavigatorGroup(
					Messages.NavigatorGroupName_Line_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					GeometryVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					GeometryVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * Gets the links source by type.
	 *
	 * @param edges the edges
	 * @param type the type
	 * @return the links source by type
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * Gets the links target by type.
	 *
	 * @param edges the edges
	 * @param type the type
	 * @return the links target by type
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * Gets the outgoing links by type.
	 *
	 * @param nodes the nodes
	 * @param type the type
	 * @return the outgoing links by type
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * Gets the incoming links by type.
	 *
	 * @param nodes the nodes
	 * @param type the type
	 * @return the incoming links by type
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * Gets the children by type.
	 *
	 * @param nodes the nodes
	 * @param type the type
	 * @return the children by type
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * Gets the diagram links by type.
	 *
	 * @param diagrams the diagrams
	 * @param type the type
	 * @return the diagram links by type
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * Select views by type.
	 *
	 * @param views the views
	 * @param type the type
	 * @return the collection
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * Checks if is own view.
	 *
	 * @param view the view
	 * @return true, if is own view
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GeometryEditPart.MODEL_ID.equals(GeometryVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * Creates the navigator items.
	 *
	 * @param views the views
	 * @param parent the parent
	 * @param isLeafs the is leafs
	 * @return the collection
	 * @generated
	 */
	private Collection<GeometryNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<GeometryNavigatorItem> result = new ArrayList<GeometryNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new GeometryNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * Gets the parent.
	 *
	 * @param element the element
	 * @return the parent
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof GeometryAbstractNavigatorItem) {
			GeometryAbstractNavigatorItem abstractNavigatorItem = (GeometryAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * Checks for children.
	 *
	 * @param element the element
	 * @return true, if successful
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
