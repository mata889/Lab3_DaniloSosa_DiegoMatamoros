/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_diego_danilo;

import java.util.Date;


public class Integrantes {
    
    String nombre, apellido, bestia,raza,altura;
    double poder, defensa, curacion;
    Date nacimiento;

    public Integrantes() {
    }

    public Integrantes(String nombre, String apellido, String bestia, String raza, String altura, double poder, double defensa, double curacion, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.bestia = bestia;
        this.raza = raza;
        this.altura = altura;
        this.poder = poder;
        this.defensa = defensa;
        this.curacion = curacion;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBestia() {
        return bestia;
    }

    public void setBestia(String bestia) {
        this.bestia = bestia;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getCuracion() {
        return curacion;
    }

    public void setCuracion(double curacion) {
        this.curacion = curacion;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
