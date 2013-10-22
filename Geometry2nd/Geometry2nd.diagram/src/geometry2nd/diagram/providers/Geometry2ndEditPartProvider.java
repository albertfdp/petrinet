package geometry2nd.diagram.providers;

import geometry2nd.diagram.edit.parts.Geometry2ndEditPartFactory;
import geometry2nd.diagram.edit.parts.GeometryEditPart;
import geometry2nd.diagram.part.Geometry2ndVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class Geometry2ndEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public Geometry2ndEditPartProvider() {
		super(new Geometry2ndEditPartFactory(),
				Geometry2ndVisualIDRegistry.TYPED_INSTANCE,
				GeometryEditPart.MODEL_ID);
	}

}
