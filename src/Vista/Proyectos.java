/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Proyectos implements Vista{
    private Scene escena;

    
    public Proyectos() throws Exception {
    Label lb1= new Label("Nombre del Proyecto");
    Label lb2= new Label("Valor Base                  ");
    Label lb3= new Label("Valor Minimo             ");
    Button b1= new Button("Guardar");
    TextField nombrep= new TextField();
    TextField vb= new TextField();
    TextField vm= new TextField();
    HBox hb1= new HBox();
    HBox hb2= new HBox();
    HBox hb3= new HBox();
    VBox vb1=new VBox();
    hb1.getChildren().add(lb1);
    hb1.getChildren().add(nombrep);
    hb2.getChildren().add(lb2);
    hb2.getChildren().add(vb);
    hb3.getChildren().add(lb3);
    hb3.getChildren().add(vm);
    vb1.getChildren().add(hb1);
    vb1.getChildren().add(hb2);
    vb1.getChildren().add(hb3);
    vb1.getChildren().add(b1);
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

