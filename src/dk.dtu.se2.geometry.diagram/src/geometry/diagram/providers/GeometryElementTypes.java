package geometry.diagram.providers;

import geometry.GeometryPackage;
import geometry.diagram.edit.parts.BendPointEditPart;
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

/**
 * @generated
 */
public class GeometryElementTypes {

	/**
	 * @generated
	 */
	private GeometryElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map/*[org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement]*/elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			GeometryDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Geometry_1000 = getElementType("Geometry.diagram.Geometry_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPoint_2001 = getElementType("Geometry.diagram.InputPoint_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connector_2002 = getElementType("Geometry.diagram.Connector_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BendPoint_2003 = getElementType("Geometry.diagram.BendPoint_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Line_4001 = getElementType("Geometry.diagram.Line_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap/*[org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement]*/();

			elements.put(Geometry_1000, GeometryPackage.eINSTANCE.getGeometry());

			elements.put(Connector_2002,
					GeometryPackage.eINSTANCE.getConnector());

			elements.put(InputPoint_2001,
					GeometryPackage.eINSTANCE.getInputPoint());

			elements.put(BendPoint_2003,
					GeometryPackage.eINSTANCE.getBendPoint());

			elements.put(Line_4001, GeometryPackage.eINSTANCE.getLine());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
			KNOWN_ELEMENT_TYPES.add(Geometry_1000);
			KNOWN_ELEMENT_TYPES.add(Connector_2002);
			KNOWN_ELEMENT_TYPES.add(InputPoint_2001);
			KNOWN_ELEMENT_TYPES.add(BendPoint_2003);
			KNOWN_ELEMENT_TYPES.add(Line_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case GeometryEditPart.VISUAL_ID:
			return Geometry_1000;
		case ConnectorEditPart.VISUAL_ID:
			return Connector_2002;
		case InputPointEditPart.VISUAL_ID:
			return InputPoint_2001;
		case BendPointEditPart.VISUAL_ID:
			return BendPoint_2003;
		case LineEditPart.VISUAL_ID:
			return Line_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */

		public boolean isKnownElementType(IElementType elementType) {
			return geometry.diagram.providers.GeometryElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */

		public IElementType getElementTypeForVisualId(int visualID) {
			return geometry.diagram.providers.GeometryElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */

		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return geometry.diagram.providers.GeometryElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
