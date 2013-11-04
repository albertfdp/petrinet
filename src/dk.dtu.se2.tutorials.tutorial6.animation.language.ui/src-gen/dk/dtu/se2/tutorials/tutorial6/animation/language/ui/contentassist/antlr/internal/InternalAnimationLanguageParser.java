package dk.dtu.se2.tutorials.tutorial6.animation.language.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.dtu.se2.tutorials.tutorial6.animation.language.services.AnimationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnimationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "')'", "'show'", "'hide'", "'stop'", "'['", "']'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAnimationLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnimationLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnimationLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g"; }


     
     	private AnimationLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(AnimationLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleAnimation_Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:60:1: entryRuleAnimation_Impl : ruleAnimation_Impl EOF ;
    public final void entryRuleAnimation_Impl() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:61:1: ( ruleAnimation_Impl EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:62:1: ruleAnimation_Impl EOF
            {
             before(grammarAccess.getAnimation_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_Impl_in_entryRuleAnimation_Impl61);
            ruleAnimation_Impl();

            state._fsp--;

             after(grammarAccess.getAnimation_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation_Impl68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimation_Impl"


    // $ANTLR start "ruleAnimation_Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:69:1: ruleAnimation_Impl : ( ( rule__Animation_Impl__Group__0 ) ) ;
    public final void ruleAnimation_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:73:2: ( ( ( rule__Animation_Impl__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:74:1: ( ( rule__Animation_Impl__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:74:1: ( ( rule__Animation_Impl__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:75:1: ( rule__Animation_Impl__Group__0 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:76:1: ( rule__Animation_Impl__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:76:2: rule__Animation_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__0_in_ruleAnimation_Impl94);
            rule__Animation_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnimation_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation_Impl"


    // $ANTLR start "entryRuleMove"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:88:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:89:1: ( ruleMove EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:90:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove121);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:97:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:101:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:102:1: ( ( rule__Move__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:102:1: ( ( rule__Move__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:103:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:104:1: ( rule__Move__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:104:2: rule__Move__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0_in_ruleMove154);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleShow"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:116:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:117:1: ( ruleShow EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:118:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShow_in_entryRuleShow181);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShow188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:125:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:129:2: ( ( ( rule__Show__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:130:1: ( ( rule__Show__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:130:1: ( ( rule__Show__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:131:1: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:132:1: ( rule__Show__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:132:2: rule__Show__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__0_in_ruleShow214);
            rule__Show__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleHide"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:144:1: entryRuleHide : ruleHide EOF ;
    public final void entryRuleHide() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:145:1: ( ruleHide EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:146:1: ruleHide EOF
            {
             before(grammarAccess.getHideRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHide_in_entryRuleHide241);
            ruleHide();

            state._fsp--;

             after(grammarAccess.getHideRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHide248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHide"


    // $ANTLR start "ruleHide"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:153:1: ruleHide : ( ( rule__Hide__Group__0 ) ) ;
    public final void ruleHide() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:157:2: ( ( ( rule__Hide__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__Hide__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__Hide__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:159:1: ( rule__Hide__Group__0 )
            {
             before(grammarAccess.getHideAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:1: ( rule__Hide__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:2: rule__Hide__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__0_in_ruleHide274);
            rule__Hide__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHideAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHide"


    // $ANTLR start "entryRuleStop"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:172:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:173:1: ( ruleStop EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:174:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop301);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:181:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:185:2: ( ( ( rule__Stop__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__Stop__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__Stop__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:187:1: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:1: ( rule__Stop__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:2: rule__Stop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0_in_ruleStop334);
            rule__Stop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleSequence"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:200:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:201:1: ( ruleSequence EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:202:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence361);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:209:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:213:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:214:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:214:1: ( ( rule__Sequence__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:215:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:1: ( rule__Sequence__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:2: rule__Sequence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0_in_ruleSequence394);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAnimation"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:228:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:229:1: ( ruleAnimation EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:230:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation421);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:237:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:241:2: ( ( ( rule__Animation__Alternatives ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__Animation__Alternatives ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__Animation__Alternatives ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:243:1: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:1: ( rule__Animation__Alternatives )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:2: rule__Animation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Alternatives_in_ruleAnimation454);
            rule__Animation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleEInt"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:256:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:257:1: ( ruleEInt EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:258:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt481);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:265:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:269:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:270:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:270:1: ( ( rule__EInt__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:271:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:1: ( rule__EInt__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt514);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:284:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:285:1: ( ruleEString EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:286:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString541);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:293:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:297:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:298:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:298:1: ( ( rule__EString__Alternatives ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:299:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:300:1: ( rule__EString__Alternatives )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:300:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString574);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Animation__Alternatives"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:312:1: rule__Animation__Alternatives : ( ( ruleMove ) | ( ruleShow ) | ( ruleHide ) | ( ruleStop ) | ( ruleSequence ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:316:1: ( ( ruleMove ) | ( ruleShow ) | ( ruleHide ) | ( ruleStop ) | ( ruleSequence ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            case 18:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:317:1: ( ruleMove )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:317:1: ( ruleMove )
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:318:1: ruleMove
                    {
                     before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Animation__Alternatives610);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:323:6: ( ruleShow )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:323:6: ( ruleShow )
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:324:1: ruleShow
                    {
                     before(grammarAccess.getAnimationAccess().getShowParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleShow_in_rule__Animation__Alternatives627);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getShowParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:329:6: ( ruleHide )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:329:6: ( ruleHide )
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:330:1: ruleHide
                    {
                     before(grammarAccess.getAnimationAccess().getHideParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHide_in_rule__Animation__Alternatives644);
                    ruleHide();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getHideParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:335:6: ( ruleStop )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:335:6: ( ruleStop )
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:336:1: ruleStop
                    {
                     before(grammarAccess.getAnimationAccess().getStopParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_rule__Animation__Alternatives661);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getStopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:341:6: ( ruleSequence )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:341:6: ( ruleSequence )
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:342:1: ruleSequence
                    {
                     before(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rule__Animation__Alternatives678);
                    ruleSequence();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:352:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:356:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:357:1: ( RULE_STRING )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:357:1: ( RULE_STRING )
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:358:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives710); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:363:6: ( RULE_ID )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:363:6: ( RULE_ID )
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:364:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives727); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Animation_Impl__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:376:1: rule__Animation_Impl__Group__0 : rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 ;
    public final void rule__Animation_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:380:1: ( rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:381:2: rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0757);
            rule__Animation_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0760);
            rule__Animation_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group__0"


    // $ANTLR start "rule__Animation_Impl__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:388:1: rule__Animation_Impl__Group__0__Impl : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:392:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:393:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:393:1: ( ruleAnimation )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:394:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl787);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group__0__Impl"


    // $ANTLR start "rule__Animation_Impl__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:405:1: rule__Animation_Impl__Group__1 : rule__Animation_Impl__Group__1__Impl ;
    public final void rule__Animation_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:409:1: ( rule__Animation_Impl__Group__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:410:2: rule__Animation_Impl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1816);
            rule__Animation_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group__1"


    // $ANTLR start "rule__Animation_Impl__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:416:1: rule__Animation_Impl__Group__1__Impl : ( ( rule__Animation_Impl__Group_1__0 )? ) ;
    public final void rule__Animation_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:420:1: ( ( ( rule__Animation_Impl__Group_1__0 )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:421:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:421:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:422:1: ( rule__Animation_Impl__Group_1__0 )?
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:423:1: ( rule__Animation_Impl__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:423:2: rule__Animation_Impl__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl843);
                    rule__Animation_Impl__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimation_ImplAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group__1__Impl"


    // $ANTLR start "rule__Animation_Impl__Group_1__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:437:1: rule__Animation_Impl__Group_1__0 : rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 ;
    public final void rule__Animation_Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:441:1: ( rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:442:2: rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0878);
            rule__Animation_Impl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0881);
            rule__Animation_Impl__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__0"


    // $ANTLR start "rule__Animation_Impl__Group_1__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:449:1: rule__Animation_Impl__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:453:1: ( ( ';' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:454:1: ( ';' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:454:1: ( ';' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:455:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl909); 
             after(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__0__Impl"


    // $ANTLR start "rule__Animation_Impl__Group_1__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:468:1: rule__Animation_Impl__Group_1__1 : rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 ;
    public final void rule__Animation_Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:472:1: ( rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:473:2: rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1940);
            rule__Animation_Impl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1943);
            rule__Animation_Impl__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__1"


    // $ANTLR start "rule__Animation_Impl__Group_1__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:480:1: rule__Animation_Impl__Group_1__1__Impl : ( () ) ;
    public final void rule__Animation_Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:484:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:485:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:485:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:486:1: ()
            {
             before(grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:487:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:489:1: 
            {
            }

             after(grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__1__Impl"


    // $ANTLR start "rule__Animation_Impl__Group_1__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:499:1: rule__Animation_Impl__Group_1__2 : rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 ;
    public final void rule__Animation_Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:503:1: ( rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:504:2: rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__21001);
            rule__Animation_Impl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__21004);
            rule__Animation_Impl__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__2"


    // $ANTLR start "rule__Animation_Impl__Group_1__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:511:1: rule__Animation_Impl__Group_1__2__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) ;
    public final void rule__Animation_Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:515:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:516:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:516:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:517:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:518:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:518:2: rule__Animation_Impl__AnimationsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl1031);
            rule__Animation_Impl__AnimationsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__2__Impl"


    // $ANTLR start "rule__Animation_Impl__Group_1__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:528:1: rule__Animation_Impl__Group_1__3 : rule__Animation_Impl__Group_1__3__Impl ;
    public final void rule__Animation_Impl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:532:1: ( rule__Animation_Impl__Group_1__3__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:533:2: rule__Animation_Impl__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__31061);
            rule__Animation_Impl__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__3"


    // $ANTLR start "rule__Animation_Impl__Group_1__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:539:1: rule__Animation_Impl__Group_1__3__Impl : ( ( rule__Animation_Impl__Group_1_3__0 )* ) ;
    public final void rule__Animation_Impl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:543:1: ( ( ( rule__Animation_Impl__Group_1_3__0 )* ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:544:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:544:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:545:1: ( rule__Animation_Impl__Group_1_3__0 )*
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:546:1: ( rule__Animation_Impl__Group_1_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:546:2: rule__Animation_Impl__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl1088);
            	    rule__Animation_Impl__Group_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAnimation_ImplAccess().getGroup_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1__3__Impl"


    // $ANTLR start "rule__Animation_Impl__Group_1_3__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:564:1: rule__Animation_Impl__Group_1_3__0 : rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 ;
    public final void rule__Animation_Impl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:568:1: ( rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:569:2: rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__01127);
            rule__Animation_Impl__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__01130);
            rule__Animation_Impl__Group_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1_3__0"


    // $ANTLR start "rule__Animation_Impl__Group_1_3__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:576:1: rule__Animation_Impl__Group_1_3__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:580:1: ( ( ';' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:581:1: ( ';' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:581:1: ( ';' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:582:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl1158); 
             after(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1_3__0__Impl"


    // $ANTLR start "rule__Animation_Impl__Group_1_3__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:595:1: rule__Animation_Impl__Group_1_3__1 : rule__Animation_Impl__Group_1_3__1__Impl ;
    public final void rule__Animation_Impl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:599:1: ( rule__Animation_Impl__Group_1_3__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:600:2: rule__Animation_Impl__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__11189);
            rule__Animation_Impl__Group_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1_3__1"


    // $ANTLR start "rule__Animation_Impl__Group_1_3__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:606:1: rule__Animation_Impl__Group_1_3__1__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) ;
    public final void rule__Animation_Impl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:610:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:611:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:611:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:612:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:613:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:613:2: rule__Animation_Impl__AnimationsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl1216);
            rule__Animation_Impl__AnimationsAssignment_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__Group_1_3__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:627:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:631:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:632:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01250);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01253);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:639:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:643:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:644:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:644:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:645:1: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:646:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:648:1: 
            {
            }

             after(grammarAccess.getMoveAccess().getMoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:658:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:662:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:663:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11311);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11314);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:670:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:674:1: ( ( 'move' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:675:1: ( 'move' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:675:1: ( 'move' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:676:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Move__Group__1__Impl1342); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:689:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:693:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:694:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21373);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21376);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:701:1: rule__Move__Group__2__Impl : ( '(' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:705:1: ( ( '(' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:706:1: ( '(' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:706:1: ( '(' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:707:1: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Move__Group__2__Impl1404); 
             after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:720:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:724:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:725:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31435);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31438);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:732:1: rule__Move__Group__3__Impl : ( ( rule__Move__SpeedAssignment_3 ) ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:736:1: ( ( ( rule__Move__SpeedAssignment_3 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:737:1: ( ( rule__Move__SpeedAssignment_3 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:737:1: ( ( rule__Move__SpeedAssignment_3 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:738:1: ( rule__Move__SpeedAssignment_3 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:739:1: ( rule__Move__SpeedAssignment_3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:739:2: rule__Move__SpeedAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1465);
            rule__Move__SpeedAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:749:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:753:1: ( rule__Move__Group__4__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:754:2: rule__Move__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41495);
            rule__Move__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:760:1: rule__Move__Group__4__Impl : ( ')' ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:764:1: ( ( ')' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:765:1: ( ')' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:765:1: ( ')' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:766:1: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__4__Impl1523); 
             after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:789:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:793:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:794:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__01564);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1_in_rule__Show__Group__01567);
            rule__Show__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0"


    // $ANTLR start "rule__Show__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:801:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:805:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:806:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:806:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:807:1: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:808:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:810:1: 
            {
            }

             after(grammarAccess.getShowAccess().getShowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0__Impl"


    // $ANTLR start "rule__Show__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:820:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:824:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:825:2: rule__Show__Group__1__Impl rule__Show__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__11625);
            rule__Show__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2_in_rule__Show__Group__11628);
            rule__Show__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1"


    // $ANTLR start "rule__Show__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:832:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:836:1: ( ( 'show' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:837:1: ( 'show' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:837:1: ( 'show' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:838:1: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Show__Group__1__Impl1656); 
             after(grammarAccess.getShowAccess().getShowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1__Impl"


    // $ANTLR start "rule__Show__Group__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:851:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:855:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:856:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__21687);
            rule__Show__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3_in_rule__Show__Group__21690);
            rule__Show__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__2"


    // $ANTLR start "rule__Show__Group__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:863:1: rule__Show__Group__2__Impl : ( '(' ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:867:1: ( ( '(' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:868:1: ( '(' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:868:1: ( '(' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:869:1: '('
            {
             before(grammarAccess.getShowAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Show__Group__2__Impl1718); 
             after(grammarAccess.getShowAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__2__Impl"


    // $ANTLR start "rule__Show__Group__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:882:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:886:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:887:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__31749);
            rule__Show__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4_in_rule__Show__Group__31752);
            rule__Show__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__3"


    // $ANTLR start "rule__Show__Group__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:894:1: rule__Show__Group__3__Impl : ( ( rule__Show__NameAssignment_3 ) ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:898:1: ( ( ( rule__Show__NameAssignment_3 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:899:1: ( ( rule__Show__NameAssignment_3 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:899:1: ( ( rule__Show__NameAssignment_3 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:900:1: ( rule__Show__NameAssignment_3 )
            {
             before(grammarAccess.getShowAccess().getNameAssignment_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:901:1: ( rule__Show__NameAssignment_3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:901:2: rule__Show__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__NameAssignment_3_in_rule__Show__Group__3__Impl1779);
            rule__Show__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__3__Impl"


    // $ANTLR start "rule__Show__Group__4"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:911:1: rule__Show__Group__4 : rule__Show__Group__4__Impl ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:915:1: ( rule__Show__Group__4__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:916:2: rule__Show__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__41809);
            rule__Show__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__4"


    // $ANTLR start "rule__Show__Group__4__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:922:1: rule__Show__Group__4__Impl : ( ')' ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:926:1: ( ( ')' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:927:1: ( ')' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:927:1: ( ')' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:928:1: ')'
            {
             before(grammarAccess.getShowAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Show__Group__4__Impl1837); 
             after(grammarAccess.getShowAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__4__Impl"


    // $ANTLR start "rule__Hide__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:951:1: rule__Hide__Group__0 : rule__Hide__Group__0__Impl rule__Hide__Group__1 ;
    public final void rule__Hide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:955:1: ( rule__Hide__Group__0__Impl rule__Hide__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:956:2: rule__Hide__Group__0__Impl rule__Hide__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__01878);
            rule__Hide__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__01881);
            rule__Hide__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__0"


    // $ANTLR start "rule__Hide__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:963:1: rule__Hide__Group__0__Impl : ( () ) ;
    public final void rule__Hide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:967:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:968:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:968:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:969:1: ()
            {
             before(grammarAccess.getHideAccess().getHideAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:970:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:972:1: 
            {
            }

             after(grammarAccess.getHideAccess().getHideAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__0__Impl"


    // $ANTLR start "rule__Hide__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:982:1: rule__Hide__Group__1 : rule__Hide__Group__1__Impl rule__Hide__Group__2 ;
    public final void rule__Hide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:986:1: ( rule__Hide__Group__1__Impl rule__Hide__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:987:2: rule__Hide__Group__1__Impl rule__Hide__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__11939);
            rule__Hide__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__11942);
            rule__Hide__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__1"


    // $ANTLR start "rule__Hide__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:994:1: rule__Hide__Group__1__Impl : ( 'hide' ) ;
    public final void rule__Hide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:998:1: ( ( 'hide' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:999:1: ( 'hide' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:999:1: ( 'hide' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1000:1: 'hide'
            {
             before(grammarAccess.getHideAccess().getHideKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Hide__Group__1__Impl1970); 
             after(grammarAccess.getHideAccess().getHideKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__1__Impl"


    // $ANTLR start "rule__Hide__Group__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1013:1: rule__Hide__Group__2 : rule__Hide__Group__2__Impl rule__Hide__Group__3 ;
    public final void rule__Hide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1017:1: ( rule__Hide__Group__2__Impl rule__Hide__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1018:2: rule__Hide__Group__2__Impl rule__Hide__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__22001);
            rule__Hide__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__22004);
            rule__Hide__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__2"


    // $ANTLR start "rule__Hide__Group__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1025:1: rule__Hide__Group__2__Impl : ( '(' ) ;
    public final void rule__Hide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1029:1: ( ( '(' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1030:1: ( '(' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1030:1: ( '(' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1031:1: '('
            {
             before(grammarAccess.getHideAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Hide__Group__2__Impl2032); 
             after(grammarAccess.getHideAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__2__Impl"


    // $ANTLR start "rule__Hide__Group__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1044:1: rule__Hide__Group__3 : rule__Hide__Group__3__Impl ;
    public final void rule__Hide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1048:1: ( rule__Hide__Group__3__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1049:2: rule__Hide__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__32063);
            rule__Hide__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__3"


    // $ANTLR start "rule__Hide__Group__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1055:1: rule__Hide__Group__3__Impl : ( ')' ) ;
    public final void rule__Hide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1059:1: ( ( ')' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1060:1: ( ')' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1060:1: ( ')' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1061:1: ')'
            {
             before(grammarAccess.getHideAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Hide__Group__3__Impl2091); 
             after(grammarAccess.getHideAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hide__Group__3__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1082:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1086:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1087:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__02130);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__02133);
            rule__Stop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0"


    // $ANTLR start "rule__Stop__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1094:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1098:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1099:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1099:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1100:1: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1101:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1103:1: 
            {
            }

             after(grammarAccess.getStopAccess().getStopAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__0__Impl"


    // $ANTLR start "rule__Stop__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1113:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1117:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1118:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__12191);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__12194);
            rule__Stop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1"


    // $ANTLR start "rule__Stop__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1125:1: rule__Stop__Group__1__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1129:1: ( ( 'stop' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1130:1: ( 'stop' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1130:1: ( 'stop' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1131:1: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Stop__Group__1__Impl2222); 
             after(grammarAccess.getStopAccess().getStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__1__Impl"


    // $ANTLR start "rule__Stop__Group__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1144:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl rule__Stop__Group__3 ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1148:1: ( rule__Stop__Group__2__Impl rule__Stop__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1149:2: rule__Stop__Group__2__Impl rule__Stop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__22253);
            rule__Stop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__22256);
            rule__Stop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__2"


    // $ANTLR start "rule__Stop__Group__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1156:1: rule__Stop__Group__2__Impl : ( '(' ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1160:1: ( ( '(' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1161:1: ( '(' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1161:1: ( '(' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1162:1: '('
            {
             before(grammarAccess.getStopAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Stop__Group__2__Impl2284); 
             after(grammarAccess.getStopAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__2__Impl"


    // $ANTLR start "rule__Stop__Group__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1175:1: rule__Stop__Group__3 : rule__Stop__Group__3__Impl ;
    public final void rule__Stop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1179:1: ( rule__Stop__Group__3__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1180:2: rule__Stop__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__32315);
            rule__Stop__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__3"


    // $ANTLR start "rule__Stop__Group__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1186:1: rule__Stop__Group__3__Impl : ( ')' ) ;
    public final void rule__Stop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1190:1: ( ( ')' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1191:1: ( ')' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1191:1: ( ')' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1192:1: ')'
            {
             before(grammarAccess.getStopAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Stop__Group__3__Impl2343); 
             after(grammarAccess.getStopAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Stop__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1213:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1217:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1218:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02382);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02385);
            rule__Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1225:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1229:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1230:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1230:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1231:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1232:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1234:1: 
            {
            }

             after(grammarAccess.getSequenceAccess().getSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1244:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1248:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1249:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12443);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12446);
            rule__Sequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1256:1: rule__Sequence__Group__1__Impl : ( '[' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1260:1: ( ( '[' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1261:1: ( '[' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1261:1: ( '[' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1262:1: '['
            {
             before(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Sequence__Group__1__Impl2474); 
             after(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1275:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1279:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1280:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22505);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22508);
            rule__Sequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1287:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__AnimationsAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1291:1: ( ( ( rule__Sequence__AnimationsAssignment_2 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1292:1: ( ( rule__Sequence__AnimationsAssignment_2 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1292:1: ( ( rule__Sequence__AnimationsAssignment_2 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1293:1: ( rule__Sequence__AnimationsAssignment_2 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_2()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1294:1: ( rule__Sequence__AnimationsAssignment_2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1294:2: rule__Sequence__AnimationsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__AnimationsAssignment_2_in_rule__Sequence__Group__2__Impl2535);
            rule__Sequence__AnimationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getAnimationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1304:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1308:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1309:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32565);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32568);
            rule__Sequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1316:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__Group_3__0 )* ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1320:1: ( ( ( rule__Sequence__Group_3__0 )* ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1321:1: ( ( rule__Sequence__Group_3__0 )* )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1321:1: ( ( rule__Sequence__Group_3__0 )* )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1322:1: ( rule__Sequence__Group_3__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1323:1: ( rule__Sequence__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1323:2: rule__Sequence__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2595);
            	    rule__Sequence__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSequenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1333:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1337:1: ( rule__Sequence__Group__4__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1338:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42626);
            rule__Sequence__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1344:1: rule__Sequence__Group__4__Impl : ( ']' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1348:1: ( ( ']' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1349:1: ( ']' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1349:1: ( ']' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1350:1: ']'
            {
             before(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Sequence__Group__4__Impl2654); 
             after(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group_3__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1373:1: rule__Sequence__Group_3__0 : rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 ;
    public final void rule__Sequence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1377:1: ( rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1378:2: rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02695);
            rule__Sequence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02698);
            rule__Sequence__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__0"


    // $ANTLR start "rule__Sequence__Group_3__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1385:1: rule__Sequence__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Sequence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1389:1: ( ( ';' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1390:1: ( ';' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1390:1: ( ';' )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1391:1: ';'
            {
             before(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Sequence__Group_3__0__Impl2726); 
             after(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1404:1: rule__Sequence__Group_3__1 : rule__Sequence__Group_3__1__Impl ;
    public final void rule__Sequence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1408:1: ( rule__Sequence__Group_3__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1409:2: rule__Sequence__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12757);
            rule__Sequence__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__1"


    // $ANTLR start "rule__Sequence__Group_3__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1415:1: rule__Sequence__Group_3__1__Impl : ( ( rule__Sequence__AnimationsAssignment_3_1 ) ) ;
    public final void rule__Sequence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1419:1: ( ( ( rule__Sequence__AnimationsAssignment_3_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1420:1: ( ( rule__Sequence__AnimationsAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1420:1: ( ( rule__Sequence__AnimationsAssignment_3_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1421:1: ( rule__Sequence__AnimationsAssignment_3_1 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_3_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1422:1: ( rule__Sequence__AnimationsAssignment_3_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1422:2: rule__Sequence__AnimationsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__AnimationsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2784);
            rule__Sequence__AnimationsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getAnimationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1436:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1440:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1441:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02818);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02821);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1448:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1452:1: ( ( ( '-' )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1453:1: ( ( '-' )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1453:1: ( ( '-' )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1454:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1455:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1456:2: '-'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__EInt__Group__0__Impl2850); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1467:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1471:1: ( rule__EInt__Group__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1472:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12883);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1478:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1482:1: ( ( RULE_INT ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1483:1: ( RULE_INT )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1483:1: ( RULE_INT )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1484:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2910); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Animation_Impl__AnimationsAssignment_1_2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1500:1: rule__Animation_Impl__AnimationsAssignment_1_2 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1504:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1505:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1505:1: ( ruleAnimation )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1506:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22948);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__AnimationsAssignment_1_2"


    // $ANTLR start "rule__Animation_Impl__AnimationsAssignment_1_3_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1515:1: rule__Animation_Impl__AnimationsAssignment_1_3_1 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1519:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1520:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1520:1: ( ruleAnimation )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1521:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12979);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Animation_Impl__AnimationsAssignment_1_3_1"


    // $ANTLR start "rule__Move__SpeedAssignment_3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1530:1: rule__Move__SpeedAssignment_3 : ( ruleEInt ) ;
    public final void rule__Move__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1534:1: ( ( ruleEInt ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1535:1: ( ruleEInt )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1535:1: ( ruleEInt )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1536:1: ruleEInt
            {
             before(grammarAccess.getMoveAccess().getSpeedEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Move__SpeedAssignment_33010);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSpeedEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__SpeedAssignment_3"


    // $ANTLR start "rule__Show__NameAssignment_3"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1545:1: rule__Show__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Show__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1549:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1550:1: ( ruleEString )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1550:1: ( ruleEString )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1551:1: ruleEString
            {
             before(grammarAccess.getShowAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Show__NameAssignment_33041);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__NameAssignment_3"


    // $ANTLR start "rule__Sequence__AnimationsAssignment_2"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1560:1: rule__Sequence__AnimationsAssignment_2 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1564:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1565:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1565:1: ( ruleAnimation )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1566:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_23072);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__AnimationsAssignment_2"


    // $ANTLR start "rule__Sequence__AnimationsAssignment_3_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1575:1: rule__Sequence__AnimationsAssignment_3_1 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1579:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1580:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1580:1: ( ruleAnimation )
            // ../dk.dtu.se2.tutorials.tutorial6.animation.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animation/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1581:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_3_13103);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__AnimationsAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnimation_Impl_in_entryRuleAnimation_Impl61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation_Impl68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__0_in_ruleAnimation_Impl94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0_in_ruleMove154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_entryRuleShow181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShow188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__0_in_ruleShow214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_entryRuleHide241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHide248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__0_in_ruleHide274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0_in_ruleStop334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Alternatives_in_ruleAnimation454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Animation__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_rule__Animation__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_rule__Animation__Alternatives644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_rule__Animation__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rule__Animation__Alternatives678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0757 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0878 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1940 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__21001 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__21004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl1031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__31061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl1088 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__01127 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__01130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__11189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl1216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01250 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11311 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Move__Group__1__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21373 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Move__Group__2__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31435 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__4__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__01564 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Show__Group__1_in_rule__Show__Group__01567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__11625 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Show__Group__2_in_rule__Show__Group__11628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Show__Group__1__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__21687 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Show__Group__3_in_rule__Show__Group__21690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Show__Group__2__Impl1718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__31749 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Show__Group__4_in_rule__Show__Group__31752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__NameAssignment_3_in_rule__Show__Group__3__Impl1779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__41809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Show__Group__4__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__01878 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__01881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__11939 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__11942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Hide__Group__1__Impl1970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__22001 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__22004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Hide__Group__2__Impl2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__32063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Hide__Group__3__Impl2091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__02130 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__02133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__12191 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__12194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Stop__Group__1__Impl2222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__22253 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__22256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Stop__Group__2__Impl2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__32315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Stop__Group__3__Impl2343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02382 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12443 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Sequence__Group__1__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22505 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__AnimationsAssignment_2_in_rule__Sequence__Group__2__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32565 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2595 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Sequence__Group__4__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02695 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Sequence__Group_3__0__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__AnimationsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02818 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EInt__Group__0__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Move__SpeedAssignment_33010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Show__NameAssignment_33041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_23072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_3_13103 = new BitSet(new long[]{0x0000000000000002L});
    }


}