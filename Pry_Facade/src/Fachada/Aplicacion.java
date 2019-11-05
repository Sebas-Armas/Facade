/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

/**
 *
 * @author User
 */
public class Aplicacion {
    private String nombre;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
        System.out.println("La aplicación " + nombre + " ha iniciado");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void guardar(){
        System.out.println("La aplicación " + nombre + " ha guardado los cambios");
    }
    
    public void cerrar(){
        guardar();
        System.out.println("La aplicación " + nombre + " ha cerrado");
    }
}
