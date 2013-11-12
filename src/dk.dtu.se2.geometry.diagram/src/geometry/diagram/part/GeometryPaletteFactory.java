package geometry.diagram.part;

import geometry.diagram.providers.GeometryElementTypes;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class GeometryPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGeometry1Group());
	}

	/**
	 * Creates "geometry" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeometry1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Geometry1Group_title);
		paletteContainer.setId("createGeometry1Group"); //$NON-NLS-1$
		paletteContainer.add(createLine1CreationTool());
		paletteContainer.add(createConnector2CreationTool());
		paletteContainer.add(createInputPoint3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Line1CreationTool_title,
				Messages.Line1CreationTool_desc,
				Collections.singletonList(GeometryElementTypes.Line_4001));
		entry.setId("createLine1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes
				.getImageDescriptor(GeometryElementTypes.Line_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connector2CreationTool_title,
				Messages.Connector2CreationTool_desc,
				Collections.singletonList(GeometryElementTypes.Connector_2001));
		entry.setId("createConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes
				.getImageDescriptor(GeometryElementTypes.Connector_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPoint3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InputPoint3CreationTool_title,
				Messages.InputPoint3CreationTool_desc,
				Collections.singletonList(GeometryElementTypes.InputPoint_2002));
		entry.setId("createInputPoint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GeometryElementTypes
				.getImageDescriptor(GeometryElementTypes.InputPoint_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
