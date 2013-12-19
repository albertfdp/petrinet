package geometry.diagram.navigator;

import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.part.GeometryDiagramEditor;
import geometry.diagram.part.GeometryDiagramEditorPlugin;
import geometry.diagram.part.GeometryVisualIDRegistry;
import geometry.diagram.part.Messages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;
import org.eclipse.ui.part.FileEditorInput;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryNavigatorActionProvider.
 *
 * @generated
 */
public class GeometryNavigatorActionProvider extends CommonActionProvider {

	/** The my contribute. @generated */
	private boolean myContribute;

	/** The my open diagram action. @generated */
	private OpenDiagramAction myOpenDiagramAction;

	/**
	 * Inits the.
	 *
	 * @param aSite the a site
	 * @generated
	 */
	public void init(ICommonActionExtensionSite aSite) {
		super.init(aSite);
		if (aSite.getViewSite() instanceof ICommonViewerWorkbenchSite) {
			myContribute = true;
			makeActions((ICommonViewerWorkbenchSite) aSite.getViewSite());
		} else {
			myContribute = false;
		}
	}

	/**
	 * Make actions.
	 *
	 * @param viewerSite the viewer site
	 * @generated
	 */
	private void makeActions(ICommonViewerWorkbenchSite viewerSite) {
		myOpenDiagramAction = new OpenDiagramAction(viewerSite);
	}

	/**
	 * Fill action bars.
	 *
	 * @param actionBars the action bars
	 * @generated
	 */
	public void fillActionBars(IActionBars actionBars) {
		if (!myContribute) {
			return;
		}
		IStructuredSelection selection = (IStructuredSelection) getContext()
				.getSelection();
		myOpenDiagramAction.selectionChanged(selection);
		if (myOpenDiagramAction.isEnabled()) {
			actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN,
					myOpenDiagramAction);
		}
	}

	/**
	 * Fill context menu.
	 *
	 * @param menu the menu
	 * @generated
	 */
	public void fillContextMenu(IMenuManager menu) {
	}

	/**
	 * The Class OpenDiagramAction.
	 *
	 * @generated
	 */
	private static class OpenDiagramAction extends Action {

		/** The my diagram. @generated */
		private Diagram myDiagram;

		/** The my viewer site. @generated */
		private ICommonViewerWorkbenchSite myViewerSite;

		/**
		 * Instantiates a new open diagram action.
		 *
		 * @param viewerSite the viewer site
		 * @generated
		 */
		public OpenDiagramAction(ICommonViewerWorkbenchSite viewerSite) {
			super(Messages.NavigatorActionProvider_OpenDiagramActionName);
			myViewerSite = viewerSite;
		}

		/**
		 * Selection changed.
		 *
		 * @param selection the selection
		 * @generated
		 */
		public final void selectionChanged(IStructuredSelection selection) {
			myDiagram = null;
			if (selection.size() == 1) {
				Object selectedElement = selection.getFirstElement();
				if (selectedElement instanceof GeometryNavigatorItem) {
					selectedElement = ((GeometryNavigatorItem) selectedElement)
							.getView();
				} else if (selectedElement instanceof IAdaptable) {
					selectedElement = ((IAdaptable) selectedElement)
							.getAdapter(View.class);
				}
				if (selectedElement instanceof Diagram) {
					Diagram diagram = (Diagram) selectedElement;
					if (GeometryEditPart.MODEL_ID
							.equals(GeometryVisualIDRegistry
									.getModelID(diagram))) {
						myDiagram = diagram;
					}
				}
			}
			setEnabled(myDiagram != null);
		}

		/**
		 * Run.
		 *
		 * @generated
		 */
		public void run() {
			if (myDiagram == null || myDiagram.eResource() == null) {
				return;
			}

			IEditorInput editorInput = getEditorInput(myDiagram);
			IWorkbenchPage page = myViewerSite.getPage();
			try {
				page.openEditor(editorInput, GeometryDiagramEditor.ID);
			} catch (PartInitException e) {
				GeometryDiagramEditorPlugin.getInstance().logError(
						"Exception while openning diagram", e); //$NON-NLS-1$
			}
		}

		/**
		 * Gets the editor input.
		 *
		 * @param diagram the diagram
		 * @return the editor input
		 * @generated
		 */
		private static IEditorInput getEditorInput(Diagram diagram) {
			Resource diagramResource = diagram.eResource();
			for (EObject nextEObject : diagramResource.getContents()) {
				if (nextEObject == diagram) {
					return new FileEditorInput(
							WorkspaceSynchronizer.getFile(diagramResource));
				}
				if (nextEObject instanceof Diagram) {
					break;
				}
			}
			URI uri = EcoreUtil.getURI(diagram);
			String editorName = uri.lastSegment() + '#'
					+ diagram.eResource().getContents().indexOf(diagram);
			IEditorInput editorInput = new URIEditorInput(uri, editorName);
			return editorInput;
		}

	}

}
