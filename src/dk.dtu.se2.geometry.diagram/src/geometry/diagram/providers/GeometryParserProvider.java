package geometry.diagram.providers;

import geometry.GeometryPackage;
import geometry.diagram.edit.parts.ConnectorLabelEditPart;
import geometry.diagram.edit.parts.InputPointLabelAppearanceLabelEditPart;
import geometry.diagram.edit.parts.InputPointLabelEditPart;
import geometry.diagram.edit.parts.LineLabelAppearanceLabelTokEditPart;
import geometry.diagram.edit.parts.LineLabelEditPart;
import geometry.diagram.parsers.ConnectorPrintfParser;
import geometry.diagram.parsers.LinePrintfParser;
import geometry.diagram.parsers.InputPointPrintfParser;
import geometry.diagram.part.GeometryVisualIDRegistry;

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
public class GeometryParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser connectorLabel_5003Parser;

	/**
	 * @generated not
	 * @Mikko_Tuulio
	 */
	private IParser getConnectorLabel_5003Parser() {
		if (connectorLabel_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { GeometryPackage.eINSTANCE
					.getGObject_Label() };
			ConnectorPrintfParser parser = new ConnectorPrintfParser(features);
			connectorLabel_5003Parser = parser;
		}
		return connectorLabel_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputPointLabelAppearanceLabel_5002Parser;

	/**
	 * @generated not
	 * @Mikko_Tuulio
	 */
	private IParser getInputPointLabelAppearanceLabel_5002Parser() {
		if (inputPointLabelAppearanceLabel_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					GeometryPackage.eINSTANCE.getGObject_Label(),
					GeometryPackage.eINSTANCE.getInputPoint_AppearanceLabel() };
			InputPointPrintfParser parser = new InputPointPrintfParser(features);
			inputPointLabelAppearanceLabel_5002Parser = parser;
		}
		return inputPointLabelAppearanceLabel_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser lineLabelAppearanceLabelTokenAppearanceLabel_6001Parser;

	/**
	 * @generated not
	 * @Mikko_Tuulio
	 */
	private IParser getLineLabelAppearanceLabelTokenAppearanceLabel_6001Parser() {
		if (lineLabelAppearanceLabelTokenAppearanceLabel_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					GeometryPackage.eINSTANCE.getGObject_Label(),
					GeometryPackage.eINSTANCE.getLine_AppearanceLabel(),
					GeometryPackage.eINSTANCE.getLine_TokenAppearanceLabel() };
			LinePrintfParser parser = new LinePrintfParser(features);
			lineLabelAppearanceLabelTokenAppearanceLabel_6001Parser = parser;
		}
		return lineLabelAppearanceLabelTokenAppearanceLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ConnectorLabelEditPart.VISUAL_ID:
			return getConnectorLabel_5003Parser();
		case InputPointLabelAppearanceLabelEditPart.VISUAL_ID:
			return getInputPointLabelAppearanceLabel_5002Parser();
		case LineLabelAppearanceLabelTokEditPart.VISUAL_ID:
			return getLineLabelAppearanceLabelTokenAppearanceLabel_6001Parser();
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
			return getParser(GeometryVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GeometryVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GeometryElementTypes.getElement(hint) == null) {
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
