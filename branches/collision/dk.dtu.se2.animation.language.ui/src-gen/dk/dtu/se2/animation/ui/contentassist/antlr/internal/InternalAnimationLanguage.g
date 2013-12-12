/*
* generated by Xtext
*/
grammar InternalAnimationLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package dk.dtu.se2.animation.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleAnimation_Impl
entryRuleAnimation_Impl 
:
{ before(grammarAccess.getAnimation_ImplRule()); }
	 ruleAnimation_Impl
{ after(grammarAccess.getAnimation_ImplRule()); } 
	 EOF 
;

// Rule Animation_Impl
ruleAnimation_Impl
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAnimation_ImplAccess().getGroup()); }
(rule__Animation_Impl__Group__0)
{ after(grammarAccess.getAnimation_ImplAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMove
entryRuleMove 
:
{ before(grammarAccess.getMoveRule()); }
	 ruleMove
{ after(grammarAccess.getMoveRule()); } 
	 EOF 
;

// Rule Move
ruleMove
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMoveAccess().getGroup()); }
(rule__Move__Group__0)
{ after(grammarAccess.getMoveAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAppear
entryRuleAppear 
:
{ before(grammarAccess.getAppearRule()); }
	 ruleAppear
{ after(grammarAccess.getAppearRule()); } 
	 EOF 
;

// Rule Appear
ruleAppear
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAppearAccess().getGroup()); }
(rule__Appear__Group__0)
{ after(grammarAccess.getAppearAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStop
entryRuleStop 
:
{ before(grammarAccess.getStopRule()); }
	 ruleStop
{ after(grammarAccess.getStopRule()); } 
	 EOF 
;

// Rule Stop
ruleStop
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStopAccess().getGroup()); }
(rule__Stop__Group__0)
{ after(grammarAccess.getStopAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSequence
entryRuleSequence 
:
{ before(grammarAccess.getSequenceRule()); }
	 ruleSequence
{ after(grammarAccess.getSequenceRule()); } 
	 EOF 
;

// Rule Sequence
ruleSequence
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSequenceAccess().getGroup()); }
(rule__Sequence__Group__0)
{ after(grammarAccess.getSequenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAnimation
entryRuleAnimation 
:
{ before(grammarAccess.getAnimationRule()); }
	 ruleAnimation
{ after(grammarAccess.getAnimationRule()); } 
	 EOF 
;

// Rule Animation
ruleAnimation
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAnimationAccess().getAlternatives()); }
(rule__Animation__Alternatives)
{ after(grammarAccess.getAnimationAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEInt
entryRuleEInt 
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEIntAccess().getGroup()); }
(rule__EInt__Group__0)
{ after(grammarAccess.getEIntAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEString
entryRuleEString 
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringAccess().getAlternatives()); }
(rule__EString__Alternatives)
{ after(grammarAccess.getEStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Animation__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); }
	ruleMove
{ after(grammarAccess.getAnimationAccess().getMoveParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); }
	ruleAppear
{ after(grammarAccess.getAnimationAccess().getAppearParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAnimationAccess().getStopParserRuleCall_2()); }
	ruleStop
{ after(grammarAccess.getAnimationAccess().getStopParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); }
	ruleSequence
{ after(grammarAccess.getAnimationAccess().getSequenceParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Animation_Impl__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group__0__Impl
	rule__Animation_Impl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); }
	ruleAnimation
{ after(grammarAccess.getAnimation_ImplAccess().getAnimationParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Animation_Impl__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getGroup_1()); }
(rule__Animation_Impl__Group_1__0)?
{ after(grammarAccess.getAnimation_ImplAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Animation_Impl__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group_1__0__Impl
	rule__Animation_Impl__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0()); }

	';' 

{ after(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Animation_Impl__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group_1__1__Impl
	rule__Animation_Impl__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1()); }
(

)
{ after(grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Animation_Impl__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group_1__2__Impl
	rule__Animation_Impl__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2()); }
(rule__Animation_Impl__AnimationsAssignment_1_2)
{ after(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Animation_Impl__Group_1__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group_1__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getGroup_1_3()); }
(rule__Animation_Impl__Group_1_3__0)*
{ after(grammarAccess.getAnimation_ImplAccess().getGroup_1_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Animation_Impl__Group_1_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group_1_3__0__Impl
	rule__Animation_Impl__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group_1_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0()); }

	';' 

