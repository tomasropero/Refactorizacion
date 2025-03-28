/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnos DAW
 */
public class Persona {
    protected String nif;
    protected String nombre;
    
    public Persona(String nif, String nombre){
        this.nif=nif;
        this.nombre=nombre;
    }
    
    public void imprimirDetalles(){
        System.out.println("Detalles del objeto");
        System.out.println("--------------------");
        System.out.println("NIF: "+this.nif);
        System.out.println("Nombre: "+this.nombre);
    }
    
    @Override
    public String toString(){
        String cadena;
        cadena=String.format("NIF:%s - Nombre:%s\n",this.nif,this.nombre);
        return cadena;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
