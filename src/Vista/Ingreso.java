package Vista;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ingreso implements Vista{
    private Scene escena;  
 
    public Ingreso() throws Exception {
        Label lb1= new Label("Usuario");
        TextField usuario= new TextField();
        Label lb2= new Label("Contraseña");
        PasswordField contraseña= new PasswordField();
      
        HBox hb1= new HBox();
        HBox hb2= new HBox();
        HBox hb3= new HBox();
        VBox vb1= new VBox();
        Button b1= new Button("Ingresar");
        Hyperlink h1= new Hyperlink("Registrese");
        hb1.getChildren().add(lb1);
        hb1.getChildren().add(usuario);
        hb2.getChildren().add(lb2);
        hb2.getChildren().add(contraseña);
        vb1.getChildren().add(hb1);
        vb1.getChildren().add(hb2);
        hb3.getChildren().add(b1);
        hb3.getChildren().add(h1);
        vb1.getChildren().add(hb3);
        this.escena= new Scene(vb1,500,500);
       
}

    @Override
    public Scene getScene() {
       return escena;
    }

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }
    
}
