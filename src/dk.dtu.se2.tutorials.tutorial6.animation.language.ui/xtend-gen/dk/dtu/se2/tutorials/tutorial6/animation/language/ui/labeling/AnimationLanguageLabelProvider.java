/**
 * generated by Xtext
 */
package dk.dtu.se2.tutorials.tutorial6.animation.language.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class AnimationLanguageLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public AnimationLanguageLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
