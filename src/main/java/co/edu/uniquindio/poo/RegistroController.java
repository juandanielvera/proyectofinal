package co.edu.uniquindio.poo;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Parqueadero;
import co.edu.uniquindio.poo.model.Propietario;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistroController {

    @FXML
    private Button registrarUsuarioBTN;

    @FXML
    private TextField nombreTextFIeld;

    private Stage primaryStage;

    private Parqueadero parqueadero = new Parqueadero("Parqueadero UQ", 10);
    private Vehiculo vehiculo = new Vehiculo("","",2.0){};
    private Propietario propietario = new Propietario("null", "null", vehiculo);
    
    

    public void inicializar(Parqueadero parqueadero, Vehiculo vehiculo){
        this.parqueadero = parqueadero;
        this.vehiculo = vehiculo;
    }

    @FXML
    void registrarUsuarioAction(ActionEvent event) throws IOException {

        //parqueadero.registroPropietario("Raul", "Martinez", vehiculo);

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 670, 300);
        //primaryStage.setTitle("Multiplicacion de Matrices");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
   

}
