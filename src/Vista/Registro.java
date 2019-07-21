package Vista;


import java.io.FileInputStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
public class Registro implements Vista {
    private Scene escena;
    
    public Registro() throws Exception {
      Label lb1= new Label("Nombre                      ");
      TextField h1= new TextField();
      Label lb2= new Label("Id                                ");
      TextField h2= new TextField();
      Label lb3= new Label("Usuario                       ");
      TextField h3= new TextField();
      Label lb4= new Label("Contraseña                 ");
      PasswordField contraseña= new PasswordField();
      Label lb5= new Label("Confirmar Contraseña");
      PasswordField contraseña1= new PasswordField();
      Label lb6= new Label("Capital                        ");
      TextField h4= new TextField();
      Label lb7= new Label("Contraseña de acceso");
      TextField h5= new TextField();
      Button b1= new Button("Siguiente");
      Label lb8= new Label("Rol                              ");
      TextField h6= new TextField();
      FileInputStream dinero= new FileInputStream("ahorrar-dinero (1).png");
      Image imagen= new Image(dinero);
      Label lb9= new Label("Si su rol es Aportante escriba su capital total",new ImageView(imagen));
      TextField h7= new TextField();
      HBox hb1 = new HBox();
      HBox hb2 = new HBox();
      HBox hb3 = new HBox();
      HBox hb4 = new HBox();
      HBox hb5 = new HBox();
      HBox hb9 = new HBox();
      VBox vb1= new VBox();
      HBox hb6= new HBox();
      HBox hb7= new HBox();
      HBox hb8 = new HBox();
      hb9.getChildren().add(lb9);
      hb9.getChildren().add(h7);
      hb8.getChildren().add(lb8);
      hb8.getChildren().add(h6);
      vb1.getChildren().add(hb8);
      hb1.getChildren().add(lb1);
      hb1.getChildren().add(h1);
      hb2.getChildren().add(lb2);
      hb2.getChildren().add(h2);
      hb3.getChildren().add(lb3);
      hb3.getChildren().add(h3);
      hb4.getChildren().add(lb4);
      hb5.getChildren().add(lb5);
      hb4.getChildren().add(contraseña);
      hb5.getChildren().add(contraseña1);
      vb1.getChildren().add(hb1);
      vb1.getChildren().add(hb2);
      vb1.getChildren().add(hb3);
      vb1.getChildren().add(hb4);
      vb1.getChildren().add(hb5);   
      vb1.getChildren().add(hb9); 
      vb1.getChildren().add(b1);
      this.escena= new Scene(vb1, 500, 500);
}

    public Scene getEscena() {
        return escena;
    }

    public void setEscena(Scene escena) {
        this.escena = escena;
    }

    @Override
    public Scene getScene() {
      return escena;
    }
   
    
}
