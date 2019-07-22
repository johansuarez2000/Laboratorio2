/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Registro;
import Vista.Vista;
import java.io.FileNotFoundException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Controlador2 {
    private Registro registro;
    String nombre;
    String id;
    String usuario;
    String contraseña;
    String confirmacion;
    String rol;
    String aporte;

    public Controlador2() throws FileNotFoundException {
        this.registro = new Registro();
        this.registro.getB1().setOnAction(new Evento());
    }
    public Registro getVista(){
    return registro;
}
    private class Evento  implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
           nombre= registro.getH1().getText();
           id=registro.getH2().getText();
           usuario= registro.getH3().getText();
           contraseña= registro.getContraseña().getText();
           confirmacion= registro.getContraseña1().getText();
           rol= registro.getH6().getText();
           aporte= registro.getH7().getText();
          
          Controlador1 controlador= new Controlador1();
          Singleton singleton = Singleton.getSingleton();
          Stage stage = singleton.getStage();
          Vista vista= controlador.getVista();
          stage.setScene(vista.getScene());
          stage.show();
        }
    
}

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(String confirmacion) {
        this.confirmacion = confirmacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getAporte() {
        return aporte;
    }

    public void setAporte(String aporte) {
        this.aporte = aporte;
    }
    
}
