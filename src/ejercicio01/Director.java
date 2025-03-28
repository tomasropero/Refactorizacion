/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Alumnos DAW
 */
public class Director extends Empleado {
    
    private int numDespacho;
    private double plusSalario;
    
    public Director(String DNI, String nombre,int numDespacho) {
        super(DNI, nombre);
        this.numDespacho=numDespacho;
        this.plusSalario=400;
    }
    
    
    @Override
    public double calcularSueldo(){
        double salarioBase=super.calcularSueldo();
        return salarioBase+plusSalario;
        
    }
    
    public void analizarDatos(){
        System.out.println("Estoy analizando datos....");
    }
}
