/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alumnos DAW
 */
public class Triangulo extends Figura {
    
    private int altura;
    private int base;
    
    public Triangulo(int altura, int base){
        super();
        this.altura=altura;
        this.base=altura*2-1;
    }
    
    
    
    
    
    
    
    @Override
    public double area() {
        return base*altura/2;
    }

    @Override
    public double perimetro() {
        double baseMitad=base/2;
        double hipotenusa=Math.sqrt(altura*altura)+(baseMitad*baseMitad);
        
        return hipotenusa+hipotenusa+this.base; 
    }

    @Override
    public void pintar() {
        System.out.println("");
        for(int i = 1; i <= altura; i++){
            //Espacios en blanco
            for(int blancos = 1; blancos <= altura-i; blancos++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos = 1; asteriscos < (i*2); asteriscos++){
                System.out.print(colorRelleno + "*");
            }
            System.out.println();
        }
    }
    
}
