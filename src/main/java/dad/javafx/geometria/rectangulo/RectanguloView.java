package dad.javafx.geometria.rectangulo;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class RectanguloView extends GridPane {

	private Label fraselabel;
	public Label getFraselabel() {
		return fraselabel;
	}

	public void setFraselabel(Label fraselabel) {
		this.fraselabel = fraselabel;
	}

	public Label getValor1label() {
		return valor1label;
	}

	public void setValor1label(Label valor1label) {
		this.valor1label = valor1label;
	}

	public Label getValor2label() {
		return valor2label;
	}

	public void setValor2label(Label valor2label) {
		this.valor2label = valor2label;
	}

	public String getValor1Text() {
		return valor1Text.getText();
	}

	public void setValor1Text(TextField valor1Text) {
		this.valor1Text = valor1Text;
	}

	public String getValor2Text() {
		return valor2Text.getText();
	}

	public void setValor2Text(TextField valor2Text) {
		this.valor2Text = valor2Text;
	}

	private Label valor1label;
	private Label valor2label;

	private TextField valor1Text;
	private TextField valor2Text;

	public RectanguloView() {

		fraselabel = new Label("Rectangulo");
		valor1label = new Label("Lado");
		valor2label = new Label("Ancho");
		
		valor1Text = new TextField();
		valor1Text.setPromptText("Lado");
		
		valor2Text = new TextField();
		valor2Text.setPromptText("Ancho");
		
		
		HBox hbox = new HBox(valor1label,valor1Text);
		HBox hbox2 = new HBox(valor2label,valor2Text);
		
		VBox vbox = new VBox(fraselabel,hbox,hbox2);


	}
}
