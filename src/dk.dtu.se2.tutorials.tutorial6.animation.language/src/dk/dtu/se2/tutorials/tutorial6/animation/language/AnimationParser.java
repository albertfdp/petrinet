package dk.dtu.se2.tutorials.tutorial6.animation.language;

import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

import animation.Animation;

import com.google.inject.Injector;

import dk.dtu.se2.tutorials.tutorial6.animation.language.parser.antlr.AnimationLanguageParser;

public class AnimationParser {
	
	private AnimationLanguageParser parser;
	
	public AnimationParser() {
   		Injector guiceInjector = new AnimationLanguageStandaloneSetup().createInjector();	
		parser = guiceInjector.getInstance(AnimationLanguageParser.class);
	}

	public Animation parse(String input) {
		ParserRule rule = parser.getGrammarAccess().getAnimationRule();
		IParseResult result = parser.parse(rule, new StringReader(input));
		Iterable<INode> errors = result.getSyntaxErrors();
		if (!errors.iterator().hasNext())  {
			EObject object = result.getRootASTElement();
			if (object instanceof Animation) {
			  return (Animation) object;
			}
		} 
	    return null;
	}
	

}
