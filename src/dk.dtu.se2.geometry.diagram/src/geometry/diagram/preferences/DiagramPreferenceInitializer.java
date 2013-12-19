package geometry.diagram.preferences;

import geometry.diagram.part.GeometryDiagramEditorPlugin;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

// TODO: Auto-generated Javadoc
/**
 * The Class DiagramPreferenceInitializer.
 *
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * Initialize default preferences.
	 *
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		DiagramGeneralPreferencePage.initDefaults(store);
		DiagramAppearancePreferencePage.initDefaults(store);
		DiagramConnectionsPreferencePage.initDefaults(store);
		DiagramPrintingPreferencePage.initDefaults(store);
		DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	 * Gets the preference store.
	 *
	 * @return the preference store
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return GeometryDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
