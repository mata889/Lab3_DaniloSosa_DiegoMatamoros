/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

public class BestiasAladas extends Bestia {
    String velocidad;

    public BestiasAladas() {
        super();
    }

    public BestiasAladas(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
