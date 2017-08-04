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
public class Hobbits extends Integrantes{
    
    String anillo;

    public Hobbits() {
        super();
    }

    public Hobbits(String anillo) {
        this.anillo = anillo;
    }

    public String getAnillo() {
        return anillo;
    }

    public void setAnillo(String anillo) {
        this.anillo = anillo;
    }

    

    @Override
    public String toString() {
        return "Hobbits{" + "anillo=" + anillo + '}';
    }
    
    
    
    
}
