package geometry.diagram.navigator;

import geometry.diagram.part.GeometryDiagramEditorPlugin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryDomainNavigatorContentProvider.
 *
 * @generated
 */
public class GeometryDomainNavigatorContentProvider implements
		ICommonContentProvider {

	/** The my adapter fctory content provier. @generated */
	private AdapterFactoryContentProvider myAdapterFctoryContentProvier;

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
	 * Instantiates a new geometry domain navigator content provider.
	 *
	 * @generated
	 */
	public GeometryDomainNavigatorContentProvider() {
		myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(
				GeometryDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
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
			return wrapEObjects(
					myAdapterFctoryContentProvier.getChildren(resource),
					parentElement);
		}

		if (parentElement instanceof GeometryDomainNavigatorItem) {
			return wrapEObjects(
					myAdapterFctoryContentProvier.getChildren(((GeometryDomainNavigatorItem) parentElement)
							.getEObject()), parentElement);
		}
		return EMPTY_ARRAY;
	}

	/**
	 * Wrap e objects.
	 *
	 * @param objects the objects
	 * @param parentElement the parent element
	 * @return the object[]
	 * @generated
	 */
	public Object[] wrapEObjects(Object[] objects, Object parentElement) {
		Collection result = new ArrayList();
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof EObject) {
				result.add(new GeometryDomainNavigatorItem(
						(EObject) objects[i], parentElement,
						myAdapterFctoryContentProvier));
			}
		}
		return result.toArray();
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
