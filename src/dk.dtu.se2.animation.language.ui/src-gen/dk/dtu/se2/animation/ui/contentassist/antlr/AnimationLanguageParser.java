/*
* generated by Xtext
*/
package dk.dtu.se2.animation.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.dtu.se2.animation.services.AnimationLanguageGrammarAccess;

public class AnimationLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private AnimationLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.dtu.se2.animation.ui.contentassist.antlr.internal.InternalAnimationLanguageParser createParser() {
		dk.dtu.se2.animation.ui.contentassist.antlr.internal.InternalAnimationLanguageParser result = new dk.dtu.se2.animation.ui.contentassist.antlr.internal.InternalAnimationLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAnimationAccess().getAlternatives(), "rule__Animation__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getAnimation_ImplAccess().getGroup(), "rule__Animation_Impl__Group__0");
					put(grammarAccess.getAnimation_ImplAccess().getGroup_1(), "rule__Animation_Impl__Group_1__0");
					put(grammarAccess.getAnimation_ImplAccess().getGroup_1_3(), "rule__Animation_Impl__Group_1_3__0");
					put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
					put(grammarAccess.getShowAccess().getGroup(), "rule__Show__Group__0");
					put(grammarAccess.getHideAccess().getGroup(), "rule__Hide__Group__0");
					put(grammarAccess.getStopAccess().getGroup(), "rule__Stop__Group__0");
					put(grammarAccess.getSequenceAccess().getGroup(), "rule__Sequence__Group__0");
					put(grammarAccess.getSequenceAccess().getGroup_3(), "rule__Sequence__Group_3__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2(), "rule__Animation_Impl__AnimationsAssignment_1_2");
					put(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1(), "rule__Animation_Impl__AnimationsAssignment_1_3_1");
					put(grammarAccess.getMoveAccess().getSpeedAssignment_3(), "rule__Move__SpeedAssignment_3");
					put(grammarAccess.getShowAccess().getNameAssignment_3(), "rule__Show__NameAssignment_3");
					put(grammarAccess.getSequenceAccess().getAnimationsAssignment_2(), "rule__Sequence__AnimationsAssignment_2");
					put(grammarAccess.getSequenceAccess().getAnimationsAssignment_3_1(), "rule__Sequence__AnimationsAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.dtu.se2.animation.ui.contentassist.antlr.internal.InternalAnimationLanguageParser typedParser = (dk.dtu.se2.animation.ui.contentassist.antlr.internal.InternalAnimationLanguageParser) parser;
			typedParser.entryRuleAnimation_Impl();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AnimationLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AnimationLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
