/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejercicio2.servicios;

import relaciones.ejercicio2.entidades.Revolver;

/**
 *
 * @author Naksuke
 */
public class RevolverServicio {
    
    Revolver r=new Revolver();
    
    public void llenarRevolver(Revolver r) {
        r.setPosicionActual((int)(Math.random()*6-1+1)+1);
        r.setPosicionAgua((int)(Math.random()*6-1+1)+1);
    }
    
    public boolean mojar(Revolver r) {
        boolean bandera=false;
        if (r.getPosicionActual()==r.getPosicionAgua()) {
            bandera=true;
        }
        return bandera;
    }
    
    public void siguienteChorro(Revolver r) {
        r.setPosicionActual(r.getPosicionActual()+1);
        if (r.getPosicionActual()==7) {
            r.setPosicionActual(1);
        }
    }
}
