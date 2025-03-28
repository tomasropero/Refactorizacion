/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alumnos DAW
 */
public class Cuadrado extends Figura {
    
    private int lado;
    
    public Cuadrado(int lado){
        super();
        this.lado=lado;
    }
    
    
    
    
    @Override
    public double area() {
        return lado*2;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }

    @Override
    public void pintar() {
        System.out.println("");
        
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(this.colorRelleno+"*");
            }
            System.out.println("");
        }
    }
    
    
}
