/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejercicio2.servicios;

import java.util.Scanner;
import relaciones.ejercicio2.entidades.Jugador;
import relaciones.ejercicio2.entidades.Revolver;

/**
 *
 * @author Naksuke
 */
public class JugadorServicio {
    
    RevolverServicio revserv=new RevolverServicio();
    
    public Jugador crearJugador() {
        Scanner leer=new Scanner(System.in);
        Jugador jug=new Jugador();
        System.out.println("Ingrese id del jugador");
        jug.setId(leer.nextInt());
        System.out.println("Ingrese nombre del jugador");
        jug.setNombre(leer.next());
        jug.setMojado(false);
        return jug;
        }
    
    public void disparo(Revolver r, Jugador ge) {
        Scanner leer=new Scanner(System.in);
        if (revserv.mojar(r)) {
            ge.setMojado(true);
            System.out.println("¡El revolver de agua le disparó a "+ge.getNombre()+" y se mojó!");
        } else {
            System.out.println("\n"+ge.getNombre()+" no se ha mojado. ¡Siguiente!");
            revserv.siguienteChorro(r);
            System.out.println("\nPresiona Enter para continuar");
            String enter=leer.nextLine();
        }
    }
    }
    
