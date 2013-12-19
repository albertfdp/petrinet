package geometry.diagram.preferences;

import geometry.diagram.part.GeometryDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;

// TODO: Auto-generated Javadoc
/**
 * The Class DiagramAppearancePreferencePage.
 *
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	 * Instantiates a new diagram appearance preference page.
	 *
	 * @generated
	 */
	public DiagramAppearancePreferencePage() {
		setPreferenceStore(GeometryDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
