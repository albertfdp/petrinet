package geometry.diagram.part;

import geometry.diagram.edit.policies.GeometryBaseItemSemanticEditPolicy;
import geometry.diagram.providers.ElementInitializers;
import geometry.provider.GeometryItemProviderAdapterFactory;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryDiagramEditorPlugin.
 *
 * @generated
 */
public class GeometryDiagramEditorPlugin extends AbstractUIPlugin {

	/** The Constant ID. @generated */
	public static final String ID = "dk.dtu.se2.geometry.diagram"; //$NON-NLS-1$

	/** The Constant DIAGRAM_PREFERENCES_HINT. @generated */
	public static final PreferencesHint DIAGRAM_PREFERENCES_HINT = new PreferencesHint(
			ID);

	/** The instance. @generated */
	private static GeometryDiagramEditorPlugin instance;

	/** The adapter factory. @generated */
	private ComposedAdapterFactory adapterFactory;

	/** The document provider. @generated */
	private GeometryDocumentProvider documentProvider;

	/** The link constraints. @generated */
	private GeometryBaseItemSemanticEditPolicy.LinkConstraints linkConstraints;

	/** The initializers. @generated */
	private ElementInitializers initializers;

	/**
	 * Instantiates a new geometry diagram editor plugin.
	 *
	 * @generated
	 */
	public GeometryDiagramEditorPlugin() {
	}

	/**
	 * Start.
	 *
	 * @param context the context
	 * @throws Exception the exception
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
		PreferencesHint.registerPreferenceStore(DIAGRAM_PREFERENCES_HINT,
				getPreferenceStore());
		adapterFactory = createAdapterFactory();
	}

	/**
	 * Stop.
	 *
	 * @param context the context
	 * @throws Exception the exception
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		adapterFactory.dispose();
		adapterFactory = null;
		linkConstraints = null;
		initializers = null;
		instance = null;
		super.stop(context);
	}

	/**
	 * Gets the single instance of GeometryDiagramEditorPlugin.
	 *
	 * @return single instance of GeometryDiagramEditorPlugin
	 * @generated
	 */
	public static GeometryDiagramEditorPlugin getInstance() {
		return instance;
	}

	/**
	 * Creates the adapter factory.
	 *
	 * @return the composed adapter factory
	 * @generated
	 */
	protected ComposedAdapterFactory createAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	/**
	 * Fill item provider factories.
	 *
	 * @param factories the factories
	 * @generated
	 */
	protected void fillItemProviderFactories(List<AdapterFactory> factories) {
		factories.add(new GeometryItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * Gets the item providers adapter factory.
	 *
	 * @return the item providers adapter factory
	 * @generated
	 */
	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * Gets the item image descriptor.
	 *
	 * @param item the item
	 * @return the item image descriptor
	 * @generated
	 */
	public ImageDescriptor getItemImageDescriptor(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return ExtendedImageRegistry.getInstance().getImageDescriptor(
					labelProvider.getImage(item));
		}
		return null;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 * @generated
	 */
	public static ImageDescriptor getBundledImageDescriptor(String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(ID, path);
	}

	/**
	 * Respects images residing in any plug-in. If path is relative,
	 * then this bundle is looked up for the image, otherwise, for absolute
	 * path, first segment is taken as id of plug-in with image
	 *
	 * @param path the path to image, either absolute (with plug-in id as first segment), or relative for bundled images
	 * @return the image descriptor
	 * @generated
	 */
	public static ImageDescriptor findImageDescriptor(String path) {
		final IPath p = new Path(path);
		if (p.isAbsolute() && p.segmentCount() > 1) {
			return AbstractUIPlugin.imageDescriptorFromPlugin(p.segment(0), p
					.removeFirstSegments(1).makeAbsolute().toString());
		} else {
			return getBundledImageDescriptor(p.makeAbsolute().toString());
		}
	}

	/**
	 * Returns an image for the image file at the given plug-in relative path.
	 * Client do not need to dispose this image. Images will be disposed automatically.
	 *
	 * @param path the path
	 * @return image instance
	 * @generated
	 */
	public Image getBundledImage(String path) {
		Image image = getImageRegistry().get(path);
		if (image == null) {
			getImageRegistry().put(path, getBundledImageDescriptor(path));
			image = getImageRegistry().get(path);
		}
		return image;
	}

	/**
	 * Returns string from plug-in's resource bundle.
	 *
	 * @param key the key
	 * @return the string
	 * @generated
	 */
	public static String getString(String key) {
		return Platform.getResourceString(getInstance().getBundle(), "%" + key); //$NON-NLS-1$
	}

	/**
	 * Gets the document provider.
	 *
	 * @return the document provider
	 * @generated
	 */
	public GeometryDocumentProvider getDocumentProvider() {
		if (documentProvider == null) {
			documentProvider = new GeometryDocumentProvider();
		}
		return documentProvider;
	}

	/**
	 * Gets the link constraints.
	 *
	 * @return the link constraints
	 * @generated
	 */
	public GeometryBaseItemSemanticEditPolicy.LinkConstraints getLinkConstraints() {
		return linkConstraints;
	}

	/**
	 * Sets the link constraints.
	 *
	 * @param lc the new link constraints
	 * @generated
	 */
	public void setLinkConstraints(
			GeometryBaseItemSemanticEditPolicy.LinkConstraints lc) {
		this.linkConstraints = lc;
	}

	/**
	 * Gets the element initializers.
	 *
	 * @return the element initializers
	 * @generated
	 */
	public ElementInitializers getElementInitializers() {
		return initializers;
	}

	/**
	 * Sets the element initializers.
	 *
	 * @param i the new element initializers
	 * @generated
	 */
	public void setElementInitializers(ElementInitializers i) {
		this.initializers = i;
	}

	/**
	 * Log error.
	 *
	 * @param error the error
	 * @generated
	 */
	public void logError(String error) {
		logError(error, null);
	}

	/**
	 * Log error.
	 *
	 * @param error the error
	 * @param throwable the throwable
	 * @generated
	 */
	public void logError(String error, Throwable throwable) {
		if (error == null && throwable != null) {
			error = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.ERROR, GeometryDiagramEditorPlugin.ID,
						IStatus.OK, error, throwable));
		debug(error, throwable);
	}

	/**
	 * Log info.
	 *
	 * @param message the message
	 * @generated
	 */
	public void logInfo(String message) {
		logInfo(message, null);
	}

	/**
	 * Log info.
	 *
	 * @param message the message
	 * @param throwable the throwable
	 * @generated
	 */
	public void logInfo(String message, Throwable throwable) {
		if (message == null && throwable != null) {
			message = throwable.getMessage();
		}
		getLog().log(
				new Status(IStatus.INFO, GeometryDiagramEditorPlugin.ID,
						IStatus.OK, message, throwable));
		debug(message, throwable);
	}

	/**
	 * Debug.
	 *
	 * @param message the message
	 * @param throwable the throwable
	 * @generated
	 */
	private void debug(String message, Throwable throwable) {
		if (!isDebugging()) {
			return;
		}
		if (message != null) {
			System.err.println(message);
		}
		if (throwable != null) {
			throwable.printStackTrace();
		}
	}
}
