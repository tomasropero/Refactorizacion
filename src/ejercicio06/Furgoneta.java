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
public class Furgoneta extends Vehiculo {
    
    private double precioKm;
    
    public Furgoneta(String matricula, String modelo, int km) {
        super(matricula, modelo, km);
        this.precioKm=0.5;
    }
    
    
    
    
    
    @Override
    public void alquilar(LocalDate fecha_alquiler, int km) {
        
        
        this.alquilado=true;
    }

    @Override
    public void devolver(LocalDate fecha_devolver, int km) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
