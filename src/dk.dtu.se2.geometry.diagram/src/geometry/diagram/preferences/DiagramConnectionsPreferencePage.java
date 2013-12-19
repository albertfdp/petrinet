package geometry.diagram.preferences;

import geometry.diagram.part.GeometryDiagramEditorPlugin;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

// TODO: Auto-generated Javadoc
/**
 * The Class DiagramConnectionsPreferencePage.
 *
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * Instantiates a new diagram connections preference page.
	 *
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(GeometryDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
