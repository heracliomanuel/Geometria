package dad.javafx.geometria.rectangulo;

import javafx.beans.property.IntegerProperty;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloController {
	private Rectangle rectangleShape;
	
	private RectanguloModel model = new RectanguloModel();
	private RectanguloView view = new RectanguloView();
	double fin;
	
	public RectanguloController() {
		double pepe = Integer.parseInt(	view.getValor1Text());
		
//		TextField aux2 = new TextField();
//		aux2= view.getValor2Text();
		double pepe2 = Integer.parseInt(view.getValor2Text());
		
		rectangleShape = new Rectangle();
		rectangleShape.setWidth(pepe);
		rectangleShape.setHeight(pepe2);
		rectangleShape.setFill(Color.rgb(0, 162, 232));
		rectangleShape.setStrokeWidth(2);
		rectangleShape.setStroke(Color.BLACK);
		
	}
	
	
	public RectanguloView getRoot() {
		return view;
		
	}

}
