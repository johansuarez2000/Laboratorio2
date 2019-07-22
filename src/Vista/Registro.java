package Vista;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
    TextField h1;
    TextField h2;
    TextField h3;
    PasswordField contraseña;
    PasswordField contraseña1;
    TextField h4;
    Button b1;
    TextField h6;
    TextField h7;
    public Registro() throws FileNotFoundException {
      Label lb1= new Label("Nombre                      ");
      h1= new TextField();
      Label lb2= new Label("Id                                ");
      h2= new TextField();
      Label lb3= new Label("Usuario                       ");
      h3= new TextField();
      Label lb4= new Label("Contraseña                 ");
      contraseña= new PasswordField();
      Label lb5= new Label("Confirmar Contraseña");
      contraseña1= new PasswordField();
      Label lb6= new Label("Capital                        ");
      h4= new TextField();
      
      b1= new Button("Guardar y volver a la parte de ingreso");
      Label lb8= new Label("Rol                              ");
      h6= new TextField();
      FileInputStream dinero= new FileInputStream("ahorrar-dinero (1).png");
      Image imagen= new Image(dinero);
      Label lb9= new Label("Si su rol es Aportante escriba su capital total",new ImageView(imagen));
      h7= new TextField();
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

    public TextField getH1() {
        return h1;
    }

    public void setH1(TextField h1) {
        this.h1 = h1;
    }

    public TextField getH2() {
        return h2;
    }

    public void setH2(TextField h2) {
        this.h2 = h2;
    }

    public TextField getH3() {
        return h3;
    }

    public void setH3(TextField h3) {
        this.h3 = h3;
    }

    public PasswordField getContraseña() {
        return contraseña;
    }

    public void setContraseña(PasswordField contraseña) {
        this.contraseña = contraseña;
    }

    public PasswordField getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(PasswordField contraseña1) {
        this.contraseña1 = contraseña1;
    }

    public TextField getH4() {
        return h4;
    }

    public void setH4(TextField h4) {
        this.h4 = h4;
    }

    public Button getB1() {
        return b1;
    }

    public void setB1(Button b1) {
        this.b1 = b1;
    }

    public TextField getH6() {
        return h6;
    }

    public void setH6(TextField h6) {
        this.h6 = h6;
    }

    public TextField getH7() {
        return h7;
    }

    public void setH7(TextField h7) {
        this.h7 = h7;
    }
   
    
}
