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

    public Hombres() {
        super();
    }

    public Hombres(String espada, String lanza, String arco) {
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

    

    @Override
    public String toString() {
        return "Hombres{" + "espada=" + espada + ", lanza=" + lanza + ", arco=" + arco + '}';
    }
    
    
}
