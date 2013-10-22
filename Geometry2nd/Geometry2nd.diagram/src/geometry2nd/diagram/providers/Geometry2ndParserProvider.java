package geometry2nd.diagram.providers;

import geometry2nd.Geometry2ndPackage;
import geometry2nd.diagram.edit.parts.BendPointLabelEditPart;
import geometry2nd.diagram.edit.parts.ConnectorLabelEditPart;
import geometry2nd.diagram.edit.parts.InputPointLabelEditPart;
import geometry2nd.diagram.parsers.MessageFormatParser;
import geometry2nd.diagram.part.Geometry2ndVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Geometry2ndParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser inputPointLabel_5001Parser;

	/**
	 * @generated
	 */
	private IParser getInputPointLabel_5001Parser() {
		if (inputPointLabel_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Geometry2ndPackage.eINSTANCE
					.getGObject_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputPointLabel_5001Parser = parser;
		}
		return inputPointLabel_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser bendPointLabel_5002Parser;

	/**
	 * @generated
	 */
	private IParser getBendPointLabel_5002Parser() {
		if (bendPointLabel_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Geometry2ndPackage.eINSTANCE
					.getGObject_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bendPointLabel_5002Parser = parser;
		}
		return bendPointLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectorLabel_5003Parser;

	/**
	 * @generated
	 */
	private IParser getConnectorLabel_5003Parser() {
		if (connectorLabel_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Geometry2ndPackage.eINSTANCE
					.getGObject_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectorLabel_5003Parser = parser;
		}
		return connectorLabel_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ConnectorLabelEditPart.VISUAL_ID:
			return getConnectorLabel_5003Parser();
		case InputPointLabelEditPart.VISUAL_ID:
			return getInputPointLabel_5001Parser();
		case BendPointLabelEditPart.VISUAL_ID:
			return getBendPointLabel_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Geometry2ndVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Geometry2ndVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Geometry2ndElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
