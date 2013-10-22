package geometry.diagram.navigator;

import geometry.Line;
import geometry.diagram.edit.parts.BendPointEditPart;
import geometry.diagram.edit.parts.BendPointLabelEditPart;
import geometry.diagram.edit.parts.ConnectorEditPart;
import geometry.diagram.edit.parts.ConnectorLabelEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.InputPointEditPart;
import geometry.diagram.edit.parts.InputPointLabelEditPart;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.part.GeometryDiagramEditorPlugin;
import geometry.diagram.part.GeometryVisualIDRegistry;
import geometry.diagram.providers.GeometryElementTypes;
import geometry.diagram.providers.GeometryParserProvider;

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
public class GeometryNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		GeometryDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		GeometryDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof GeometryNavigatorItem
				&& !isOwnView(((GeometryNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GeometryNavigatorGroup) {
			GeometryNavigatorGroup group = (GeometryNavigatorGroup) element;
			return GeometryDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem navigatorItem = (GeometryNavigatorItem) element;
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
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://geometry/1.0?Geometry", GeometryElementTypes.Geometry_1000); //$NON-NLS-1$
		case InputPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry/1.0?InputPoint", GeometryElementTypes.InputPoint_2001); //$NON-NLS-1$
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry/1.0?Connector", GeometryElementTypes.Connector_2002); //$NON-NLS-1$
		case BendPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry/1.0?BendPoint", GeometryElementTypes.BendPoint_2003); //$NON-NLS-1$
		case LineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://geometry/1.0?Line", GeometryElementTypes.Line_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = GeometryDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& GeometryElementTypes.isKnownElementType(elementType)) {
			image = GeometryElementTypes.getImage(elementType);
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
		if (element instanceof GeometryNavigatorGroup) {
			GeometryNavigatorGroup group = (GeometryNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem navigatorItem = (GeometryNavigatorItem) element;
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
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000Text(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2001Text(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2002Text(view);
		case BendPointEditPart.VISUAL_ID:
			return getBendPoint_2003Text(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001Text(view);
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
		IParser parser = GeometryParserProvider.getParser(
				GeometryElementTypes.InputPoint_2001,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry
						.getType(InputPointLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnector_2002Text(View view) {
		IParser parser = GeometryParserProvider.getParser(
				GeometryElementTypes.Connector_2002,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry
						.getType(ConnectorLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBendPoint_2003Text(View view) {
		IParser parser = GeometryParserProvider.getParser(
				GeometryElementTypes.BendPoint_2003,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry
						.getType(BendPointLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLine_4001Text(View view) {
		Line domainModelElement = (Line) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getId());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
		return GeometryEditPart.MODEL_ID.equals(GeometryVisualIDRegistry
				.getModelID(view));
	}

}
