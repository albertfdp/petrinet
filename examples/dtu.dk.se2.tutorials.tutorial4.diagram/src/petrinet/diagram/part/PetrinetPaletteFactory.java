package petrinet.diagram.part;

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

import petrinet.diagram.providers.PetrinetElementTypes;

/**
 * @generated
 */
public class PetrinetPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPetrinet1Group());
	}

	/**
	 * Creates "petrinet" palette tool group
	 * @generated
	 */
	private PaletteContainer createPetrinet1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Petrinet1Group_title);
		paletteContainer.setId("createPetrinet1Group"); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		paletteContainer.add(createPlace2CreationTool());
		paletteContainer.add(createToken3CreationTool());
		paletteContainer.add(createArc4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Transition1CreationTool_title,
				Messages.Transition1CreationTool_desc,
				Collections.singletonList(PetrinetElementTypes.Transition_2002));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetrinetElementTypes
				.getImageDescriptor(PetrinetElementTypes.Transition_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlace2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Place2CreationTool_title,
				Messages.Place2CreationTool_desc,
				Collections.singletonList(PetrinetElementTypes.Place_2001));
		entry.setId("createPlace2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetrinetElementTypes
				.getImageDescriptor(PetrinetElementTypes.Place_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createToken3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Token3CreationTool_title,
				Messages.Token3CreationTool_desc,
				Collections.singletonList(PetrinetElementTypes.Token_3001));
		entry.setId("createToken3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetrinetElementTypes
				.getImageDescriptor(PetrinetElementTypes.Token_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArc4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Arc4CreationTool_title,
				Messages.Arc4CreationTool_desc,
				Collections.singletonList(PetrinetElementTypes.Arc_4001));
		entry.setId("createArc4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PetrinetElementTypes
				.getImageDescriptor(PetrinetElementTypes.Arc_4001));
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
