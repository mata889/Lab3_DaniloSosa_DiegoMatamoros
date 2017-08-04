/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

import java.util.ArrayList;


public class Pueblos {
    public String nombre;
    public ArrayList<Integrantes> integrantes=new ArrayList();

    public Pueblos() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integrantes> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Integrantes> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
