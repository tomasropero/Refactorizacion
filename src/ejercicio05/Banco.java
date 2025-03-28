/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

import java.util.ArrayList;

/**
 *
 * @author Alumnos DAW
 */
public class Banco {
    private String nombre;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Cuenta_Bancaria> listaCuentas;
    private static int INTERES_DEPOSITO;
    private static int INTERESES_CUENTACORRIENTE;
    
    public Banco(String nombre){
        this.nombre=nombre;
        this.listaClientes=new ArrayList();
        this.listaCuentas=new ArrayList();
        this.INTERESES_CUENTACORRIENTE=5;
        this.INTERES_DEPOSITO=0;
    }
    
    public void nuevoCliente(String nombre, String apellidos, String dni){
        Cliente c=new Cliente(nombre,apellidos,dni);
        listaClientes.add(c);
    }
    
    public void nuevoCliente(Cliente c){
        listaClientes.add(c);
    }
    
    
    public void nuevaCuenta(Cuenta_Bancaria cc){
        listaCuentas.add(cc);
    }
    
    
    public void listarEstadoCuentas(){
        System.out.println("------------------------------");
        System.out.println("      ESTADO DE CUENTAS       ");
        System.out.println("------------------------------");
        System.out.println("  TIPO  NUM  TIT    SALDO     INTERESES");
        if()
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Cuenta_Bancaria> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList<Cuenta_Bancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public static int getINTERES_DEPOSITO() {
        return INTERES_DEPOSITO;
    }

    public static void setINTERES_DEPOSITO(int INTERES_DEPOSITO) {
        Banco.INTERES_DEPOSITO = INTERES_DEPOSITO;
    }

    public static int getINTERESES_CUENTACORRIENTE() {
        return INTERESES_CUENTACORRIENTE;
    }

    public static void setINTERESES_CUENTACORRIENTE(int INTERESES_CUENTACORRIENTE) {
        Banco.INTERESES_CUENTACORRIENTE = INTERESES_CUENTACORRIENTE;
    }

   
    
    
    
}
