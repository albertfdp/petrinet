package geometry.diagram.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryLinkDescriptor.
 *
 * @generated
 */
public class GeometryLinkDescriptor extends UpdaterLinkDescriptor {
	
	/**
	 * Instantiates a new geometry link descriptor.
	 *
	 * @param source the source
	 * @param destination the destination
	 * @param elementType the element type
	 * @param linkVID the link vid
	 * @generated
	 */
	public GeometryLinkDescriptor(EObject source, EObject destination,
			IElementType elementType, int linkVID) {
		super(source, destination, elementType, linkVID);
	}

	/**
	 * Instantiates a new geometry link descriptor.
	 *
	 * @param source the source
	 * @param destination the destination
	 * @param linkElement the link element
	 * @param elementType the element type
	 * @param linkVID the link vid
	 * @generated
	 */
	public GeometryLinkDescriptor(EObject source, EObject destination,
			EObject linkElement, IElementType elementType, int linkVID) {
		super(source, destination, linkElement, elementType, linkVID);
	}

}
