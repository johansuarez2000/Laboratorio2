package Vista;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
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
public class Registro extends Application{
    private Scene escena;
    @Override
    public void start(Stage primaryStage) throws Exception {
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
      Button b1= new Button("Guardar");
      HBox hb1 = new HBox();
      HBox hb2 = new HBox();
      HBox hb3 = new HBox();
      HBox hb4 = new HBox();
      HBox hb5 = new HBox();
      VBox vb1= new VBox();
      HBox hb6= new HBox();
      HBox hb7= new HBox();
      ObservableList names =FXCollections.observableArrayList();
      names.add("CrownFounder");
      names.add("Aportante");
      names.add("Promotor");
      ChoiceBox cb = new ChoiceBox(names);
      vb1.getChildren().add(cb);
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
      vb1.getChildren().add(b1);
      cb.setOnAction(e -> System.out.println("Action Nueva Selección: " + cb.getValue()));
      /*cb.valueProperty().addListener((ov, p1, p2) -> {
    System.out.println("Nueva Selección: " + p2);
    System.out.println("Vieja Selección: " + p1);
});*/
       
      this.escena= new Scene(vb1,500,500);
      primaryStage.setScene(escena);
      primaryStage.show();
      
    }
    public static void main(String[] args) {
Application.launch(args);
    
}
   
    
}
