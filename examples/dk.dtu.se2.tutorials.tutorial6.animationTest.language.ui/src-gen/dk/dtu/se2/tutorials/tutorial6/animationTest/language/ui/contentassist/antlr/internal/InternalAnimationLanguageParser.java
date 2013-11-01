package dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui.contentassist.antlr.internal; 

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
import dk.dtu.se2.tutorials.tutorial6.animationTest.language.services.AnimationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnimationLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Animation'", "'{'", "'animationObjects'", "'}'", "','", "'AnimationObject'", "'label'", "'Move'", "'speed'", "'Show'", "'Hide'", "'Stop'"
    };
    public static final int RULE_ID=5;
    public static final int T__22=22;
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
    public String getGrammarFileName() { return "../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g"; }


     
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




    // $ANTLR start "entryRuleAnimation"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:60:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:61:1: ( ruleAnimation EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:62:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation61);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation68); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:69:1: ruleAnimation : ( ( rule__Animation__Group__0 ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:73:2: ( ( ( rule__Animation__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:74:1: ( ( rule__Animation__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:74:1: ( ( rule__Animation__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:75:1: ( rule__Animation__Group__0 )
            {
             before(grammarAccess.getAnimationAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:76:1: ( rule__Animation__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:76:2: rule__Animation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__0_in_ruleAnimation94);
            rule__Animation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAnimationObject"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:88:1: entryRuleAnimationObject : ruleAnimationObject EOF ;
    public final void entryRuleAnimationObject() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:89:1: ( ruleAnimationObject EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:90:1: ruleAnimationObject EOF
            {
             before(grammarAccess.getAnimationObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_in_entryRuleAnimationObject121);
            ruleAnimationObject();

            state._fsp--;

             after(grammarAccess.getAnimationObjectRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimationObject128); 

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
    // $ANTLR end "entryRuleAnimationObject"


    // $ANTLR start "ruleAnimationObject"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:97:1: ruleAnimationObject : ( ( rule__AnimationObject__Alternatives ) ) ;
    public final void ruleAnimationObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:101:2: ( ( ( rule__AnimationObject__Alternatives ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:102:1: ( ( rule__AnimationObject__Alternatives ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:102:1: ( ( rule__AnimationObject__Alternatives ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:103:1: ( rule__AnimationObject__Alternatives )
            {
             before(grammarAccess.getAnimationObjectAccess().getAlternatives()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:104:1: ( rule__AnimationObject__Alternatives )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:104:2: rule__AnimationObject__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject__Alternatives_in_ruleAnimationObject154);
            rule__AnimationObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimationObjectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAnimationObject"


    // $ANTLR start "entryRuleAnimationObject_Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:116:1: entryRuleAnimationObject_Impl : ruleAnimationObject_Impl EOF ;
    public final void entryRuleAnimationObject_Impl() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:117:1: ( ruleAnimationObject_Impl EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:118:1: ruleAnimationObject_Impl EOF
            {
             before(grammarAccess.getAnimationObject_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_Impl_in_entryRuleAnimationObject_Impl181);
            ruleAnimationObject_Impl();

            state._fsp--;

             after(grammarAccess.getAnimationObject_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimationObject_Impl188); 

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
    // $ANTLR end "entryRuleAnimationObject_Impl"


    // $ANTLR start "ruleAnimationObject_Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:125:1: ruleAnimationObject_Impl : ( ( rule__AnimationObject_Impl__Group__0 ) ) ;
    public final void ruleAnimationObject_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:129:2: ( ( ( rule__AnimationObject_Impl__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:130:1: ( ( rule__AnimationObject_Impl__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:130:1: ( ( rule__AnimationObject_Impl__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:131:1: ( rule__AnimationObject_Impl__Group__0 )
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:132:1: ( rule__AnimationObject_Impl__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:132:2: rule__AnimationObject_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__0_in_ruleAnimationObject_Impl214);
            rule__AnimationObject_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnimationObject_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleAnimationObject_Impl"


    // $ANTLR start "entryRuleEString"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:145:1: ( ruleEString EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:1: ( rule__EString__Alternatives )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
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


    // $ANTLR start "entryRuleMove"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:172:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:173:1: ( ruleMove EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:174:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove301);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove308); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:181:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:185:2: ( ( ( rule__Move__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__Move__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:186:1: ( ( rule__Move__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:187:1: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:1: ( rule__Move__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:188:2: rule__Move__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0_in_ruleMove334);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:200:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:201:1: ( ruleShow EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:202:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShow_in_entryRuleShow361);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShow368); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:209:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:213:2: ( ( ( rule__Show__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:214:1: ( ( rule__Show__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:214:1: ( ( rule__Show__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:215:1: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:1: ( rule__Show__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:216:2: rule__Show__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__0_in_ruleShow394);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:228:1: entryRuleHide : ruleHide EOF ;
    public final void entryRuleHide() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:229:1: ( ruleHide EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:230:1: ruleHide EOF
            {
             before(grammarAccess.getHideRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHide_in_entryRuleHide421);
            ruleHide();

            state._fsp--;

             after(grammarAccess.getHideRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHide428); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:237:1: ruleHide : ( ( rule__Hide__Group__0 ) ) ;
    public final void ruleHide() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:241:2: ( ( ( rule__Hide__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__Hide__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:242:1: ( ( rule__Hide__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:243:1: ( rule__Hide__Group__0 )
            {
             before(grammarAccess.getHideAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:1: ( rule__Hide__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:244:2: rule__Hide__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__0_in_ruleHide454);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:256:1: entryRuleStop : ruleStop EOF ;
    public final void entryRuleStop() throws RecognitionException {
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:257:1: ( ruleStop EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:258:1: ruleStop EOF
            {
             before(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop481);
            ruleStop();

            state._fsp--;

             after(grammarAccess.getStopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop488); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:265:1: ruleStop : ( ( rule__Stop__Group__0 ) ) ;
    public final void ruleStop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:269:2: ( ( ( rule__Stop__Group__0 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:270:1: ( ( rule__Stop__Group__0 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:270:1: ( ( rule__Stop__Group__0 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:271:1: ( rule__Stop__Group__0 )
            {
             before(grammarAccess.getStopAccess().getGroup()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:1: ( rule__Stop__Group__0 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:272:2: rule__Stop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0_in_ruleStop514);
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


    // $ANTLR start "rule__AnimationObject__Alternatives"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:284:1: rule__AnimationObject__Alternatives : ( ( ruleAnimationObject_Impl ) | ( ruleMove ) | ( ruleShow ) | ( ruleHide ) | ( ruleStop ) );
    public final void rule__AnimationObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:288:1: ( ( ruleAnimationObject_Impl ) | ( ruleMove ) | ( ruleShow ) | ( ruleHide ) | ( ruleStop ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 21:
                {
                alt1=4;
                }
                break;
            case 22:
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
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:289:1: ( ruleAnimationObject_Impl )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:289:1: ( ruleAnimationObject_Impl )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:290:1: ruleAnimationObject_Impl
                    {
                     before(grammarAccess.getAnimationObjectAccess().getAnimationObject_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_Impl_in_rule__AnimationObject__Alternatives550);
                    ruleAnimationObject_Impl();

                    state._fsp--;

                     after(grammarAccess.getAnimationObjectAccess().getAnimationObject_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:295:6: ( ruleMove )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:295:6: ( ruleMove )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:296:1: ruleMove
                    {
                     before(grammarAccess.getAnimationObjectAccess().getMoveParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_rule__AnimationObject__Alternatives567);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getAnimationObjectAccess().getMoveParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:301:6: ( ruleShow )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:301:6: ( ruleShow )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:302:1: ruleShow
                    {
                     before(grammarAccess.getAnimationObjectAccess().getShowParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleShow_in_rule__AnimationObject__Alternatives584);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getAnimationObjectAccess().getShowParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:307:6: ( ruleHide )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:307:6: ( ruleHide )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:308:1: ruleHide
                    {
                     before(grammarAccess.getAnimationObjectAccess().getHideParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleHide_in_rule__AnimationObject__Alternatives601);
                    ruleHide();

                    state._fsp--;

                     after(grammarAccess.getAnimationObjectAccess().getHideParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:313:6: ( ruleStop )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:313:6: ( ruleStop )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:314:1: ruleStop
                    {
                     before(grammarAccess.getAnimationObjectAccess().getStopParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_rule__AnimationObject__Alternatives618);
                    ruleStop();

                    state._fsp--;

                     after(grammarAccess.getAnimationObjectAccess().getStopParserRuleCall_4()); 

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
    // $ANTLR end "rule__AnimationObject__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:324:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:328:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:329:1: ( RULE_STRING )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:329:1: ( RULE_STRING )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:330:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives650); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:335:6: ( RULE_ID )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:335:6: ( RULE_ID )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:336:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives667); 
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


    // $ANTLR start "rule__Animation__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:348:1: rule__Animation__Group__0 : rule__Animation__Group__0__Impl rule__Animation__Group__1 ;
    public final void rule__Animation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:352:1: ( rule__Animation__Group__0__Impl rule__Animation__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:353:2: rule__Animation__Group__0__Impl rule__Animation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__0__Impl_in_rule__Animation__Group__0697);
            rule__Animation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__1_in_rule__Animation__Group__0700);
            rule__Animation__Group__1();

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
    // $ANTLR end "rule__Animation__Group__0"


    // $ANTLR start "rule__Animation__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:360:1: rule__Animation__Group__0__Impl : ( 'Animation' ) ;
    public final void rule__Animation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:364:1: ( ( 'Animation' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:365:1: ( 'Animation' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:365:1: ( 'Animation' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:366:1: 'Animation'
            {
             before(grammarAccess.getAnimationAccess().getAnimationKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Animation__Group__0__Impl728); 
             after(grammarAccess.getAnimationAccess().getAnimationKeyword_0()); 

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
    // $ANTLR end "rule__Animation__Group__0__Impl"


    // $ANTLR start "rule__Animation__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:379:1: rule__Animation__Group__1 : rule__Animation__Group__1__Impl rule__Animation__Group__2 ;
    public final void rule__Animation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:383:1: ( rule__Animation__Group__1__Impl rule__Animation__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:384:2: rule__Animation__Group__1__Impl rule__Animation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__1__Impl_in_rule__Animation__Group__1759);
            rule__Animation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__2_in_rule__Animation__Group__1762);
            rule__Animation__Group__2();

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
    // $ANTLR end "rule__Animation__Group__1"


    // $ANTLR start "rule__Animation__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:391:1: rule__Animation__Group__1__Impl : ( '{' ) ;
    public final void rule__Animation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:395:1: ( ( '{' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:396:1: ( '{' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:396:1: ( '{' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:397:1: '{'
            {
             before(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Animation__Group__1__Impl790); 
             after(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Animation__Group__1__Impl"


    // $ANTLR start "rule__Animation__Group__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:410:1: rule__Animation__Group__2 : rule__Animation__Group__2__Impl rule__Animation__Group__3 ;
    public final void rule__Animation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:414:1: ( rule__Animation__Group__2__Impl rule__Animation__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:415:2: rule__Animation__Group__2__Impl rule__Animation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__2__Impl_in_rule__Animation__Group__2821);
            rule__Animation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__3_in_rule__Animation__Group__2824);
            rule__Animation__Group__3();

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
    // $ANTLR end "rule__Animation__Group__2"


    // $ANTLR start "rule__Animation__Group__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:422:1: rule__Animation__Group__2__Impl : ( 'animationObjects' ) ;
    public final void rule__Animation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:426:1: ( ( 'animationObjects' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:427:1: ( 'animationObjects' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:427:1: ( 'animationObjects' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:428:1: 'animationObjects'
            {
             before(grammarAccess.getAnimationAccess().getAnimationObjectsKeyword_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Animation__Group__2__Impl852); 
             after(grammarAccess.getAnimationAccess().getAnimationObjectsKeyword_2()); 

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
    // $ANTLR end "rule__Animation__Group__2__Impl"


    // $ANTLR start "rule__Animation__Group__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:441:1: rule__Animation__Group__3 : rule__Animation__Group__3__Impl rule__Animation__Group__4 ;
    public final void rule__Animation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:445:1: ( rule__Animation__Group__3__Impl rule__Animation__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:446:2: rule__Animation__Group__3__Impl rule__Animation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__3__Impl_in_rule__Animation__Group__3883);
            rule__Animation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__4_in_rule__Animation__Group__3886);
            rule__Animation__Group__4();

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
    // $ANTLR end "rule__Animation__Group__3"


    // $ANTLR start "rule__Animation__Group__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:453:1: rule__Animation__Group__3__Impl : ( '{' ) ;
    public final void rule__Animation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:457:1: ( ( '{' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:458:1: ( '{' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:458:1: ( '{' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:459:1: '{'
            {
             before(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Animation__Group__3__Impl914); 
             after(grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Animation__Group__3__Impl"


    // $ANTLR start "rule__Animation__Group__4"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:472:1: rule__Animation__Group__4 : rule__Animation__Group__4__Impl rule__Animation__Group__5 ;
    public final void rule__Animation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:476:1: ( rule__Animation__Group__4__Impl rule__Animation__Group__5 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:477:2: rule__Animation__Group__4__Impl rule__Animation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__4__Impl_in_rule__Animation__Group__4945);
            rule__Animation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__5_in_rule__Animation__Group__4948);
            rule__Animation__Group__5();

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
    // $ANTLR end "rule__Animation__Group__4"


    // $ANTLR start "rule__Animation__Group__4__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:484:1: rule__Animation__Group__4__Impl : ( ( rule__Animation__AnimationObjectsAssignment_4 ) ) ;
    public final void rule__Animation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:488:1: ( ( ( rule__Animation__AnimationObjectsAssignment_4 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:489:1: ( ( rule__Animation__AnimationObjectsAssignment_4 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:489:1: ( ( rule__Animation__AnimationObjectsAssignment_4 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:490:1: ( rule__Animation__AnimationObjectsAssignment_4 )
            {
             before(grammarAccess.getAnimationAccess().getAnimationObjectsAssignment_4()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:491:1: ( rule__Animation__AnimationObjectsAssignment_4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:491:2: rule__Animation__AnimationObjectsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__AnimationObjectsAssignment_4_in_rule__Animation__Group__4__Impl975);
            rule__Animation__AnimationObjectsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getAnimationObjectsAssignment_4()); 

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
    // $ANTLR end "rule__Animation__Group__4__Impl"


    // $ANTLR start "rule__Animation__Group__5"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:501:1: rule__Animation__Group__5 : rule__Animation__Group__5__Impl rule__Animation__Group__6 ;
    public final void rule__Animation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:505:1: ( rule__Animation__Group__5__Impl rule__Animation__Group__6 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:506:2: rule__Animation__Group__5__Impl rule__Animation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__5__Impl_in_rule__Animation__Group__51005);
            rule__Animation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__6_in_rule__Animation__Group__51008);
            rule__Animation__Group__6();

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
    // $ANTLR end "rule__Animation__Group__5"


    // $ANTLR start "rule__Animation__Group__5__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:513:1: rule__Animation__Group__5__Impl : ( ( rule__Animation__Group_5__0 )* ) ;
    public final void rule__Animation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:517:1: ( ( ( rule__Animation__Group_5__0 )* ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:518:1: ( ( rule__Animation__Group_5__0 )* )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:518:1: ( ( rule__Animation__Group_5__0 )* )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:519:1: ( rule__Animation__Group_5__0 )*
            {
             before(grammarAccess.getAnimationAccess().getGroup_5()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:520:1: ( rule__Animation__Group_5__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:520:2: rule__Animation__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_5__0_in_rule__Animation__Group__5__Impl1035);
            	    rule__Animation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAnimationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Animation__Group__5__Impl"


    // $ANTLR start "rule__Animation__Group__6"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:530:1: rule__Animation__Group__6 : rule__Animation__Group__6__Impl rule__Animation__Group__7 ;
    public final void rule__Animation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:534:1: ( rule__Animation__Group__6__Impl rule__Animation__Group__7 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:535:2: rule__Animation__Group__6__Impl rule__Animation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__6__Impl_in_rule__Animation__Group__61066);
            rule__Animation__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__7_in_rule__Animation__Group__61069);
            rule__Animation__Group__7();

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
    // $ANTLR end "rule__Animation__Group__6"


    // $ANTLR start "rule__Animation__Group__6__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:542:1: rule__Animation__Group__6__Impl : ( '}' ) ;
    public final void rule__Animation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:546:1: ( ( '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:547:1: ( '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:547:1: ( '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:548:1: '}'
            {
             before(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Animation__Group__6__Impl1097); 
             after(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Animation__Group__6__Impl"


    // $ANTLR start "rule__Animation__Group__7"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:561:1: rule__Animation__Group__7 : rule__Animation__Group__7__Impl ;
    public final void rule__Animation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:565:1: ( rule__Animation__Group__7__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:566:2: rule__Animation__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group__7__Impl_in_rule__Animation__Group__71128);
            rule__Animation__Group__7__Impl();

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
    // $ANTLR end "rule__Animation__Group__7"


    // $ANTLR start "rule__Animation__Group__7__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:572:1: rule__Animation__Group__7__Impl : ( '}' ) ;
    public final void rule__Animation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:576:1: ( ( '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:577:1: ( '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:577:1: ( '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:578:1: '}'
            {
             before(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Animation__Group__7__Impl1156); 
             after(grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Animation__Group__7__Impl"


    // $ANTLR start "rule__Animation__Group_5__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:607:1: rule__Animation__Group_5__0 : rule__Animation__Group_5__0__Impl rule__Animation__Group_5__1 ;
    public final void rule__Animation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:611:1: ( rule__Animation__Group_5__0__Impl rule__Animation__Group_5__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:612:2: rule__Animation__Group_5__0__Impl rule__Animation__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_5__0__Impl_in_rule__Animation__Group_5__01203);
            rule__Animation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_5__1_in_rule__Animation__Group_5__01206);
            rule__Animation__Group_5__1();

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
    // $ANTLR end "rule__Animation__Group_5__0"


    // $ANTLR start "rule__Animation__Group_5__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:619:1: rule__Animation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Animation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:623:1: ( ( ',' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:624:1: ( ',' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:624:1: ( ',' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:625:1: ','
            {
             before(grammarAccess.getAnimationAccess().getCommaKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Animation__Group_5__0__Impl1234); 
             after(grammarAccess.getAnimationAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Animation__Group_5__0__Impl"


    // $ANTLR start "rule__Animation__Group_5__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:638:1: rule__Animation__Group_5__1 : rule__Animation__Group_5__1__Impl ;
    public final void rule__Animation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:642:1: ( rule__Animation__Group_5__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:643:2: rule__Animation__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__Group_5__1__Impl_in_rule__Animation__Group_5__11265);
            rule__Animation__Group_5__1__Impl();

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
    // $ANTLR end "rule__Animation__Group_5__1"


    // $ANTLR start "rule__Animation__Group_5__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:649:1: rule__Animation__Group_5__1__Impl : ( ( rule__Animation__AnimationObjectsAssignment_5_1 ) ) ;
    public final void rule__Animation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:653:1: ( ( ( rule__Animation__AnimationObjectsAssignment_5_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:654:1: ( ( rule__Animation__AnimationObjectsAssignment_5_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:654:1: ( ( rule__Animation__AnimationObjectsAssignment_5_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:655:1: ( rule__Animation__AnimationObjectsAssignment_5_1 )
            {
             before(grammarAccess.getAnimationAccess().getAnimationObjectsAssignment_5_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:656:1: ( rule__Animation__AnimationObjectsAssignment_5_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:656:2: rule__Animation__AnimationObjectsAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Animation__AnimationObjectsAssignment_5_1_in_rule__Animation__Group_5__1__Impl1292);
            rule__Animation__AnimationObjectsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getAnimationObjectsAssignment_5_1()); 

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
    // $ANTLR end "rule__Animation__Group_5__1__Impl"


    // $ANTLR start "rule__AnimationObject_Impl__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:670:1: rule__AnimationObject_Impl__Group__0 : rule__AnimationObject_Impl__Group__0__Impl rule__AnimationObject_Impl__Group__1 ;
    public final void rule__AnimationObject_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:674:1: ( rule__AnimationObject_Impl__Group__0__Impl rule__AnimationObject_Impl__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:675:2: rule__AnimationObject_Impl__Group__0__Impl rule__AnimationObject_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__0__Impl_in_rule__AnimationObject_Impl__Group__01326);
            rule__AnimationObject_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__1_in_rule__AnimationObject_Impl__Group__01329);
            rule__AnimationObject_Impl__Group__1();

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__0"


    // $ANTLR start "rule__AnimationObject_Impl__Group__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:682:1: rule__AnimationObject_Impl__Group__0__Impl : ( () ) ;
    public final void rule__AnimationObject_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:686:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:687:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:687:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:688:1: ()
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getAnimationObjectAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:689:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:691:1: 
            {
            }

             after(grammarAccess.getAnimationObject_ImplAccess().getAnimationObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnimationObject_Impl__Group__0__Impl"


    // $ANTLR start "rule__AnimationObject_Impl__Group__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:701:1: rule__AnimationObject_Impl__Group__1 : rule__AnimationObject_Impl__Group__1__Impl rule__AnimationObject_Impl__Group__2 ;
    public final void rule__AnimationObject_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:705:1: ( rule__AnimationObject_Impl__Group__1__Impl rule__AnimationObject_Impl__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:706:2: rule__AnimationObject_Impl__Group__1__Impl rule__AnimationObject_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__1__Impl_in_rule__AnimationObject_Impl__Group__11387);
            rule__AnimationObject_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__2_in_rule__AnimationObject_Impl__Group__11390);
            rule__AnimationObject_Impl__Group__2();

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__1"


    // $ANTLR start "rule__AnimationObject_Impl__Group__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:713:1: rule__AnimationObject_Impl__Group__1__Impl : ( 'AnimationObject' ) ;
    public final void rule__AnimationObject_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:717:1: ( ( 'AnimationObject' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:718:1: ( 'AnimationObject' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:718:1: ( 'AnimationObject' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:719:1: 'AnimationObject'
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getAnimationObjectKeyword_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__AnimationObject_Impl__Group__1__Impl1418); 
             after(grammarAccess.getAnimationObject_ImplAccess().getAnimationObjectKeyword_1()); 

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__1__Impl"


    // $ANTLR start "rule__AnimationObject_Impl__Group__2"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:732:1: rule__AnimationObject_Impl__Group__2 : rule__AnimationObject_Impl__Group__2__Impl rule__AnimationObject_Impl__Group__3 ;
    public final void rule__AnimationObject_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:736:1: ( rule__AnimationObject_Impl__Group__2__Impl rule__AnimationObject_Impl__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:737:2: rule__AnimationObject_Impl__Group__2__Impl rule__AnimationObject_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__2__Impl_in_rule__AnimationObject_Impl__Group__21449);
            rule__AnimationObject_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__3_in_rule__AnimationObject_Impl__Group__21452);
            rule__AnimationObject_Impl__Group__3();

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__2"


    // $ANTLR start "rule__AnimationObject_Impl__Group__2__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:744:1: rule__AnimationObject_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__AnimationObject_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:748:1: ( ( '{' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:749:1: ( '{' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:749:1: ( '{' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:750:1: '{'
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__AnimationObject_Impl__Group__2__Impl1480); 
             after(grammarAccess.getAnimationObject_ImplAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__2__Impl"


    // $ANTLR start "rule__AnimationObject_Impl__Group__3"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:763:1: rule__AnimationObject_Impl__Group__3 : rule__AnimationObject_Impl__Group__3__Impl rule__AnimationObject_Impl__Group__4 ;
    public final void rule__AnimationObject_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:767:1: ( rule__AnimationObject_Impl__Group__3__Impl rule__AnimationObject_Impl__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:768:2: rule__AnimationObject_Impl__Group__3__Impl rule__AnimationObject_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__3__Impl_in_rule__AnimationObject_Impl__Group__31511);
            rule__AnimationObject_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__4_in_rule__AnimationObject_Impl__Group__31514);
            rule__AnimationObject_Impl__Group__4();

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__3"


    // $ANTLR start "rule__AnimationObject_Impl__Group__3__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:775:1: rule__AnimationObject_Impl__Group__3__Impl : ( ( rule__AnimationObject_Impl__Group_3__0 )? ) ;
    public final void rule__AnimationObject_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:779:1: ( ( ( rule__AnimationObject_Impl__Group_3__0 )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:780:1: ( ( rule__AnimationObject_Impl__Group_3__0 )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:780:1: ( ( rule__AnimationObject_Impl__Group_3__0 )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:781:1: ( rule__AnimationObject_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getGroup_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:782:1: ( rule__AnimationObject_Impl__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:782:2: rule__AnimationObject_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group_3__0_in_rule__AnimationObject_Impl__Group__3__Impl1541);
                    rule__AnimationObject_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnimationObject_ImplAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__3__Impl"


    // $ANTLR start "rule__AnimationObject_Impl__Group__4"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:792:1: rule__AnimationObject_Impl__Group__4 : rule__AnimationObject_Impl__Group__4__Impl ;
    public final void rule__AnimationObject_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:796:1: ( rule__AnimationObject_Impl__Group__4__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:797:2: rule__AnimationObject_Impl__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group__4__Impl_in_rule__AnimationObject_Impl__Group__41572);
            rule__AnimationObject_Impl__Group__4__Impl();

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__4"


    // $ANTLR start "rule__AnimationObject_Impl__Group__4__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:803:1: rule__AnimationObject_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__AnimationObject_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:807:1: ( ( '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:808:1: ( '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:808:1: ( '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:809:1: '}'
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__AnimationObject_Impl__Group__4__Impl1600); 
             after(grammarAccess.getAnimationObject_ImplAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__AnimationObject_Impl__Group__4__Impl"


    // $ANTLR start "rule__AnimationObject_Impl__Group_3__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:832:1: rule__AnimationObject_Impl__Group_3__0 : rule__AnimationObject_Impl__Group_3__0__Impl rule__AnimationObject_Impl__Group_3__1 ;
    public final void rule__AnimationObject_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:836:1: ( rule__AnimationObject_Impl__Group_3__0__Impl rule__AnimationObject_Impl__Group_3__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:837:2: rule__AnimationObject_Impl__Group_3__0__Impl rule__AnimationObject_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group_3__0__Impl_in_rule__AnimationObject_Impl__Group_3__01641);
            rule__AnimationObject_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group_3__1_in_rule__AnimationObject_Impl__Group_3__01644);
            rule__AnimationObject_Impl__Group_3__1();

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
    // $ANTLR end "rule__AnimationObject_Impl__Group_3__0"


    // $ANTLR start "rule__AnimationObject_Impl__Group_3__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:844:1: rule__AnimationObject_Impl__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__AnimationObject_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:848:1: ( ( 'label' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:849:1: ( 'label' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:849:1: ( 'label' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:850:1: 'label'
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getLabelKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__AnimationObject_Impl__Group_3__0__Impl1672); 
             after(grammarAccess.getAnimationObject_ImplAccess().getLabelKeyword_3_0()); 

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
    // $ANTLR end "rule__AnimationObject_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__AnimationObject_Impl__Group_3__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:863:1: rule__AnimationObject_Impl__Group_3__1 : rule__AnimationObject_Impl__Group_3__1__Impl ;
    public final void rule__AnimationObject_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:867:1: ( rule__AnimationObject_Impl__Group_3__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:868:2: rule__AnimationObject_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__Group_3__1__Impl_in_rule__AnimationObject_Impl__Group_3__11703);
            rule__AnimationObject_Impl__Group_3__1__Impl();

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
    // $ANTLR end "rule__AnimationObject_Impl__Group_3__1"


    // $ANTLR start "rule__AnimationObject_Impl__Group_3__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:874:1: rule__AnimationObject_Impl__Group_3__1__Impl : ( ( rule__AnimationObject_Impl__LabelAssignment_3_1 ) ) ;
    public final void rule__AnimationObject_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:878:1: ( ( ( rule__AnimationObject_Impl__LabelAssignment_3_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:879:1: ( ( rule__AnimationObject_Impl__LabelAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:879:1: ( ( rule__AnimationObject_Impl__LabelAssignment_3_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:880:1: ( rule__AnimationObject_Impl__LabelAssignment_3_1 )
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getLabelAssignment_3_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:881:1: ( rule__AnimationObject_Impl__LabelAssignment_3_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:881:2: rule__AnimationObject_Impl__LabelAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnimationObject_Impl__LabelAssignment_3_1_in_rule__AnimationObject_Impl__Group_3__1__Impl1730);
            rule__AnimationObject_Impl__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimationObject_ImplAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__AnimationObject_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:895:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:899:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:900:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01764);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01767);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:907:1: rule__Move__Group__0__Impl : ( () ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:911:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:912:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:912:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:913:1: ()
            {
             before(grammarAccess.getMoveAccess().getMoveAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:914:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:916:1: 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:926:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:930:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:931:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11825);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11828);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:938:1: rule__Move__Group__1__Impl : ( 'Move' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:942:1: ( ( 'Move' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:943:1: ( 'Move' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:943:1: ( 'Move' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:944:1: 'Move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Move__Group__1__Impl1856); 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:957:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:961:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:962:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21887);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21890);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:969:1: rule__Move__Group__2__Impl : ( '{' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:973:1: ( ( '{' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:974:1: ( '{' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:974:1: ( '{' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:975:1: '{'
            {
             before(grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Move__Group__2__Impl1918); 
             after(grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:988:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:992:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:993:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31949);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31952);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1000:1: rule__Move__Group__3__Impl : ( ( rule__Move__Group_3__0 )? ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1004:1: ( ( ( rule__Move__Group_3__0 )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1005:1: ( ( rule__Move__Group_3__0 )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1005:1: ( ( rule__Move__Group_3__0 )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1006:1: ( rule__Move__Group_3__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1007:1: ( rule__Move__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1007:2: rule__Move__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Move__Group_3__0_in_rule__Move__Group__3__Impl1979);
                    rule__Move__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_3()); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1017:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1021:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1022:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__42010);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5_in_rule__Move__Group__42013);
            rule__Move__Group__5();

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1029:1: rule__Move__Group__4__Impl : ( ( rule__Move__Group_4__0 )? ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1033:1: ( ( ( rule__Move__Group_4__0 )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1034:1: ( ( rule__Move__Group_4__0 )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1034:1: ( ( rule__Move__Group_4__0 )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1035:1: ( rule__Move__Group_4__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_4()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1036:1: ( rule__Move__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1036:2: rule__Move__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Move__Group_4__0_in_rule__Move__Group__4__Impl2040);
                    rule__Move__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Move__Group__5"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1046:1: rule__Move__Group__5 : rule__Move__Group__5__Impl ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1050:1: ( rule__Move__Group__5__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1051:2: rule__Move__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__52071);
            rule__Move__Group__5__Impl();

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
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1057:1: rule__Move__Group__5__Impl : ( '}' ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1061:1: ( ( '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1062:1: ( '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1062:1: ( '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1063:1: '}'
            {
             before(grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Move__Group__5__Impl2099); 
             after(grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__Move__Group_3__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1088:1: rule__Move__Group_3__0 : rule__Move__Group_3__0__Impl rule__Move__Group_3__1 ;
    public final void rule__Move__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1092:1: ( rule__Move__Group_3__0__Impl rule__Move__Group_3__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1093:2: rule__Move__Group_3__0__Impl rule__Move__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_3__0__Impl_in_rule__Move__Group_3__02142);
            rule__Move__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_3__1_in_rule__Move__Group_3__02145);
            rule__Move__Group_3__1();

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
    // $ANTLR end "rule__Move__Group_3__0"


    // $ANTLR start "rule__Move__Group_3__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1100:1: rule__Move__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__Move__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1104:1: ( ( 'label' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1105:1: ( 'label' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1105:1: ( 'label' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1106:1: 'label'
            {
             before(grammarAccess.getMoveAccess().getLabelKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Move__Group_3__0__Impl2173); 
             after(grammarAccess.getMoveAccess().getLabelKeyword_3_0()); 

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
    // $ANTLR end "rule__Move__Group_3__0__Impl"


    // $ANTLR start "rule__Move__Group_3__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1119:1: rule__Move__Group_3__1 : rule__Move__Group_3__1__Impl ;
    public final void rule__Move__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1123:1: ( rule__Move__Group_3__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1124:2: rule__Move__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_3__1__Impl_in_rule__Move__Group_3__12204);
            rule__Move__Group_3__1__Impl();

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
    // $ANTLR end "rule__Move__Group_3__1"


    // $ANTLR start "rule__Move__Group_3__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1130:1: rule__Move__Group_3__1__Impl : ( ( rule__Move__LabelAssignment_3_1 ) ) ;
    public final void rule__Move__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1134:1: ( ( ( rule__Move__LabelAssignment_3_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1135:1: ( ( rule__Move__LabelAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1135:1: ( ( rule__Move__LabelAssignment_3_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1136:1: ( rule__Move__LabelAssignment_3_1 )
            {
             before(grammarAccess.getMoveAccess().getLabelAssignment_3_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1137:1: ( rule__Move__LabelAssignment_3_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1137:2: rule__Move__LabelAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__LabelAssignment_3_1_in_rule__Move__Group_3__1__Impl2231);
            rule__Move__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__Move__Group_3__1__Impl"


    // $ANTLR start "rule__Move__Group_4__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1151:1: rule__Move__Group_4__0 : rule__Move__Group_4__0__Impl rule__Move__Group_4__1 ;
    public final void rule__Move__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1155:1: ( rule__Move__Group_4__0__Impl rule__Move__Group_4__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1156:2: rule__Move__Group_4__0__Impl rule__Move__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_4__0__Impl_in_rule__Move__Group_4__02265);
            rule__Move__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_4__1_in_rule__Move__Group_4__02268);
            rule__Move__Group_4__1();

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
    // $ANTLR end "rule__Move__Group_4__0"


    // $ANTLR start "rule__Move__Group_4__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1163:1: rule__Move__Group_4__0__Impl : ( 'speed' ) ;
    public final void rule__Move__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1167:1: ( ( 'speed' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1168:1: ( 'speed' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1168:1: ( 'speed' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1169:1: 'speed'
            {
             before(grammarAccess.getMoveAccess().getSpeedKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Move__Group_4__0__Impl2296); 
             after(grammarAccess.getMoveAccess().getSpeedKeyword_4_0()); 

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
    // $ANTLR end "rule__Move__Group_4__0__Impl"


    // $ANTLR start "rule__Move__Group_4__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1182:1: rule__Move__Group_4__1 : rule__Move__Group_4__1__Impl ;
    public final void rule__Move__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1186:1: ( rule__Move__Group_4__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1187:2: rule__Move__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__Group_4__1__Impl_in_rule__Move__Group_4__12327);
            rule__Move__Group_4__1__Impl();

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
    // $ANTLR end "rule__Move__Group_4__1"


    // $ANTLR start "rule__Move__Group_4__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1193:1: rule__Move__Group_4__1__Impl : ( ( rule__Move__SpeedAssignment_4_1 ) ) ;
    public final void rule__Move__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1197:1: ( ( ( rule__Move__SpeedAssignment_4_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1198:1: ( ( rule__Move__SpeedAssignment_4_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1198:1: ( ( rule__Move__SpeedAssignment_4_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1199:1: ( rule__Move__SpeedAssignment_4_1 )
            {
             before(grammarAccess.getMoveAccess().getSpeedAssignment_4_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1200:1: ( rule__Move__SpeedAssignment_4_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1200:2: rule__Move__SpeedAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Move__SpeedAssignment_4_1_in_rule__Move__Group_4__1__Impl2354);
            rule__Move__SpeedAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getSpeedAssignment_4_1()); 

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
    // $ANTLR end "rule__Move__Group_4__1__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1214:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1218:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1219:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__02388);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1_in_rule__Show__Group__02391);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1226:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1230:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1231:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1231:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1232:1: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1233:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1235:1: 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1245:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1249:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1250:2: rule__Show__Group__1__Impl rule__Show__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__12449);
            rule__Show__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2_in_rule__Show__Group__12452);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1257:1: rule__Show__Group__1__Impl : ( 'Show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1261:1: ( ( 'Show' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1262:1: ( 'Show' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1262:1: ( 'Show' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1263:1: 'Show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Show__Group__1__Impl2480); 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1276:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1280:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1281:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__22511);
            rule__Show__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3_in_rule__Show__Group__22514);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1288:1: rule__Show__Group__2__Impl : ( '{' ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1292:1: ( ( '{' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1293:1: ( '{' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1293:1: ( '{' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1294:1: '{'
            {
             before(grammarAccess.getShowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Show__Group__2__Impl2542); 
             after(grammarAccess.getShowAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1307:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1311:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1312:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__32573);
            rule__Show__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4_in_rule__Show__Group__32576);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1319:1: rule__Show__Group__3__Impl : ( ( rule__Show__Group_3__0 )? ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1323:1: ( ( ( rule__Show__Group_3__0 )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1324:1: ( ( rule__Show__Group_3__0 )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1324:1: ( ( rule__Show__Group_3__0 )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1325:1: ( rule__Show__Group_3__0 )?
            {
             before(grammarAccess.getShowAccess().getGroup_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1326:1: ( rule__Show__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1326:2: rule__Show__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Show__Group_3__0_in_rule__Show__Group__3__Impl2603);
                    rule__Show__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShowAccess().getGroup_3()); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1336:1: rule__Show__Group__4 : rule__Show__Group__4__Impl ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1340:1: ( rule__Show__Group__4__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1341:2: rule__Show__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__42634);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1347:1: rule__Show__Group__4__Impl : ( '}' ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1351:1: ( ( '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1352:1: ( '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1352:1: ( '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1353:1: '}'
            {
             before(grammarAccess.getShowAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Show__Group__4__Impl2662); 
             after(grammarAccess.getShowAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Show__Group_3__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1376:1: rule__Show__Group_3__0 : rule__Show__Group_3__0__Impl rule__Show__Group_3__1 ;
    public final void rule__Show__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1380:1: ( rule__Show__Group_3__0__Impl rule__Show__Group_3__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1381:2: rule__Show__Group_3__0__Impl rule__Show__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group_3__0__Impl_in_rule__Show__Group_3__02703);
            rule__Show__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Show__Group_3__1_in_rule__Show__Group_3__02706);
            rule__Show__Group_3__1();

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
    // $ANTLR end "rule__Show__Group_3__0"


    // $ANTLR start "rule__Show__Group_3__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1388:1: rule__Show__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__Show__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1392:1: ( ( 'label' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1393:1: ( 'label' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1393:1: ( 'label' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1394:1: 'label'
            {
             before(grammarAccess.getShowAccess().getLabelKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Show__Group_3__0__Impl2734); 
             after(grammarAccess.getShowAccess().getLabelKeyword_3_0()); 

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
    // $ANTLR end "rule__Show__Group_3__0__Impl"


    // $ANTLR start "rule__Show__Group_3__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1407:1: rule__Show__Group_3__1 : rule__Show__Group_3__1__Impl ;
    public final void rule__Show__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1411:1: ( rule__Show__Group_3__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1412:2: rule__Show__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__Group_3__1__Impl_in_rule__Show__Group_3__12765);
            rule__Show__Group_3__1__Impl();

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
    // $ANTLR end "rule__Show__Group_3__1"


    // $ANTLR start "rule__Show__Group_3__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1418:1: rule__Show__Group_3__1__Impl : ( ( rule__Show__LabelAssignment_3_1 ) ) ;
    public final void rule__Show__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1422:1: ( ( ( rule__Show__LabelAssignment_3_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1423:1: ( ( rule__Show__LabelAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1423:1: ( ( rule__Show__LabelAssignment_3_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1424:1: ( rule__Show__LabelAssignment_3_1 )
            {
             before(grammarAccess.getShowAccess().getLabelAssignment_3_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1425:1: ( rule__Show__LabelAssignment_3_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1425:2: rule__Show__LabelAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Show__LabelAssignment_3_1_in_rule__Show__Group_3__1__Impl2792);
            rule__Show__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__Show__Group_3__1__Impl"


    // $ANTLR start "rule__Hide__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1439:1: rule__Hide__Group__0 : rule__Hide__Group__0__Impl rule__Hide__Group__1 ;
    public final void rule__Hide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1443:1: ( rule__Hide__Group__0__Impl rule__Hide__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1444:2: rule__Hide__Group__0__Impl rule__Hide__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__02826);
            rule__Hide__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__02829);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1451:1: rule__Hide__Group__0__Impl : ( () ) ;
    public final void rule__Hide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1455:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1456:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1456:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1457:1: ()
            {
             before(grammarAccess.getHideAccess().getHideAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1458:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1460:1: 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1470:1: rule__Hide__Group__1 : rule__Hide__Group__1__Impl rule__Hide__Group__2 ;
    public final void rule__Hide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1474:1: ( rule__Hide__Group__1__Impl rule__Hide__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1475:2: rule__Hide__Group__1__Impl rule__Hide__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__12887);
            rule__Hide__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__12890);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1482:1: rule__Hide__Group__1__Impl : ( 'Hide' ) ;
    public final void rule__Hide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1486:1: ( ( 'Hide' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1487:1: ( 'Hide' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1487:1: ( 'Hide' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1488:1: 'Hide'
            {
             before(grammarAccess.getHideAccess().getHideKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Hide__Group__1__Impl2918); 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1501:1: rule__Hide__Group__2 : rule__Hide__Group__2__Impl rule__Hide__Group__3 ;
    public final void rule__Hide__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1505:1: ( rule__Hide__Group__2__Impl rule__Hide__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1506:2: rule__Hide__Group__2__Impl rule__Hide__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__22949);
            rule__Hide__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__22952);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1513:1: rule__Hide__Group__2__Impl : ( '{' ) ;
    public final void rule__Hide__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1517:1: ( ( '{' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1518:1: ( '{' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1518:1: ( '{' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1519:1: '{'
            {
             before(grammarAccess.getHideAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Hide__Group__2__Impl2980); 
             after(grammarAccess.getHideAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1532:1: rule__Hide__Group__3 : rule__Hide__Group__3__Impl rule__Hide__Group__4 ;
    public final void rule__Hide__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1536:1: ( rule__Hide__Group__3__Impl rule__Hide__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1537:2: rule__Hide__Group__3__Impl rule__Hide__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__33011);
            rule__Hide__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__4_in_rule__Hide__Group__33014);
            rule__Hide__Group__4();

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1544:1: rule__Hide__Group__3__Impl : ( ( rule__Hide__Group_3__0 )? ) ;
    public final void rule__Hide__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1548:1: ( ( ( rule__Hide__Group_3__0 )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1549:1: ( ( rule__Hide__Group_3__0 )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1549:1: ( ( rule__Hide__Group_3__0 )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1550:1: ( rule__Hide__Group_3__0 )?
            {
             before(grammarAccess.getHideAccess().getGroup_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1551:1: ( rule__Hide__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1551:2: rule__Hide__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Hide__Group_3__0_in_rule__Hide__Group__3__Impl3041);
                    rule__Hide__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHideAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Hide__Group__4"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1561:1: rule__Hide__Group__4 : rule__Hide__Group__4__Impl ;
    public final void rule__Hide__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1565:1: ( rule__Hide__Group__4__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1566:2: rule__Hide__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group__4__Impl_in_rule__Hide__Group__43072);
            rule__Hide__Group__4__Impl();

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
    // $ANTLR end "rule__Hide__Group__4"


    // $ANTLR start "rule__Hide__Group__4__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1572:1: rule__Hide__Group__4__Impl : ( '}' ) ;
    public final void rule__Hide__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1576:1: ( ( '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1577:1: ( '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1577:1: ( '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1578:1: '}'
            {
             before(grammarAccess.getHideAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Hide__Group__4__Impl3100); 
             after(grammarAccess.getHideAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Hide__Group__4__Impl"


    // $ANTLR start "rule__Hide__Group_3__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1601:1: rule__Hide__Group_3__0 : rule__Hide__Group_3__0__Impl rule__Hide__Group_3__1 ;
    public final void rule__Hide__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1605:1: ( rule__Hide__Group_3__0__Impl rule__Hide__Group_3__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1606:2: rule__Hide__Group_3__0__Impl rule__Hide__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group_3__0__Impl_in_rule__Hide__Group_3__03141);
            rule__Hide__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group_3__1_in_rule__Hide__Group_3__03144);
            rule__Hide__Group_3__1();

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
    // $ANTLR end "rule__Hide__Group_3__0"


    // $ANTLR start "rule__Hide__Group_3__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1613:1: rule__Hide__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__Hide__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1617:1: ( ( 'label' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1618:1: ( 'label' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1618:1: ( 'label' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1619:1: 'label'
            {
             before(grammarAccess.getHideAccess().getLabelKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Hide__Group_3__0__Impl3172); 
             after(grammarAccess.getHideAccess().getLabelKeyword_3_0()); 

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
    // $ANTLR end "rule__Hide__Group_3__0__Impl"


    // $ANTLR start "rule__Hide__Group_3__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1632:1: rule__Hide__Group_3__1 : rule__Hide__Group_3__1__Impl ;
    public final void rule__Hide__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1636:1: ( rule__Hide__Group_3__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1637:2: rule__Hide__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__Group_3__1__Impl_in_rule__Hide__Group_3__13203);
            rule__Hide__Group_3__1__Impl();

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
    // $ANTLR end "rule__Hide__Group_3__1"


    // $ANTLR start "rule__Hide__Group_3__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1643:1: rule__Hide__Group_3__1__Impl : ( ( rule__Hide__LabelAssignment_3_1 ) ) ;
    public final void rule__Hide__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1647:1: ( ( ( rule__Hide__LabelAssignment_3_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1648:1: ( ( rule__Hide__LabelAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1648:1: ( ( rule__Hide__LabelAssignment_3_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1649:1: ( rule__Hide__LabelAssignment_3_1 )
            {
             before(grammarAccess.getHideAccess().getLabelAssignment_3_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1650:1: ( rule__Hide__LabelAssignment_3_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1650:2: rule__Hide__LabelAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Hide__LabelAssignment_3_1_in_rule__Hide__Group_3__1__Impl3230);
            rule__Hide__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHideAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__Hide__Group_3__1__Impl"


    // $ANTLR start "rule__Stop__Group__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1664:1: rule__Stop__Group__0 : rule__Stop__Group__0__Impl rule__Stop__Group__1 ;
    public final void rule__Stop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1668:1: ( rule__Stop__Group__0__Impl rule__Stop__Group__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1669:2: rule__Stop__Group__0__Impl rule__Stop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__03264);
            rule__Stop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__03267);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1676:1: rule__Stop__Group__0__Impl : ( () ) ;
    public final void rule__Stop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1680:1: ( ( () ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1681:1: ( () )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1681:1: ( () )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1682:1: ()
            {
             before(grammarAccess.getStopAccess().getStopAction_0()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1683:1: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1685:1: 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1695:1: rule__Stop__Group__1 : rule__Stop__Group__1__Impl rule__Stop__Group__2 ;
    public final void rule__Stop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1699:1: ( rule__Stop__Group__1__Impl rule__Stop__Group__2 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1700:2: rule__Stop__Group__1__Impl rule__Stop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__13325);
            rule__Stop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__13328);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1707:1: rule__Stop__Group__1__Impl : ( 'Stop' ) ;
    public final void rule__Stop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1711:1: ( ( 'Stop' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1712:1: ( 'Stop' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1712:1: ( 'Stop' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1713:1: 'Stop'
            {
             before(grammarAccess.getStopAccess().getStopKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Stop__Group__1__Impl3356); 
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1726:1: rule__Stop__Group__2 : rule__Stop__Group__2__Impl rule__Stop__Group__3 ;
    public final void rule__Stop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1730:1: ( rule__Stop__Group__2__Impl rule__Stop__Group__3 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1731:2: rule__Stop__Group__2__Impl rule__Stop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__23387);
            rule__Stop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__23390);
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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1738:1: rule__Stop__Group__2__Impl : ( '{' ) ;
    public final void rule__Stop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1742:1: ( ( '{' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1743:1: ( '{' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1743:1: ( '{' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1744:1: '{'
            {
             before(grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Stop__Group__2__Impl3418); 
             after(grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1757:1: rule__Stop__Group__3 : rule__Stop__Group__3__Impl rule__Stop__Group__4 ;
    public final void rule__Stop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1761:1: ( rule__Stop__Group__3__Impl rule__Stop__Group__4 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1762:2: rule__Stop__Group__3__Impl rule__Stop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__33449);
            rule__Stop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__33452);
            rule__Stop__Group__4();

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1769:1: rule__Stop__Group__3__Impl : ( ( rule__Stop__Group_3__0 )? ) ;
    public final void rule__Stop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1773:1: ( ( ( rule__Stop__Group_3__0 )? ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1774:1: ( ( rule__Stop__Group_3__0 )? )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1774:1: ( ( rule__Stop__Group_3__0 )? )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1775:1: ( rule__Stop__Group_3__0 )?
            {
             before(grammarAccess.getStopAccess().getGroup_3()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1776:1: ( rule__Stop__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1776:2: rule__Stop__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Stop__Group_3__0_in_rule__Stop__Group__3__Impl3479);
                    rule__Stop__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStopAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Stop__Group__4"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1786:1: rule__Stop__Group__4 : rule__Stop__Group__4__Impl ;
    public final void rule__Stop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1790:1: ( rule__Stop__Group__4__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1791:2: rule__Stop__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__43510);
            rule__Stop__Group__4__Impl();

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
    // $ANTLR end "rule__Stop__Group__4"


    // $ANTLR start "rule__Stop__Group__4__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1797:1: rule__Stop__Group__4__Impl : ( '}' ) ;
    public final void rule__Stop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1801:1: ( ( '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1802:1: ( '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1802:1: ( '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1803:1: '}'
            {
             before(grammarAccess.getStopAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Stop__Group__4__Impl3538); 
             after(grammarAccess.getStopAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Stop__Group__4__Impl"


    // $ANTLR start "rule__Stop__Group_3__0"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1826:1: rule__Stop__Group_3__0 : rule__Stop__Group_3__0__Impl rule__Stop__Group_3__1 ;
    public final void rule__Stop__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1830:1: ( rule__Stop__Group_3__0__Impl rule__Stop__Group_3__1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1831:2: rule__Stop__Group_3__0__Impl rule__Stop__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group_3__0__Impl_in_rule__Stop__Group_3__03579);
            rule__Stop__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group_3__1_in_rule__Stop__Group_3__03582);
            rule__Stop__Group_3__1();

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
    // $ANTLR end "rule__Stop__Group_3__0"


    // $ANTLR start "rule__Stop__Group_3__0__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1838:1: rule__Stop__Group_3__0__Impl : ( 'label' ) ;
    public final void rule__Stop__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1842:1: ( ( 'label' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1843:1: ( 'label' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1843:1: ( 'label' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1844:1: 'label'
            {
             before(grammarAccess.getStopAccess().getLabelKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Stop__Group_3__0__Impl3610); 
             after(grammarAccess.getStopAccess().getLabelKeyword_3_0()); 

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
    // $ANTLR end "rule__Stop__Group_3__0__Impl"


    // $ANTLR start "rule__Stop__Group_3__1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1857:1: rule__Stop__Group_3__1 : rule__Stop__Group_3__1__Impl ;
    public final void rule__Stop__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1861:1: ( rule__Stop__Group_3__1__Impl )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1862:2: rule__Stop__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__Group_3__1__Impl_in_rule__Stop__Group_3__13641);
            rule__Stop__Group_3__1__Impl();

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
    // $ANTLR end "rule__Stop__Group_3__1"


    // $ANTLR start "rule__Stop__Group_3__1__Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1868:1: rule__Stop__Group_3__1__Impl : ( ( rule__Stop__LabelAssignment_3_1 ) ) ;
    public final void rule__Stop__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1872:1: ( ( ( rule__Stop__LabelAssignment_3_1 ) ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1873:1: ( ( rule__Stop__LabelAssignment_3_1 ) )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1873:1: ( ( rule__Stop__LabelAssignment_3_1 ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1874:1: ( rule__Stop__LabelAssignment_3_1 )
            {
             before(grammarAccess.getStopAccess().getLabelAssignment_3_1()); 
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1875:1: ( rule__Stop__LabelAssignment_3_1 )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1875:2: rule__Stop__LabelAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Stop__LabelAssignment_3_1_in_rule__Stop__Group_3__1__Impl3668);
            rule__Stop__LabelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStopAccess().getLabelAssignment_3_1()); 

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
    // $ANTLR end "rule__Stop__Group_3__1__Impl"


    // $ANTLR start "rule__Animation__AnimationObjectsAssignment_4"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1890:1: rule__Animation__AnimationObjectsAssignment_4 : ( ruleAnimationObject ) ;
    public final void rule__Animation__AnimationObjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1894:1: ( ( ruleAnimationObject ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1895:1: ( ruleAnimationObject )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1895:1: ( ruleAnimationObject )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1896:1: ruleAnimationObject
            {
             before(grammarAccess.getAnimationAccess().getAnimationObjectsAnimationObjectParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_in_rule__Animation__AnimationObjectsAssignment_43707);
            ruleAnimationObject();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getAnimationObjectsAnimationObjectParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Animation__AnimationObjectsAssignment_4"


    // $ANTLR start "rule__Animation__AnimationObjectsAssignment_5_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1905:1: rule__Animation__AnimationObjectsAssignment_5_1 : ( ruleAnimationObject ) ;
    public final void rule__Animation__AnimationObjectsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1909:1: ( ( ruleAnimationObject ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1910:1: ( ruleAnimationObject )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1910:1: ( ruleAnimationObject )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1911:1: ruleAnimationObject
            {
             before(grammarAccess.getAnimationAccess().getAnimationObjectsAnimationObjectParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_in_rule__Animation__AnimationObjectsAssignment_5_13738);
            ruleAnimationObject();

            state._fsp--;

             after(grammarAccess.getAnimationAccess().getAnimationObjectsAnimationObjectParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Animation__AnimationObjectsAssignment_5_1"


    // $ANTLR start "rule__AnimationObject_Impl__LabelAssignment_3_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1920:1: rule__AnimationObject_Impl__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AnimationObject_Impl__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1924:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1925:1: ( ruleEString )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1925:1: ( ruleEString )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1926:1: ruleEString
            {
             before(grammarAccess.getAnimationObject_ImplAccess().getLabelEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnimationObject_Impl__LabelAssignment_3_13769);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnimationObject_ImplAccess().getLabelEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AnimationObject_Impl__LabelAssignment_3_1"


    // $ANTLR start "rule__Move__LabelAssignment_3_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1935:1: rule__Move__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Move__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1939:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1940:1: ( ruleEString )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1940:1: ( ruleEString )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1941:1: ruleEString
            {
             before(grammarAccess.getMoveAccess().getLabelEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Move__LabelAssignment_3_13800);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getLabelEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Move__LabelAssignment_3_1"


    // $ANTLR start "rule__Move__SpeedAssignment_4_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1950:1: rule__Move__SpeedAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Move__SpeedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1954:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1955:1: ( ruleEString )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1955:1: ( ruleEString )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1956:1: ruleEString
            {
             before(grammarAccess.getMoveAccess().getSpeedEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Move__SpeedAssignment_4_13831);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getSpeedEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Move__SpeedAssignment_4_1"


    // $ANTLR start "rule__Show__LabelAssignment_3_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1965:1: rule__Show__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Show__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1969:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1970:1: ( ruleEString )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1970:1: ( ruleEString )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1971:1: ruleEString
            {
             before(grammarAccess.getShowAccess().getLabelEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Show__LabelAssignment_3_13862);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getLabelEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Show__LabelAssignment_3_1"


    // $ANTLR start "rule__Hide__LabelAssignment_3_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1980:1: rule__Hide__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Hide__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1984:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1985:1: ( ruleEString )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1985:1: ( ruleEString )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1986:1: ruleEString
            {
             before(grammarAccess.getHideAccess().getLabelEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Hide__LabelAssignment_3_13893);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHideAccess().getLabelEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Hide__LabelAssignment_3_1"


    // $ANTLR start "rule__Stop__LabelAssignment_3_1"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1995:1: rule__Stop__LabelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Stop__LabelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:1999:1: ( ( ruleEString ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:2000:1: ( ruleEString )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:2000:1: ( ruleEString )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language.ui/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/ui/contentassist/antlr/internal/InternalAnimationLanguage.g:2001:1: ruleEString
            {
             before(grammarAccess.getStopAccess().getLabelEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Stop__LabelAssignment_3_13924);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStopAccess().getLabelEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Stop__LabelAssignment_3_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__0_in_ruleAnimation94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_in_entryRuleAnimationObject121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimationObject128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject__Alternatives_in_ruleAnimationObject154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_Impl_in_entryRuleAnimationObject_Impl181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimationObject_Impl188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__0_in_ruleAnimationObject_Impl214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0_in_ruleMove334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_entryRuleShow361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShow368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__0_in_ruleShow394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_entryRuleHide421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHide428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__0_in_ruleHide454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0_in_ruleStop514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_Impl_in_rule__AnimationObject__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_rule__AnimationObject__Alternatives567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_rule__AnimationObject__Alternatives584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_rule__AnimationObject__Alternatives601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_rule__AnimationObject__Alternatives618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__0__Impl_in_rule__Animation__Group__0697 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Animation__Group__1_in_rule__Animation__Group__0700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Animation__Group__0__Impl728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__1__Impl_in_rule__Animation__Group__1759 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Animation__Group__2_in_rule__Animation__Group__1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Animation__Group__1__Impl790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__2__Impl_in_rule__Animation__Group__2821 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Animation__Group__3_in_rule__Animation__Group__2824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Animation__Group__2__Impl852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__3__Impl_in_rule__Animation__Group__3883 = new BitSet(new long[]{0x0000000000750000L});
        public static final BitSet FOLLOW_rule__Animation__Group__4_in_rule__Animation__Group__3886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Animation__Group__3__Impl914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__4__Impl_in_rule__Animation__Group__4945 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Animation__Group__5_in_rule__Animation__Group__4948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__AnimationObjectsAssignment_4_in_rule__Animation__Group__4__Impl975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__5__Impl_in_rule__Animation__Group__51005 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Animation__Group__6_in_rule__Animation__Group__51008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_5__0_in_rule__Animation__Group__5__Impl1035 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Animation__Group__6__Impl_in_rule__Animation__Group__61066 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Animation__Group__7_in_rule__Animation__Group__61069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Animation__Group__6__Impl1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group__7__Impl_in_rule__Animation__Group__71128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Animation__Group__7__Impl1156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_5__0__Impl_in_rule__Animation__Group_5__01203 = new BitSet(new long[]{0x0000000000750000L});
        public static final BitSet FOLLOW_rule__Animation__Group_5__1_in_rule__Animation__Group_5__01206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Animation__Group_5__0__Impl1234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__Group_5__1__Impl_in_rule__Animation__Group_5__11265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Animation__AnimationObjectsAssignment_5_1_in_rule__Animation__Group_5__1__Impl1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__0__Impl_in_rule__AnimationObject_Impl__Group__01326 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__1_in_rule__AnimationObject_Impl__Group__01329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__1__Impl_in_rule__AnimationObject_Impl__Group__11387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__2_in_rule__AnimationObject_Impl__Group__11390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AnimationObject_Impl__Group__1__Impl1418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__2__Impl_in_rule__AnimationObject_Impl__Group__21449 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__3_in_rule__AnimationObject_Impl__Group__21452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AnimationObject_Impl__Group__2__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__3__Impl_in_rule__AnimationObject_Impl__Group__31511 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__4_in_rule__AnimationObject_Impl__Group__31514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group_3__0_in_rule__AnimationObject_Impl__Group__3__Impl1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group__4__Impl_in_rule__AnimationObject_Impl__Group__41572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AnimationObject_Impl__Group__4__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group_3__0__Impl_in_rule__AnimationObject_Impl__Group_3__01641 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group_3__1_in_rule__AnimationObject_Impl__Group_3__01644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AnimationObject_Impl__Group_3__0__Impl1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__Group_3__1__Impl_in_rule__AnimationObject_Impl__Group_3__11703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnimationObject_Impl__LabelAssignment_3_1_in_rule__AnimationObject_Impl__Group_3__1__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__0__Impl_in_rule__Move__Group__01764 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Move__Group__1_in_rule__Move__Group__01767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__1__Impl_in_rule__Move__Group__11825 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Move__Group__2_in_rule__Move__Group__11828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Move__Group__1__Impl1856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__2__Impl_in_rule__Move__Group__21887 = new BitSet(new long[]{0x00000000000A4000L});
        public static final BitSet FOLLOW_rule__Move__Group__3_in_rule__Move__Group__21890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Move__Group__2__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__3__Impl_in_rule__Move__Group__31949 = new BitSet(new long[]{0x00000000000A4000L});
        public static final BitSet FOLLOW_rule__Move__Group__4_in_rule__Move__Group__31952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_3__0_in_rule__Move__Group__3__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__4__Impl_in_rule__Move__Group__42010 = new BitSet(new long[]{0x00000000000A4000L});
        public static final BitSet FOLLOW_rule__Move__Group__5_in_rule__Move__Group__42013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_4__0_in_rule__Move__Group__4__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group__5__Impl_in_rule__Move__Group__52071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Move__Group__5__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_3__0__Impl_in_rule__Move__Group_3__02142 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Move__Group_3__1_in_rule__Move__Group_3__02145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Move__Group_3__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_3__1__Impl_in_rule__Move__Group_3__12204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__LabelAssignment_3_1_in_rule__Move__Group_3__1__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_4__0__Impl_in_rule__Move__Group_4__02265 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Move__Group_4__1_in_rule__Move__Group_4__02268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Move__Group_4__0__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__Group_4__1__Impl_in_rule__Move__Group_4__12327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Move__SpeedAssignment_4_1_in_rule__Move__Group_4__1__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__0__Impl_in_rule__Show__Group__02388 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Show__Group__1_in_rule__Show__Group__02391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__1__Impl_in_rule__Show__Group__12449 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Show__Group__2_in_rule__Show__Group__12452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Show__Group__1__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__2__Impl_in_rule__Show__Group__22511 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Show__Group__3_in_rule__Show__Group__22514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Show__Group__2__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__3__Impl_in_rule__Show__Group__32573 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Show__Group__4_in_rule__Show__Group__32576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group_3__0_in_rule__Show__Group__3__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group__4__Impl_in_rule__Show__Group__42634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Show__Group__4__Impl2662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group_3__0__Impl_in_rule__Show__Group_3__02703 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Show__Group_3__1_in_rule__Show__Group_3__02706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Show__Group_3__0__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__Group_3__1__Impl_in_rule__Show__Group_3__12765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Show__LabelAssignment_3_1_in_rule__Show__Group_3__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__0__Impl_in_rule__Hide__Group__02826 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Hide__Group__1_in_rule__Hide__Group__02829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__1__Impl_in_rule__Hide__Group__12887 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Hide__Group__2_in_rule__Hide__Group__12890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Hide__Group__1__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__2__Impl_in_rule__Hide__Group__22949 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Hide__Group__3_in_rule__Hide__Group__22952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Hide__Group__2__Impl2980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__3__Impl_in_rule__Hide__Group__33011 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Hide__Group__4_in_rule__Hide__Group__33014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group_3__0_in_rule__Hide__Group__3__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group__4__Impl_in_rule__Hide__Group__43072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Hide__Group__4__Impl3100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group_3__0__Impl_in_rule__Hide__Group_3__03141 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Hide__Group_3__1_in_rule__Hide__Group_3__03144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Hide__Group_3__0__Impl3172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__Group_3__1__Impl_in_rule__Hide__Group_3__13203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Hide__LabelAssignment_3_1_in_rule__Hide__Group_3__1__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__0__Impl_in_rule__Stop__Group__03264 = new BitSet(new long[]{0x0000000000750000L});
        public static final BitSet FOLLOW_rule__Stop__Group__1_in_rule__Stop__Group__03267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__1__Impl_in_rule__Stop__Group__13325 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Stop__Group__2_in_rule__Stop__Group__13328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Stop__Group__1__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__2__Impl_in_rule__Stop__Group__23387 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Stop__Group__3_in_rule__Stop__Group__23390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Stop__Group__2__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__3__Impl_in_rule__Stop__Group__33449 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_rule__Stop__Group__4_in_rule__Stop__Group__33452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group_3__0_in_rule__Stop__Group__3__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group__4__Impl_in_rule__Stop__Group__43510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Stop__Group__4__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group_3__0__Impl_in_rule__Stop__Group_3__03579 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Stop__Group_3__1_in_rule__Stop__Group_3__03582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Stop__Group_3__0__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__Group_3__1__Impl_in_rule__Stop__Group_3__13641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Stop__LabelAssignment_3_1_in_rule__Stop__Group_3__1__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_in_rule__Animation__AnimationObjectsAssignment_43707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_in_rule__Animation__AnimationObjectsAssignment_5_13738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnimationObject_Impl__LabelAssignment_3_13769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Move__LabelAssignment_3_13800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Move__SpeedAssignment_4_13831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Show__LabelAssignment_3_13862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Hide__LabelAssignment_3_13893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Stop__LabelAssignment_3_13924 = new BitSet(new long[]{0x0000000000000002L});
    }


}