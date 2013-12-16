package appearance.presentation;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import appearance.AppearancePackage;

/**
 * Allows customization of the property
 * 
 * @author Morten
 *
 */
 
public class CustomPropertySource extends PropertySource {
 
	public CustomPropertySource(Object object,
			IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}
 
	@Override
	protected IPropertyDescriptor createPropertyDescriptor(
			IItemPropertyDescriptor itemPropertyDescriptor) {
		AppearancePackage pkg = AppearancePackage.eINSTANCE;
		Object feature = itemPropertyDescriptor.getFeature(object);
		if (pkg.getAObject_Object3D().equals(feature) || pkg.getAObject_Texture().equals(feature)) {
			return new CustomPropertyDescriptor(object, itemPropertyDescriptor);
		}
		// Other cases to handle ?
		// else if (pkg.get<AnotherFeature>().equals(feature)) {
		//	return myPropertyDescriptor(object, itemPropertyDescriptor); 
		// }
		// Else, default EMF behavior
		else {
			return super.createPropertyDescriptor(itemPropertyDescriptor);
		}
	}
 
}
