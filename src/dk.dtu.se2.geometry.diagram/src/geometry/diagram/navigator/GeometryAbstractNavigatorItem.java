package geometry.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryAbstractNavigatorItem.
 *
 * @generated
 */
public abstract class GeometryAbstractNavigatorItem extends PlatformObject {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { ITabbedPropertySheetPageContributor.class };
		final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {
			public String getContributorId() {
				return "dk.dtu.se2.geometry.diagram"; //$NON-NLS-1$
			}
		};
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof geometry.diagram.navigator.GeometryAbstractNavigatorItem
						&& adapterType == ITabbedPropertySheetPageContributor.class) {
					return propertySheetPageContributor;
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, geometry.diagram.navigator.GeometryAbstractNavigatorItem.class);
	}

	/** The my parent. @generated */
	private Object myParent;

	/**
	 * Instantiates a new geometry abstract navigator item.
	 *
	 * @param parent the parent
	 * @generated
	 */
	protected GeometryAbstractNavigatorItem(Object parent) {
		myParent = parent;
	}

	/**
	 * Gets the parent.
	 *
	 * @return the parent
	 * @generated
	 */
	public Object getParent() {
		return myParent;
	}

}
