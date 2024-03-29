package appearance.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * Allows customization of the cell editor
 * 
 * @author Morten
 *
 */
public class CustomizedAdapterFactoryContentProvider implements
		IPropertySourceProvider {
	
	private AdapterFactory adapterFactory;
	
	public CustomizedAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		// TODO Auto-generated constructor stub
		this.adapterFactory = adapterFactory;
	}

	@Override
	public IPropertySource getPropertySource(Object object) {
		if (object instanceof IPropertySource) {
			return (IPropertySource) object;
		} else {
			IItemPropertySource itemPropertySource = (IItemPropertySource) (object instanceof EObject
					&& ((EObject) object).eClass() == null ? null
					: adapterFactory.adapt(object, IItemPropertySource.class));
 
			return itemPropertySource != null ? createPropertySource(object,
					itemPropertySource) : null;
		}
	}
 
	protected IPropertySource createPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		// Returns the custom property source
		return new CustomPropertySource(object, itemPropertySource);
	}

}
