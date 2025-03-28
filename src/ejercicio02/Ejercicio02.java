/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Alumnos DAW
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn=new Scanner (System.in);
        
        int intentosLogin=2;
        Usu_Normal usuarioActual;
        
        
        BD_Usuarios.añadirUsuario("zipi", "zipi", "zipi@kk.com", false);
        BD_Usuarios.añadirUsuario("zape", "zape", "zape@kk.com", false);
        BD_Usuarios.añadirUsuario("root", "root", "zipi@kk.com", true);
        
        
        do {
            System.out.println("");
            System.out.println("Login");
            System.out.println("************");
            System.out.print("Usuario: ");
            String usuario=sn.nextLine();
            System.out.print("Password: ");
            String password=sn.nextLine();
            
            
            
            if(BD_Usuarios.verificarLogin(usuario, password)){
                usuarioActual = BD_Usuarios.obtenerUsuario(usuario);
                intentosLogin=2;
                menu(usuarioActual);
            }
            else{
                intentosLogin--;
            }
            
            
            
            
        } while (intentosLogin>0);
        
        if(intentosLogin==0){
            System.out.println("");
            System.out.println("Fallo en el logeo, saliendo del sistema...");
        }
        
    }
    
    public static void menu(Usu_Normal usuario){
        Scanner sn = new Scanner (System.in);
        int opcion;
        boolean salir=false;
        
        do {
            System.out.println("********************");
            if(usuario instanceof Usu_Adim){
                System.out.println("Aministrador: << "+usuario.getNombre()+" >>");
            }
            else{
                System.out.println("Usuario: << "+usuario.getNombre()+" >>");
            }
            System.out.println("********************");
            
            System.out.println("1. Salir del sistema");
            System.out.println("2. Listar usuarios");
            System.out.println("3. Cambiar password");
            if(usuario instanceof Usu_Adim){
                System.out.println("4. Cambiar password de otro Usuario");
            }
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(sn.nextLine());
            
            switch (opcion){
                case 1:
                    salir=true;
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    
                    System.out.println("Opcion incorrecta.");
                
            }
        } while (salir==false);
        
    }
    
    
    
    
    
}
