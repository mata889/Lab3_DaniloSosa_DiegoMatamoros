/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

import java.util.Date;

/**
 *
 * @author Danilo Sosa
 */
public class Elfos extends Integrantes {

    public String arma;
    double ataque=443,defensa=150,curacion=335;

    public Elfos() {
        super();
    }
    

    public Elfos(String arma) {
        this.arma = arma;
    }

    public Elfos(String arma, String nombre, String apellido, String bestia, String raza, String altura, double poder, double defensa, double curacion, Date nacimiento) {
        super(nombre, apellido, bestia, raza, altura, poder, defensa, curacion, nacimiento);
        this.arma = arma;
    }

    
    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
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
