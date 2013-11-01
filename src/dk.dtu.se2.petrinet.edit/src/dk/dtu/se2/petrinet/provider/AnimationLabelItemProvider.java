/**
 */
package dk.dtu.se2.petrinet.provider;

import java.io.StringReader;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.IParseResult;
import org.pnml.tools.epnk.structuredpntypemodel.provider.StructuredLabelItemProvider;

import animation.Animation;

import com.google.inject.Injector;

import dk.dtu.se2.petrinet.AnimationLabel;
import dk.dtu.se2.tutorials.tutorial6.animationTest.language.AnimationLanguageStandaloneSetup;
import dk.dtu.se2.tutorials.tutorial6.animationTest.language.parser.antlr.AnimationLanguageParser;


/**
 * This is the item provider adapter for a {@link dk.dtu.se2.petrinet.AnimationLabel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnimationLabelItemProvider
	extends StructuredLabelItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	
	 protected Injector guiceInjector;	
	 protected AnimationLanguageParser parser;
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimationLabelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
		
		guiceInjector  = new AnimationLanguageStandaloneSetup().createInjector();
		parser  = guiceInjector.getInstance(AnimationLanguageParser.class);
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
	 * This returns AnimationLabel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AnimationLabel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = crop(((AnimationLabel)object).getText());
		return label == null || label.length() == 0 ?
			getString("_UI_AnimationLabel_type") :
			getString("_UI_AnimationLabel_type") + " " + label;
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PetrinetEditPlugin.INSTANCE;
	}
	
	public EObject parse(String input) {
		  ParserRule rule = parser.getGrammarAccess().getAnimationRule();
		  IParseResult parseResult = parser.parse(rule, new StringReader(input));
		  Iterable<INode> errors = parseResult.getSyntaxErrors();
		  if (!errors.iterator().hasNext())  {
		    EObject object = parseResult.getRootASTElement();
		    if (object instanceof Animation) {
		      result = (Animation) object;
		    }
		  }
		
		return result;
	}
	

}
