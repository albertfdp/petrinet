package geometry.diagram.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.tooling.runtime.parsers.AbstractAttributeParser;

/**
 * @generated
 */
public class PrintfParser extends AbstractAttributeParser {

	/**
	 * @generated
	 */
	private String defaultPattern;
	/**
	 * @generated
	 */
	private String defaultEditablePattern;

	/**
	 * @generated
	 */
	public PrintfParser(EAttribute[] features) {
		super(features);
	}

	/**
	 * @generated
	 */
	public PrintfParser(EAttribute[] features, EAttribute[] editableFeatures) {
		super(features, editableFeatures);
	}

	/**
	 * @generated
	 */
	protected String getDefaultPattern() {
		if (defaultPattern == null) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < features.length; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append('%');
				sb.append(i + 1);
				sb.append('$');
				sb.append('s');
			}
			defaultPattern = sb.toString();
		}
		return defaultPattern;
	}

	/**
	 * @generated
	 */
	protected String getDefaultEditablePattern() {
		if (defaultEditablePattern == null) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < editableFeatures.length; i++) {
				if (i > 0) {
					sb.append(' ');
				}
				sb.append('%');
				sb.append(i + 1);
				sb.append('$');
				sb.append('s');
			}
			defaultEditablePattern = sb.toString();
		}
		return defaultEditablePattern;
	}

	/**
	 * @generated
	 */
	public String getEditString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		String pattern = getEditorPattern() == null ? getDefaultEditablePattern()
				: getEditorPattern();
		return String.format(pattern, getEditableValues(element));
	}

	/**
	 * @generated
	 */
	public IParserEditStatus isValidEditString(IAdaptable adapter,
			String editString) {
		return ParserEditStatus.UNEDITABLE_STATUS;
	}

	/**
	 * @generated
	 */
	public ICommand getParseCommand(IAdaptable adapter, String newString,
			int flags) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated not
	 * @Mikko_Tuulio
	 * If they would have new lines instead of " ", this would likely look nicer. However, something prevents using new line.
	 * Currently the end result looks cluttered. 
	 */
	public String getPrintString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		String string;
		Object[] labels = getValues(element);
		string = "Label: ";
		string += (String) labels[0];
		if (labels[1] != "")
			string += " Visual: " + labels[1];
		if (labels[2] != "")
			string += " Token: " + labels[2];

		return string;
	}

}
