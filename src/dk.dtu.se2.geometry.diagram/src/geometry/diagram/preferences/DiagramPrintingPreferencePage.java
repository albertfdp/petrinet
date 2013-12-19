package geometry.diagram.preferences;

import geometry.diagram.part.GeometryDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage;

// TODO: Auto-generated Javadoc
/**
 * The Class DiagramPrintingPreferencePage.
 *
 * @generated
 */
public class DiagramPrintingPreferencePage extends PrintingPreferencePage {

	/**
	 * Instantiates a new diagram printing preference page.
	 *
	 * @generated
	 */
	public DiagramPrintingPreferencePage() {
		setPreferenceStore(GeometryDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
