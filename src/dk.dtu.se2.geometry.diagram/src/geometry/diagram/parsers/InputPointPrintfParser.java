package geometry.diagram.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserEditStatus;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserEditStatus;
import org.eclipse.gmf.tooling.runtime.parsers.AbstractAttributeParser;

// TODO: Auto-generated Javadoc
/**
 * The Class InputPointPrintfParser.
 *
 * @generated
 */
public class InputPointPrintfParser extends AbstractAttributeParser {

	/** The default pattern. @generated */
	private String defaultPattern;
	
	/** The default editable pattern. @generated */
	private String defaultEditablePattern;

	/**
	 * Instantiates a new input point printf parser.
	 *
	 * @param features the features
	 * @generated
	 */
	public InputPointPrintfParser(EAttribute[] features) {
		super(features);
	}

	/**
	 * Instantiates a new input point printf parser.
	 *
	 * @param features the features
	 * @param editableFeatures the editable features
	 * @generated
	 */
	public InputPointPrintfParser(EAttribute[] features, EAttribute[] editableFeatures) {
		super(features, editableFeatures);
	}

	/**
	 * Gets the default pattern.
	 *
	 * @return the default pattern
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
	 * Gets the default editable pattern.
	 *
	 * @return the default editable pattern
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
	 * Gets the edits the string.
	 *
	 * @param adapter the adapter
	 * @param flags the flags
	 * @return the edits the string
	 * @generated
	 */
	public String getEditString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		String pattern = getEditorPattern() == null ? getDefaultEditablePattern()
				: getEditorPattern();
		return String.format(pattern, getEditableValues(element));
	}

	/**
	 * Checks if is valid edit string.
	 *
	 * @param adapter the adapter
	 * @param editString the edit string
	 * @return the i parser edit status
	 * @generated
	 */
	public IParserEditStatus isValidEditString(IAdaptable adapter,
			String editString) {
		return ParserEditStatus.UNEDITABLE_STATUS;
	}

	/**
	 * Gets the parses the command.
	 *
	 * @param adapter the adapter
	 * @param newString the new string
	 * @param flags the flags
	 * @return the parses the command
	 * @generated
	 */
	public ICommand getParseCommand(IAdaptable adapter, String newString,
			int flags) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * Gets the prints the string.
	 *
	 * @param adapter the adapter
	 * @param flags the flags
	 * @return the prints the string
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
		if (labels[1] != "" && labels.length > 1)
			string += " Visual: " + labels[1];

		return string;
	}

}
