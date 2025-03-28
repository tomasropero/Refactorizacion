/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Alumnos DAW
 */
public class Camion extends Vehiculo {

    private int km_tacografo;

    public Camion(String matricula, String marca_modelo) {
        super(matricula, marca_modelo);
        this.km_motor=0;
        this.km_aceite=0;
        this.km_ruedas=0;
        this.km_tacografo =0;
    }
    
    
    
    public Camion(String matricula, String marca_modelo, int km_motor) {
        super(matricula, marca_modelo, km_motor);
        this.km_aceite=0;
        this.km_ruedas=0;
        this.km_tacografo=0;
    }
    
    
    public boolean checkTacografo(){
        if(km_tacografo>=50000){
            this.km_tacografo=0;
            return true;
        }else{
            return false;
        }
    }
    
    
    
    @Override
    public void avanzar(int km){
        this.km_motor=this.km_motor+km;
        this.km_aceite=this.km_motor+km;
        this.km_ruedas=this.km_motor+km;
    }
    
    @Override
    public boolean checkAceite() {
        if(this.km_aceite>=30000){
            this.km_aceite=0;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean checkRuedas() {
        if(this.km_ruedas>=50000){
            this.km_ruedas=0;
            return true;
        }else{
            return false;
        }
    }
    
}
