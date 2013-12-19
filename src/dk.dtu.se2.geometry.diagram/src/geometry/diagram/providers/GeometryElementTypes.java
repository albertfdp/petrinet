package geometry.diagram.providers;

import geometry.GeometryPackage;
import geometry.diagram.edit.parts.ConnectorEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.InputPointEditPart;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.part.GeometryDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryElementTypes.
 *
 * @generated
 */
public class GeometryElementTypes {

	/**
	 * Instantiates a new geometry element types.
	 *
	 * @generated
	 */
	private GeometryElementTypes() {
	}

	/** The elements. @generated */
	private static Map<IElementType, ENamedElement> elements;

	/** The element type images. @generated */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			GeometryDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/** The known element types. @generated */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/** The Constant Geometry_1000. @generated */
	public static final IElementType Geometry_1000 = getElementType("dk.dtu.se2.geometry.diagram.Geometry_1000"); //$NON-NLS-1$
	
	/** The Constant Connector_2001. @generated */
	public static final IElementType Connector_2001 = getElementType("dk.dtu.se2.geometry.diagram.Connector_2001"); //$NON-NLS-1$
	
	/** The Constant InputPoint_2002. @generated */
	public static final IElementType InputPoint_2002 = getElementType("dk.dtu.se2.geometry.diagram.InputPoint_2002"); //$NON-NLS-1$
	
	/** The Constant Line_4001. @generated */
	public static final IElementType Line_4001 = getElementType("dk.dtu.se2.geometry.diagram.Line_4001"); //$NON-NLS-1$

	/**
	 * Gets the image descriptor.
	 *
	 * @param element the element
	 * @return the image descriptor
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * Gets the image.
	 *
	 * @param element the element
	 * @return the image
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * Gets the image descriptor.
	 *
	 * @param hint the hint
	 * @return the image descriptor
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * Gets the image.
	 *
	 * @param hint the hint
	 * @return the image
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 *
	 * @param hint the hint
	 * @return the element
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Geometry_1000, GeometryPackage.eINSTANCE.getGeometry());

			elements.put(Connector_2001,
					GeometryPackage.eINSTANCE.getConnector());

			elements.put(InputPoint_2002,
					GeometryPackage.eINSTANCE.getInputPoint());

			elements.put(Line_4001, GeometryPackage.eINSTANCE.getLine());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * Gets the element type.
	 *
	 * @param id the id
	 * @return the element type
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * Checks if is known element type.
	 *
	 * @param elementType the element type
	 * @return true, if is known element type
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Geometry_1000);
			KNOWN_ELEMENT_TYPES.add(Connector_2001);
			KNOWN_ELEMENT_TYPES.add(InputPoint_2002);
			KNOWN_ELEMENT_TYPES.add(Line_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * Gets the element type.
	 *
	 * @param visualID the visual id
	 * @return the element type
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GeometryEditPart.VISUAL_ID:
			return Geometry_1000;
		case ConnectorEditPart.VISUAL_ID:
			return Connector_2001;
		case InputPointEditPart.VISUAL_ID:
			return InputPoint_2002;
		case LineEditPart.VISUAL_ID:
			return Line_4001;
		}
		return null;
	}

	/** The Constant TYPED_INSTANCE. @generated */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * Checks if is known element type.
		 *
		 * @param elementType the element type
		 * @return true, if is known element type
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return geometry.diagram.providers.GeometryElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * Gets the element type for visual id.
		 *
		 * @param visualID the visual id
		 * @return the element type for visual id
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return geometry.diagram.providers.GeometryElementTypes
					.getElementType(visualID);
		}

		/**
		 * Gets the defining named element.
		 *
		 * @param elementTypeAdapter the element type adapter
		 * @return the defining named element
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return geometry.diagram.providers.GeometryElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