{ after(grammarAccess.getAnimation_ImplAccess().getSemicolonKeyword_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Animation_Impl__Group_1_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Animation_Impl__Group_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__Group_1_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1()); }
(rule__Animation_Impl__AnimationsAssignment_1_3_1)
{ after(grammarAccess.getAnimation_ImplAccess().getAnimationsAssignment_1_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Move__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__0__Impl
	rule__Move__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getMoveAction_0()); }
(

)
{ after(grammarAccess.getMoveAccess().getMoveAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__1__Impl
	rule__Move__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getMoveKeyword_1()); }

	'move' 

{ after(grammarAccess.getMoveAccess().getMoveKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__2__Impl
	rule__Move__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getMoveAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__3__Impl
	rule__Move__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getSpeedAssignment_3()); }
(rule__Move__SpeedAssignment_3)
{ after(grammarAccess.getMoveAccess().getSpeedAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Move__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Move__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Move__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); }

	')' 

{ after(grammarAccess.getMoveAccess().getRightParenthesisKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Appear__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__0__Impl
	rule__Appear__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getAppearAction_0()); }
(

)
{ after(grammarAccess.getAppearAccess().getAppearAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__1__Impl
	rule__Appear__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getAppearKeyword_1()); }

	'appear' 

{ after(grammarAccess.getAppearAccess().getAppearKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__2__Impl
	rule__Appear__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getAppearAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__3__Impl
	rule__Appear__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getGeometryAssignment_3()); }
(rule__Appear__GeometryAssignment_3)
{ after(grammarAccess.getAppearAccess().getGeometryAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__4__Impl
	rule__Appear__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getCommaKeyword_4()); }

	',' 

{ after(grammarAccess.getAppearAccess().getCommaKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__5__Impl
	rule__Appear__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getAppearanceAssignment_5()); }
(rule__Appear__AppearanceAssignment_5)
{ after(grammarAccess.getAppearAccess().getAppearanceAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Appear__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Appear__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getRightParenthesisKeyword_6()); }

	')' 

{ after(grammarAccess.getAppearAccess().getRightParenthesisKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__Stop__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stop__Group__0__Impl
	rule__Stop__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Stop__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStopAccess().getStopAction_0()); }
(

)
{ after(grammarAccess.getStopAccess().getStopAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stop__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stop__Group__1__Impl
	rule__Stop__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Stop__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStopAccess().getStopKeyword_1()); }

	'stop' 

{ after(grammarAccess.getStopAccess().getStopKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stop__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stop__Group__2__Impl
	rule__Stop__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Stop__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStopAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getStopAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Stop__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Stop__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Stop__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStopAccess().getRightParenthesisKeyword_3()); }

	')' 

{ after(grammarAccess.getStopAccess().getRightParenthesisKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Sequence__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__0__Impl
	rule__Sequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getSequenceAction_0()); }
(

)
{ after(grammarAccess.getSequenceAccess().getSequenceAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__1__Impl
	rule__Sequence__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); }

	'[' 

{ after(grammarAccess.getSequenceAccess().getLeftSquareBracketKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__2__Impl
	rule__Sequence__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getAnimationsAssignment_2()); }
(rule__Sequence__AnimationsAssignment_2)
{ after(grammarAccess.getSequenceAccess().getAnimationsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__3__Impl
	rule__Sequence__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getGroup_3()); }
(rule__Sequence__Group_3__0)*
{ after(grammarAccess.getSequenceAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); }

	']' 

{ after(grammarAccess.getSequenceAccess().getRightSquareBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Sequence__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group_3__0__Impl
	rule__Sequence__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); }

	';' 

{ after(grammarAccess.getSequenceAccess().getSemicolonKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getAnimationsAssignment_3_1()); }
(rule__Sequence__AnimationsAssignment_3_1)
{ after(grammarAccess.getSequenceAccess().getAnimationsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__EInt__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
(
	'-' 
)?
{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Animation_Impl__AnimationsAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); }
	ruleAnimation{ after(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Animation_Impl__AnimationsAssignment_1_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); }
	ruleAnimation{ after(grammarAccess.getAnimation_ImplAccess().getAnimationsAnimationParserRuleCall_1_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Move__SpeedAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMoveAccess().getSpeedEIntParserRuleCall_3_0()); }
	ruleEInt{ after(grammarAccess.getMoveAccess().getSpeedEIntParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__GeometryAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); }
	ruleEString{ after(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Appear__AppearanceAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); }
	ruleEString{ after(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__AnimationsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); }
	ruleAnimation{ after(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__AnimationsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); }
	ruleAnimation{ after(grammarAccess.getSequenceAccess().getAnimationsAnimationParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

