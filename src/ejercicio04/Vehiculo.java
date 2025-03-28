/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Alumnos DAW
 */
public abstract class Vehiculo {
    
    protected String matriula;
    protected String marca_modelo;
    protected int km_motor;
    protected int km_aceite;
    protected int km_ruedas;
    
    public Vehiculo(String matricula, String marca_modelo){
        this.matriula=matricula;
        this.marca_modelo=marca_modelo;
        this.km_motor=0;
        this.km_aceite=0;
        this.km_ruedas=0;
    }
    
    public Vehiculo(String matricula, String marca_modelo, int km_motor){
        this.matriula=matricula;
        this.marca_modelo=marca_modelo;
        this.km_motor=km_motor;
        this.km_aceite=0;
        this.km_ruedas=0;
    }
    
    public void avanzar(int km){
        this.km_motor=this.km_motor+km;
        this.km_aceite=this.km_motor+km;
        this.km_ruedas=this.km_motor+km;
    }
    
    @Override
    public String toString(){
        if(km_motor==0){
            return String.format("%s   %s nuevo ", this.marca_modelo,this.matriula);
            
        }else{
            return String.format("%s   %s [%d km] ", this.marca_modelo,this.matriula,this.km_motor);
        }
        
    }
    
    public abstract boolean checkAceite();
    
    public abstract boolean checkRuedas();
}
