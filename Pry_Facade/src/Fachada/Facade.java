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
public class Facade {
    
    
    public Ordenador prender(){
        Bateria bateria = new Bateria();
        bateria.encender();
        
        CPU cpu = new CPU();
        cpu.iniciar();
        
        ArrayList <Aplicacion> aplicaciones = new ArrayList<>();
         
        Ordenador compu = new Ordenador(bateria, cpu, aplicaciones);
        return compu;
    }
    
    public void iniciarAplicacion (Ordenador compu, String nombre){
        compu.getAplicaciones().add(new Aplicacion(nombre));
    }
    
    public void cerrarAplicacion (Ordenador compu, String nombre){
        for (int i = 0; i<compu.getAplicaciones().size(); i++){
            if(compu.getAplicaciones().get(i).getNombre().equals(nombre)){
                compu.getAplicaciones().get(i).cerrar();
                compu.getAplicaciones().remove(i);
                break;
            }
        }
    }
    
    public void mostrarAplicacionesActivas (Ordenador compu){
        if(compu.getAplicaciones().isEmpty()){
            System.out.println("No hay aplicaciones activas");
        } else{
            System.out.println("Aplicaciones activas:");
            for (int i = 0; i<compu.getAplicaciones().size(); i++){
                System.out.println((i+1) + ". " + compu.getAplicaciones().get(i).getNombre());
            }
        }
        
    }
    
    public void apagar (Ordenador compu){
        System.out.println("Apagando el ordenador. \nCerrando todas las aplicaciones");
        while (!compu.getAplicaciones().isEmpty()){
            compu.getAplicaciones().get(0).cerrar();
            compu.getAplicaciones().remove(0);
        }
        compu.getCpu().apagar();
        compu.getBateria().apagar();
        
    }
}
