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
public class Arañas extends Bestia{
    String nombre;
    String Sexo;

    public Arañas() {
        super();
    }

    public Arañas(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
