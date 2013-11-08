/*
* generated by Xtext
*/
package dk.dtu.se2.animation.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import dk.dtu.se2.animation.services.AnimationLanguageGrammarAccess;

public class AnimationLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AnimationLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected dk.dtu.se2.animation.parser.antlr.internal.InternalAnimationLanguageParser createParser(XtextTokenStream stream) {
		return new dk.dtu.se2.animation.parser.antlr.internal.InternalAnimationLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Animation_Impl";
	}
	
	public AnimationLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AnimationLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
