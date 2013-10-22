package geometry2nd.diagram.providers;

import geometry2nd.diagram.part.Geometry2ndDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Geometry2ndDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Geometry2ndDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
