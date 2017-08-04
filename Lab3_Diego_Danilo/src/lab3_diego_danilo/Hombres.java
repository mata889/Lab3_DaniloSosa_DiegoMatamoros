/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

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
