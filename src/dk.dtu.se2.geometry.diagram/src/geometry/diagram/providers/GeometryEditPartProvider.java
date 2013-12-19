package geometry.diagram.providers;

import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.GeometryEditPartFactory;
import geometry.diagram.part.GeometryVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryEditPartProvider.
 *
 * @generated
 */
public class GeometryEditPartProvider extends DefaultEditPartProvider {

	/**
	 * Instantiates a new geometry edit part provider.
	 *
	 * @generated
	 */
	public GeometryEditPartProvider() {
		super(new GeometryEditPartFactory(),
				GeometryVisualIDRegistry.TYPED_INSTANCE,
				GeometryEditPart.MODEL_ID);
	}

}
