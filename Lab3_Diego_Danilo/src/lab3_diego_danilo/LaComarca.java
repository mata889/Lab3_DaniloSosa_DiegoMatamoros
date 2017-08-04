/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;


public class LaComarca extends Lugar{
    int numeroCasa;
    public LaComarca() {
        super();
    }

    public LaComarca(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
