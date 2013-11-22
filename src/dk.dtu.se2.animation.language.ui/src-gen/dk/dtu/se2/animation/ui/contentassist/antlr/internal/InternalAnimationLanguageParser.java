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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "')'", "'appear'", "','", "'stop'", "'['", "']'", "'-'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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


    // $ANTLR start "entryRuleEInt"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:229:1: ( ruleEInt EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt421);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt428); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__EInt__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:243:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:1: ( rule__EInt__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt454);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:256:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:257:1: ( ruleEString EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:258:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString481);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString488); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:265:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:269:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:270:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:270:1: ( ( rule__EString__Alternatives ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:271:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:1: ( rule__EString__Alternatives )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString514);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:284:1: rule__Animation__Alternatives : ( ( ruleMove ) | ( ruleAppear ) | ( ruleStop ) | ( ruleSequence ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:288:1: ( ( ruleMove ) | ( ruleAppear ) | ( ruleStop ) | ( ruleSequence ) )
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
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:289:1: ( ruleMove )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:289:1: ( ruleMove )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:290:1: ruleMove
                    {
                     before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Animation__Alternatives550);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:295:6: ( ruleAppear )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:295:6: ( ruleAppear )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:296:1: ruleAppear
                    {
                     before(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAppear_in_rule__Animation__Alternatives567);
                    ruleAppear();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:301:6: ( ruleStop )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:301:6: ( ruleStop )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:302:1: ruleStop
                    {
                     before(grammarAccess.getAnimationAccess().getStopParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_rule__Animation__Alternatives584);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getStopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:307:6: ( ruleSequence )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:307:6: ( ruleSequence )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:308:1: ruleSequence
                    {
                     before(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_rule__Animation__Alternatives601);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:318:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:322:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:323:1: ( RULE_STRING )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:323:1: ( RULE_STRING )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:324:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives633); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:329:6: ( RULE_ID )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:329:6: ( RULE_ID )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:330:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives650); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:342:1: rule__Animation_Impl__Group__0 : rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 ;
    public final void rule__Animation_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:346:1: ( rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:347:2: rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0680);
            rule__Animation_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0683);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:354:1: rule__Animation_Impl__Group__0__Impl : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:358:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:359:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:359:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:360:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl710);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:371:1: rule__Animation_Impl__Group__1 : rule__Animation_Impl__Group__1__Impl ;
    public final void rule__Animation_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:375:1: ( rule__Animation_Impl__Group__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:376:2: rule__Animation_Impl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1739);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:382:1: rule__Animation_Impl__Group__1__Impl : ( ( rule__Animation_Impl__Group_1__0 )? ) ;
    public final void rule__Animation_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:386:1: ( ( ( rule__Animation_Impl__Group_1__0 )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:387:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:387:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:388:1: ( rule__Animation_Impl__Group_1__0 )?
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:389:1: ( rule__Animation_Impl__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:389:2: rule__Animation_Impl__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl766);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:403:1: rule__Animation_Impl__Group_1__0 : rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 ;
    public final void rule__Animation_Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:407:1: ( rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:408:2: rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0801);
            rule__Animation_Impl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0804);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:415:1: rule__Animation_Impl__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:419:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:420:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:420:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:421:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl832); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:434:1: rule__Animation_Impl__Group_1__1 : rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 ;
    public final void rule__Animation_Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:438:1: ( rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:439:2: rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1863);
            rule__Animation_Impl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1866);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:446:1: rule__Animation_Impl__Group_1__1__Impl : ( () ) ;
    public final void rule__Animation_Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:450:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:451:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:451:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:452:1: ()
            {
             before(grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:453:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:455:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:465:1: rule__Animation_Impl__Group_1__2 : rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 ;
    public final void rule__Animation_Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:469:1: ( rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:470:2: rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__2924);
            rule__Animation_Impl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__2927);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:477:1: rule__Animation_Impl__Group_1__2__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) ;
    public final void rule__Animation_Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:481:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:482:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:482:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:483:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:484:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:484:2: rule__Animation_Impl__AnimationsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl954);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:494:1: rule__Animation_Impl__Group_1__3 : rule__Animation_Impl__Group_1__3__Impl ;
    public final void rule__Animation_Impl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:498:1: ( rule__Animation_Impl__Group_1__3__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:499:2: rule__Animation_Impl__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__3984);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:505:1: rule__Animation_Impl__Group_1__3__Impl : ( ( rule__Animation_Impl__Group_1_3__0 )* ) ;
    public final void rule__Animation_Impl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:509:1: ( ( ( rule__Animation_Impl__Group_1_3__0 )* ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:510:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:510:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:511:1: ( rule__Animation_Impl__Group_1_3__0 )*
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:512:1: ( rule__Animation_Impl__Group_1_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:512:2: rule__Animation_Impl__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl1011);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:530:1: rule__Animation_Impl__Group_1_3__0 : rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 ;
    public final void rule__Animation_Impl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:534:1: ( rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:535:2: rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__01050);
            rule__Animation_Impl__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__01053);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:542:1: rule__Animation_Impl__Group_1_3__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:546:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:547:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:547:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:548:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl1081); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:561:1: rule__Animation_Impl__Group_1_3__1 : rule__Animation_Impl__Group_1_3__1__Impl ;
    public final void rule__Animation_Impl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:565:1: ( rule__Animation_Impl__Group_1_3__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:566:2: rule__Animation_Impl__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__11112);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:572:1: rule__Animation_Impl__Group_1_3__1__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) ;
    public final void rule__Animation_Impl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:576:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:577:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:577:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:578:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:579:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:579:2: rule__Animation_Impl__AnimationsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl1139);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:593:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:597:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:598:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01173);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01176);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:605:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:609:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:610:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:610:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:611:1: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:612:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:614:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:624:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:628:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:629:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11234);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11237);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:636:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:640:1: ( ( 'move' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:641:1: ( 'move' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:641:1: ( 'move' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:642:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Move__Group__1__Impl1265); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:655:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:659:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:660:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21296);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21299);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:667:1: rule__Move__Group__2__Impl : ( '(' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:671:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:672:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:672:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:673:1: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Move__Group__2__Impl1327); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:686:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:690:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:691:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31358);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31361);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:698:1: rule__Move__Group__3__Impl : ( ( rule__Move__SpeedAssignment_3 ) ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:702:1: ( ( ( rule__Move__SpeedAssignment_3 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:703:1: ( ( rule__Move__SpeedAssignment_3 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:703:1: ( ( rule__Move__SpeedAssignment_3 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:704:1: ( rule__Move__SpeedAssignment_3 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:705:1: ( rule__Move__SpeedAssignment_3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:705:2: rule__Move__SpeedAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1388);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:715:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:719:1: ( rule__Move__Group__4__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:720:2: rule__Move__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41418);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:726:1: rule__Move__Group__4__Impl : ( ')' ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:730:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:731:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:731:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:732:1: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__4__Impl1446); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:755:1: rule__Appear__Group__0 : rule__Appear__Group__0__Impl rule__Appear__Group__1 ;
    public final void rule__Appear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:759:1: ( rule__Appear__Group__0__Impl rule__Appear__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:760:2: rule__Appear__Group__0__Impl rule__Appear__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__01487);
            rule__Appear__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__01490);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:767:1: rule__Appear__Group__0__Impl : ( () ) ;
    public final void rule__Appear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:771:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:772:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:772:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:773:1: ()
            {
             before(grammarAccess.getAppearAccess().getAppearAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:774:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:776:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:786:1: rule__Appear__Group__1 : rule__Appear__Group__1__Impl rule__Appear__Group__2 ;
    public final void rule__Appear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:790:1: ( rule__Appear__Group__1__Impl rule__Appear__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:791:2: rule__Appear__Group__1__Impl rule__Appear__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__11548);
            rule__Appear__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__11551);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:798:1: rule__Appear__Group__1__Impl : ( 'appear' ) ;
    public final void rule__Appear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:802:1: ( ( 'appear' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:803:1: ( 'appear' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:803:1: ( 'appear' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:804:1: 'appear'
            {
             before(grammarAccess.getAppearAccess().getAppearKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Appear__Group__1__Impl1579); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:817:1: rule__Appear__Group__2 : rule__Appear__Group__2__Impl rule__Appear__Group__3 ;
    public final void rule__Appear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:821:1: ( rule__Appear__Group__2__Impl rule__Appear__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:822:2: rule__Appear__Group__2__Impl rule__Appear__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__21610);
            rule__Appear__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__21613);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:829:1: rule__Appear__Group__2__Impl : ( '(' ) ;
    public final void rule__Appear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:833:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:834:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:834:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:835:1: '('
            {
             before(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Appear__Group__2__Impl1641); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:848:1: rule__Appear__Group__3 : rule__Appear__Group__3__Impl rule__Appear__Group__4 ;
    public final void rule__Appear__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:852:1: ( rule__Appear__Group__3__Impl rule__Appear__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:853:2: rule__Appear__Group__3__Impl rule__Appear__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__31672);
            rule__Appear__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__4_in_rule__Appear__Group__31675);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:860:1: rule__Appear__Group__3__Impl : ( ( rule__Appear__GeometryAssignment_3 ) ) ;
    public final void rule__Appear__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:864:1: ( ( ( rule__Appear__GeometryAssignment_3 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:865:1: ( ( rule__Appear__GeometryAssignment_3 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:865:1: ( ( rule__Appear__GeometryAssignment_3 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:866:1: ( rule__Appear__GeometryAssignment_3 )
            {
             before(grammarAccess.getAppearAccess().getGeometryAssignment_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:867:1: ( rule__Appear__GeometryAssignment_3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:867:2: rule__Appear__GeometryAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__GeometryAssignment_3_in_rule__Appear__Group__3__Impl1702);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:877:1: rule__Appear__Group__4 : rule__Appear__Group__4__Impl rule__Appear__Group__5 ;
    public final void rule__Appear__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:881:1: ( rule__Appear__Group__4__Impl rule__Appear__Group__5 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:882:2: rule__Appear__Group__4__Impl rule__Appear__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__4__Impl_in_rule__Appear__Group__41732);
            rule__Appear__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__5_in_rule__Appear__Group__41735);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:889:1: rule__Appear__Group__4__Impl : ( ',' ) ;
    public final void rule__Appear__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:893:1: ( ( ',' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:894:1: ( ',' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:894:1: ( ',' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:895:1: ','
            {
             before(grammarAccess.getAppearAccess().getCommaKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Appear__Group__4__Impl1763); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:908:1: rule__Appear__Group__5 : rule__Appear__Group__5__Impl rule__Appear__Group__6 ;
    public final void rule__Appear__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:912:1: ( rule__Appear__Group__5__Impl rule__Appear__Group__6 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:913:2: rule__Appear__Group__5__Impl rule__Appear__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__5__Impl_in_rule__Appear__Group__51794);
            rule__Appear__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__6_in_rule__Appear__Group__51797);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:920:1: rule__Appear__Group__5__Impl : ( ( rule__Appear__AppearanceAssignment_5 ) ) ;
    public final void rule__Appear__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:924:1: ( ( ( rule__Appear__AppearanceAssignment_5 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:925:1: ( ( rule__Appear__AppearanceAssignment_5 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:925:1: ( ( rule__Appear__AppearanceAssignment_5 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:926:1: ( rule__Appear__AppearanceAssignment_5 )
            {
             before(grammarAccess.getAppearAccess().getAppearanceAssignment_5()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:927:1: ( rule__Appear__AppearanceAssignment_5 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:927:2: rule__Appear__AppearanceAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__AppearanceAssignment_5_in_rule__Appear__Group__5__Impl1824);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:937:1: rule__Appear__Group__6 : rule__Appear__Group__6__Impl ;
    public final void rule__Appear__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:941:1: ( rule__Appear__Group__6__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:942:2: rule__Appear__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__6__Impl_in_rule__Appear__Group__61854);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:948:1: rule__Appear__Group__6__Impl : ( ')' ) ;
    public final void rule__Appear__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:952:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:953:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:953:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:954:1: ')'
            {
             before(grammarAccess.getAppearAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Appear__Group__6__Impl1882); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:981:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:985:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:986:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__01927);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__01930);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:993:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:997:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:998:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:998:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:999:1: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1000:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1002:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1012:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1016:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1017:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__11988);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__11991);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1024:1: rule__Stop__Group__1__Impl : ( 'stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1028:1: ( ( 'stop' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1029:1: ( 'stop' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1029:1: ( 'stop' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1030:1: 'stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Stop__Group__1__Impl2019); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1043:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl rule__Stop__Group__3 ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1047:1: ( rule__Stop__Group__2__Impl rule__Stop__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1048:2: rule__Stop__Group__2__Impl rule__Stop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__22050);
            rule__Stop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__22053);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1055:1: rule__Stop__Group__2__Impl : ( '(' ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1059:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1060:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1060:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1061:1: '('
            {
             before(grammarAccess.getStopAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Stop__Group__2__Impl2081); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1074:1: rule__Stop__Group__3 : rule__Stop__Group__3__Impl ;
    public final void rule__Stop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1078:1: ( rule__Stop__Group__3__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1079:2: rule__Stop__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__32112);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1085:1: rule__Stop__Group__3__Impl : ( ')' ) ;
    public final void rule__Stop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1089:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1090:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1090:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1091:1: ')'
            {
             before(grammarAccess.getStopAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Stop__Group__3__Impl2140); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1112:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1116:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1117:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02179);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02182);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1124:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1128:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1129:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1129:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1130:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1131:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1133:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1143:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1147:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1148:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12240);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12243);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1155:1: rule__Sequence__Group__1__Impl : ( '[' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1159:1: ( ( '[' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1160:1: ( '[' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1160:1: ( '[' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1161:1: '['
            {
             before(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Sequence__Group__1__Impl2271); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1174:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1178:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1179:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22302);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22305);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1186:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__AnimationsAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1190:1: ( ( ( rule__Sequence__AnimationsAssignment_2 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1191:1: ( ( rule__Sequence__AnimationsAssignment_2 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1191:1: ( ( rule__Sequence__AnimationsAssignment_2 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1192:1: ( rule__Sequence__AnimationsAssignment_2 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_2()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1193:1: ( rule__Sequence__AnimationsAssignment_2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1193:2: rule__Sequence__AnimationsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__AnimationsAssignment_2_in_rule__Sequence__Group__2__Impl2332);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1203:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1207:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1208:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32362);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32365);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1215:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__Group_3__0 )* ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1219:1: ( ( ( rule__Sequence__Group_3__0 )* ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1220:1: ( ( rule__Sequence__Group_3__0 )* )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1220:1: ( ( rule__Sequence__Group_3__0 )* )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1221:1: ( rule__Sequence__Group_3__0 )*
            {
             before(grammarAccess.getSequenceAccess().getGroup_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1222:1: ( rule__Sequence__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1222:2: rule__Sequence__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2392);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1232:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1236:1: ( rule__Sequence__Group__4__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1237:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42423);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1243:1: rule__Sequence__Group__4__Impl : ( ']' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1247:1: ( ( ']' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1248:1: ( ']' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1248:1: ( ']' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1249:1: ']'
            {
             before(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Sequence__Group__4__Impl2451); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1272:1: rule__Sequence__Group_3__0 : rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 ;
    public final void rule__Sequence__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1276:1: ( rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1277:2: rule__Sequence__Group_3__0__Impl rule__Sequence__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02492);
            rule__Sequence__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02495);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1284:1: rule__Sequence__Group_3__0__Impl : ( ';' ) ;
    public final void rule__Sequence__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1288:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1289:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1289:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1290:1: ';'
            {
             before(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Sequence__Group_3__0__Impl2523); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1303:1: rule__Sequence__Group_3__1 : rule__Sequence__Group_3__1__Impl ;
    public final void rule__Sequence__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1307:1: ( rule__Sequence__Group_3__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1308:2: rule__Sequence__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12554);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1314:1: rule__Sequence__Group_3__1__Impl : ( ( rule__Sequence__AnimationsAssignment_3_1 ) ) ;
    public final void rule__Sequence__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1318:1: ( ( ( rule__Sequence__AnimationsAssignment_3_1 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1319:1: ( ( rule__Sequence__AnimationsAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1319:1: ( ( rule__Sequence__AnimationsAssignment_3_1 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1320:1: ( rule__Sequence__AnimationsAssignment_3_1 )
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAssignment_3_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1321:1: ( rule__Sequence__AnimationsAssignment_3_1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1321:2: rule__Sequence__AnimationsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Sequence__AnimationsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2581);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1335:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1339:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1340:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02615);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02618);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1347:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1351:1: ( ( ( '-' )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1352:1: ( ( '-' )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1352:1: ( ( '-' )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1353:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1354:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1355:2: '-'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__EInt__Group__0__Impl2647); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1366:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1370:1: ( rule__EInt__Group__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1371:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12680);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1377:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1381:1: ( ( RULE_INT ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1382:1: ( RULE_INT )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1382:1: ( RULE_INT )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1383:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2707); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1399:1: rule__Animation_Impl__AnimationsAssignment_1_2 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1403:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1404:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1404:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1405:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22745);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1414:1: rule__Animation_Impl__AnimationsAssignment_1_3_1 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1418:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1419:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1419:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1420:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12776);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1429:1: rule__Move__SpeedAssignment_3 : ( ruleEInt ) ;
    public final void rule__Move__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1433:1: ( ( ruleEInt ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1434:1: ( ruleEInt )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1434:1: ( ruleEInt )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1435:1: ruleEInt
            {
             before(grammarAccess.getMoveAccess().getSpeedEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Move__SpeedAssignment_32807);
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


    // $ANTLR start "rule__Appear__GeometryAssignment_3"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1444:1: rule__Appear__GeometryAssignment_3 : ( ruleEString ) ;
    public final void rule__Appear__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1448:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1449:1: ( ruleEString )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1449:1: ( ruleEString )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1450:1: ruleEString
            {
             before(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Appear__GeometryAssignment_32838);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1459:1: rule__Appear__AppearanceAssignment_5 : ( ruleEString ) ;
    public final void rule__Appear__AppearanceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1463:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1464:1: ( ruleEString )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1464:1: ( ruleEString )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1465:1: ruleEString
            {
             before(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Appear__AppearanceAssignment_52869);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1474:1: rule__Sequence__AnimationsAssignment_2 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1478:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1479:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1479:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1480:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_22900);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1489:1: rule__Sequence__AnimationsAssignment_3_1 : ( ruleAnimation ) ;
    public final void rule__Sequence__AnimationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1493:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1494:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1494:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1495:1: ruleAnimation
            {
             before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_3_12931);
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
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Animation__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_rule__Animation__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_rule__Animation__Alternatives584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_rule__Animation__Alternatives601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0680 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0801 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1863 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__2924 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__3984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl1011 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__01050 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__01053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl1081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__11112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl1139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01173 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11234 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Move__Group__1__Impl1265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21296 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Move__Group__2__Impl1327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31358 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__4__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__01487 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__01490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__11548 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__11551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Appear__Group__1__Impl1579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__21610 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__21613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Appear__Group__2__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__31672 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Appear__Group__4_in_rule__Appear__Group__31675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__GeometryAssignment_3_in_rule__Appear__Group__3__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__4__Impl_in_rule__Appear__Group__41732 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Appear__Group__5_in_rule__Appear__Group__41735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Appear__Group__4__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__5__Impl_in_rule__Appear__Group__51794 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Appear__Group__6_in_rule__Appear__Group__51797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__AppearanceAssignment_5_in_rule__Appear__Group__5__Impl1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__6__Impl_in_rule__Appear__Group__61854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Appear__Group__6__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__01927 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__01930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__11988 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__11991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Stop__Group__1__Impl2019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__22050 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__22053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Stop__Group__2__Impl2081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__32112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Stop__Group__3__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02179 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12240 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Sequence__Group__1__Impl2271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22302 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__AnimationsAssignment_2_in_rule__Sequence__Group__2__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32362 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0_in_rule__Sequence__Group__3__Impl2392 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Sequence__Group__4__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__0__Impl_in_rule__Sequence__Group_3__02492 = new BitSet(new long[]{0x0000000000069000L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1_in_rule__Sequence__Group_3__02495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Sequence__Group_3__0__Impl2523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__Group_3__1__Impl_in_rule__Sequence__Group_3__12554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Sequence__AnimationsAssignment_3_1_in_rule__Sequence__Group_3__1__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02615 = new BitSet(new long[]{0x0000000000100040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__02618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__EInt__Group__0__Impl2647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__12680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl2707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Move__SpeedAssignment_32807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Appear__GeometryAssignment_32838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Appear__AppearanceAssignment_52869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_22900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Sequence__AnimationsAssignment_3_12931 = new BitSet(new long[]{0x0000000000000002L});
    }


}