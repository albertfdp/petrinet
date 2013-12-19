package geometry.diagram.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

// TODO: Auto-generated Javadoc
/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	 * Instantiates a new model element selection page.
	 *
	 * @param pageName the page name
	 * @generated
	 */
	public ModelElementSelectionPage(String pageName) {
		super(GeometryDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory(), pageName);
	}

	/**
	 * Override to provide custom model element description.
	 *
	 * @return the selection title
	 * @generated
	 */
	protected String getSelectionTitle() {
		return Messages.ModelElementSelectionPageMessage;
	}

}
