/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumnos DAW
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 =new Persona("000A","Mortadelo");
        persona1.imprimirDetalles();
        System.out.println("");
        System.out.println(persona1);
        
        Alumno alu1=new Alumno("1234Z","Pedro Palotes","1DAW");
        alu1.imprimirDetalles();
        System.out.println(alu1);
    }
    
}
