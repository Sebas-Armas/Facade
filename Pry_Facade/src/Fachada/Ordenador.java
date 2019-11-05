/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Ordenador {
    private Bateria bateria;
    private CPU cpu;
    private ArrayList<Aplicacion> aplicaciones;
    
    public Ordenador(){
        
    }

    public Ordenador(Bateria bateria, CPU cpu, ArrayList<Aplicacion> aplicaciones) {
        this.bateria = bateria;
        this.cpu = cpu;
        this.aplicaciones = aplicaciones;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public CPU getCpu() {
        return cpu;
    }

    public ArrayList<Aplicacion> getAplicaciones() {
        return aplicaciones;
    }

    
    
    
}
