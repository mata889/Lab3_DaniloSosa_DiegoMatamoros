/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;


public class Maiar extends Integrantes{
    
    public String baston;
    public String Sombrero;

    public Maiar() {
        super();
    }

    public Maiar(String baston, String Sombrero) {
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

    

    @Override
    public String toString() {
        return "Maiar{" + "baston=" + baston + ", Sombrero=" + Sombrero + '}';
    }
    
    
}
