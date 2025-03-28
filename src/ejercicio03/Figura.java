/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

enum TipoColor{
    NEGRO,AZUL,ROJO,VERDE
}

/**
 *
 * @author Alumnos DAW
 */
public abstract class Figura {
    protected String colorRelleno;
    
    private static final String COLOR_NEGRO="\033[30m";
    private static final String COLOR_AZUL="\033[34m";
    private static final String COLOR_ROJO="\033[31m";
    private static final String COLOR_VERDE="\033[32m";
    
    public Figura(){
        this.colorRelleno=COLOR_NEGRO;
    }
    
    public void setColor(TipoColor color){
        
        switch(color){
            case NEGRO:
                colorRelleno="\033[30m";
                break;
            case VERDE:
                colorRelleno=COLOR_VERDE;
                break;
            case ROJO:
                colorRelleno=COLOR_ROJO;
                break;
            case AZUL:
                colorRelleno=COLOR_AZUL;
                break;
        }
    }
    
    public abstract double area();
    
    public abstract double perimetro();
    
    public abstract void pintar();
    
}
