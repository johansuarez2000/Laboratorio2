/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ventana1;
import java.io.FileNotFoundException;

/**
 *
 * @author Usuario
 */
public class Controlador3 {
    private Ventana1 ventana;

    public Controlador3() throws FileNotFoundException {
        this.ventana = new Ventana1();
        
    }
    public Ventana1 getVista(){
        return ventana;
    }
    
  
    
}
