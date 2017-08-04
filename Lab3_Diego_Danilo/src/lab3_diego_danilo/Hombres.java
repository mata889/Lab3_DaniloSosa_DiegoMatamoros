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
public class Hombres extends Integrantes {
    
    public String espada;
    public String lanza;
    public String arco;
    double ataque=150,defensa=140,curacion=50;

    public Hombres() {
        super();
    }

    

    
    public Hombres(String espada, String lanza, String arco) {
        this.espada = espada;
        this.lanza = lanza;
        this.arco = arco;
    }

    public Hombres(String espada, String lanza, String arco, String nombre, String apellido, String bestia, String raza, String altura, double poder, double defensa, double curacion, Date nacimiento) {
        super(nombre, apellido, bestia, raza, altura, poder, defensa, curacion, nacimiento);
        this.espada = espada;
        this.lanza = lanza;
        this.arco = arco;
    }

    

    public String getEspada() {
        return espada;
    }

    public void setEspada(String espada) {
        this.espada = espada;
    }

    public String getLanza() {
        return lanza;
    }

    public void setLanza(String lanza) {
        this.lanza = lanza;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
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
