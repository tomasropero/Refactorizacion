/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author Alumnos DAW
 */
public class BD_Usuarios {
    private static ArrayList<Usu_Normal> bd=new ArrayList();
            
    public static void añadirUsuario(String nombre, String password, String email, boolean esAdmin){
        if(esAdmin){
            bd.add(new Usu_Adim(nombre,password,email));
        }
        else{
            bd.add(new Usu_Normal(nombre,password,email));
        }
    }
    
    public static Usu_Normal obtenerUsuario(int id){
        for (Usu_Normal usuario : bd) {
            if(usuario.getId()==id){
                return usuario;
            }
        }
        return null;
    }
    
    public static Usu_Normal obtenerUsuario(String nombre){
        for (Usu_Normal usuario : bd) {
            if(usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }
        return null;
    }
    
    public static boolean verificarLogin(String nombre,String password){
        for (Usu_Normal usuario : bd) {
            if(usuario.getNombre().equals(nombre) && usuario.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    } 
    
    
    public static void listarUsuarios(boolean esAdmin){
        System.out.println("");
        System.out.println("         LISTA DE USUARIOS");
        System.out.println("====================================");
        if(esAdmin){
            for (Usu_Normal usuario : bd) {
                System.out.println(usuario);
            }
        }
        else{
            for (Usu_Normal usuario : bd) {
                if(usuario instanceof Usu_Adim){
                    System.out.printf("A%2d %10s *********** %s\n",usuario.getId(),usuario.getNombre(),usuario.getEmail());
                }
                else{
                    System.out.printf(" %2d %10s *********** %s\n",usuario.getId(),usuario.getNombre(),usuario.getEmail());
                }
            }
        }
    }
}
