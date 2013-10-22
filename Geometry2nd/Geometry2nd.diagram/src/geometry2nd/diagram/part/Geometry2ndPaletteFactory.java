package geometry2nd.diagram.part;

import geometry2nd.diagram.providers.Geometry2ndElementTypes;

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
public class Geometry2ndPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createGeometry2nd1Group());
	}

	/**
	 * Creates "geometry2nd" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeometry2nd1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Geometry2nd1Group_title);
		paletteContainer.setId("createGeometry2nd1Group"); //$NON-NLS-1$
		paletteContainer.add(createLine1CreationTool());
		paletteContainer.add(createInputPoint2CreationTool());
		paletteContainer.add(createConnector3CreationTool());
		paletteContainer.add(createBendPoint4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLine1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Line1CreationTool_title,
				Messages.Line1CreationTool_desc,
				Collections
						.singletonList(Geometry2ndElementTypes.Connector_2003));
		entry.setId("createLine1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Geometry2ndElementTypes
				.getImageDescriptor(Geometry2ndElementTypes.Connector_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPoint2CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.InputPoint2CreationTool_title,
				Messages.InputPoint2CreationTool_desc, null, null) {
		};
		entry.setId("createInputPoint2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connector3CreationTool_title,
				Messages.Connector3CreationTool_desc,
				Collections
						.singletonList(Geometry2ndElementTypes.InputPoint_2001));
		entry.setId("createConnector3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Geometry2ndElementTypes
				.getImageDescriptor(Geometry2ndElementTypes.InputPoint_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBendPoint4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BendPoint4CreationTool_title,
				Messages.BendPoint4CreationTool_desc,
				Collections
						.singletonList(Geometry2ndElementTypes.BendPoint_2002));
		entry.setId("createBendPoint4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Geometry2ndElementTypes
				.getImageDescriptor(Geometry2ndElementTypes.BendPoint_2002));
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
