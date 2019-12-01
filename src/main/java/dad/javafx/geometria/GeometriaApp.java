package dad.javafx.geometria;

import dad.javafx.geometria.rectangulo.RectanguloController;
import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GeometriaApp extends Application {

	private RectanguloController rectanguloController;

	
	
	public void start(Stage primaryStage) throws Exception {

		
		rectanguloController = new RectanguloController();
		
		TabPane root = new TabPane();
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		root.getTabs().add(new Tab("Rectángulo", rectanguloController.getRoot()));
		root.getTabs().add(new Tab("Circulo"));
		root.getTabs().add(new Tab("Hexagon"));
		root.getTabs().add(new Tab("Triangle"));

		
		Scene scene = new Scene(root, 640, 480);
		
		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();
			}
		
	
	public static void main(String[] args){
		
		launch(args);
	}

}
