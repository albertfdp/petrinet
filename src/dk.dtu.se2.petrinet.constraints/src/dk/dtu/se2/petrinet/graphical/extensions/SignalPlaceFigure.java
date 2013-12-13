package dk.dtu.se2.petrinet.graphical.extensions;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import dk.dtu.se2.petrinet.InputPlace;

/**
 * Graphical extensions to Petri Net Editor
 * 
 * @generated NOT
 * @author Albert
 *
 */
public class SignalPlaceFigure extends PlaceFigure {

	public SignalPlaceFigure(Place place) {
		super(place);
	}
	
	public void update() {
		this.repaint();
	}
	
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		dk.dtu.se2.petrinet.Place p = (dk.dtu.se2.petrinet.Place) this.place;
		
		if (!p.getTokens().isEmpty()) {
			Rectangle rectangle = this.getClientArea();
			graphics.setBackgroundColor(getForegroundColor());
			graphics.fillOval((int) (rectangle.x + 0.325 * rectangle.width), 
					(int) (rectangle.y + 0.375 * rectangle.height),
					(int) (0.25 * rectangle.width), (int) (0.25 * rectangle.height));
			graphics.drawString(String.valueOf(p.getTokens().size()), 
					(int) (rectangle.x + 0.6 * rectangle.width), 
					(int) (rectangle.y + 0.45 * rectangle.height));
		}
		
		InputPlace inputPlace = p.getInputPlaceLabel();
		if(inputPlace != null && inputPlace.isText()){
			Rectangle rectangle = this.getClientArea();
			graphics.setBackgroundColor(getForegroundColor());
			graphics.setLineWidth(2);
			graphics.drawLine(rectangle.x + 10, rectangle.y + 10, 
					rectangle.x + rectangle.width - 10, rectangle.y + rectangle.height - 10);
			graphics.drawLine(rectangle.x + 10, rectangle.y + rectangle.height - 10, 
					rectangle.x + rectangle.width - 10, rectangle.y + 10);
		}
	}

}
