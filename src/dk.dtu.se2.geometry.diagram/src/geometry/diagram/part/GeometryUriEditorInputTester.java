package geometry.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.common.ui.URIEditorInput;

// TODO: Auto-generated Javadoc
/**
 * The Class GeometryUriEditorInputTester.
 *
 * @generated
 */
public class GeometryUriEditorInputTester extends PropertyTester {

	/**
	 * Test.
	 *
	 * @param receiver the receiver
	 * @param method the method
	 * @param args the args
	 * @param expectedValue the expected value
	 * @return true, if successful
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof URIEditorInput) {
			return false;
		}
		URIEditorInput editorInput = (URIEditorInput) receiver;
		return "geometry_diagram".equals(editorInput.getURI().fileExtension()); //$NON-NLS-1$
	}

}
