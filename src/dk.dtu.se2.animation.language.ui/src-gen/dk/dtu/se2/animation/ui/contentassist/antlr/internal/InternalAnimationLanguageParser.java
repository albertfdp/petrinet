package dk.dtu.se2.animation.ui.contentassist.antlr.internal; 

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
import dk.dtu.se2.animation.services.AnimationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnimationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "')'", "'appear'", "','", "'stop'", "'['", "']'", "'-'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
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
    public String getGrammarFileName() { return "../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g"; }


     
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:60:1: entryRuleAnimation_Impl : ruleAnimation_Impl EOF ;
    public final void entryRuleAnimation_Impl() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:61:1: ( ruleAnimation_Impl EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:62:1: ruleAnimation_Impl EOF
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:69:1: ruleAnimation_Impl : ( ( rule__Animation_Impl__Group__0 ) ) ;
    public final void ruleAnimation_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:73:2: ( ( ( rule__Animation_Impl__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:74:1: ( ( rule__Animation_Impl__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:74:1: ( ( rule__Animation_Impl__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:75:1: ( rule__Animation_Impl__Group__0 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:76:1: ( rule__Animation_Impl__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:76:2: rule__Animation_Impl__Group__0
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:88:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:89:1: ( ruleMove EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:90:1: ruleMove EOF
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:97:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:101:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:102:1: ( ( rule__Move__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:102:1: ( ( rule__Move__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:103:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:104:1: ( rule__Move__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:104:2: rule__Move__Group__0
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


    // $ANTLR start "entryRuleAppear"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:116:1: entryRuleAppear : ruleAppear EOF ;
    public final void entryRuleAppear() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:117:1: ( ruleAppear EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:118:1: ruleAppear EOF
            {
             before(grammarAccess.getAppearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAppear_in_entryRuleAppear181);
            ruleAppear();

            state._fsp--;

             after(grammarAccess.getAppearRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAppear188); 

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
    // $ANTLR end "entryRuleAppear"


    // $ANTLR start "ruleAppear"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:125:1: ruleAppear : ( ( rule__Appear__Group__0 ) ) ;
    public final void ruleAppear() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:129:2: ( ( ( rule__Appear__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:130:1: ( ( rule__Appear__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:130:1: ( ( rule__Appear__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:131:1: ( rule__Appear__Group__0 )
            {
             before(grammarAccess.getAppearAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:132:1: ( rule__Appear__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:132:2: rule__Appear__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__0_in_ruleAppear214);
            rule__Appear__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppearAccess().getGroup()); 

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
    // $ANTLR end "ruleAppear"


    // $ANTLR start "entryRuleStop"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:144:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:145:1: ( ruleStop EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:146:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop241);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop248); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:153:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:157:2: ( ( ( rule__Stop__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__Stop__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__Stop__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:159:1: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:1: ( rule__Stop__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:2: rule__Stop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0_in_ruleStop274);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:172:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:173:1: ( ruleSequence EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:174:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence301);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence308); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:181:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:185:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__Sequence__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:187:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:1: ( rule__Sequence__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:2: rule__Sequence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0_in_ruleSequence334);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:200:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:201:1: ( ruleAnimation EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:202:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation361);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation368); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:209:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:213:2: ( ( ( rule__Animation__Alternatives ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:214:1: ( ( rule__Animation__Alternatives ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:214:1: ( ( rule__Animation__Alternatives ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:215:1: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:1: ( rule__Animation__Alternatives )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:2: rule__Animation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Alternatives_in_ruleAnimation394);
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


    // $ANTLR start "entryRuleEDouble"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:228:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:229:1: ( ruleEDouble EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:230:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble421);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble428); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:237:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:241:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__EDouble__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:243:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:1: ( rule__EDouble__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble454);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:258:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:259:1: ( ruleEString EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:260:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString483);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString490); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:267:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:271:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:1: ( ( rule__EString__Alternatives ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:273:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:274:1: ( rule__EString__Alternatives )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:274:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString516);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:286:1: rule__Animation__Alternatives : ( ( ruleMove ) | ( ruleAppear ) | ( ruleStop ) | ( ruleSequence ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:290:1: ( ( ruleMove ) | ( ruleAppear ) | ( ruleStop ) | ( ruleSequence ) )
            int alt1=4;
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
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:291:1: ( ruleMove )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:291:1: ( ruleMove )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:292:1: ruleMove
                    {
                     before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Animation__Alternatives552);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:297:6: ( ruleAppear )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:297:6: ( ruleAppear )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:298:1: ruleAppear
                    {
                     before(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAppear_in_rule__Animation__Alternatives569);
                    ruleAppear();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:303:6: ( ruleStop )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:303:6: ( ruleStop )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:304:1: ruleStop
                    {
                     before(grammarAccess.getAnimationAccess().getStopParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_rule__Animation__Alternatives586);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getStopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:309:6: ( ruleSequence )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:309:6: ( ruleSequence )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:310:1: ruleSequence
                    {
                     before(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rule__Animation__Alternatives603);
                    ruleSequence();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:320:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:324:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:325:1: ( RULE_STRING )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:325:1: ( RULE_STRING )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:326:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives635); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:331:6: ( RULE_ID )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:331:6: ( RULE_ID )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:332:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives652); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:344:1: rule__Animation_Impl__Group__0 : rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 ;
    public final void rule__Animation_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:348:1: ( rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:349:2: rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0682);
            rule__Animation_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0685);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:356:1: rule__Animation_Impl__Group__0__Impl : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:360:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:361:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:361:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:362:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl712);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:373:1: rule__Animation_Impl__Group__1 : rule__Animation_Impl__Group__1__Impl ;
    public final void rule__Animation_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:377:1: ( rule__Animation_Impl__Group__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:378:2: rule__Animation_Impl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1741);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:384:1: rule__Animation_Impl__Group__1__Impl : ( ( rule__Animation_Impl__Group_1__0 )? ) ;
    public final void rule__Animation_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:388:1: ( ( ( rule__Animation_Impl__Group_1__0 )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:389:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:389:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:390:1: ( rule__Animation_Impl__Group_1__0 )?
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:391:1: ( rule__Animation_Impl__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:391:2: rule__Animation_Impl__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl768);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:405:1: rule__Animation_Impl__Group_1__0 : rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 ;
    public final void rule__Animation_Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:409:1: ( rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:410:2: rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0803);
            rule__Animation_Impl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0806);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:417:1: rule__Animation_Impl__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:421:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:422:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:422:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:423:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl834); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:436:1: rule__Animation_Impl__Group_1__1 : rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 ;
    public final void rule__Animation_Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:440:1: ( rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:441:2: rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1865);
            rule__Animation_Impl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1868);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:448:1: rule__Animation_Impl__Group_1__1__Impl : ( () ) ;
    public final void rule__Animation_Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:452:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:453:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:453:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:454:1: ()
            {
             before(grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:455:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:457:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:467:1: rule__Animation_Impl__Group_1__2 : rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 ;
    public final void rule__Animation_Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:471:1: ( rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:472:2: rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__2926);
            rule__Animation_Impl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__2929);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:479:1: rule__Animation_Impl__Group_1__2__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) ;
    public final void rule__Animation_Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:483:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:484:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:484:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:485:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:486:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:486:2: rule__Animation_Impl__AnimationsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl956);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:496:1: rule__Animation_Impl__Group_1__3 : rule__Animation_Impl__Group_1__3__Impl ;
    public final void rule__Animation_Impl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:500:1: ( rule__Animation_Impl__Group_1__3__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:501:2: rule__Animation_Impl__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__3986);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:507:1: rule__Animation_Impl__Group_1__3__Impl : ( ( rule__Animation_Impl__Group_1_3__0 )* ) ;
    public final void rule__Animation_Impl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:511:1: ( ( ( rule__Animation_Impl__Group_1_3__0 )* ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:512:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:512:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:513:1: ( rule__Animation_Impl__Group_1_3__0 )*
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:514:1: ( rule__Animation_Impl__Group_1_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:514:2: rule__Animation_Impl__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl1013);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:532:1: rule__Animation_Impl__Group_1_3__0 : rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 ;
    public final void rule__Animation_Impl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:536:1: ( rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:537:2: rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__01052);
            rule__Animation_Impl__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__01055);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:544:1: rule__Animation_Impl__Group_1_3__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:548:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:549:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:549:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:550:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl1083); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:563:1: rule__Animation_Impl__Group_1_3__1 : rule__Animation_Impl__Group_1_3__1__Impl ;
    public final void rule__Animation_Impl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:567:1: ( rule__Animation_Impl__Group_1_3__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:568:2: rule__Animation_Impl__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__11114);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:574:1: rule__Animation_Impl__Group_1_3__1__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) ;
    public final void rule__Animation_Impl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:578:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:579:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:579:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:580:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:581:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:581:2: rule__Animation_Impl__AnimationsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl1141);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:595:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:599:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:600:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01175);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01178);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:607:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:611:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:612:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:612:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:613:1: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:614:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:616:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:626:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:630:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:631:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11236);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11239);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:638:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:642:1: ( ( 'move' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:643:1: ( 'move' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:643:1: ( 'move' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:644:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Move__Group__1__Impl1267); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:657:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:661:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:662:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21298);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21301);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:669:1: rule__Move__Group__2__Impl : ( '(' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:673:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:674:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:674:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:675:1: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Move__Group__2__Impl1329); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:688:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:692:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:693:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31360);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31363);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:700:1: rule__Move__Group__3__Impl : ( ( rule__Move__SpeedAssignment_3 ) ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:704:1: ( ( ( rule__Move__SpeedAssignment_3 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:705:1: ( ( rule__Move__SpeedAssignment_3 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:705:1: ( ( rule__Move__SpeedAssignment_3 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:706:1: ( rule__Move__SpeedAssignment_3 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:707:1: ( rule__Move__SpeedAssignment_3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:707:2: rule__Move__SpeedAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1390);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:717:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:721:1: ( rule__Move__Group__4__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:722:2: rule__Move__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41420);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:728:1: rule__Move__Group__4__Impl : ( ')' ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:732:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:733:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:733:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:734:1: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__4__Impl1448); 
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


    // $ANTLR start "rule__Appear__Group__0"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:757:1: rule__Appear__Group__0 : rule__Appear__Group__0__Impl rule__Appear__Group__1 ;
    public final void rule__Appear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:761:1: ( rule__Appear__Group__0__Impl rule__Appear__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:762:2: rule__Appear__Group__0__Impl rule__Appear__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__01489);
            rule__Appear__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__01492);
            rule__Appear__Group__1();

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
    // $ANTLR end "rule__Appear__Group__0"


    // $ANTLR start "rule__Appear__Group__0__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:769:1: rule__Appear__Group__0__Impl : ( () ) ;
    public final void rule__Appear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:773:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:774:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:774:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:775:1: ()
            {
             before(grammarAccess.getAppearAccess().getAppearAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:776:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:778:1: 
            {
            }

             after(grammarAccess.getAppearAccess().getAppearAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appear__Group__0__Impl"


    // $ANTLR start "rule__Appear__Group__1"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:788:1: rule__Appear__Group__1 : rule__Appear__Group__1__Impl rule__Appear__Group__2 ;
    public final void rule__Appear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:792:1: ( rule__Appear__Group__1__Impl rule__Appear__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:793:2: rule__Appear__Group__1__Impl rule__Appear__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__11550);
            rule__Appear__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__11553);
            rule__Appear__Group__2();

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
    // $ANTLR end "rule__Appear__Group__1"


    // $ANTLR start "rule__Appear__Group__1__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:800:1: rule__Appear__Group__1__Impl : ( 'appear' ) ;
    public final void rule__Appear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:804:1: ( ( 'appear' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:805:1: ( 'appear' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:805:1: ( 'appear' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:806:1: 'appear'
            {
             before(grammarAccess.getAppearAccess().getAppearKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Appear__Group__1__Impl1581); 
             after(grammarAccess.getAppearAccess().getAppearKeyword_1()); 

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
    // $ANTLR end "rule__Appear__Group__1__Impl"


    // $ANTLR start "rule__Appear__Group__2"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:819:1: rule__Appear__Group__2 : rule__Appear__Group__2__Impl rule__Appear__Group__3 ;
    public final void rule__Appear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:823:1: ( rule__Appear__Group__2__Impl rule__Appear__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:824:2: rule__Appear__Group__2__Impl rule__Appear__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__21612);
            rule__Appear__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__21615);
            rule__Appear__Group__3();

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
    // $ANTLR end "rule__Appear__Group__2"


    // $ANTLR start "rule__Appear__Group__2__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:831:1: rule__Appear__Group__2__Impl : ( '(' ) ;
    public final void rule__Appear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:835:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:836:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:836:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:837:1: '('
            {
             before(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Appear__Group__2__Impl1643); 
             after(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Appear__Group__2__Impl"


    // $ANTLR start "rule__Appear__Group__3"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:850:1: rule__Appear__Group__3 : rule__Appear__Group__3__Impl rule__Appear__Group__4 ;
    public final void rule__Appear__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:854:1: ( rule__Appear__Group__3__Impl rule__Appear__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:855:2: rule__Appear__Group__3__Impl rule__Appear__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__31674);
            rule__Appear__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__4_in_rule__Appear__Group__31677);
            rule__Appear__Group__4();

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
    // $ANTLR end "rule__Appear__Group__3"


    // $ANTLR start "rule__Appear__Group__3__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:862:1: rule__Appear__Group__3__Impl : ( ( rule__Appear__GeometryAssignment_3 ) ) ;
    public final void rule__Appear__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:866:1: ( ( ( rule__Appear__GeometryAssignment_3 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:867:1: ( ( rule__Appear__GeometryAssignment_3 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:867:1: ( ( rule__Appear__GeometryAssignment_3 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:868:1: ( rule__Appear__GeometryAssignment_3 )
            {
             before(grammarAccess.getAppearAccess().getGeometryAssignment_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:869:1: ( rule__Appear__GeometryAssignment_3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:869:2: rule__Appear__GeometryAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__GeometryAssignment_3_in_rule__Appear__Group__3__Impl1704);
            rule__Appear__GeometryAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAppearAccess().getGeometryAssignment_3()); 

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
    // $ANTLR end "rule__Appear__Group__3__Impl"


    // $ANTLR start "rule__Appear__Group__4"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:879:1: rule__Appear__Group__4 : rule__Appear__Group__4__Impl rule__Appear__Group__5 ;
    public final void rule__Appear__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:883:1: ( rule__Appear__Group__4__Impl rule__Appear__Group__5 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:884:2: rule__Appear__Group__4__Impl rule__Appear__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__4__Impl_in_rule__Appear__Group__41734);
            rule__Appear__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__5_in_rule__Appear__Group__41737);
            rule__Appear__Group__5();

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
    // $ANTLR end "rule__Appear__Group__4"


    // $ANTLR start "rule__Appear__Group__4__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:891:1: rule__Appear__Group__4__Impl : ( ',' ) ;
    public final void rule__Appear__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:895:1: ( ( ',' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:896:1: ( ',' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:896:1: ( ',' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:897:1: ','
            {
             before(grammarAccess.getAppearAccess().getCommaKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Appear__Group__4__Impl1765); 
             after(grammarAccess.getAppearAccess().getCommaKeyword_4()); 

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
    // $ANTLR end "rule__Appear__Group__4__Impl"


    // $ANTLR start "rule__Appear__Group__5"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:910:1: rule__Appear__Group__5 : rule__Appear__Group__5__Impl rule__Appear__Group__6 ;
    public final void rule__Appear__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:914:1: ( rule__Appear__Group__5__Impl rule__Appear__Group__6 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:915:2: rule__Appear__Group__5__Impl rule__Appear__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__5__Impl_in_rule__Appear__Group__51796);
            rule__Appear__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__6_in_rule__Appear__Group__51799);
            rule__Appear__Group__6();

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
    // $ANTLR end "rule__Appear__Group__5"


    // $ANTLR start "rule__Appear__Group__5__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:922:1: rule__Appear__Group__5__Impl : ( ( rule__Appear__AppearanceAssignment_5 ) ) ;
    public final void rule__Appear__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:926:1: ( ( ( rule__Appear__AppearanceAssignment_5 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:927:1: ( ( rule__Appear__AppearanceAssignment_5 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:927:1: ( ( rule__Appear__AppearanceAssignment_5 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:928:1: ( rule__Appear__AppearanceAssignment_5 )
            {
             before(grammarAccess.getAppearAccess().getAppearanceAssignment_5()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:929:1: ( rule__Appear__AppearanceAssignment_5 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:929:2: rule__Appear__AppearanceAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__AppearanceAssignment_5_in_rule__Appear__Group__5__Impl1826);
            rule__Appear__AppearanceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAppearAccess().getAppearanceAssignment_5()); 

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
    // $ANTLR end "rule__Appear__Group__5__Impl"


    // $ANTLR start "rule__Appear__Group__6"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:939:1: rule__Appear__Group__6 : rule__Appear__Group__6__Impl ;
    public final void rule__Appear__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:943:1: ( rule__Appear__Group__6__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:944:2: rule__Appear__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__6__Impl_in_rule__Appear__Group__61856);
            rule__Appear__Group__6__Impl();

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
    // $ANTLR end "rule__Appear__Group__6"


    // $ANTLR start "rule__Appear__Group__6__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:950:1: rule__Appear__Group__6__Impl : ( ')' ) ;
    public final void rule__Appear__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:954:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:955:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:955:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:956:1: ')'
            {
             before(grammarAccess.getAppearAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Appear__Group__6__Impl1884); 
             after(grammarAccess.getAppearAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Appear__Group__6__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:983:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:987:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:988:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__01929);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__01932);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:995:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:999:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1000:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1000:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1001:1: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1002:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1004:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1014:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1018:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1019:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__11990);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__11993);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1026:1: rule__Stop__Group__1__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1030:1: ( ( 'stop' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1031:1: ( 'stop' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1031:1: ( 'stop' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1032:1: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Stop__Group__1__Impl2021); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1045:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl rule__Stop__Group__3 ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1049:1: ( rule__Stop__Group__2__Impl rule__Stop__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1050:2: rule__Stop__Group__2__Impl rule__Stop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__22052);
            rule__Stop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__22055);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1057:1: rule__Stop__Group__2__Impl : ( '(' ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1061:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1062:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1062:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1063:1: '('
            {
             before(grammarAccess.getStopAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Stop__Group__2__Impl2083); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1076:1: rule__Stop__Group__3 : rule__Stop__Group__3__Impl ;
    public final void rule__Stop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1080:1: ( rule__Stop__Group__3__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1081:2: rule__Stop__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__32114);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1087:1: rule__Stop__Group__3__Impl : ( ')' ) ;
    public final void rule__Stop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1091:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1092:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1092:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1093:1: ')'
            {
             before(grammarAccess.getStopAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Stop__Group__3__Impl2142); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1114:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1118:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1119:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02181);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02184);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1126:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1130:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1131:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1131:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1132:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1133:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1135:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1145:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1149:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1150:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12242);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12245);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1157:1: rule__Sequence__Group__1__Impl : ( '[' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1161:1: ( ( '[' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1162:1: ( '[' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1162:1: ( '[' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1163:1: '['
            {
             before(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Sequence__Group__1__Impl2273); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1176:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1180:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1181:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22304);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22307);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1188:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__AnimationsAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1192:1: ( ( ( rule__Sequence__AnimationsAssignment_2 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1193:1: ( ( rule__Sequence__AnimationsAssignment_2 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1193:1: ( ( rule__Sequence__AnimationsAssignment_2 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1194:1: ( rule__Sequence__AnimationsAssignment_2 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_2()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1195:1: ( rule__Sequence__AnimationsAssignment_2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1195:2: rule__Sequence__AnimationsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__AnimationsAssignment_2_in_rule__Sequence__Group__2__Impl2334);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1205:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1209:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1210:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32364);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32367);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1217:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__Group_3__0 )* ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1221:1: ( ( ( rule__Sequence__Group_3__0 )* ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1222:1: ( ( rule__Sequence__Group_3__0 )* )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1222:1: ( ( rule__Sequence__Group_3__0 )* )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1223:1: ( rule__Sequence__Group_3__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1224:1: ( rule__Sequence__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1224:2: rule__Sequence__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2394);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1234:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1238:1: ( rule__Sequence__Group__4__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1239:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42425);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1245:1: rule__Sequence__Group__4__Impl : ( ']' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1249:1: ( ( ']' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1250:1: ( ']' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1250:1: ( ']' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1251:1: ']'
            {
             before(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Sequence__Group__4__Impl2453); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1274:1: rule__Sequence__Group_3__0 : rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 ;
    public final void rule__Sequence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1278:1: ( rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1279:2: rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02494);
            rule__Sequence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02497);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1286:1: rule__Sequence__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Sequence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1290:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1291:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1291:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1292:1: ';'
            {
             before(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Sequence__Group_3__0__Impl2525); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1305:1: rule__Sequence__Group_3__1 : rule__Sequence__Group_3__1__Impl ;
    public final void rule__Sequence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1309:1: ( rule__Sequence__Group_3__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1310:2: rule__Sequence__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12556);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1316:1: rule__Sequence__Group_3__1__Impl : ( ( rule__Sequence__AnimationsAssignment_3_1 ) ) ;
    public final void rule__Sequence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1320:1: ( ( ( rule__Sequence__AnimationsAssignment_3_1 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1321:1: ( ( rule__Sequence__AnimationsAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1321:1: ( ( rule__Sequence__AnimationsAssignment_3_1 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1322:1: ( rule__Sequence__AnimationsAssignment_3_1 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_3_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1323:1: ( rule__Sequence__AnimationsAssignment_3_1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1323:2: rule__Sequence__AnimationsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__AnimationsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2583);
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


    // $ANTLR start "rule__EDouble__Group__0"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1337:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1341:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1342:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02617);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02620);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1349:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1353:1: ( ( ( '-' )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1354:1: ( ( '-' )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1354:1: ( ( '-' )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1355:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1356:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1357:2: '-'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__EDouble__Group__0__Impl2649); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1368:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1372:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1373:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__12682);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__12685);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1380:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1384:1: ( ( ( RULE_INT )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1385:1: ( ( RULE_INT )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1385:1: ( ( RULE_INT )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1386:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1387:1: ( RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1387:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl2713); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1397:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1401:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1402:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__22744);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__22747);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1409:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1413:1: ( ( '.' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1414:1: ( '.' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1414:1: ( '.' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1415:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__EDouble__Group__2__Impl2775); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1428:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1432:1: ( rule__EDouble__Group__3__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1433:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__32806);
            rule__EDouble__Group__3__Impl();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1439:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1443:1: ( ( RULE_INT ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1444:1: ( RULE_INT )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1444:1: ( RULE_INT )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1445:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl2833); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__Animation_Impl__AnimationsAssignment_1_2"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1466:1: rule__Animation_Impl__AnimationsAssignment_1_2 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1470:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1471:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1471:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1472:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22876);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1481:1: rule__Animation_Impl__AnimationsAssignment_1_3_1 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1485:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1486:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1486:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1487:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12907);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1496:1: rule__Move__SpeedAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Move__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1500:1: ( ( ruleEDouble ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1501:1: ( ruleEDouble )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1501:1: ( ruleEDouble )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1502:1: ruleEDouble
            {
             before(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_32938);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Appear__GeometryAssignment_3"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1511:1: rule__Appear__GeometryAssignment_3 : ( ruleEString ) ;
    public final void rule__Appear__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1515:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1516:1: ( ruleEString )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1516:1: ( ruleEString )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1517:1: ruleEString
            {
             before(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Appear__GeometryAssignment_32969);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Appear__GeometryAssignment_3"


    // $ANTLR start "rule__Appear__AppearanceAssignment_5"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1526:1: rule__Appear__AppearanceAssignment_5 : ( ruleEString ) ;
    public final void rule__Appear__AppearanceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1530:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1531:1: ( ruleEString )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1531:1: ( ruleEString )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1532:1: ruleEString
            {
             before(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Appear__AppearanceAssignment_53000);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Appear__AppearanceAssignment_5"


    // $ANTLR start "rule__Sequence__AnimationsAssignment_2"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1541:1: rule__Sequence__AnimationsAssignment_2 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1545:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1546:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1546:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1547:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_23031);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1556:1: rule__Sequence__AnimationsAssignment_3_1 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1560:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1561:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1561:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1562:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_3_13062);
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
        public static final BitSet FOLLOW_ruleAppear_in_entryRuleAppear181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAppear188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__0_in_ruleAppear214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0_in_ruleStop274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Alternatives_in_ruleAnimation394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Animation__Alternatives552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_rule__Animation__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_rule__Animation__Alternatives586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rule__Animation__Alternatives603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0682 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0803 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1865 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__2926 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__2929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__3986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl1013 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__01052 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__01055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl1083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__11114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl1141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01175 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11236 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Move__Group__1__Impl1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21298 = new BitSet(new long[]{0x0000000000300040L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Move__Group__2__Impl1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31360 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__4__Impl1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__01489 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__01492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__11550 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__11553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Appear__Group__1__Impl1581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__21612 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__21615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Appear__Group__2__Impl1643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__31674 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Appear__Group__4_in_rule__Appear__Group__31677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__GeometryAssignment_3_in_rule__Appear__Group__3__Impl1704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__4__Impl_in_rule__Appear__Group__41734 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Appear__Group__5_in_rule__Appear__Group__41737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Appear__Group__4__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__5__Impl_in_rule__Appear__Group__51796 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Appear__Group__6_in_rule__Appear__Group__51799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__AppearanceAssignment_5_in_rule__Appear__Group__5__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__6__Impl_in_rule__Appear__Group__61856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Appear__Group__6__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__01929 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__01932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__11990 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__11993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Stop__Group__1__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__22052 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__22055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Stop__Group__2__Impl2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__32114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Stop__Group__3__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02181 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12242 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Sequence__Group__1__Impl2273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22304 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__AnimationsAssignment_2_in_rule__Sequence__Group__2__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32364 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2394 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Sequence__Group__4__Impl2453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02494 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Sequence__Group_3__0__Impl2525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__AnimationsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__02617 = new BitSet(new long[]{0x0000000000300040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__02620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EDouble__Group__0__Impl2649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__12682 = new BitSet(new long[]{0x0000000000300040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__12685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl2713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__22744 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__22747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__EDouble__Group__2__Impl2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__32806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl2833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_32938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Appear__GeometryAssignment_32969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Appear__AppearanceAssignment_53000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_23031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_3_13062 = new BitSet(new long[]{0x0000000000000002L});
    }


}