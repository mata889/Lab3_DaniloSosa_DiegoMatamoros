/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

import java.awt.Color;

/**
 *
 * @author Family
 */
public class Aguilas extends Bestia{
    String nombre;
    String color;

    public Aguilas() {
        super();
    }

    public Aguilas(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
