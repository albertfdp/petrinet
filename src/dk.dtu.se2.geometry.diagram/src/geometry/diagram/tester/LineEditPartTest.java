package geometry.diagram.tester;

import static org.junit.Assert.*;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.diagram.core.view.factories.ViewFactory;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.*;
import org.eclipse.gmf.runtime.diagram.core.providers.*;

import geometry.GeometryPackage;
import geometry.diagram.edit.parts.GeometryEditPart;
import geometry.diagram.edit.parts.GeometryEditPartFactory;
import geometry.diagram.edit.parts.LineEditPart;
import geometry.diagram.edit.parts.LineEditPart.LineFigure;
import geometry.diagram.providers.GeometryEditPartProvider;

import org.junit.Test;

public class LineEditPartTest {

	/*
	 * generated NOT
	 * @Mikko Tuulio
	 */
	@Test
	public void testCalculateCatmullRomPoints() {
		
		LineFigure lineFigure = GeometryEditPartFactory.
		
		PointList testPoints = new PointList();
		
		PointList straightLinePoints = new PointList();
		testPoints.addPoint(5, 5);
		testPoints.addPoint(10, 10);
		
		straightLinePoints.addPoint(5, 5);
		straightLinePoints.addPoint(10, 10);
		
		
		//straightLinePoints = lineFigure.calculateCatmullromPointList(testPoints, 5);
		
		assertEquals("moi", 6, straightLinePoints.getPoint(1).x());
		
	}

}
