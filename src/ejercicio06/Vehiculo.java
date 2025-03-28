/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06;

import java.time.LocalDate;

/**
 *
 * @author Alumnos DAW
 */
public abstract class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected int km;
    protected boolean alquilado;
    
    public Vehiculo(String matricula, String modelo, int km){
        this.matricula=matricula;
        this.modelo=modelo;
        this.km=km;
        this.alquilado=false;
    }
    
    public abstract void alquilar(LocalDate fecha_alquiler, int km);
    
    public abstract void devolver(LocalDate fecha_devolver, int km);
    
    @Override
    public String toString(){
        return String.format("", args);
    }
}
