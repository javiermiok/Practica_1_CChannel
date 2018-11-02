package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {
	
	private Stage stage;
	private AnchorPane panel;
	
	/**
	 * Recibe la ventana y el panel secundario para
	 * añadir el panel secundario en la ventana
	 * @param stage
	 * @param panel
	 */
	public void setStage(Stage stage, AnchorPane panel) {
		this.stage = stage;
		this.panel = panel;
	}
	
	@FXML
	private void handleClose() {
		System.exit(0);
	}

	@FXML
	private void cambiarEscena() throws IOException {
				
		// Añadir el panel a la ventana		
		stage.setTitle("SegundaVentana.fxml");
		stage.setScene(new Scene(panel));
		stage.show();
	}
}
