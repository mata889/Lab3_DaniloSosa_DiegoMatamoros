/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

import java.util.Random;


public class Bestia {
   Random random=new Random();
   String animal;
   int garras;
   boolean veneno;
   int vida=50+random.nextInt(100);

    public Bestia() {
    }

    public Bestia(String animal, int garras, boolean veneno) {
        this.animal = animal;
        this.garras = garras;
        this.veneno = veneno;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getGarras() {
        return garras;
    }

    public void setGarras(int garras) {
        this.garras = garras;
    }

    public boolean isVeneno() {
        return veneno;
    }

    public void setVeneno(boolean veneno) {
        this.veneno = veneno;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return animal;
    }

    
    
    
    
   
    
}
