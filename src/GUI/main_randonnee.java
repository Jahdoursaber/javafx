/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author TOSHIBA
 */
public class main_randonnee extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try{ 
           Parent root = FXMLLoader.load(getClass().getResource("gestion_randonnee_1.fxml"));
           //Parent root = FXMLLoader.load(getClass().getResource("Gestion_reservation.fxml"));
            //Parent root = FXMLLoader.load(getClass().getResource("ajouter_randonnee.fxml"));
            //Parent root = FXMLLoader.load(getClass().getResource("Consult_Reser_Rando.fxml"));
            //Parent root = FXMLLoader.load(getClass().getResource("Consulter_Paticipation.fxml"));
      
             Scene scene = new Scene(root);
             primaryStage.setScene(scene);
             
             primaryStage.show();
        }catch (IOException ex){  
        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
