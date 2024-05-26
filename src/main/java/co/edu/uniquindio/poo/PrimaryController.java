package co.edu.uniquindio.poo;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Parqueadero;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PrimaryController {

    private Stage stage;

    @FXML
    private Button ingresarBTN;

    @FXML
    private Button registrarBTN;

    @FXML
    private Button eliminarBTN;

    private Parqueadero parqueadero;
    private Vehiculo vehiculo;

    @FXML
    void ingresarAction(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("parquear.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Modelo de Parqueadero");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void registrarAction(ActionEvent event) throws IOException {

        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("registrar.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Modelo de Parqueadero");
        stage.setScene(scene);
        stage.show();
        
    }
    

    public void setStage(Stage primaryStage){
        stage = primaryStage;
    }
    
    
}
