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
public class Usu_Adim extends Usu_Normal {
    
    public Usu_Adim(String nombre, String password, String email) {
        super(nombre, password, email);
    }
    
    
    public void cambiarPassword(){
       Usu_Normal usuario = BD_Usuarios.obtenerUsuario(id);
       
       if(usuario==null){
           System.out.println("Dicho id no existe");
       }
       else{
           usuario.cambiarPassword();
       }
       
        
    }
     
    @Override
    public String toString(){
        return String.format("A%2d %10s %10s %s",this.id,this.nombre,this.password,this.email);
    }
    
   @Override
    public void listarUsuarios(){
        BD_Usuarios.listarUsuarios(true);
    }
    
}
