package dk.dtu.se2.tutorials.tutorial6.animationTest.language.serializer;

import animation.Animation;
import animation.AnimationObject;
import animation.AnimationPackage;
import animation.Hide;
import animation.Move;
import animation.Show;
import animation.Stop;
import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.dtu.se2.tutorials.tutorial6.animationTest.language.services.AnimationLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractAnimationLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnimationLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnimationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnimationPackage.ANIMATION:
				if(context == grammarAccess.getAnimationRule()) {
					sequence_Animation(context, (Animation) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.ANIMATION_OBJECT:
				if(context == grammarAccess.getAnimationObjectRule() ||
				   context == grammarAccess.getAnimationObject_ImplRule()) {
					sequence_AnimationObject_Impl(context, (AnimationObject) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.HIDE:
				if(context == grammarAccess.getAnimationObjectRule() ||
				   context == grammarAccess.getHideRule()) {
					sequence_Hide(context, (Hide) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.MOVE:
				if(context == grammarAccess.getAnimationObjectRule() ||
				   context == grammarAccess.getMoveRule()) {
					sequence_Move(context, (Move) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.SHOW:
				if(context == grammarAccess.getAnimationObjectRule() ||
				   context == grammarAccess.getShowRule()) {
					sequence_Show(context, (Show) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.STOP:
				if(context == grammarAccess.getAnimationObjectRule() ||
				   context == grammarAccess.getStopRule()) {
					sequence_Stop(context, (Stop) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (label=EString?)
	 */
	protected void sequence_AnimationObject_Impl(EObject context, AnimationObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (animationObjects+=AnimationObject animationObjects+=AnimationObject*)
	 */
	protected void sequence_Animation(EObject context, Animation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=EString?)
	 */
	protected void sequence_Hide(EObject context, Hide semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=EString? speed=EString?)
	 */
	protected void sequence_Move(EObject context, Move semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=EString?)
	 */
	protected void sequence_Show(EObject context, Show semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=EString?)
	 */
	protected void sequence_Stop(EObject context, Stop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
