package dk.dtu.se2.animation.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.dtu.se2.animation.AnimationPackage;
import dk.dtu.se2.animation.Appear;
import dk.dtu.se2.animation.Move;
import dk.dtu.se2.animation.Sequence;
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
			case AnimationPackage.APPEAR:
				if(context == grammarAccess.getAnimationRule() ||
				   context == grammarAccess.getAnimation_ImplRule() ||
				   context == grammarAccess.getAnimation_ImplAccess().getSequenceAnimationsAction_1_1() ||
				   context == grammarAccess.getAppearRule()) {
					sequence_Appear(context, (Appear) semanticObject); 
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
					sequence_Animation_Impl(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (animations+=Animation_Impl_Sequence_1_1 animations+=Animation animations+=Animation*)
	 */
	protected void sequence_Animation_Impl(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (geometry=EString appearance=EString)
	 */
	protected void sequence_Appear(EObject context, Appear semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnimationPackage.Literals.APPEAR__GEOMETRY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnimationPackage.Literals.APPEAR__GEOMETRY));
			if(transientValues.isValueTransient(semanticObject, AnimationPackage.Literals.APPEAR__APPEARANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnimationPackage.Literals.APPEAR__APPEARANCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAppearAccess().getGeometryEStringParserRuleCall_3_0(), semanticObject.getGeometry());
		feeder.accept(grammarAccess.getAppearAccess().getAppearanceEStringParserRuleCall_5_0(), semanticObject.getAppearance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     speed=EDouble
	 */
	protected void sequence_Move(EObject context, Move semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AnimationPackage.Literals.MOVE__SPEED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AnimationPackage.Literals.MOVE__SPEED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoveAccess().getSpeedEDoubleParserRuleCall_3_0(), semanticObject.getSpeed());
		feeder.finish();
	}
}
