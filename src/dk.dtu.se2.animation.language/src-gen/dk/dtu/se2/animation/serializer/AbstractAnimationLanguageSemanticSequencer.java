package dk.dtu.se2.animation.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.dtu.se2.animation.AnimationPackage;
import dk.dtu.se2.animation.Hide;
import dk.dtu.se2.animation.Move;
import dk.dtu.se2.animation.Sequence;
import dk.dtu.se2.animation.Show;
import dk.dtu.se2.animation.Stop;
import dk.dtu.se2.animation.services.AnimationLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractAnimationLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AnimationLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnimationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnimationPackage.HIDE:
				if(context == grammarAccess.getAnimationRule() ||
				   context == grammarAccess.getAnimation_ImplRule() ||
				   context == grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1() ||
				   context == grammarAccess.getHideRule()) {
					sequence_Hide(context, (Hide) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.MOVE:
				if(context == grammarAccess.getAnimationRule() ||
				   context == grammarAccess.getAnimation_ImplRule() ||
				   context == grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1() ||
				   context == grammarAccess.getMoveRule()) {
					sequence_Move(context, (Move) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.SEQUENCE:
				if(context == grammarAccess.getAnimation_ImplRule()) {
					sequence_Animation_Impl_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnimationRule() ||
				   context == grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1() ||
				   context == grammarAccess.getSequenceRule()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.SHOW:
				if(context == grammarAccess.getAnimationRule() ||
				   context == grammarAccess.getAnimation_ImplRule() ||
				   context == grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1() ||
				   context == grammarAccess.getShowRule()) {
					sequence_Show(context, (Show) semanticObject); 
					return; 
				}
				else break;
			case AnimationPackage.STOP:
				if(context == grammarAccess.getAnimationRule() ||
				   context == grammarAccess.getAnimation_ImplRule() ||
				   context == grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1() ||
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
	 *     ((animations+=Animation_Impl_Sequence_1_1 animations+=Animation animations+=Animation*) | (animations+=Animation animations+=Animation*))
	 */
	protected void sequence_Animation_Impl_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     label=EString
	 */
	protected void sequence_Hide(EObject context, Hide semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnimationPackage.Literals.HIDE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnimationPackage.Literals.HIDE__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHideAccess().getLabelEStringParserRuleCall_3_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     speed=EInt
	 */
	protected void sequence_Move(EObject context, Move semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnimationPackage.Literals.MOVE__SPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnimationPackage.Literals.MOVE__SPEED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoveAccess().getSpeedEIntParserRuleCall_3_0(), semanticObject.getSpeed());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (animations+=Animation animations+=Animation*)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Show}
	 */
	protected void sequence_Show(EObject context, Show semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Stop}
	 */
	protected void sequence_Stop(EObject context, Stop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
