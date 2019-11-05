/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_facade;

import Fachada.Facade;
import Fachada.Ordenador;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Facade fachada = new Facade();
        Ordenador compu1 = fachada.prender();
        sc.nextLine();
        
        fachada.mostrarAplicacionesActivas(compu1);
        sc.nextLine();
        
        fachada.iniciarAplicacion(compu1, "Word");
        fachada.iniciarAplicacion(compu1, "Excel");
        fachada.iniciarAplicacion(compu1, "PowerPoint");
        sc.nextLine();
        
        fachada.mostrarAplicacionesActivas(compu1);
        sc.nextLine();
        
        fachada.cerrarAplicacion(compu1, "Excel");
        sc.nextLine();
        
        fachada.mostrarAplicacionesActivas(compu1);
        sc.nextLine();
        
        fachada.apagar(compu1);
        
    }
    
}
