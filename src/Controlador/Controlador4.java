/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Proyectos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Usuario
 */
public class Controlador4 {
    private Proyectos proyecto;
    String nombreP;
    String valorBase;
    String valorMinimo;
    public Controlador4()  {
     this.proyecto= new Proyectos();
     this.proyecto.getB1().setOnAction(new Evento());
    }
    public Proyectos getVista(){
        return proyecto;
    }
    private class Evento implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
           nombreP= proyecto.getNombrep().getText();
           valorBase= proyecto.getVb().getText();
           valorMinimo= proyecto.getVm().getText();
            System.out.println(nombreP+ " "+ valorBase+ " "+ valorMinimo);
        }
        
    }

    public Proyectos getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyectos proyecto) {
        this.proyecto = proyecto;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getValorBase() {
        return valorBase;
    }

    public void setValorBase(String valorBase) {
        this.valorBase = valorBase;
    }

    public String getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(String valorMinimo) {
        this.valorMinimo = valorMinimo;
    }
    
}
