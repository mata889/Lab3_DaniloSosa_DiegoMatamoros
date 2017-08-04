/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

import java.util.Date;

/**
 *
 * @author Family
 */
public class Hobbits extends Integrantes{
    
    String anillo;
    double ataque=10,defensa=100,curacion=1;

    public Hobbits() {
        super();
    }
    

    public Hobbits(String anillo) {
        this.anillo = anillo;
    }

    public Hobbits(String anillo, String nombre, String apellido, String bestia, String raza, String altura, double poder, double defensa, double curacion, Date nacimiento) {
        super(nombre, apellido, bestia, raza, altura, poder, defensa, curacion, nacimiento);
        this.anillo = anillo;
    }

   

    public String getAnillo() {
        return anillo;
    }

    public void setAnillo(String anillo) {
        this.anillo = anillo;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getCuracion() {
        return curacion;
    }

    public void setCuracion(double curacion) {
        this.curacion = curacion;
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
