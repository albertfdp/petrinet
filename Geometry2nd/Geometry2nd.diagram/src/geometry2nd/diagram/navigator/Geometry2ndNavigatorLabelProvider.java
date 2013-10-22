package geometry2nd.diagram.navigator;

import geometry2nd.diagram.edit.parts.BendPointEditPart;
import geometry2nd.diagram.edit.parts.BendPointLabelEditPart;
import geometry2nd.diagram.edit.parts.ConnectorEditPart;
import geometry2nd.diagram.edit.parts.ConnectorInEditPart;
import geometry2nd.diagram.edit.parts.ConnectorLabelEditPart;
import geometry2nd.diagram.edit.parts.ConnectorOutEditPart;
import geometry2nd.diagram.edit.parts.GeometryEditPart;
import geometry2nd.diagram.edit.parts.InputPointEditPart;
import geometry2nd.diagram.edit.parts.InputPointLabelEditPart;
import geometry2nd.diagram.edit.parts.LineBeginEditPart;
import geometry2nd.diagram.edit.parts.LineEndEditPart;
import geometry2nd.diagram.part.Geometry2ndDiagramEditorPlugin;
import geometry2nd.diagram.part.Geometry2ndVisualIDRegistry;
import geometry2nd.diagram.providers.Geometry2ndElementTypes;
import geometry2nd.diagram.providers.Geometry2ndParserProvider;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Geometry2ndNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Geometry2ndDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Geometry2ndDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Geometry2ndNavigatorItem
				&& !isOwnView(((Geometry2ndNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Geometry2ndNavigatorGroup) {
			Geometry2ndNavigatorGroup group = (Geometry2ndNavigatorGroup) element;
			return Geometry2ndDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof Geometry2ndNavigatorItem) {
			Geometry2ndNavigatorItem navigatorItem = (Geometry2ndNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Geometry2ndVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://geometry2nd/1.0?Geometry", Geometry2ndElementTypes.Geometry_1000); //$NON-NLS-1$
		case InputPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry2nd/1.0?InputPoint", Geometry2ndElementTypes.InputPoint_2001); //$NON-NLS-1$
		case BendPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry2nd/1.0?BendPoint", Geometry2ndElementTypes.BendPoint_2002); //$NON-NLS-1$
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry2nd/1.0?Connector", Geometry2ndElementTypes.Connector_2003); //$NON-NLS-1$
		case LineEndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://geometry2nd/1.0?Line?end", Geometry2ndElementTypes.LineEnd_4006); //$NON-NLS-1$
		case LineBeginEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://geometry2nd/1.0?Line?begin", Geometry2ndElementTypes.LineBegin_4007); //$NON-NLS-1$
		case ConnectorInEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://geometry2nd/1.0?Connector?in", Geometry2ndElementTypes.ConnectorIn_4008); //$NON-NLS-1$
		case ConnectorOutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://geometry2nd/1.0?Connector?out", Geometry2ndElementTypes.ConnectorOut_4009); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Geometry2ndDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& Geometry2ndElementTypes.isKnownElementType(elementType)) {
			image = Geometry2ndElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Geometry2ndNavigatorGroup) {
			Geometry2ndNavigatorGroup group = (Geometry2ndNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Geometry2ndNavigatorItem) {
			Geometry2ndNavigatorItem navigatorItem = (Geometry2ndNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Geometry2ndVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000Text(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001Text(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2002Text(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2003Text(view);
		case LineEndEditPart.VISUAL_ID:
			return getLineEnd_4006Text(view);
		case LineBeginEditPart.VISUAL_ID:
			return getLineBegin_4007Text(view);
		case ConnectorInEditPart.VISUAL_ID:
			return getConnectorIn_4008Text(view);
		case ConnectorOutEditPart.VISUAL_ID:
			return getConnectorOut_4009Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getGeometry_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInputPoint_2001Text(View view) {
		IParser parser = Geometry2ndParserProvider.getParser(
				Geometry2ndElementTypes.InputPoint_2001,
				view.getElement() != null ? view.getElement() : view,
				Geometry2ndVisualIDRegistry
						.getType(InputPointLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Geometry2ndDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBendPoint_2002Text(View view) {
		IParser parser = Geometry2ndParserProvider.getParser(
				Geometry2ndElementTypes.BendPoint_2002,
				view.getElement() != null ? view.getElement() : view,
				Geometry2ndVisualIDRegistry
						.getType(BendPointLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Geometry2ndDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnector_2003Text(View view) {
		IParser parser = Geometry2ndParserProvider.getParser(
				Geometry2ndElementTypes.Connector_2003,
				view.getElement() != null ? view.getElement() : view,
				Geometry2ndVisualIDRegistry
						.getType(ConnectorLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Geometry2ndDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLineEnd_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLineBegin_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectorIn_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectorOut_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GeometryEditPart.MODEL_ID.equals(Geometry2ndVisualIDRegistry
				.getModelID(view));
	}

}
