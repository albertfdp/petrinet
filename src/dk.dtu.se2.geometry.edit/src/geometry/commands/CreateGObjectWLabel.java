package geometry.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import geometry.GObject;
import geometry.Geometry;
import geometry.GeometryPackage;

/*
 * @author: Morten
 * This class is used to automatically add Labels to Geometry objects
 */
public class CreateGObjectWLabel extends CompoundCommand {

	protected EditingDomain domain;
	
	public CreateGObjectWLabel(EditingDomain domain, 
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
		
		//Iterating through the other objects to get the number of the objects
		int count = 1;
		String myLabel = "";
		for (Object object: owner.eContents()) {
			if (object.getClass() == resultObject.getClass())
				count++;
		}
		if (resultObject instanceof geometry.BendPoint)
			myLabel = "BP" + count;
		if (resultObject instanceof geometry.Line)
			myLabel = "L" + count;
		if (resultObject instanceof geometry.Connector)
			myLabel = "C" + count;
		
		/*
		 * domain: the editing domain your model lives in
		 * owner: element you are doing the modifications to
		 * feature: feature in model that should be given to you by the EPackage of your model
		 * value: the value you want to be set in the feature
		 */
		this.append(new SetCommand(domain, resultObject, GeometryPackage.eINSTANCE.getGObject_Label(), myLabel));		
	}
	

}