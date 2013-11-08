package dk.dtu.se2.animation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.dtu.se2.animation.services.AnimationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnimationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "')'", "'show'", "'hide'", "'stop'", "'['", "']'", "'-'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=6;
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g"; }



     	private AnimationLanguageGrammarAccess grammarAccess;
     	
        public InternalAnimationLanguageParser(TokenStream input, AnimationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Animation_Impl";	
       	}
       	
       	@Override
       	protected AnimationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAnimation_Impl"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:67:1: entryRuleAnimation_Impl returns [EObject current=null] : iv_ruleAnimation_Impl= ruleAnimation_Impl EOF ;
    public final EObject entryRuleAnimation_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation_Impl = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:68:2: (iv_ruleAnimation_Impl= ruleAnimation_Impl EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:69:2: iv_ruleAnimation_Impl= ruleAnimation_Impl EOF
            {
             newCompositeNode(grammarAccess.getAnimation_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_Impl_in_entryRuleAnimation_Impl75);
            iv_ruleAnimation_Impl=ruleAnimation_Impl();

            state._fsp--;

             current =iv_ruleAnimation_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation_Impl85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimation_Impl"


    // $ANTLR start "ruleAnimation_Impl"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:76:1: ruleAnimation_Impl returns [EObject current=null] : (this_Animation_0= ruleAnimation (otherlv_1= ';' () ( (lv_animations_3_0= ruleAnimation ) ) (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )* )? ) ;
    public final EObject ruleAnimation_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_Animation_0 = null;

        EObject lv_animations_3_0 = null;

        EObject lv_animations_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:79:28: ( (this_Animation_0= ruleAnimation (otherlv_1= ';' () ( (lv_animations_3_0= ruleAnimation ) ) (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )* )? ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:80:1: (this_Animation_0= ruleAnimation (otherlv_1= ';' () ( (lv_animations_3_0= ruleAnimation ) ) (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )* )? )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:80:1: (this_Animation_0= ruleAnimation (otherlv_1= ';' () ( (lv_animations_3_0= ruleAnimation ) ) (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )* )? )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:81:5: this_Animation_0= ruleAnimation (otherlv_1= ';' () ( (lv_animations_3_0= ruleAnimation ) ) (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_ruleAnimation_Impl132);
            this_Animation_0=ruleAnimation();

            state._fsp--;

             
                    current = this_Animation_0; 
                    afterParserOrEnumRuleCall();
                
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:89:1: (otherlv_1= ';' () ( (lv_animations_3_0= ruleAnimation ) ) (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:89:3: otherlv_1= ';' () ( (lv_animations_3_0= ruleAnimation ) ) (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )*
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAnimation_Impl144); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0());
                        
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:93:1: ()
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:94:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1(),
                                current);
                        

                    }

                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:99:2: ( (lv_animations_3_0= ruleAnimation ) )
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:100:1: (lv_animations_3_0= ruleAnimation )
                    {
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:100:1: (lv_animations_3_0= ruleAnimation )
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:101:3: lv_animations_3_0= ruleAnimation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_ruleAnimation_Impl174);
                    lv_animations_3_0=ruleAnimation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnimation_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"animations",
                            		lv_animations_3_0, 
                            		"Animation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:117:2: (otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:117:4: otherlv_4= ';' ( (lv_animations_5_0= ruleAnimation ) )
                    	    {
                    	    otherlv_4=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAnimation_Impl187); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0());
                    	        
                    	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:121:1: ( (lv_animations_5_0= ruleAnimation ) )
                    	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:122:1: (lv_animations_5_0= ruleAnimation )
                    	    {
                    	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:122:1: (lv_animations_5_0= ruleAnimation )
                    	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:123:3: lv_animations_5_0= ruleAnimation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_ruleAnimation_Impl208);
                    	    lv_animations_5_0=ruleAnimation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnimation_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"animations",
                    	            		lv_animations_5_0, 
                    	            		"Animation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimation_Impl"


    // $ANTLR start "entryRuleMove"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:147:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:148:2: (iv_ruleMove= ruleMove EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:149:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove248);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:156:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEInt ) ) otherlv_4= ')' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_speed_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:159:28: ( ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEInt ) ) otherlv_4= ')' ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:160:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEInt ) ) otherlv_4= ')' )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:160:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEInt ) ) otherlv_4= ')' )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:160:2: () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEInt ) ) otherlv_4= ')'
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:160:2: ()
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:161:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoveAccess().getMoveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMove304); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMove316); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2());
                
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:174:1: ( (lv_speed_3_0= ruleEInt ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:175:1: (lv_speed_3_0= ruleEInt )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:175:1: (lv_speed_3_0= ruleEInt )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:176:3: lv_speed_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSpeedEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleMove337);
            lv_speed_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveRule());
            	        }
                   		set(
                   			current, 
                   			"speed",
                    		lv_speed_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMove349); 

                	newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleShow"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:204:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:205:2: (iv_ruleShow= ruleShow EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:206:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShow_in_entryRuleShow385);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShow395); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:213:1: ruleShow returns [EObject current=null] : ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:216:28: ( ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:1: ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:1: ( () otherlv_1= 'show' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')' )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:2: () otherlv_1= 'show' otherlv_2= '(' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ')'
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:2: ()
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShowAccess().getShowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleShow441); 

                	newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleShow453); 

                	newLeafNode(otherlv_2, grammarAccess.getShowAccess().getLeftParenthesisKeyword_2());
                
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:231:1: ( (lv_name_3_0= ruleEString ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:232:1: (lv_name_3_0= ruleEString )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:232:1: (lv_name_3_0= ruleEString )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:233:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getShowAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleShow474);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShowRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleShow486); 

                	newLeafNode(otherlv_4, grammarAccess.getShowAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleHide"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:261:1: entryRuleHide returns [EObject current=null] : iv_ruleHide= ruleHide EOF ;
    public final EObject entryRuleHide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHide = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:262:2: (iv_ruleHide= ruleHide EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:263:2: iv_ruleHide= ruleHide EOF
            {
             newCompositeNode(grammarAccess.getHideRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHide_in_entryRuleHide522);
            iv_ruleHide=ruleHide();

            state._fsp--;

             current =iv_ruleHide; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHide532); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHide"


    // $ANTLR start "ruleHide"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:270:1: ruleHide returns [EObject current=null] : ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleHide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:273:28: ( ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:274:1: ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:274:1: ( () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')' )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:274:2: () otherlv_1= 'hide' otherlv_2= '(' otherlv_3= ')'
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:274:2: ()
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:275:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHideAccess().getHideAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleHide578); 

                	newLeafNode(otherlv_1, grammarAccess.getHideAccess().getHideKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleHide590); 

                	newLeafNode(otherlv_2, grammarAccess.getHideAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleHide602); 

                	newLeafNode(otherlv_3, grammarAccess.getHideAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHide"


    // $ANTLR start "entryRuleStop"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:300:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:301:2: (iv_ruleStop= ruleStop EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:302:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop638);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStop"


    // $ANTLR start "ruleStop"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:309:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'stop' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:312:28: ( ( () otherlv_1= 'stop' otherlv_2= '(' otherlv_3= ')' ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:313:1: ( () otherlv_1= 'stop' otherlv_2= '(' otherlv_3= ')' )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:313:1: ( () otherlv_1= 'stop' otherlv_2= '(' otherlv_3= ')' )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:313:2: () otherlv_1= 'stop' otherlv_2= '(' otherlv_3= ')'
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:313:2: ()
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStopAccess().getStopAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStop694); 

                	newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleStop706); 

                	newLeafNode(otherlv_2, grammarAccess.getStopAccess().getLeftParenthesisKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleStop718); 

                	newLeafNode(otherlv_3, grammarAccess.getStopAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStop"


    // $ANTLR start "entryRuleSequence"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:339:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:340:2: (iv_ruleSequence= ruleSequence EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:341:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence754);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:348:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_animations_2_0= ruleAnimation ) ) (otherlv_3= ';' ( (lv_animations_4_0= ruleAnimation ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_animations_2_0 = null;

        EObject lv_animations_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:351:28: ( ( () otherlv_1= '[' ( (lv_animations_2_0= ruleAnimation ) ) (otherlv_3= ';' ( (lv_animations_4_0= ruleAnimation ) ) )* otherlv_5= ']' ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:352:1: ( () otherlv_1= '[' ( (lv_animations_2_0= ruleAnimation ) ) (otherlv_3= ';' ( (lv_animations_4_0= ruleAnimation ) ) )* otherlv_5= ']' )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:352:1: ( () otherlv_1= '[' ( (lv_animations_2_0= ruleAnimation ) ) (otherlv_3= ';' ( (lv_animations_4_0= ruleAnimation ) ) )* otherlv_5= ']' )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:352:2: () otherlv_1= '[' ( (lv_animations_2_0= ruleAnimation ) ) (otherlv_3= ';' ( (lv_animations_4_0= ruleAnimation ) ) )* otherlv_5= ']'
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:352:2: ()
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:353:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSequenceAccess().getSequenceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSequence810); 

                	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1());
                
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:362:1: ( (lv_animations_2_0= ruleAnimation ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:363:1: (lv_animations_2_0= ruleAnimation )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:363:1: (lv_animations_2_0= ruleAnimation )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:364:3: lv_animations_2_0= ruleAnimation
            {
             
            	        newCompositeNode(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_ruleSequence831);
            lv_animations_2_0=ruleAnimation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	        }
                   		add(
                   			current, 
                   			"animations",
                    		lv_animations_2_0, 
                    		"Animation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:380:2: (otherlv_3= ';' ( (lv_animations_4_0= ruleAnimation ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:380:4: otherlv_3= ';' ( (lv_animations_4_0= ruleAnimation ) )
            	    {
            	    otherlv_3=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleSequence844); 

            	        	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0());
            	        
            	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:384:1: ( (lv_animations_4_0= ruleAnimation ) )
            	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:385:1: (lv_animations_4_0= ruleAnimation )
            	    {
            	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:385:1: (lv_animations_4_0= ruleAnimation )
            	    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:386:3: lv_animations_4_0= ruleAnimation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_ruleSequence865);
            	    lv_animations_4_0=ruleAnimation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"animations",
            	            		lv_animations_4_0, 
            	            		"Animation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSequence879); 

                	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAnimation"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:414:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:415:2: (iv_ruleAnimation= ruleAnimation EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:416:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation915);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation925); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:423:1: ruleAnimation returns [EObject current=null] : (this_Move_0= ruleMove | this_Show_1= ruleShow | this_Hide_2= ruleHide | this_Stop_3= ruleStop | this_Sequence_4= ruleSequence ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Show_1 = null;

        EObject this_Hide_2 = null;

        EObject this_Stop_3 = null;

        EObject this_Sequence_4 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:426:28: ( (this_Move_0= ruleMove | this_Show_1= ruleShow | this_Hide_2= ruleHide | this_Stop_3= ruleStop | this_Sequence_4= ruleSequence ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:427:1: (this_Move_0= ruleMove | this_Show_1= ruleShow | this_Hide_2= ruleHide | this_Stop_3= ruleStop | this_Sequence_4= ruleSequence )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:427:1: (this_Move_0= ruleMove | this_Show_1= ruleShow | this_Hide_2= ruleHide | this_Stop_3= ruleStop | this_Sequence_4= ruleSequence )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:428:5: this_Move_0= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleAnimation972);
                    this_Move_0=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:438:5: this_Show_1= ruleShow
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getShowParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleShow_in_ruleAnimation999);
                    this_Show_1=ruleShow();

                    state._fsp--;

                     
                            current = this_Show_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:448:5: this_Hide_2= ruleHide
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getHideParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHide_in_ruleAnimation1026);
                    this_Hide_2=ruleHide();

                    state._fsp--;

                     
                            current = this_Hide_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:458:5: this_Stop_3= ruleStop
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getStopParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_ruleAnimation1053);
                    this_Stop_3=ruleStop();

                    state._fsp--;

                     
                            current = this_Stop_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:468:5: this_Sequence_4= ruleSequence
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSequence_in_ruleAnimation1080);
                    this_Sequence_4=ruleSequence();

                    state._fsp--;

                     
                            current = this_Sequence_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleEInt"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:484:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:485:2: (iv_ruleEInt= ruleEInt EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:486:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1116);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1127); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:493:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:496:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:497:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:497:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:497:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:497:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:498:2: kw= '-'
                    {
                    kw=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEInt1166); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1183); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:518:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:519:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:520:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1229);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1240); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:527:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:530:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:531:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:531:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:531:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1280); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:539:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1306); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnimation_Impl_in_entryRuleAnimation_Impl75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation_Impl85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleAnimation_Impl132 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAnimation_Impl144 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleAnimation_Impl174 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAnimation_Impl187 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleAnimation_Impl208 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMove304 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMove316 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleMove337 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMove349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_entryRuleShow385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShow395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleShow441 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleShow453 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleShow474 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleShow486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_entryRuleHide522 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHide532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleHide578 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleHide590 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleHide602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop638 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleStop694 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleStop706 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleStop718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSequence810 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleSequence831 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_11_in_ruleSequence844 = new BitSet(new long[]{0x0000000000079000L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleSequence865 = new BitSet(new long[]{0x0000000000080800L});
        public static final BitSet FOLLOW_19_in_ruleSequence879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleAnimation972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_ruleAnimation999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_ruleAnimation1026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_ruleAnimation1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSequence_in_ruleAnimation1080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleEInt1166 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1229 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1306 = new BitSet(new long[]{0x0000000000000002L});
    }


}