/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.ArrayList;

/**
 *
 * @author Alumnos DAW
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Vehiculo> listaVehiculos=new ArrayList();
        
        
        Turismo turismo;
        Turismo turismo2;
        Camion camion;
        Camion camion2;
        
        
        turismo= new Turismo("1111FFF","PEUGEOT 308");
        listaVehiculos.add(turismo);
        
        turismo2=new Turismo("2222AAA","SEAT IBIZA",10000);
        listaVehiculos.add(turismo2);
        
        camion=new Camion("3333GGG","VOLVO 500");
        listaVehiculos.add(camion);
        
        camion2=new Camion("4444HHH","SCANIA 550",100000);
        listaVehiculos.add(camion2);
        
        
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
        
        turismo.avanzar(20000);
        turismo.checkAceite();
        
        turismo2.avanzar(30000);
        turismo2.checkAceite();
        turismo2.checkRuedas();
        
        
        camion.avanzar(20000);
        
        camion2.avanzar(60000);
        camion2.checkAceite();
        camion2.checkRuedas();
        camion2.checkTacografo();
        System.out.println("");
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
        
    }
    
}
