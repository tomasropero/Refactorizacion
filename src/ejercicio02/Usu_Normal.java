/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Alumnos DAW
 */
public class Usu_Normal {
    protected String nombre;
    protected String password;
    protected String email;
    protected int id;
    private static int contadorID=1;
    
    
    public Usu_Normal(String nombre, String password, String email){
        this.nombre=nombre;
        this.password=password;
        this.email=email;
        this.id=contadorID;
        contadorID++;
        
    }
    
    
    @Override
    public String toString(){
        return String.format(" %2d %10s %10s %s",this.id,this.nombre,this.password,this.email);
    }
    
    
    public void cambiarPassword(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("Cambiando password de <"+this.nombre+">");
        System.out.print("Nuevo password:");
        String nuevopassword=teclado.nextLine();
        this.password=nuevopassword;
        System.out.println("El password ha sido cambiado");
        
    }
    
    
    public void listarUsuarios(){
        BD_Usuarios.listarUsuarios(false);
    }
    
    
    //getter and setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    //***************** fin getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
