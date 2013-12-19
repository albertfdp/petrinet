package dk.dtu.se2.simulator.petrinet;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNetDoc;
import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelFactory;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.se2.animation.AnimationFactory;
import dk.dtu.se2.animation.Move;
import dk.dtu.se2.petrinet.AnimationLabel;
import dk.dtu.se2.petrinet.Arc;
import dk.dtu.se2.petrinet.GeometryLabel;
import dk.dtu.se2.petrinet.PetrinetFactory;
import dk.dtu.se2.petrinet.Place;
import dk.dtu.se2.simulator.petrinet.runtime.RTAnimation;

public class PetriNetEngineTest {
	
	static PetriNetDoc doc;
	
	private static PetriNetEngine petrinetEngine;
	
	@Before
	public void init() {
		doc = PnmlcoremodelFactory.eINSTANCE.createPetriNetDoc();
		PetriNet petrinet = PnmlcoremodelFactory.eINSTANCE.createPetriNet();
		petrinet.getPage().add(PnmlcoremodelFactory.eINSTANCE.createPage());
		
		Place p1 = PetrinetFactory.eINSTANCE.createPlace();
		GeometryLabel gl = PetrinetFactory.eINSTANCE.createGeometryLabel();
		gl.setText("L1");
		AnimationLabel al = PetrinetFactory.eINSTANCE.createAnimationLabel();
		Move animation1 = AnimationFactory.eINSTANCE.createMove();
		animation1.setSpeed(1.0);
		al.setStructure(animation1);
		p1.setGeometryLabel(gl);
		p1.setAnimationLabel(al);
		p1.getTokens().add(PetrinetFactory.eINSTANCE.createToken());
		
		Place p2 = PetrinetFactory.eINSTANCE.createPlace();
		GeometryLabel gl2 = PetrinetFactory.eINSTANCE.createGeometryLabel();
		gl.setText("L2");
		Move animation2 = AnimationFactory.eINSTANCE.createMove();
		animation1.setSpeed(1.0);
		AnimationLabel al2 = PetrinetFactory.eINSTANCE.createAnimationLabel();
		al.setStructure(animation2);
		p2.setGeometryLabel(gl2);
		p2.setAnimationLabel(al2);
		
		Arc arcP1ToT1 = PetrinetFactory.eINSTANCE.createArc();
		Arc arcT1ToP2 = PetrinetFactory.eINSTANCE.createArc();
		Arc arcP2ToT2 = PetrinetFactory.eINSTANCE.createArc();
		Arc arcT2ToP1 = PetrinetFactory.eINSTANCE.createArc();
		
		Transition T1 = PnmlcoremodelFactory.eINSTANCE.createTransition();
		Transition T2 = PnmlcoremodelFactory.eINSTANCE.createTransition();
		
		arcP1ToT1.setSource(p1);
		arcP1ToT1.setTarget(T1);
		
		arcT1ToP2.setSource(T1);
		arcT1ToP2.setTarget(p2);
		
		arcP2ToT2.setSource(p2);
		arcP2ToT2.setTarget(T2);
		
		arcT2ToP1.setSource(T2);
		arcT2ToP1.setTarget(p1);
		
		petrinet.getPage().get(0).getObject().add(p1);
		petrinet.getPage().get(0).getObject().add(p2);
		petrinet.getPage().get(0).getObject().add(T1);
		petrinet.getPage().get(0).getObject().add(T2);
		doc.getNet().add(petrinet);
				
		petrinetEngine = new PetriNetEngine();
	}

	@Test
	public void testInit() {
		ArrayList<RTAnimation> animations = petrinetEngine.init(doc);
		assertTrue(animations.size() == 1);
	}

	@Test
	public void testGetAllPossibleAnimations() {
		ArrayList<RTAnimation> animations = petrinetEngine.getAllPossibleAnimations(doc);
		assertTrue(animations.size() == 2);
	}

	@Test
	public void testFireTransitions() {
		fail("Not yet implemented");
	}

	@Test
	public void testMarkTokenAsFinished() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateToken() {
		fail("Not yet implemented");
	}

}
