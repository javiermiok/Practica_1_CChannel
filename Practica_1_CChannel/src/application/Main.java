package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	private AnchorPane panelInicial;
	private AnchorPane panelSecundario;
	
	@Override
	public void start(Stage stage) throws IOException {
		
		// 1º Cargar recursos
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Layouts.fxml"));
		FXMLLoader loader2 = new FXMLLoader(getClass().getResource("SegundaVentana.fxml"));
		
		// 2º Crear paneles
		panelInicial = (AnchorPane) loader.load();
		panelSecundario = (AnchorPane) loader2.load();
		
		// 3º Configurar el controlador
		Controlador control = loader.getController();
		control.setStage(stage, panelSecundario);
		
		// añade la escena al stage y la titula
		stage.setTitle("Layouts.fxml");
		stage.setScene(new Scene(panelInicial));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
