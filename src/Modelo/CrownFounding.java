/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CrownFounding extends Persona {
    private ArrayList<Promotor> promotores= new ArrayList<>();
    private ArrayList<Aportante> aportantes= new ArrayList<>();

    public CrownFounding(String nombre, int id, String usuario, String contraseña) {
        super(nombre, id, usuario, contraseña);
    }

    public ArrayList<Promotor> getPromotores() {
        return promotores;
    }

    public void setPromotores(ArrayList<Promotor> promotores) {
        this.promotores = promotores;
    }

    public ArrayList<Aportante> getAportantes() {
        return aportantes;
    }

    public void setAportantes(ArrayList<Aportante> aportantes) {
        this.aportantes = aportantes;
    }
    
    
}
