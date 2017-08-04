/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

import java.util.Date;


public class Maiar extends Integrantes{
    
    public String baston;
    public String Sombrero;
    double ataque=0,defensa=0,curacion=0;

    public Maiar() {
        super();
    }

    
    public Maiar(String baston, String Sombrero) {
        this.baston = baston;
        this.Sombrero = Sombrero;
    }

    public Maiar(String baston, String Sombrero, String nombre, String apellido, String bestia, String raza, String altura, double poder, double defensa, double curacion, Date nacimiento) {
        super(nombre, apellido, bestia, raza, altura, poder, defensa, curacion, nacimiento);
        this.baston = baston;
        this.Sombrero = Sombrero;
    }

    

    public String getBaston() {
        return baston;
    }

    public void setBaston(String baston) {
        this.baston = baston;
    }

    public String getSombrero() {
        return Sombrero;
    }

    public void setSombrero(String Sombrero) {
        this.Sombrero = Sombrero;
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
