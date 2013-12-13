package dk.dtu.se2.petrinet.graphical.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;

import dk.dtu.se2.petrinet.Place;

/**
 * @generated NOT
 * 
 * @author Albert
 *
 */
public class SignalnetGraphics extends GraphicalExtension {

	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(dk.dtu.se2.petrinet.PetrinetPackage.eINSTANCE.getExtendedPetriNet());
		return list;
	}

	/**
	 * Returns a list referring to the EClass Place and the EClass Arc of the Petri Net type,
	 * which are the classes for which new graphics are provided.
	 */
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		if (netType.equals(dk.dtu.se2.petrinet.PetrinetPackage.eINSTANCE.getExtendedPetriNet())) {
			list.add(dk.dtu.se2.petrinet.PetrinetPackage.eINSTANCE.getPlace());
		}
		return list;
	}

	/**
	 * Returns the specific place figure for all the places.
	 */
	@Override
	public IUpdateableFigure createPlaceFigure(org.pnml.tools.epnk.pnmlcoremodel.Place place) {
		if (place instanceof Place) {
			return new SignalPlaceFigure((Place) place);
		}
		return null;
	}
	
}
