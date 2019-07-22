/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Usuario
 */
public class Ventana1 implements Vista {
    private Scene escena;
    Label lb1;
    Label lb2;
    Label lb3;
    Label lb4;
    Label lb5;
    TextField h1;
    TextField h2;
    TextField h3;
    public Ventana1( ) throws FileNotFoundException{
        FileInputStream imput= new FileInputStream("dinero (3).png");
        Image image= new Image(imput);
        lb1= new Label("Crow Founding",new ImageView(image));        
        lb2= new Label("Bienvenido a su app de CrownFounding abajo apecera la lista de proyectos      ");        
        FileInputStream dinero= new FileInputStream("dinero (4).png");
        Image imagen= new Image(dinero);
        TableView tablas = new TableView();
        tablas.setEditable(true);
        TableColumn NombreP= new TableColumn("Nombre del proyecto");
        TableColumn vb= new TableColumn("valor Base");
        TableColumn vm= new TableColumn("Valor Minimo");
        TableColumn MejorOferta= new TableColumn("Mejor oferta");
        tablas.getColumns().addAll(NombreP, vb,vm ,MejorOferta );
        lb3= new Label("Ingrese Nombre del proyecto");
        h1= new TextField();
        lb4= new Label("Ingrese tiempo de prestamo  ");
        h2= new TextField();
        lb5= new Label("Ingrese interés                        ");
        h3= new TextField();
        
        Button b1= new Button("Aportar", new ImageView(imagen));
        VBox vb2= new VBox();
        
        
        VBox vb1=new VBox();
        HBox hb1= new HBox();
        HBox hb2= new HBox();
        HBox hb3= new HBox();
        HBox hb4= new HBox();
        hb2.getChildren().add(lb3);
        hb2.getChildren().add(h1);
        hb3.getChildren().add(lb4);
        hb3.getChildren().add(h2);
        hb4.getChildren().add(lb5);
        hb4.getChildren().add(h3);
        vb2.getChildren().add(hb2);
        vb2.getChildren().add(hb3);
        vb2.getChildren().add(hb4);
        vb2.getChildren().add(b1);
        hb1.getChildren().add(lb2);
        hb1.getChildren().add(lb1);
        vb1.getChildren().add(hb1);
        vb1.getChildren().add(tablas);
        vb1.getChildren().add(vb2);
        this.escena= new Scene(vb1,540,500);
       
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
    
    

    
}
