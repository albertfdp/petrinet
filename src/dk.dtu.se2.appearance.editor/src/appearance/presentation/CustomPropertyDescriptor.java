package appearance.presentation;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;

import appearance.AppearancePackage;

/**
 * Customizes the cell editor to a FileDialog in which the user
 * can specify the 3D model and texture.
 * 
 * @author Morten
 *
 */

public class CustomPropertyDescriptor extends PropertyDescriptor {

	public CustomPropertyDescriptor(Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CellEditor createPropertyEditor(Composite parent) {
		return new ExtendedDialogCellEditor(parent, getLabelProvider()) {
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				// Dialog creation
				FileDialog fd = new FileDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
				
				// File extension filters
				String[] modelFileExt =  {"*.*","*.obj","*.mesh.xml", "*.meshxml",
						"*.scene","*.MTL","*.blend"};
				String[] textureFileExt = {"*.*","*.png","*.gif","*.jpg"};
				String[] fileNames = {"All Files (*.*)"};
				
				AppearancePackage pkg = AppearancePackage.eINSTANCE;
				Object feature = itemPropertyDescriptor.getFeature(object);
				String filePrefix = "";
				if (pkg.getAObject_Object3D().equals(feature)) {
					 fd.setFilterExtensions(modelFileExt);
					 fd.setFilterNames(fileNames);
					 filePrefix = "Models";
				}
				if (pkg.getAObject_Texture().equals(feature)) {
					 fd.setFilterExtensions(textureFileExt);
					 fd.setFilterNames(fileNames);
					 filePrefix = "Textures";
				}
				
				// Open the dialog and retrieve the user selection filepath
				fd.setFilterPath("~/Documents");
				fd.open();
				String result = filePrefix + "/" + fd.getFileName();
				return result;
			}
		};
	}

}
