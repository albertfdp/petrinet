package geometry.diagram.navigator;

import geometry.diagram.part.GeometryVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryNavigatorSorter.
 *
 * @generated
 */
public class GeometryNavigatorSorter extends ViewerSorter {

	/** The Constant GROUP_CATEGORY. @generated */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * Category.
	 *
	 * @param element the element
	 * @return the int
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof GeometryNavigatorItem) {
			GeometryNavigatorItem item = (GeometryNavigatorItem) element;
			return GeometryVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
