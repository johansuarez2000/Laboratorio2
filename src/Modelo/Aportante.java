package Modelo;


import Modelo.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Aportante extends Persona {
    private int capitalTotal;

    public Aportante(int capitalTotal, String nombre, int id, String usuario, String contraseña) {
        super(nombre, id, usuario, contraseña);
        this.capitalTotal = capitalTotal;
    }
    
    public int getCapitalTotal() {
        return capitalTotal;
    }

    public void setCapitalTotal(int capitalTotal) {
        this.capitalTotal = capitalTotal;
    }


    @Override
    public String Datos() {
        return "Persona{" + "nombre=" + getNombre() + ", id=" + getId() + ", usuario=" + getUsuario() + ", contrase\u00f1a=" + getContraseña()+ "Aportante{" + "capitalTotal=" + capitalTotal + '}';
    }
    
    
    
}
