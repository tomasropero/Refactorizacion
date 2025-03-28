/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnos DAW
 */
public class Alumno extends Persona {
    
    private String curso;
    
    
    public Alumno(String nif, String nombre, String curso) {
        super(nif, nombre);
        this.curso=curso;
    }
    
    @Override
    public void imprimirDetalles(){
        System.out.println("Detalles del objeto");
        System.out.println("--------------------");
        System.out.println("NIF: "+this.nif);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Curso: "+this.curso);
    }
    
    @Override
    public String toString(){
        String cadena;
        cadena=String.format("NIF:%s - Nombre:%s  Curso:%s\n",this.nif,this.nombre,this.curso);
        return cadena;
    }
    
    
}
