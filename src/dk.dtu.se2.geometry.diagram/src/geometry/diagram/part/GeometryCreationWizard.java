package geometry.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryCreationWizard.
 *
 * @generated
 */
public class GeometryCreationWizard extends Wizard implements INewWizard {

	/** The workbench. @generated */
	private IWorkbench workbench;

	/** The selection. @generated */
	protected IStructuredSelection selection;

	/** The diagram model file page. @generated */
	protected GeometryCreationWizardPage diagramModelFilePage;

	/** The domain model file page. @generated */
	protected GeometryCreationWizardPage domainModelFilePage;

	/** The diagram. @generated */
	protected Resource diagram;

	/** The open newly created diagram editor. @generated */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * Gets the workbench.
	 *
	 * @return the workbench
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * Gets the selection.
	 *
	 * @return the selection
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * Gets the diagram.
	 *
	 * @return the diagram
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * Checks if is open newly created diagram editor.
	 *
	 * @return true, if is open newly created diagram editor
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * Sets the open newly created diagram editor.
	 *
	 * @param openNewlyCreatedDiagramEditor the new open newly created diagram editor
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * Inits the.
	 *
	 * @param workbench the workbench
	 * @param selection the selection
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.GeometryCreationWizardTitle);
		setDefaultPageImageDescriptor(GeometryDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewGeometryWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * Adds the pages.
	 *
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new GeometryCreationWizardPage(
				"DiagramModelFile", getSelection(), "geometry_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.GeometryCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.GeometryCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new GeometryCreationWizardPage(
				"DomainModelFile", getSelection(), "geometry") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".geometry_diagram".length()); //$NON-NLS-1$
					setFileName(GeometryDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, "geometry")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Messages.GeometryCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.GeometryCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * Perform finish.
	 *
	 * @return true, if successful
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = GeometryDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						GeometryDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.GeometryCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.GeometryCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				GeometryDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
