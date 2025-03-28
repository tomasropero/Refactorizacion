/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Alumnos DAW
 */
public class Contable extends Empleado {
    
    private double plusSalario;
    
    public Contable(String DNI, String nombre) {
        super(DNI, nombre);
        this.plusSalario=200;
    }
    
    
    @Override
    public double calcularSueldo(){
        double sueldoBase=super.calcularSueldo();
        return sueldoBase+plusSalario;
    }
    
    public void contabilizar(){
        System.out.println("Estoy contabilizando....");
    }
    
}
