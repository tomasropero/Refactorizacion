/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.ArrayList;

/**
 *
 * @author Alumnos DAW
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Figura> listaFiguras=new ArrayList();
        
        Figura figura;
        
        figura=new Rectangulo(8,3);
        figura.setColor(TipoColor.ROJO);
        listaFiguras.add(figura);
        
        figura=new Cuadrado(4);
        figura.setColor(TipoColor.VERDE);
        listaFiguras.add(figura);
        
        figura=new Triangulo(8,5);
        figura.setColor(TipoColor.AZUL);
        listaFiguras.add(figura);
        
        for (Figura f : listaFiguras) {
            f.pintar();
            System.out.printf("Area:%7.2f     Perimetro:%.2f\n",f.area(),f.perimetro());
        }
    }
    
}
