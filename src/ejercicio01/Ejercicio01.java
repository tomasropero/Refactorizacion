/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author Alumnos DAW
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado=new Empleado("1111A","Alicia Camacho");
        Contable contable=new Contable("2222A","J.L.Abalos");
        
        
        empleado.setHorasExtras(5);
        contable.setHorasExtras(5);
        
        System.out.println(empleado);
        System.out.println("SUELDO: "+empleado.calcularSueldo());
        
        System.out.println(contable);
        System.out.println("SUELDO: "+contable.calcularSueldo());
        contable.contabilizar();
        
    }
    
}
