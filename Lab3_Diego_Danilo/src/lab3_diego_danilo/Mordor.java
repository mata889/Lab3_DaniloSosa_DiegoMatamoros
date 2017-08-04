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
public class Mordor extends Lugar {
    int NumeroGuardian;

    public Mordor() {
        super();
    }

    
    public Mordor(int NumeroGuardian) {
        this.NumeroGuardian = NumeroGuardian;
    }

    public Mordor(int NumeroGuardian, int extension, int numeroInt, String lugar) {
        super(extension, numeroInt, lugar);
        this.NumeroGuardian = NumeroGuardian;
    }

    

    public int getNumeroGuardian() {
        return NumeroGuardian;
    }

    public void setNumeroGuardian(int NumeroGuardian) {
        this.NumeroGuardian = NumeroGuardian;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
