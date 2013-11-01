package dk.dtu.se2.tutorials.tutorial6.animationTest.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.dtu.se2.tutorials.tutorial6.animationTest.language.services.AnimationLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnimationLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Animation'", "'{'", "'animationObjects'", "','", "'}'", "'AnimationObject'", "'label'", "'Move'", "'speed'", "'Show'", "'Hide'", "'Stop'"
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
    public String getGrammarFileName() { return "../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g"; }



     	private AnimationLanguageGrammarAccess grammarAccess;
     	
        public InternalAnimationLanguageParser(TokenStream input, AnimationLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Animation";	
       	}
       	
       	@Override
       	protected AnimationLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAnimation"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:67:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:68:2: (iv_ruleAnimation= ruleAnimation EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:69:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimation_in_entryRuleAnimation75);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimation85); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:76:1: ruleAnimation returns [EObject current=null] : (otherlv_0= 'Animation' otherlv_1= '{' otherlv_2= 'animationObjects' otherlv_3= '{' ( (lv_animationObjects_4_0= ruleAnimationObject ) ) (otherlv_5= ',' ( (lv_animationObjects_6_0= ruleAnimationObject ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_animationObjects_4_0 = null;

        EObject lv_animationObjects_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:79:28: ( (otherlv_0= 'Animation' otherlv_1= '{' otherlv_2= 'animationObjects' otherlv_3= '{' ( (lv_animationObjects_4_0= ruleAnimationObject ) ) (otherlv_5= ',' ( (lv_animationObjects_6_0= ruleAnimationObject ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:80:1: (otherlv_0= 'Animation' otherlv_1= '{' otherlv_2= 'animationObjects' otherlv_3= '{' ( (lv_animationObjects_4_0= ruleAnimationObject ) ) (otherlv_5= ',' ( (lv_animationObjects_6_0= ruleAnimationObject ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:80:1: (otherlv_0= 'Animation' otherlv_1= '{' otherlv_2= 'animationObjects' otherlv_3= '{' ( (lv_animationObjects_4_0= ruleAnimationObject ) ) (otherlv_5= ',' ( (lv_animationObjects_6_0= ruleAnimationObject ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:80:3: otherlv_0= 'Animation' otherlv_1= '{' otherlv_2= 'animationObjects' otherlv_3= '{' ( (lv_animationObjects_4_0= ruleAnimationObject ) ) (otherlv_5= ',' ( (lv_animationObjects_6_0= ruleAnimationObject ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAnimation122); 

                	newLeafNode(otherlv_0, grammarAccess.getAnimationAccess().getAnimationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnimation134); 

                	newLeafNode(otherlv_1, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAnimation146); 

                	newLeafNode(otherlv_2, grammarAccess.getAnimationAccess().getAnimationObjectsKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnimation158); 

                	newLeafNode(otherlv_3, grammarAccess.getAnimationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:96:1: ( (lv_animationObjects_4_0= ruleAnimationObject ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:97:1: (lv_animationObjects_4_0= ruleAnimationObject )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:97:1: (lv_animationObjects_4_0= ruleAnimationObject )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:98:3: lv_animationObjects_4_0= ruleAnimationObject
            {
             
            	        newCompositeNode(grammarAccess.getAnimationAccess().getAnimationObjectsAnimationObjectParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_in_ruleAnimation179);
            lv_animationObjects_4_0=ruleAnimationObject();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnimationRule());
            	        }
                   		add(
                   			current, 
                   			"animationObjects",
                    		lv_animationObjects_4_0, 
                    		"AnimationObject");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:114:2: (otherlv_5= ',' ( (lv_animationObjects_6_0= ruleAnimationObject ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:114:4: otherlv_5= ',' ( (lv_animationObjects_6_0= ruleAnimationObject ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAnimation192); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAnimationAccess().getCommaKeyword_5_0());
            	        
            	    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:118:1: ( (lv_animationObjects_6_0= ruleAnimationObject ) )
            	    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:119:1: (lv_animationObjects_6_0= ruleAnimationObject )
            	    {
            	    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:119:1: (lv_animationObjects_6_0= ruleAnimationObject )
            	    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:120:3: lv_animationObjects_6_0= ruleAnimationObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnimationAccess().getAnimationObjectsAnimationObjectParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_in_ruleAnimation213);
            	    lv_animationObjects_6_0=ruleAnimationObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnimationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"animationObjects",
            	            		lv_animationObjects_6_0, 
            	            		"AnimationObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnimation227); 

                	newLeafNode(otherlv_7, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnimation239); 

                	newLeafNode(otherlv_8, grammarAccess.getAnimationAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleAnimationObject"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:152:1: entryRuleAnimationObject returns [EObject current=null] : iv_ruleAnimationObject= ruleAnimationObject EOF ;
    public final EObject entryRuleAnimationObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimationObject = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:153:2: (iv_ruleAnimationObject= ruleAnimationObject EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:154:2: iv_ruleAnimationObject= ruleAnimationObject EOF
            {
             newCompositeNode(grammarAccess.getAnimationObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_in_entryRuleAnimationObject275);
            iv_ruleAnimationObject=ruleAnimationObject();

            state._fsp--;

             current =iv_ruleAnimationObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimationObject285); 

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
    // $ANTLR end "entryRuleAnimationObject"


    // $ANTLR start "ruleAnimationObject"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:161:1: ruleAnimationObject returns [EObject current=null] : (this_AnimationObject_Impl_0= ruleAnimationObject_Impl | this_Move_1= ruleMove | this_Show_2= ruleShow | this_Hide_3= ruleHide | this_Stop_4= ruleStop ) ;
    public final EObject ruleAnimationObject() throws RecognitionException {
        EObject current = null;

        EObject this_AnimationObject_Impl_0 = null;

        EObject this_Move_1 = null;

        EObject this_Show_2 = null;

        EObject this_Hide_3 = null;

        EObject this_Stop_4 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:164:28: ( (this_AnimationObject_Impl_0= ruleAnimationObject_Impl | this_Move_1= ruleMove | this_Show_2= ruleShow | this_Hide_3= ruleHide | this_Stop_4= ruleStop ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:165:1: (this_AnimationObject_Impl_0= ruleAnimationObject_Impl | this_Move_1= ruleMove | this_Show_2= ruleShow | this_Hide_3= ruleHide | this_Stop_4= ruleStop )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:165:1: (this_AnimationObject_Impl_0= ruleAnimationObject_Impl | this_Move_1= ruleMove | this_Show_2= ruleShow | this_Hide_3= ruleHide | this_Stop_4= ruleStop )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:166:5: this_AnimationObject_Impl_0= ruleAnimationObject_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationObjectAccess().getAnimationObject_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_Impl_in_ruleAnimationObject332);
                    this_AnimationObject_Impl_0=ruleAnimationObject_Impl();

                    state._fsp--;

                     
                            current = this_AnimationObject_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:176:5: this_Move_1= ruleMove
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationObjectAccess().getMoveParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMove_in_ruleAnimationObject359);
                    this_Move_1=ruleMove();

                    state._fsp--;

                     
                            current = this_Move_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:186:5: this_Show_2= ruleShow
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationObjectAccess().getShowParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleShow_in_ruleAnimationObject386);
                    this_Show_2=ruleShow();

                    state._fsp--;

                     
                            current = this_Show_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:196:5: this_Hide_3= ruleHide
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationObjectAccess().getHideParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHide_in_ruleAnimationObject413);
                    this_Hide_3=ruleHide();

                    state._fsp--;

                     
                            current = this_Hide_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:206:5: this_Stop_4= ruleStop
                    {
                     
                            newCompositeNode(grammarAccess.getAnimationObjectAccess().getStopParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStop_in_ruleAnimationObject440);
                    this_Stop_4=ruleStop();

                    state._fsp--;

                     
                            current = this_Stop_4; 
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
    // $ANTLR end "ruleAnimationObject"


    // $ANTLR start "entryRuleAnimationObject_Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:222:1: entryRuleAnimationObject_Impl returns [EObject current=null] : iv_ruleAnimationObject_Impl= ruleAnimationObject_Impl EOF ;
    public final EObject entryRuleAnimationObject_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimationObject_Impl = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:223:2: (iv_ruleAnimationObject_Impl= ruleAnimationObject_Impl EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:224:2: iv_ruleAnimationObject_Impl= ruleAnimationObject_Impl EOF
            {
             newCompositeNode(grammarAccess.getAnimationObject_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnimationObject_Impl_in_entryRuleAnimationObject_Impl475);
            iv_ruleAnimationObject_Impl=ruleAnimationObject_Impl();

            state._fsp--;

             current =iv_ruleAnimationObject_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnimationObject_Impl485); 

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
    // $ANTLR end "entryRuleAnimationObject_Impl"


    // $ANTLR start "ruleAnimationObject_Impl"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:231:1: ruleAnimationObject_Impl returns [EObject current=null] : ( () otherlv_1= 'AnimationObject' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAnimationObject_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_label_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:234:28: ( ( () otherlv_1= 'AnimationObject' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:235:1: ( () otherlv_1= 'AnimationObject' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:235:1: ( () otherlv_1= 'AnimationObject' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:235:2: () otherlv_1= 'AnimationObject' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:235:2: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:236:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnimationObject_ImplAccess().getAnimationObjectAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAnimationObject_Impl531); 

                	newLeafNode(otherlv_1, grammarAccess.getAnimationObject_ImplAccess().getAnimationObjectKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAnimationObject_Impl543); 

                	newLeafNode(otherlv_2, grammarAccess.getAnimationObject_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:249:1: (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:249:3: otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAnimationObject_Impl556); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnimationObject_ImplAccess().getLabelKeyword_3_0());
                        
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:253:1: ( (lv_label_4_0= ruleEString ) )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:254:1: (lv_label_4_0= ruleEString )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:254:1: (lv_label_4_0= ruleEString )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:255:3: lv_label_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnimationObject_ImplAccess().getLabelEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAnimationObject_Impl577);
                    lv_label_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnimationObject_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAnimationObject_Impl591); 

                	newLeafNode(otherlv_5, grammarAccess.getAnimationObject_ImplAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAnimationObject_Impl"


    // $ANTLR start "entryRuleEString"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:283:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:284:2: (iv_ruleEString= ruleEString EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:285:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString628);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString639); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:292:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:295:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:296:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:296:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:296:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString679); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:304:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString705); 

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


    // $ANTLR start "entryRuleMove"
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:319:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:320:2: (iv_ruleMove= ruleMove EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:321:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMove_in_entryRuleMove750);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMove760); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:328:1: ruleMove returns [EObject current=null] : ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'speed' ( (lv_speed_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_label_4_0 = null;

        AntlrDatatypeRuleToken lv_speed_6_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:331:28: ( ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'speed' ( (lv_speed_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:332:1: ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'speed' ( (lv_speed_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:332:1: ( () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'speed' ( (lv_speed_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:332:2: () otherlv_1= 'Move' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? (otherlv_5= 'speed' ( (lv_speed_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:332:2: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:333:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMoveAccess().getMoveAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMove806); 

                	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMove818); 

                	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:346:1: (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:346:3: otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMove831); 

                        	newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getLabelKeyword_3_0());
                        
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:350:1: ( (lv_label_4_0= ruleEString ) )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:351:1: (lv_label_4_0= ruleEString )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:351:1: (lv_label_4_0= ruleEString )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:352:3: lv_label_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getLabelEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove852);
                    lv_label_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMoveRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:368:4: (otherlv_5= 'speed' ( (lv_speed_6_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:368:6: otherlv_5= 'speed' ( (lv_speed_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMove867); 

                        	newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getSpeedKeyword_4_0());
                        
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:372:1: ( (lv_speed_6_0= ruleEString ) )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:373:1: (lv_speed_6_0= ruleEString )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:373:1: (lv_speed_6_0= ruleEString )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:374:3: lv_speed_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getMoveAccess().getSpeedEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMove888);
                    lv_speed_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMoveRule());
                    	        }
                           		set(
                           			current, 
                           			"speed",
                            		lv_speed_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMove902); 

                	newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:402:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:403:2: (iv_ruleShow= ruleShow EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:404:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleShow_in_entryRuleShow938);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShow948); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:411:1: ruleShow returns [EObject current=null] : ( () otherlv_1= 'Show' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_label_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:414:28: ( ( () otherlv_1= 'Show' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:415:1: ( () otherlv_1= 'Show' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:415:1: ( () otherlv_1= 'Show' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:415:2: () otherlv_1= 'Show' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:415:2: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:416:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getShowAccess().getShowAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleShow994); 

                	newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleShow1006); 

                	newLeafNode(otherlv_2, grammarAccess.getShowAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:429:1: (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:429:3: otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleShow1019); 

                        	newLeafNode(otherlv_3, grammarAccess.getShowAccess().getLabelKeyword_3_0());
                        
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:433:1: ( (lv_label_4_0= ruleEString ) )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:434:1: (lv_label_4_0= ruleEString )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:434:1: (lv_label_4_0= ruleEString )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:435:3: lv_label_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getShowAccess().getLabelEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleShow1040);
                    lv_label_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getShowRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleShow1054); 

                	newLeafNode(otherlv_5, grammarAccess.getShowAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:463:1: entryRuleHide returns [EObject current=null] : iv_ruleHide= ruleHide EOF ;
    public final EObject entryRuleHide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHide = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:464:2: (iv_ruleHide= ruleHide EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:465:2: iv_ruleHide= ruleHide EOF
            {
             newCompositeNode(grammarAccess.getHideRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHide_in_entryRuleHide1090);
            iv_ruleHide=ruleHide();

            state._fsp--;

             current =iv_ruleHide; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHide1100); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:472:1: ruleHide returns [EObject current=null] : ( () otherlv_1= 'Hide' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleHide() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_label_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:475:28: ( ( () otherlv_1= 'Hide' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:476:1: ( () otherlv_1= 'Hide' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:476:1: ( () otherlv_1= 'Hide' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:476:2: () otherlv_1= 'Hide' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:476:2: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:477:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getHideAccess().getHideAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleHide1146); 

                	newLeafNode(otherlv_1, grammarAccess.getHideAccess().getHideKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleHide1158); 

                	newLeafNode(otherlv_2, grammarAccess.getHideAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:490:1: (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:490:3: otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleHide1171); 

                        	newLeafNode(otherlv_3, grammarAccess.getHideAccess().getLabelKeyword_3_0());
                        
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:494:1: ( (lv_label_4_0= ruleEString ) )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:495:1: (lv_label_4_0= ruleEString )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:495:1: (lv_label_4_0= ruleEString )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:496:3: lv_label_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getHideAccess().getLabelEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHide1192);
                    lv_label_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHideRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleHide1206); 

                	newLeafNode(otherlv_5, grammarAccess.getHideAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:524:1: entryRuleStop returns [EObject current=null] : iv_ruleStop= ruleStop EOF ;
    public final EObject entryRuleStop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStop = null;


        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:525:2: (iv_ruleStop= ruleStop EOF )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:526:2: iv_ruleStop= ruleStop EOF
            {
             newCompositeNode(grammarAccess.getStopRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStop_in_entryRuleStop1242);
            iv_ruleStop=ruleStop();

            state._fsp--;

             current =iv_ruleStop; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStop1252); 

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
    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:533:1: ruleStop returns [EObject current=null] : ( () otherlv_1= 'Stop' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleStop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_label_4_0 = null;


         enterRule(); 
            
        try {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:536:28: ( ( () otherlv_1= 'Stop' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:537:1: ( () otherlv_1= 'Stop' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:537:1: ( () otherlv_1= 'Stop' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:537:2: () otherlv_1= 'Stop' otherlv_2= '{' (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:537:2: ()
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:538:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStopAccess().getStopAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStop1298); 

                	newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStop1310); 

                	newLeafNode(otherlv_2, grammarAccess.getStopAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:551:1: (otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:551:3: otherlv_3= 'label' ( (lv_label_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleStop1323); 

                        	newLeafNode(otherlv_3, grammarAccess.getStopAccess().getLabelKeyword_3_0());
                        
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:555:1: ( (lv_label_4_0= ruleEString ) )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:556:1: (lv_label_4_0= ruleEString )
                    {
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:556:1: (lv_label_4_0= ruleEString )
                    // ../dk.dtu.se2.tutorials.tutorial6.animationTest.language/src-gen/dk/dtu/se2/tutorials/tutorial6/animationTest/language/parser/antlr/internal/InternalAnimationLanguage.g:557:3: lv_label_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStopAccess().getLabelEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStop1344);
                    lv_label_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStopRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStop1358); 

                	newLeafNode(otherlv_5, grammarAccess.getStopAccess().getRightCurlyBracketKeyword_4());
                

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAnimation_in_entryRuleAnimation75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimation85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAnimation122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnimation134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAnimation146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnimation158 = new BitSet(new long[]{0x0000000000750000L});
        public static final BitSet FOLLOW_ruleAnimationObject_in_ruleAnimation179 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleAnimation192 = new BitSet(new long[]{0x0000000000750000L});
        public static final BitSet FOLLOW_ruleAnimationObject_in_ruleAnimation213 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleAnimation227 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnimation239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_in_entryRuleAnimationObject275 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimationObject285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_Impl_in_ruleAnimationObject332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_ruleAnimationObject359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_ruleAnimationObject386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_ruleAnimationObject413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_ruleAnimationObject440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnimationObject_Impl_in_entryRuleAnimationObject_Impl475 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnimationObject_Impl485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleAnimationObject_Impl531 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAnimationObject_Impl543 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleAnimationObject_Impl556 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAnimationObject_Impl577 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAnimationObject_Impl591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMove_in_entryRuleMove750 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMove760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleMove806 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMove818 = new BitSet(new long[]{0x00000000000A8000L});
        public static final BitSet FOLLOW_17_in_ruleMove831 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove852 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleMove867 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMove888 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMove902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShow_in_entryRuleShow938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShow948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleShow994 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleShow1006 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleShow1019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleShow1040 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleShow1054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHide_in_entryRuleHide1090 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHide1100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleHide1146 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleHide1158 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleHide1171 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHide1192 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleHide1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStop_in_entryRuleStop1242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStop1252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleStop1298 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStop1310 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleStop1323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStop1344 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleStop1358 = new BitSet(new long[]{0x0000000000000002L});
    }


}