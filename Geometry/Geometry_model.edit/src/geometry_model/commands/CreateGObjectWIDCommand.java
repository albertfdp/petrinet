package commands;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import geometry_model.GObject;
import geometry_model.Geometry_modelPackage;

/*
 * @tr: This class is used to automatically add IDs to Geometry_model objects
 */
public class CreateGObjectWIDCommand extends CompoundCommand {

	protected EditingDomain domain;
	
	public CreateGObjectWIDCommand(EditingDomain domain, 
			EObject owner,
			Command command) {
		
		//Calling super constructor of CompoundCommand
		super(0);
		this.domain = domain;
		
		//Executing the add command
		this.append(command);
		
		//Getting its result (the added object)
		Collection<?> collection = this.getResult();
		GObject resultObject = null;
		if (collection.iterator().next() instanceof GObject) {
			resultObject = (GObject) collection.iterator().next();
		}
		
		//Iterating through the other objects to get the maximum id
		int max = -1;
		for (Object object: owner.eContents()) {
			if (object instanceof geometry_model.GObject) {
				int currentId = ((geometry_model.GObject) object).getId();
				
				max = Math.max(max, currentId);
			}
		}
		max = max + 1;
		
		/*
		 * domain: the editing domain your model lives in
		 * owner: element you are doing the modifications to
		 * feature: feature in model that should be given to you by the EPackage of your model
		 * value: the value you want to be set in the feature
		 */
		this.append(new SetCommand(domain, resultObject, Geometry_modelPackage.eINSTANCE.getGObject_Id(), max));		
	}
	

}
