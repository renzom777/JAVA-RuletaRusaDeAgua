/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejercicio2.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones.ejercicio2.entidades.Jugador;
import relaciones.ejercicio2.entidades.Revolver;

/**
 *
 * @author Naksuke
 */
public class JuegoServicio {

    JugadorServicio jugserv = new JugadorServicio();
    
    public ArrayList<Jugador> crearJuego(ArrayList<Jugador> a) {
        Scanner leer=new Scanner(System.in);
        System.out.println("\nIngrese cantidad de jugadores (6 o menos)");
        Integer numJugadores = leer.nextInt();
        if (numJugadores > 6) {
            numJugadores = 6;
        }
        for (int i = 0; i < numJugadores; i++) {
            Jugador j=jugserv.crearJugador();
            a.add(j);
        }
        return a;
    }
    
    public void ronda(Revolver r, ArrayList<Jugador> a) {
        boolean bandera=true;
        do {            
            for (Jugador jugadore : a) {
                jugserv.disparo(r, jugadore);
                if (jugadore.isMojado()) {
                    bandera=false;
                    break;
                }
            }
        } while (bandera);
    }
}