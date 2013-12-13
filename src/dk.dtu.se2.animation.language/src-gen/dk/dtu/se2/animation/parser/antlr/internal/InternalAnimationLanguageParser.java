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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'move'", "'('", "')'", "'appear'", "','", "'-'", "'.'"
    };
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
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:156:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_speed_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:159:28: ( ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:160:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:160:1: ( () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')' )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:160:2: () otherlv_1= 'move' otherlv_2= '(' ( (lv_speed_3_0= ruleEDouble ) ) otherlv_4= ')'
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
                
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:174:1: ( (lv_speed_3_0= ruleEDouble ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:175:1: (lv_speed_3_0= ruleEDouble )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:175:1: (lv_speed_3_0= ruleEDouble )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:176:3: lv_speed_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleMove337);
            lv_speed_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMoveRule());
            	        }
                   		set(
                   			current, 
                   			"speed",
                    		lv_speed_3_0, 
                    		"EDouble");
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


    // $ANTLR start "entryRuleAppear"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:204:1: entryRuleAppear returns [EObject current=null] : iv_ruleAppear= ruleAppear EOF ;
    public final EObject entryRuleAppear() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppear = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:205:2: (iv_ruleAppear= ruleAppear EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:206:2: iv_ruleAppear= ruleAppear EOF
            {
             newCompositeNode(grammarAccess.getAppearRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAppear_in_entryRuleAppear385);
            iv_ruleAppear=ruleAppear();

            state._fsp--;

             current =iv_ruleAppear; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAppear395); 

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
    // $ANTLR end "entryRuleAppear"


    // $ANTLR start "ruleAppear"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:213:1: ruleAppear returns [EObject current=null] : ( () otherlv_1= 'appear' otherlv_2= '(' ( (lv_geometry_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_appearance_5_0= ruleEString ) ) otherlv_6= ')' ) ;
    public final EObject ruleAppear() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_geometry_3_0 = null;

        AntlrDatatypeRuleToken lv_appearance_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:216:28: ( ( () otherlv_1= 'appear' otherlv_2= '(' ( (lv_geometry_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_appearance_5_0= ruleEString ) ) otherlv_6= ')' ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:1: ( () otherlv_1= 'appear' otherlv_2= '(' ( (lv_geometry_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_appearance_5_0= ruleEString ) ) otherlv_6= ')' )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:1: ( () otherlv_1= 'appear' otherlv_2= '(' ( (lv_geometry_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_appearance_5_0= ruleEString ) ) otherlv_6= ')' )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:2: () otherlv_1= 'appear' otherlv_2= '(' ( (lv_geometry_3_0= ruleEString ) ) otherlv_4= ',' ( (lv_appearance_5_0= ruleEString ) ) otherlv_6= ')'
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:217:2: ()
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:218:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAppearAccess().getAppearAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAppear441); 

                	newLeafNode(otherlv_1, grammarAccess.getAppearAccess().getAppearKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAppear453); 

                	newLeafNode(otherlv_2, grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2());
                
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:231:1: ( (lv_geometry_3_0= ruleEString ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:232:1: (lv_geometry_3_0= ruleEString )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:232:1: (lv_geometry_3_0= ruleEString )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:233:3: lv_geometry_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAppear474);
            lv_geometry_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppearRule());
            	        }
                   		set(
                   			current, 
                   			"geometry",
                    		lv_geometry_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAppear486); 

                	newLeafNode(otherlv_4, grammarAccess.getAppearAccess().getCommaKeyword_4());
                
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:253:1: ( (lv_appearance_5_0= ruleEString ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:254:1: (lv_appearance_5_0= ruleEString )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:254:1: (lv_appearance_5_0= ruleEString )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:255:3: lv_appearance_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAppear507);
            lv_appearance_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAppearRule());
            	        }
                   		set(
                   			current, 
                   			"appearance",
                    		lv_appearance_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAppear519); 

                	newLeafNode(otherlv_6, grammarAccess.getAppearAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleAppear"


    // $ANTLR start "entryRuleAnimation"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:283:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:284:2: (iv_ruleAnimation= ruleAnimation EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:285:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation555);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation565); 

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
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:292:1: ruleAnimation returns [EObject current=null] : (this_Move_0= ruleMove | this_Appear_1= ruleAppear ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Appear_1 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:295:28: ( (this_Move_0= ruleMove | this_Appear_1= ruleAppear ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:296:1: (this_Move_0= ruleMove | this_Appear_1= ruleAppear )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:296:1: (this_Move_0= ruleMove | this_Appear_1= ruleAppear )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:297:5: this_Move_0= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleAnimation612);
                    this_Move_0=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:307:5: this_Appear_1= ruleAppear
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAppear_in_ruleAnimation639);
                    this_Appear_1=ruleAppear();

                    state._fsp--;

                     
                            current = this_Appear_1; 
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


    // $ANTLR start "entryRuleEDouble"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:323:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:324:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:325:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble675);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble686); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:332:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:335:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:336:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:336:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:336:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:336:2: (kw= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:337:2: kw= '-'
                    {
                    kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEDouble725); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:342:3: (this_INT_1= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:342:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble743); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEDouble763); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble778); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:372:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:373:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:374:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString826);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString837); 

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
    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:381:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:384:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:385:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:385:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:385:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString877); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.animation.language/src-gen/dk/dtu/se2/animation/parser/antlr/internal/InternalAnimationLanguage.g:393:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString903); 

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
        public static final BitSet FOLLOW_11_in_ruleAnimation_Impl144 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleAnimation_Impl174 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleAnimation_Impl187 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_ruleAnimation_in_ruleAnimation_Impl208 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove248 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_ruleMove304 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMove316 = new BitSet(new long[]{0x0000000000060010L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleMove337 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMove349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_entryRuleAppear385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAppear395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleAppear441 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAppear453 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAppear474 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAppear486 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAppear507 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAppear519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleAnimation612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAppear_in_ruleAnimation639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleEDouble725 = new BitSet(new long[]{0x0000000000040010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble743 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEDouble763 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString903 = new BitSet(new long[]{0x0000000000000002L});
    }


}