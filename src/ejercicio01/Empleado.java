/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Alumnos DAW
 */
public class Empleado {
    protected String DNI;
    protected String nombre;
    protected double salarioBase;
    protected int horasExtras;
    protected double precioHoraExtra;
    
    public Empleado(String DNI, String nombre){
        this.DNI=DNI;
        this.nombre=nombre;
        this.salarioBase=1000;
        this.precioHoraExtra=10;
        this.horasExtras=0;
    }
    
    
    public double calcularSueldo(){
        return salarioBase+(horasExtras*precioHoraExtra);
    }
    
    
    @Override
    public String toString(){
        return String.format("%s [DNI:%s]", this.nombre,this.DNI);
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }
    
    
}
