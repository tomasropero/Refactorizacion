/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author Alumnos DAW
 */
public class Turismo extends Vehiculo {

    public Turismo(String matricula, String marca_modelo) {
        super(matricula, marca_modelo);
        this.km_motor=0;
        this.km_aceite=0;
        this.km_ruedas=0;
    }
    
    public Turismo(String matricula, String marca_modelo, int km_motor){
        super(matricula, marca_modelo, km_motor);
        this.km_aceite=0;
        this.km_ruedas=0;
    }
    
    
    
    
    
    @Override
    public boolean checkAceite() {
        if(this.km_aceite>=15000){
            this.km_aceite=0;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean checkRuedas() {
        if(this.km_ruedas>=30000){
            this.km_ruedas=0;
            return true;
        }else{
            return false;
        }
    }
    
}
