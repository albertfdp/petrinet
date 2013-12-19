package geometry.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryDomainNavigatorItem.
 *
 * @generated
 */
public class GeometryDomainNavigatorItem extends PlatformObject {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { EObject.class,
				IPropertySource.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof geometry.diagram.navigator.GeometryDomainNavigatorItem) {
					geometry.diagram.navigator.GeometryDomainNavigatorItem domainNavigatorItem = (geometry.diagram.navigator.GeometryDomainNavigatorItem) adaptableObject;
					EObject eObject = domainNavigatorItem.getEObject();
					if (adapterType == EObject.class) {
						return eObject;
					}
					if (adapterType == IPropertySource.class) {
						return domainNavigatorItem.getPropertySourceProvider()
								.getPropertySource(eObject);
					}
				}

				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, geometry.diagram.navigator.GeometryDomainNavigatorItem.class);
	}

	/** The my parent. @generated */
	private Object myParent;

	/** The my e object. @generated */
	private EObject myEObject;

	/** The my property source provider. @generated */
	private IPropertySourceProvider myPropertySourceProvider;

	/**
	 * Instantiates a new geometry domain navigator item.
	 *
	 * @param eObject the e object
	 * @param parent the parent
	 * @param propertySourceProvider the property source provider
	 * @generated
	 */
	public GeometryDomainNavigatorItem(EObject eObject, Object parent,
			IPropertySourceProvider propertySourceProvider) {
		myParent = parent;
		myEObject = eObject;
		myPropertySourceProvider = propertySourceProvider;
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

	/**
	 * Gets the e object.
	 *
	 * @return the e object
	 * @generated
	 */
	public EObject getEObject() {
		return myEObject;
	}

	/**
	 * Gets the property source provider.
	 *
	 * @return the property source provider
	 * @generated
	 */
	public IPropertySourceProvider getPropertySourceProvider() {
		return myPropertySourceProvider;
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof geometry.diagram.navigator.GeometryDomainNavigatorItem) {
			return EcoreUtil
					.getURI(getEObject())
					.equals(EcoreUtil
							.getURI(((geometry.diagram.navigator.GeometryDomainNavigatorItem) obj)
									.getEObject()));
		}
		return super.equals(obj);
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getEObject()).hashCode();
	}

}
