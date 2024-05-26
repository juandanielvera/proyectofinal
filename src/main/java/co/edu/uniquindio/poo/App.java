package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Propietario;

/**
 * JavaFX App
 */
public class App extends Application {

    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Modelo de Parqueadero");
        primaryStage.setScene(scene);
        PrimaryController primaryController = fxmlLoader.getController();
        primaryController.setStage(primaryStage);
        primaryStage.show();
    }

    /*public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }*/

    /*public static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }*/

    public static void main(String[] args) {
        launch(args);
        
    }

}