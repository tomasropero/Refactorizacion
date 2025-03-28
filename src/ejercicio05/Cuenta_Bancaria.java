/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Alumnos DAW
 */
public abstract class Cuenta_Bancaria {
    protected int numero;
    protected static int contador=1000;
    protected Cliente titular;
    protected double saldo;
    protected LocalDate fechaApertura;
    protected double TAE;
    
    
    public Cuenta_Bancaria(Cliente titular, double saldo_inicial, LocalDate fechaApertura){
        this.titular=titular;
        this.saldo=saldo_inicial;
        this.fechaApertura=fechaApertura;
        this.numero=Cuenta_Bancaria.contador;
        Cuenta_Bancaria.contador++;
        
    }
    
    public double calcularIntereses(){
        int mesesPasados = (int) ChronoUnit.MONTHS.between(fechaApertura, LocalDate.now());
        double TAE_mensual = this.TAE/12;
        return saldo*((TAE_mensual/100)*mesesPasados);
    }
    
    @Override
    public String toString(){
        String tipocuenta;
        if(this instanceof CuentaCorriente){
            tipocuenta="C.CORRIENTE";
        }
         return String.format("%d %s %f %f", this.numero,this.titular.getNombre(),this.saldo,this.TAE);
    }
    
    public abstract void reintegro(double importe);
    
    public abstract void ingreso(double importe);
    
    public abstract void transferencia(Cuenta_Bancaria c,double importe);
}
