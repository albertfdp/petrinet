package geometry.diagram.navigator;

import geometry.diagram.part.GeometryDiagramEditorPlugin;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryDomainNavigatorLabelProvider.
 *
 * @generated
 */
public class GeometryDomainNavigatorLabelProvider implements
		ICommonLabelProvider {

	/** The my adapter factory label provider. @generated */
	private AdapterFactoryLabelProvider myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(
			GeometryDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * Inits the.
	 *
	 * @param aConfig the a config
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * Gets the image.
	 *
	 * @param element the element
	 * @return the image
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof GeometryDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider
					.getImage(((GeometryDomainNavigatorItem) element)
							.getEObject());
		}
		return null;
	}

	/**
	 * Gets the text.
	 *
	 * @param element the element
	 * @return the text
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof GeometryDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider
					.getText(((GeometryDomainNavigatorItem) element)
							.getEObject());
		}
		return null;
	}

	/**
	 * Adds the listener.
	 *
	 * @param listener the listener
	 * @generated
	 */
	public void addListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.addListener(listener);
	}

	/**
	 * Dispose.
	 *
	 * @generated
	 */
	public void dispose() {
		myAdapterFactoryLabelProvider.dispose();
	}

	/**
	 * Checks if is label property.
	 *
	 * @param element the element
	 * @param property the property
	 * @return true, if is label property
	 * @generated
	 */
	public boolean isLabelProperty(Object element, String property) {
		return myAdapterFactoryLabelProvider.isLabelProperty(element, property);
	}

	/**
	 * Removes the listener.
	 *
	 * @param listener the listener
	 * @generated
	 */
	public void removeListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.removeListener(listener);
	}

	/**
	 * Restore state.
	 *
	 * @param aMemento the a memento
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * Save state.
	 *
	 * @param aMemento the a memento
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * Gets the description.
	 *
	 * @param anElement the an element
	 * @return the description
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

}
