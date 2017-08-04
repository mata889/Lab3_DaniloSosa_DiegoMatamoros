/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

/**
 *
 * @author Danilo Sosa
 */
public class Elfos extends Integrantes {

    public String arma;

    public Elfos() {
        super();
    }

    public Elfos(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    
    
    @Override
    public String toString() {
        return "Elfos{" + "arma=" + arma + '}';
    }
    
    

    

    

   
    

}
