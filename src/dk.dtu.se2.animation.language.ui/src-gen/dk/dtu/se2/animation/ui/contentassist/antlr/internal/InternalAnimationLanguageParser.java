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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "')'", "'appear'", "','", "'-'", "'.'"
    };
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


    // $ANTLR start "entryRuleAnimation"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:144:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:145:1: ( ruleAnimation EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:146:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation241);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation248); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:153:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:157:2: ( ( ( rule__Animation__Alternatives ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__Animation__Alternatives ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__Animation__Alternatives ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:159:1: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:1: ( rule__Animation__Alternatives )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:2: rule__Animation__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Alternatives_in_ruleAnimation274);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:172:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:173:1: ( ruleEDouble EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:174:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble301);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble308); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:181:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:185:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__EDouble__Group__0 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:187:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:1: ( rule__EDouble__Group__0 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble334);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:202:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:203:1: ( ruleEString EOF )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:204:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString363);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString370); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:211:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:215:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:1: ( ( rule__EString__Alternatives ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:217:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:218:1: ( rule__EString__Alternatives )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:218:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString396);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:230:1: rule__Animation__Alternatives : ( ( ruleMove ) | ( ruleAppear ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:234:1: ( ( ruleMove ) | ( ruleAppear ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:235:1: ( ruleMove )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:235:1: ( ruleMove )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:236:1: ruleMove
                    {
                     before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__Animation__Alternatives432);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:241:6: ( ruleAppear )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:241:6: ( ruleAppear )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ruleAppear
                    {
                     before(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAppear_in_rule__Animation__Alternatives449);
                    ruleAppear();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:257:1: ( RULE_STRING )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:257:1: ( RULE_STRING )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:258:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives481); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:263:6: ( RULE_ID )
                    {
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:263:6: ( RULE_ID )
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:264:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives498); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:276:1: rule__Animation_Impl__Group__0 : rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 ;
    public final void rule__Animation_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:280:1: ( rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:281:2: rule__Animation_Impl__Group__0__Impl rule__Animation_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0528);
            rule__Animation_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0531);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:288:1: rule__Animation_Impl__Group__0__Impl : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:292:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:293:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:293:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:294:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl558);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:305:1: rule__Animation_Impl__Group__1 : rule__Animation_Impl__Group__1__Impl ;
    public final void rule__Animation_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:309:1: ( rule__Animation_Impl__Group__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:310:2: rule__Animation_Impl__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1587);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:316:1: rule__Animation_Impl__Group__1__Impl : ( ( rule__Animation_Impl__Group_1__0 )? ) ;
    public final void rule__Animation_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:320:1: ( ( ( rule__Animation_Impl__Group_1__0 )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:321:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:321:1: ( ( rule__Animation_Impl__Group_1__0 )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:322:1: ( rule__Animation_Impl__Group_1__0 )?
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:323:1: ( rule__Animation_Impl__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:323:2: rule__Animation_Impl__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl614);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:337:1: rule__Animation_Impl__Group_1__0 : rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 ;
    public final void rule__Animation_Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:341:1: ( rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:342:2: rule__Animation_Impl__Group_1__0__Impl rule__Animation_Impl__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0649);
            rule__Animation_Impl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0652);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:349:1: rule__Animation_Impl__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:353:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:354:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:354:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:355:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl680); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:368:1: rule__Animation_Impl__Group_1__1 : rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 ;
    public final void rule__Animation_Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:372:1: ( rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:373:2: rule__Animation_Impl__Group_1__1__Impl rule__Animation_Impl__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1711);
            rule__Animation_Impl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1714);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:380:1: rule__Animation_Impl__Group_1__1__Impl : ( () ) ;
    public final void rule__Animation_Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:384:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:385:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:385:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:386:1: ()
            {
             before(grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:387:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:389:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:399:1: rule__Animation_Impl__Group_1__2 : rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 ;
    public final void rule__Animation_Impl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:403:1: ( rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:404:2: rule__Animation_Impl__Group_1__2__Impl rule__Animation_Impl__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__2772);
            rule__Animation_Impl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__2775);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:411:1: rule__Animation_Impl__Group_1__2__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) ;
    public final void rule__Animation_Impl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:415:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:416:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:416:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_2 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:417:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:418:1: ( rule__Animation_Impl__AnimationsAssignment_1_2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:418:2: rule__Animation_Impl__AnimationsAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl802);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:428:1: rule__Animation_Impl__Group_1__3 : rule__Animation_Impl__Group_1__3__Impl ;
    public final void rule__Animation_Impl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:432:1: ( rule__Animation_Impl__Group_1__3__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:433:2: rule__Animation_Impl__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__3832);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:439:1: rule__Animation_Impl__Group_1__3__Impl : ( ( rule__Animation_Impl__Group_1_3__0 )* ) ;
    public final void rule__Animation_Impl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:443:1: ( ( ( rule__Animation_Impl__Group_1_3__0 )* ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:444:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:444:1: ( ( rule__Animation_Impl__Group_1_3__0 )* )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:445:1: ( rule__Animation_Impl__Group_1_3__0 )*
            {
             before(grammarAccess.getAnimation_ImplAccess().getGroup_1_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:446:1: ( rule__Animation_Impl__Group_1_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:446:2: rule__Animation_Impl__Group_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl859);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:464:1: rule__Animation_Impl__Group_1_3__0 : rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 ;
    public final void rule__Animation_Impl__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:468:1: ( rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:469:2: rule__Animation_Impl__Group_1_3__0__Impl rule__Animation_Impl__Group_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__0898);
            rule__Animation_Impl__Group_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__0901);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:476:1: rule__Animation_Impl__Group_1_3__0__Impl : ( ';' ) ;
    public final void rule__Animation_Impl__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:480:1: ( ( ';' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:481:1: ( ';' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:481:1: ( ';' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:482:1: ';'
            {
             before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl929); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:495:1: rule__Animation_Impl__Group_1_3__1 : rule__Animation_Impl__Group_1_3__1__Impl ;
    public final void rule__Animation_Impl__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:499:1: ( rule__Animation_Impl__Group_1_3__1__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:500:2: rule__Animation_Impl__Group_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__1960);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:506:1: rule__Animation_Impl__Group_1_3__1__Impl : ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) ;
    public final void rule__Animation_Impl__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:510:1: ( ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:511:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:511:1: ( ( rule__Animation_Impl__AnimationsAssignment_1_3_1 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:512:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:513:1: ( rule__Animation_Impl__AnimationsAssignment_1_3_1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:513:2: rule__Animation_Impl__AnimationsAssignment_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl987);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:527:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:531:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:532:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01021);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01024);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:539:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:543:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:544:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:544:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:545:1: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:546:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:548:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:558:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:562:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:563:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11082);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11085);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:570:1: rule__Move__Group__1__Impl : ( 'move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:574:1: ( ( 'move' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:575:1: ( 'move' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:575:1: ( 'move' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:576:1: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Move__Group__1__Impl1113); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:589:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:593:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:594:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21144);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21147);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:601:1: rule__Move__Group__2__Impl : ( '(' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:605:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:606:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:606:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:607:1: '('
            {
             before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Move__Group__2__Impl1175); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:620:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:624:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:625:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31206);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31209);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:632:1: rule__Move__Group__3__Impl : ( ( rule__Move__SpeedAssignment_3 ) ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:636:1: ( ( ( rule__Move__SpeedAssignment_3 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:637:1: ( ( rule__Move__SpeedAssignment_3 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:637:1: ( ( rule__Move__SpeedAssignment_3 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:638:1: ( rule__Move__SpeedAssignment_3 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:639:1: ( rule__Move__SpeedAssignment_3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:639:2: rule__Move__SpeedAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1236);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:649:1: rule__Move__Group__4 : rule__Move__Group__4__Impl ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:653:1: ( rule__Move__Group__4__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:654:2: rule__Move__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41266);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:660:1: rule__Move__Group__4__Impl : ( ')' ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:664:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:665:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:665:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:666:1: ')'
            {
             before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__4__Impl1294); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:689:1: rule__Appear__Group__0 : rule__Appear__Group__0__Impl rule__Appear__Group__1 ;
    public final void rule__Appear__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:693:1: ( rule__Appear__Group__0__Impl rule__Appear__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:694:2: rule__Appear__Group__0__Impl rule__Appear__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__01335);
            rule__Appear__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__01338);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:701:1: rule__Appear__Group__0__Impl : ( () ) ;
    public final void rule__Appear__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:705:1: ( ( () ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:706:1: ( () )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:706:1: ( () )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:707:1: ()
            {
             before(grammarAccess.getAppearAccess().getAppearAction_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:708:1: ()
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:710:1: 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:720:1: rule__Appear__Group__1 : rule__Appear__Group__1__Impl rule__Appear__Group__2 ;
    public final void rule__Appear__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:724:1: ( rule__Appear__Group__1__Impl rule__Appear__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:725:2: rule__Appear__Group__1__Impl rule__Appear__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__11396);
            rule__Appear__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__11399);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:732:1: rule__Appear__Group__1__Impl : ( 'appear' ) ;
    public final void rule__Appear__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:736:1: ( ( 'appear' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:737:1: ( 'appear' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:737:1: ( 'appear' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:738:1: 'appear'
            {
             before(grammarAccess.getAppearAccess().getAppearKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Appear__Group__1__Impl1427); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:751:1: rule__Appear__Group__2 : rule__Appear__Group__2__Impl rule__Appear__Group__3 ;
    public final void rule__Appear__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:755:1: ( rule__Appear__Group__2__Impl rule__Appear__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:756:2: rule__Appear__Group__2__Impl rule__Appear__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__21458);
            rule__Appear__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__21461);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:763:1: rule__Appear__Group__2__Impl : ( '(' ) ;
    public final void rule__Appear__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:767:1: ( ( '(' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:768:1: ( '(' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:768:1: ( '(' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:769:1: '('
            {
             before(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Appear__Group__2__Impl1489); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:782:1: rule__Appear__Group__3 : rule__Appear__Group__3__Impl rule__Appear__Group__4 ;
    public final void rule__Appear__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:786:1: ( rule__Appear__Group__3__Impl rule__Appear__Group__4 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:787:2: rule__Appear__Group__3__Impl rule__Appear__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__31520);
            rule__Appear__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__4_in_rule__Appear__Group__31523);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:794:1: rule__Appear__Group__3__Impl : ( ( rule__Appear__GeometryAssignment_3 ) ) ;
    public final void rule__Appear__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:798:1: ( ( ( rule__Appear__GeometryAssignment_3 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:799:1: ( ( rule__Appear__GeometryAssignment_3 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:799:1: ( ( rule__Appear__GeometryAssignment_3 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:800:1: ( rule__Appear__GeometryAssignment_3 )
            {
             before(grammarAccess.getAppearAccess().getGeometryAssignment_3()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:801:1: ( rule__Appear__GeometryAssignment_3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:801:2: rule__Appear__GeometryAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__GeometryAssignment_3_in_rule__Appear__Group__3__Impl1550);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:811:1: rule__Appear__Group__4 : rule__Appear__Group__4__Impl rule__Appear__Group__5 ;
    public final void rule__Appear__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:815:1: ( rule__Appear__Group__4__Impl rule__Appear__Group__5 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:816:2: rule__Appear__Group__4__Impl rule__Appear__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__4__Impl_in_rule__Appear__Group__41580);
            rule__Appear__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__5_in_rule__Appear__Group__41583);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:823:1: rule__Appear__Group__4__Impl : ( ',' ) ;
    public final void rule__Appear__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:827:1: ( ( ',' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:828:1: ( ',' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:828:1: ( ',' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:829:1: ','
            {
             before(grammarAccess.getAppearAccess().getCommaKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Appear__Group__4__Impl1611); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:842:1: rule__Appear__Group__5 : rule__Appear__Group__5__Impl rule__Appear__Group__6 ;
    public final void rule__Appear__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:846:1: ( rule__Appear__Group__5__Impl rule__Appear__Group__6 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:847:2: rule__Appear__Group__5__Impl rule__Appear__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__5__Impl_in_rule__Appear__Group__51642);
            rule__Appear__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__6_in_rule__Appear__Group__51645);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:854:1: rule__Appear__Group__5__Impl : ( ( rule__Appear__AppearanceAssignment_5 ) ) ;
    public final void rule__Appear__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:858:1: ( ( ( rule__Appear__AppearanceAssignment_5 ) ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:859:1: ( ( rule__Appear__AppearanceAssignment_5 ) )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:859:1: ( ( rule__Appear__AppearanceAssignment_5 ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:860:1: ( rule__Appear__AppearanceAssignment_5 )
            {
             before(grammarAccess.getAppearAccess().getAppearanceAssignment_5()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:861:1: ( rule__Appear__AppearanceAssignment_5 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:861:2: rule__Appear__AppearanceAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__AppearanceAssignment_5_in_rule__Appear__Group__5__Impl1672);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:871:1: rule__Appear__Group__6 : rule__Appear__Group__6__Impl ;
    public final void rule__Appear__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:875:1: ( rule__Appear__Group__6__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:876:2: rule__Appear__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Appear__Group__6__Impl_in_rule__Appear__Group__61702);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:882:1: rule__Appear__Group__6__Impl : ( ')' ) ;
    public final void rule__Appear__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:886:1: ( ( ')' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:887:1: ( ')' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:887:1: ( ')' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:888:1: ')'
            {
             before(grammarAccess.getAppearAccess().getRightParenthesisKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Appear__Group__6__Impl1730); 
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


    // $ANTLR start "rule__EDouble__Group__0"
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:915:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:919:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:920:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__01775);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__01778);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:927:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:931:1: ( ( ( '-' )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:932:1: ( ( '-' )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:932:1: ( ( '-' )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:933:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:934:1: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:935:2: '-'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__EDouble__Group__0__Impl1807); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:946:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:950:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:951:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__11840);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__11843);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:958:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:962:1: ( ( ( RULE_INT )? ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:963:1: ( ( RULE_INT )? )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:963:1: ( ( RULE_INT )? )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:964:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:965:1: ( RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:965:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl1871); 

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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:975:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:979:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:980:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__21902);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__21905);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:987:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:991:1: ( ( '.' ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:992:1: ( '.' )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:992:1: ( '.' )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:993:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__EDouble__Group__2__Impl1933); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1006:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1010:1: ( rule__EDouble__Group__3__Impl )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1011:2: rule__EDouble__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__31964);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1017:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1021:1: ( ( RULE_INT ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1022:1: ( RULE_INT )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1022:1: ( RULE_INT )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1023:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl1991); 
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1044:1: rule__Animation_Impl__AnimationsAssignment_1_2 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1048:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1049:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1049:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1050:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22034);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1059:1: rule__Animation_Impl__AnimationsAssignment_1_3_1 : ( ruleAnimation ) ;
    public final void rule__Animation_Impl__AnimationsAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1063:1: ( ( ruleAnimation ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1064:1: ( ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1064:1: ( ruleAnimation )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1065:1: ruleAnimation
            {
             before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12065);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1074:1: rule__Move__SpeedAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Move__SpeedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1078:1: ( ( ruleEDouble ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1079:1: ( ruleEDouble )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1079:1: ( ruleEDouble )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1080:1: ruleEDouble
            {
             before(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_32096);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1089:1: rule__Appear__GeometryAssignment_3 : ( ruleEString ) ;
    public final void rule__Appear__GeometryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1093:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1094:1: ( ruleEString )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1094:1: ( ruleEString )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1095:1: ruleEString
            {
             before(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Appear__GeometryAssignment_32127);
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
    // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1104:1: rule__Appear__AppearanceAssignment_5 : ( ruleEString ) ;
    public final void rule__Appear__AppearanceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1108:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1109:1: ( ruleEString )
            {
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1109:1: ( ruleEString )
            // ../dk.dtu.se2.animation.language.ui/src-gen/dk/dtu/se2/animation/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1110:1: ruleEString
            {
             before(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Appear__AppearanceAssignment_52158);
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
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Alternatives_in_ruleAnimation274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__Animation__Alternatives432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_rule__Animation__Alternatives449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__0__Impl_in_rule__Animation_Impl__Group__0528 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1_in_rule__Animation_Impl__Group__0531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__Group__0__Impl558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group__1__Impl_in_rule__Animation_Impl__Group__1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0_in_rule__Animation_Impl__Group__1__Impl614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__0__Impl_in_rule__Animation_Impl__Group_1__0649 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1_in_rule__Animation_Impl__Group_1__0652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1__0__Impl680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__1__Impl_in_rule__Animation_Impl__Group_1__1711 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2_in_rule__Animation_Impl__Group_1__1714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__2__Impl_in_rule__Animation_Impl__Group_1__2772 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3_in_rule__Animation_Impl__Group_1__2775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_2_in_rule__Animation_Impl__Group_1__2__Impl802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1__3__Impl_in_rule__Animation_Impl__Group_1__3832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0_in_rule__Animation_Impl__Group_1__3__Impl859 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__0__Impl_in_rule__Animation_Impl__Group_1_3__0898 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1_in_rule__Animation_Impl__Group_1_3__0901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation_Impl__Group_1_3__0__Impl929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__Group_1_3__1__Impl_in_rule__Animation_Impl__Group_1_3__1960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation_Impl__AnimationsAssignment_1_3_1_in_rule__Animation_Impl__Group_1_3__1__Impl987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01021 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11082 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Move__Group__1__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21144 = new BitSet(new long[]{0x0000000000060040L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Move__Group__2__Impl1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31206 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_3_in_rule__Move__Group__3__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__41266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__4__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__0__Impl_in_rule__Appear__Group__01335 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_rule__Appear__Group__1_in_rule__Appear__Group__01338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__1__Impl_in_rule__Appear__Group__11396 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Appear__Group__2_in_rule__Appear__Group__11399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Appear__Group__1__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__2__Impl_in_rule__Appear__Group__21458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Appear__Group__3_in_rule__Appear__Group__21461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Appear__Group__2__Impl1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__3__Impl_in_rule__Appear__Group__31520 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Appear__Group__4_in_rule__Appear__Group__31523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__GeometryAssignment_3_in_rule__Appear__Group__3__Impl1550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__4__Impl_in_rule__Appear__Group__41580 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Appear__Group__5_in_rule__Appear__Group__41583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Appear__Group__4__Impl1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__5__Impl_in_rule__Appear__Group__51642 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Appear__Group__6_in_rule__Appear__Group__51645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__AppearanceAssignment_5_in_rule__Appear__Group__5__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Appear__Group__6__Impl_in_rule__Appear__Group__61702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Appear__Group__6__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__01775 = new BitSet(new long[]{0x0000000000060040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__01778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__EDouble__Group__0__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__11840 = new BitSet(new long[]{0x0000000000060040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__11843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__21902 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__21905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__EDouble__Group__2__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__31964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_22034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_rule__Animation_Impl__AnimationsAssignment_1_3_12065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Move__SpeedAssignment_32096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Appear__GeometryAssignment_32127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Appear__AppearanceAssignment_52158 = new BitSet(new long[]{0x0000000000000002L});
    }


}