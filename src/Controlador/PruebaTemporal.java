/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Vista;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class PruebaTemporal extends Application {

   public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      //Temporal
      Singleton singleton = Singleton.getSingleton();
      singleton.setStage(primaryStage);
      Controlador1 controlador = new Controlador1();
      Vista vista = controlador.getVista();
      primaryStage.setScene(vista.getScene());
      primaryStage.show();
        
    }
    
  
    
}
