package dk.dtu.se2.tutorials.tutorial6.animationTest.language;

import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

import animation.Animation;

import com.google.inject.Injector;

import dk.dtu.se2.tutorials.tutorial6.animationTest.language.parser.antlr.AnimationLanguageParser;

/**
 * Helper class to allow other modules easily parse an animation label.
 * 
 * @author albert, thibaud
 * 
 */
public class AnimationParser {

	private AnimationLanguageParser animationLanguageParser;

	public AnimationParser() {
		Injector injector = new AnimationLanguageStandaloneSetup()
				.createInjector();
		animationLanguageParser = injector
				.getInstance(AnimationLanguageParser.class);
	}

	public Animation parse(String input) {
		Animation result = null;
		ParserRule rule = animationLanguageParser.getGrammarAccess().getAnimationRule();
		IParseResult parseResult = animationLanguageParser.parse(rule, new StringReader(input));
		Iterable<INode> errors = parseResult.getSyntaxErrors();
		
		if (!errors.iterator().hasNext()) {
			EObject object = parseResult.getRootASTElement();
			if (object instanceof Animation) {
				result = (Animation) object;
			}
		}
		return result;
	}

}
