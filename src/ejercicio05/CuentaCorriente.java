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
public class CuentaCorriente extends Cuenta_Bancaria {
    
    public CuentaCorriente(Cliente titular, double saldo_inicial, LocalDate fechaApertura) {
        super(titular, saldo_inicial, fechaApertura);
        this.TAE = Banco.getINTERESES_CUENTACORRIENTE();
    }

    @Override
    public void reintegro(double importe) {
        this.saldo= saldo - importe;
    }

    @Override
    public void ingreso(double importe) {
        this.saldo = saldo + importe;
    }

    @Override
    public void transferencia(Cuenta_Bancaria c,double importe) {
        this.saldo = saldo - importe;
        c.ingreso(importe);
    }
    
}
