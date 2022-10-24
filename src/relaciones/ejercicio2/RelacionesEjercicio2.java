/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejercicio2;

import java.util.ArrayList;
import relaciones.ejercicio2.entidades.Jugador;
import relaciones.ejercicio2.entidades.Revolver;
import relaciones.ejercicio2.servicios.JuegoServicio;
import relaciones.ejercicio2.servicios.RevolverServicio;

/**
 *
 * @author Naksuke
 */
public class RelacionesEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JuegoServicio jueserv=new JuegoServicio();
        RevolverServicio revserv=new RevolverServicio();
        Revolver r=new Revolver();
        ArrayList<Jugador> a=new ArrayList<Jugador>();
        
        revserv.llenarRevolver(r);
        System.out.println("¡El revolver de agua ha sido cargado!");
        jueserv.crearJuego(a);
        jueserv.ronda(r, a);
        }
    }
   
