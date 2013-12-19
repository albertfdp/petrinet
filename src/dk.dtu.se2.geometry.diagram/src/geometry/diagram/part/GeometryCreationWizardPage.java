package geometry.diagram.part;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryCreationWizardPage.
 *
 * @generated
 */
public class GeometryCreationWizardPage extends WizardNewFileCreationPage {

	/** The file extension. @generated */
	private final String fileExtension;

	/**
	 * Instantiates a new geometry creation wizard page.
	 *
	 * @param pageName the page name
	 * @param selection the selection
	 * @param fileExtension the file extension
	 * @generated
	 */
	public GeometryCreationWizardPage(String pageName,
			IStructuredSelection selection, String fileExtension) {
		super(pageName, selection);
		this.fileExtension = fileExtension;
	}

	/**
	 * Override to create files with this extension.
	 *
	 * @return the extension
	 * @generated
	 */
	protected String getExtension() {
		return fileExtension;
	}

	/**
	 * Gets the uri.
	 *
	 * @return the uri
	 * @generated
	 */
	public URI getURI() {
		return URI.createPlatformResourceURI(getFilePath().toString(), false);
	}

	/**
	 * Gets the file path.
	 *
	 * @return the file path
	 * @generated
	 */
	protected IPath getFilePath() {
		IPath path = getContainerFullPath();
		if (path == null) {
			path = new Path(""); //$NON-NLS-1$
		}
		String fileName = getFileName();
		if (fileName != null) {
			path = path.append(fileName);
		}
		return path;
	}

	/**
	 * Creates the control.
	 *
	 * @param parent the parent
	 * @generated
	 */
	public void createControl(Composite parent) {
		super.createControl(parent);
		setFileName(GeometryDiagramEditorUtil.getUniqueFileName(
				getContainerFullPath(), getFileName(), getExtension()));
		setPageComplete(validatePage());
	}

	/**
	 * Validate page.
	 *
	 * @return true, if successful
	 * @generated
	 */
	protected boolean validatePage() {
		if (!super.validatePage()) {
			return false;
		}
		String extension = getExtension();
		if (extension != null
				&& !getFilePath().toString().endsWith("." + extension)) {
			setErrorMessage(NLS.bind(
					Messages.GeometryCreationWizardPageExtensionError,
					extension));
			return false;
		}
		return true;
	}
}
