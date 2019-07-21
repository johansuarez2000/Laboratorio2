package Vista;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
public class ventana extends Application{
    private Scene escena;
    Label lb1;
    Label lb2;
    @Override
    public void start( Stage primayStage) throws FileNotFoundException{
        FileInputStream imput= new FileInputStream("dinero (3).png");
        Image image= new Image(imput);
        lb1= new Label("Crow Founding",new ImageView(image));        
        lb2= new Label("Bienvenido a su app de CrownFounding abajo apecera la lista de proyectos      ");
        primayStage.setTitle("Crown foundig");
        
        TableView tablas = new TableView();
        tablas.setEditable(true);
        TableColumn NombreP= new TableColumn("Nombre del proyecto");
        TableColumn vb= new TableColumn("valor Base");
        TableColumn vm= new TableColumn("Valor Minimo");
        TableColumn MejorOferta= new TableColumn("Mejor oferta");
        tablas.getColumns().addAll(NombreP, vb,vm ,MejorOferta );
        
        VBox vb1=new VBox();
        HBox hb1= new HBox();
        hb1.getChildren().add(lb2);
        hb1.getChildren().add(lb1);
        vb1.getChildren().add(hb1);
        vb1.getChildren().add(tablas);
       this.escena= new Scene(vb1,540,500);
       primayStage.setScene(escena);
       primayStage.show();
    }
    public static void main(String[] args) {
Application.launch(args);
    
}

}
