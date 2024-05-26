package co.edu.uniquindio.poo;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IniciarSesionController {

    private Stage stage;

    @FXML
    private void switchToPrimary() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("parquear.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 300);
        stage.setTitle("Modelo de Parqueadero");
        stage.setScene(scene);
        stage.show();
       
    }

    public void setStage(Stage primaryStage) {
        
        stage = primaryStage;
    
    }
}
