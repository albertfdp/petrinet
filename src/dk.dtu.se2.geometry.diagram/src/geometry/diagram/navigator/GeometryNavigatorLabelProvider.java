package geometry.diagram.navigator;

import geometry.Connector;
import geometry.InputPoint;
import geometry.Line;
import geometry.diagram.edit.parts.ConnectorEditPart;
import geometry.diagram.edit.parts.ConnectorLabelEditPart;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.InputPointEditPart;
import geometry.diagram.edit.parts.InputPointLabelAppearanceLabelEditPart;
import geometry.diagram.edit.parts.InputPointLabelEditPart;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.edit.parts.LineLabelAppearanceLabelTokEditPart;
import geometry.diagram.edit.parts.LineLabelEditPart;
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

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryNavigatorLabelProvider.
 *
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
	 * Update label.
	 *
	 * @param label the label
	 * @param elementPath the element path
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
	 * Gets the image.
	 *
	 * @param element the element
	 * @return the image
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
	 * Gets the image.
	 *
	 * @param view the view
	 * @return the image
	 * @generated
	 */
	public Image getImage(View view) {
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://geometry/1.0?Geometry", GeometryElementTypes.Geometry_1000); //$NON-NLS-1$
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry/1.0?Connector", GeometryElementTypes.Connector_2001); //$NON-NLS-1$
		case InputPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://geometry/1.0?InputPoint", GeometryElementTypes.InputPoint_2002); //$NON-NLS-1$
		case LineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://geometry/1.0?Line", GeometryElementTypes.Line_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * Gets the image.
	 *
	 * @param key the key
	 * @param elementType the element type
	 * @return the image
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
	 * Gets the text.
	 *
	 * @param element the element
	 * @return the text
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
	 * Gets the text.
	 *
	 * @param view the view
	 * @return the text
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (GeometryVisualIDRegistry.getVisualID(view)) {
		case GeometryEditPart.VISUAL_ID:
			return getGeometry_1000Text(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2001Text(view);
		case InputPointEditPart.VISUAL_ID:
			return getInputPoint_2002Text(view);
		case LineEditPart.VISUAL_ID:
			return getLine_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * Gets the geometry_1000 text.
	 *
	 * @param view the view
	 * @return the geometry_1000 text
	 * @generated
	 */
	private String getGeometry_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * Gets the connector_2001 text.
	 *
	 * @param view the view
	 * @return the connector_2001 text
	 * @generated
	 */
	private String getConnector_2001Text(View view) {
		IParser parser = GeometryParserProvider.getParser(
				GeometryElementTypes.Connector_2001,
				view.getElement() != null ? view.getElement() : view,
				GeometryVisualIDRegistry
						.getType(ConnectorLabelEditPart.VISUAL_ID));
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
	 * Gets the input point_2002 text.
	 *
	 * @param view the view
	 * @return the input point_2002 text
	 * @generated
	 */
	private String getInputPoint_2002Text(View view) {
		IParser parser = GeometryParserProvider
				.getParser(
						GeometryElementTypes.InputPoint_2002,
						view.getElement() != null ? view.getElement() : view,
						GeometryVisualIDRegistry
								.getType(InputPointLabelAppearanceLabelEditPart.VISUAL_ID));
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
	 * Gets the line_4001 text.
	 *
	 * @param view the view
	 * @return the line_4001 text
	 * @generated
	 */
	private String getLine_4001Text(View view) {
		IParser parser = GeometryParserProvider
				.getParser(
						GeometryElementTypes.Line_4001,
						view.getElement() != null ? view.getElement() : view,
						GeometryVisualIDRegistry
								.getType(LineLabelAppearanceLabelTokEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			GeometryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * Gets the unknown element text.
	 *
	 * @param view the view
	 * @return the unknown element text
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * Gets the unresolved domain element proxy text.
	 *
	 * @param view the view
	 * @return the unresolved domain element proxy text
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * Inits the.
	 *
	 * @param aConfig the a config
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * Restore state.
	 *
	 * @param aMemento the a memento
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * Save state.
	 *
	 * @param aMemento the a memento
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * Gets the description.
	 *
	 * @param anElement the an element
	 * @return the description
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * Checks if is own view.
	 *
	 * @param view the view
	 * @return true, if is own view
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return GeometryEditPart.MODEL_ID.equals(GeometryVisualIDRegistry
				.getModelID(view));
	}

}
