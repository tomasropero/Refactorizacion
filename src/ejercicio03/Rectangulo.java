/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Alumnos DAW
 */
public class Rectangulo extends Figura {
    
    private int ladoLargo;
    private int ladoCorto;
    
    public Rectangulo(int ladoLargo, int ladoCorto){
        super();
        this.ladoLargo=ladoLargo;
        this.ladoCorto=ladoCorto;
    }
    
    
    
    @Override
    public double area() {
        return ladoLargo*ladoCorto;
    }

    @Override
    public double perimetro() {
        return ((ladoLargo*2)+(ladoCorto*2));
    }

    @Override
    public void pintar() {
        System.out.println("");
        
        for (int i = 0; i < ladoCorto; i++) {
            for (int j = 0; j < ladoLargo; j++) {
                System.out.print(this.colorRelleno+"*");
            }
            System.out.println("");
        }
    }
    
}
