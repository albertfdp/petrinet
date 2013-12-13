/*
* generated by Xtext
*/
grammar InternalAnimationLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package dk.dtu.se2.animation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAnimation_Impl
entryRuleAnimation_Impl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnimation_ImplRule()); }
	 iv_ruleAnimation_Impl=ruleAnimation_Impl 
	 { $current=$iv_ruleAnimation_Impl.current; } 
	 EOF 
;

// Rule Animation_Impl
ruleAnimation_Impl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); 
    }
    this_Animation_0=ruleAnimation
    { 
        $current = $this_Animation_0.current; 
        afterParserOrEnumRuleCall();
    }
(	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0());
    }
(
    {
        $current = forceCreateModelElementAndAdd(
            grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); 
	    }
		lv_animations_3_0=ruleAnimation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnimation_ImplRule());
	        }
       		add(
       			$current, 
       			"animations",
        		lv_animations_3_0, 
        		"Animation");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); 
	    }
		lv_animations_5_0=ruleAnimation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnimation_ImplRule());
	        }
       		add(
       			$current, 
       			"animations",
        		lv_animations_5_0, 
        		"Animation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleMove
entryRuleMove returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMoveRule()); }
	 iv_ruleMove=ruleMove 
	 { $current=$iv_ruleMove.current; } 
	 EOF 
;

// Rule Move
ruleMove returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getMoveAccess().getMoveAction_0(),
            $current);
    }
)	otherlv_1='move' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getMoveKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0()); 
	    }
		lv_speed_3_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMoveRule());
	        }
       		set(
       			$current, 
       			"speed",
        		lv_speed_3_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMoveAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRuleAppear
entryRuleAppear returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAppearRule()); }
	 iv_ruleAppear=ruleAppear 
	 { $current=$iv_ruleAppear.current; } 
	 EOF 
;

// Rule Appear
ruleAppear returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAppearAccess().getAppearAction_0(),
            $current);
    }
)	otherlv_1='appear' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAppearAccess().getAppearKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); 
	    }
		lv_geometry_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAppearRule());
	        }
       		set(
       			$current, 
       			"geometry",
        		lv_geometry_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAppearAccess().getCommaKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); 
	    }
		lv_appearance_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAppearRule());
	        }
       		set(
       			$current, 
       			"appearance",
        		lv_appearance_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAppearAccess().getRightParenthesisKeyword_6());
    }
)
;





// Entry rule entryRuleStop
entryRuleStop returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStopRule()); }
	 iv_ruleStop=ruleStop 
	 { $current=$iv_ruleStop.current; } 
	 EOF 
;

// Rule Stop
ruleStop returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStopAccess().getStopAction_0(),
            $current);
    }
)	otherlv_1='stop' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getStopAccess().getStopKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStopAccess().getLeftParenthesisKeyword_2());
    }
	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getStopAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleSequence
entryRuleSequence returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSequenceRule()); }
	 iv_ruleSequence=ruleSequence 
	 { $current=$iv_ruleSequence.current; } 
	 EOF 
;

// Rule Sequence
ruleSequence returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getSequenceAccess().getSequenceAction_0(),
            $current);
    }
)	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); 
	    }
		lv_animations_2_0=ruleAnimation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceRule());
	        }
       		add(
       			$current, 
       			"animations",
        		lv_animations_2_0, 
        		"Animation");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); 
	    }
		lv_animations_4_0=ruleAnimation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSequenceRule());
	        }
       		add(
       			$current, 
       			"animations",
        		lv_animations_4_0, 
        		"Animation");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4());
    }
)
;





// Entry rule entryRuleAnimation
entryRuleAnimation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnimationRule()); }
	 iv_ruleAnimation=ruleAnimation 
	 { $current=$iv_ruleAnimation.current; } 
	 EOF 
;

// Rule Animation
ruleAnimation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); 
    }
    this_Move_0=ruleMove
    { 
        $current = $this_Move_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); 
    }
    this_Appear_1=ruleAppear
    { 
        $current = $this_Appear_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAnimationAccess().getStopParserRuleCall_2()); 
    }
    this_Stop_2=ruleStop
    { 
        $current = $this_Stop_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); 
    }
    this_Sequence_3=ruleSequence
    { 
        $current = $this_Sequence_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); } 
	 iv_ruleEDouble=ruleEDouble 
	 { $current=$iv_ruleEDouble.current.getText(); }  
	 EOF 
;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
    }
)?(    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
    }
)?
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
    }
)
    ;







// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


