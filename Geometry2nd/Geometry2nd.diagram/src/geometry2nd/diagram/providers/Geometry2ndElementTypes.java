package geometry2nd.diagram.providers;

import geometry2nd.Geometry2ndPackage;
import geometry2nd.diagram.edit.parts.BendPointEditPart;
import geometry2nd.diagram.edit.parts.ConnectorEditPart;
import geometry2nd.diagram.edit.parts.ConnectorInEditPart;
import geometry2nd.diagram.edit.parts.ConnectorOutEditPart;
import geometry2nd.diagram.edit.parts.GeometryEditPart;
import geometry2nd.diagram.edit.parts.InputPointEditPart;
import geometry2nd.diagram.edit.parts.LineBeginEditPart;
import geometry2nd.diagram.edit.parts.LineEndEditPart;
import geometry2nd.diagram.part.Geometry2ndDiagramEditorPlugin;

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
public class Geometry2ndElementTypes {

	/**
	 * @generated
	 */
	private Geometry2ndElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			Geometry2ndDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Geometry_1000 = getElementType("Geometry2nd.diagram.Geometry_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InputPoint_2001 = getElementType("Geometry2nd.diagram.InputPoint_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BendPoint_2002 = getElementType("Geometry2nd.diagram.BendPoint_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectorIn_4008 = getElementType("Geometry2nd.diagram.ConnectorIn_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LineEnd_4006 = getElementType("Geometry2nd.diagram.LineEnd_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectorOut_4009 = getElementType("Geometry2nd.diagram.ConnectorOut_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LineBegin_4007 = getElementType("Geometry2nd.diagram.LineBegin_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connector_2003 = getElementType("Geometry2nd.diagram.Connector_2003"); //$NON-NLS-1$

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
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Geometry_1000,
					Geometry2ndPackage.eINSTANCE.getGeometry());

			elements.put(Connector_2003,
					Geometry2ndPackage.eINSTANCE.getConnector());

			elements.put(InputPoint_2001,
					Geometry2ndPackage.eINSTANCE.getInputPoint());

			elements.put(BendPoint_2002,
					Geometry2ndPackage.eINSTANCE.getBendPoint());

			elements.put(ConnectorIn_4008,
					Geometry2ndPackage.eINSTANCE.getConnector_In());

			elements.put(LineEnd_4006,
					Geometry2ndPackage.eINSTANCE.getLine_End());

			elements.put(ConnectorOut_4009,
					Geometry2ndPackage.eINSTANCE.getConnector_Out());

			elements.put(LineBegin_4007,
					Geometry2ndPackage.eINSTANCE.getLine_Begin());
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
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Geometry_1000);
			KNOWN_ELEMENT_TYPES.add(Connector_2003);
			KNOWN_ELEMENT_TYPES.add(InputPoint_2001);
			KNOWN_ELEMENT_TYPES.add(BendPoint_2002);
			KNOWN_ELEMENT_TYPES.add(ConnectorIn_4008);
			KNOWN_ELEMENT_TYPES.add(LineEnd_4006);
			KNOWN_ELEMENT_TYPES.add(ConnectorOut_4009);
			KNOWN_ELEMENT_TYPES.add(LineBegin_4007);
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
			return Connector_2003;
		case InputPointEditPart.VISUAL_ID:
			return InputPoint_2001;
		case BendPointEditPart.VISUAL_ID:
			return BendPoint_2002;
		case ConnectorInEditPart.VISUAL_ID:
			return ConnectorIn_4008;
		case LineEndEditPart.VISUAL_ID:
			return LineEnd_4006;
		case ConnectorOutEditPart.VISUAL_ID:
			return ConnectorOut_4009;
		case LineBeginEditPart.VISUAL_ID:
			return LineBegin_4007;
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
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return geometry2nd.diagram.providers.Geometry2ndElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return geometry2nd.diagram.providers.Geometry2ndElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return geometry2nd.diagram.providers.Geometry2ndElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
