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
    Button b1;
    Hyperlink h1;
    TextField usuario;
    PasswordField contraseña;
    public Ingreso(){
        Label lb1= new Label("Usuario");
        usuario= new TextField();
        Label lb2= new Label("Contraseña");
        contraseña= new PasswordField();
      
        HBox hb1= new HBox();
        HBox hb2= new HBox();
        HBox hb3= new HBox();
        VBox vb1= new VBox();
        b1= new Button("Ingresar");
        h1= new Hyperlink("Registrese");
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

    public Button getB1() {
        return b1;
    }

    public void setB1(Button b1) {
        this.b1 = b1;
    }

    public Hyperlink getH1() {
        return h1;
    }

    public void setH1(Hyperlink h1) {
        this.h1 = h1;
    }

    public TextField getUsuario() {
        return usuario;
    }

    public void setUsuario(TextField usuario) {
        this.usuario = usuario;
    }

    public PasswordField getContraseña() {
        return contraseña;
    }

    public void setContraseña(PasswordField contraseña) {
        this.contraseña = contraseña;
    }
    
}
