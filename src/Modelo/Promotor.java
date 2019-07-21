package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Promotor extends Persona {
    
    private String nombreProyecto;
    private Prestamo prestamo;

    public Promotor(String nombre, int id, String usuario, String contraseña) {
        super(nombre, id, usuario, contraseña);
        
    }

    

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void PedirPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }


    
 

    @Override
    public String Datos() {
    
    return "Persona{" + "nombre=" + getNombre() + ", id=" + getId() + ", usuario=" + getUsuario() + ", contrase\u00f1a=" + getContraseña() +"Promotor{" + "nombreProyecto=" + nombreProyecto + ", prestamo=" + prestamo + '}';
    }
    

    
    
    
    
}
