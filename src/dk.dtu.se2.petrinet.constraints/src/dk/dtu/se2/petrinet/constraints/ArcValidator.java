package dk.dtu.se2.petrinet.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;

import dk.dtu.se2.petrinet.Place;


/**
 * Only allow arcs to be a connection between Places and Transitions.
 * 
 * @generated NOT
 * @author Albert
 *
 */
public class ArcValidator extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		
		EObject eObject = ctx.getTarget();
		if (eObject instanceof Arc) {
			Arc arc = (Arc) eObject;
			Node source = arc.getSource();
			Node target = arc.getTarget();
			
			if((source instanceof Place && target instanceof Place) || 
					(source instanceof Transition && target instanceof Transition)) {
				return ctx.createFailureStatus(new Object[] {arc});
			}
		}
		
		return ctx.createSuccessStatus();
	}

}
