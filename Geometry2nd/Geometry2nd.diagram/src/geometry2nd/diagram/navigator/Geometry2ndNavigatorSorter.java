package geometry2nd.diagram.navigator;

import geometry2nd.diagram.part.Geometry2ndVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Geometry2ndNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4011;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Geometry2ndNavigatorItem) {
			Geometry2ndNavigatorItem item = (Geometry2ndNavigatorItem) element;
			return Geometry2ndVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
