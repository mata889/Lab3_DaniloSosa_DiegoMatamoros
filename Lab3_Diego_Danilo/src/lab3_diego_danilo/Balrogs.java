/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;


public class Balrogs extends Bestia{
    String latigo;

    public Balrogs() {
        super();
    }

    
    public Balrogs(String latigo) {
        this.latigo = latigo;
    }

    public Balrogs(String latigo, String animal, int garras, boolean veneno) {
        super(animal, garras, veneno);
        this.latigo = latigo;
    }

    

    public String getLatigo() {
        return latigo;
    }

    public void setLatigo(String latigo) {
        this.latigo = latigo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
