/**
 */
package geometry_model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import geometry_model.Geometry;
import geometry_model.Geometry_modelFactory;
import geometry_model.Geometry_modelPackage;
import commands.CreateGObjectWIDCommand;

/**
 * This is the item provider adapter for a {@link geometry_model.Geometry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometryItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Geometry_modelPackage.Literals.GEOMETRY__EREFERENCE0);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Geometry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Geometry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Geometry_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Geometry.class)) {
			case Geometry_modelPackage.GEOMETRY__EREFERENCE0:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Geometry_modelPackage.Literals.GEOMETRY__EREFERENCE0,
				 Geometry_modelFactory.eINSTANCE.createGObject()));

		newChildDescriptors.add
			(createChildParameter
				(Geometry_modelPackage.Literals.GEOMETRY__EREFERENCE0,
				 Geometry_modelFactory.eINSTANCE.createLine()));

		newChildDescriptors.add
			(createChildParameter
				(Geometry_modelPackage.Literals.GEOMETRY__EREFERENCE0,
				 Geometry_modelFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Geometry_modelPackage.Literals.GEOMETRY__EREFERENCE0,
				 Geometry_modelFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(Geometry_modelPackage.Literals.GEOMETRY__EREFERENCE0,
				 Geometry_modelFactory.eINSTANCE.createInputPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Geometry_modelPackage.Literals.GEOMETRY__EREFERENCE0,
				 Geometry_modelFactory.eINSTANCE.createBendPoint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Geometry_modelEditPlugin.INSTANCE;
	}
	/*
	 * 
	 * @not generated
	 */
	@Override
	 protected Command createAddCommand(EditingDomain domain, EObject owner, 
			 				EStructuralFeature feature, Collection<?> collection, int index) {
		 
		 
		 if (feature == Geometry_modelPackage.eINSTANCE.getGeometry_EReference0()) {
			 return new CreateGObjectWIDCommand(domain, owner,
			 super.createAddCommand(domain, owner, feature, collection, index));
		 }
		 
		 return super.createAddCommand(domain, owner, feature, collection, index);
	 }


}
