package dk.dtu.se2.petrinet.command;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;

public class CreatePObjectWIDCommand extends CompoundCommand {
	
	public CreatePObjectWIDCommand (EditingDomain domain, EObject owner, Command command) {
		super(0);
		
		this.append(command);
		Collection<?> collection = this.getResult();
		
		int max = 0;
		for (Object object : owner.eContents()) {
			if (object instanceof org.pnml.tools.epnk.pnmlcoremodel.Object) {
				
			}
		}
		
		Object object = collection.iterator().next();
		if (object instanceof org.pnml.tools.epnk.pnmlcoremodel.Object) {
			org.pnml.tools.epnk.pnmlcoremodel.Object pObject = (org.pnml.tools.epnk.pnmlcoremodel.Object) object;
			
		}
		
		
		
	}
	
}
