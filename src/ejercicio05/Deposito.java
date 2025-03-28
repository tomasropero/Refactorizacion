/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

import java.time.LocalDate;

/**
 *
 * @author Alumnos DAW
 */
public class Deposito extends Cuenta_Bancaria {
    
    public Deposito(Cliente titular, double saldo_inicial, LocalDate fechaApertura) {
        super(titular, saldo_inicial, fechaApertura);
        this.TAE= Banco.getINTERES_DEPOSITO();
    }

    @Override
    public void reintegro(double importe) {
        System.out.println("ERROR operacion no posible");
    }

    @Override
    public void ingreso(double importe) {
        System.out.println("ERROR operacion no posible");
    }

    @Override
    public void transferencia(Cuenta_Bancaria c,double importe) {
        System.out.println("ERROR operacion no posible");
    }

    
    
    
}
