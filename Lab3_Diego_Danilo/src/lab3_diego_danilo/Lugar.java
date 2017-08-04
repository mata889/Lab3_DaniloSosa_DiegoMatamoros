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
public class Lugar {
    int extension;
    int numeroInt;
    String lugar;

    public Lugar() {
    }

    public Lugar(int extension, int numeroInt, String lugar) {
        this.extension = extension;
        this.numeroInt = numeroInt;
        this.lugar = lugar;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public int getNumeroInt() {
        return numeroInt;
    }

    public void setNumeroInt(int numeroInt) {
        this.numeroInt = numeroInt;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return lugar;
    }

    
    
}
