package geometry.diagram.providers;

import geometry.diagram.part.GeometryDiagramEditorPlugin;

// TODO: Auto-generated Javadoc
/**
 * The Class ElementInitializers.
 *
 * @generated
 */
public class ElementInitializers {

	/**
	 * Instantiates a new element initializers.
	 */
	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * Gets the single instance of ElementInitializers.
	 *
	 * @return single instance of ElementInitializers
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = GeometryDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			GeometryDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
