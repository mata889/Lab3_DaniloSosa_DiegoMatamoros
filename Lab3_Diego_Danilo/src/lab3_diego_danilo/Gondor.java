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
public class Gondor extends Lugar{
    int parajes;

    public Gondor() {
        super();
    }

    
    public Gondor(int parajes) {
        this.parajes = parajes;
    }

    public Gondor(int parajes, int extension, int numeroInt, String lugar) {
        super(extension, numeroInt, lugar);
        this.parajes = parajes;
    }

    

    public int getParajes() {
        return parajes;
    }

    public void setParajes(int parajes) {
        this.parajes = parajes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
