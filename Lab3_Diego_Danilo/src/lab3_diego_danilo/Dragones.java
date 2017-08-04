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
public class Dragones extends Bestia {
    String Longitud;

    public Dragones() {
        super();
    }

    
    public Dragones(String Longitud) {
        this.Longitud = Longitud;
    }

    public Dragones(String Longitud, String animal, int garras, boolean veneno) {
        super(animal, garras, veneno);
        this.Longitud = Longitud;
    }

    

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
