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

    public Promotor(String nombreProyecto, Prestamo prestamo, String nombre, int id, String usuario, String contraseña) {
        super(nombre, id, usuario, contraseña);
        this.nombreProyecto = nombreProyecto;
        this.prestamo = prestamo;
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
    
    
    
}
