/*
 * generated by Xtext
 */
package dk.dtu.se2.tutorials.tutorial6.animationTest.language.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractAnimationLanguageValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://animation/1.0"));
		return result;
	}
}
