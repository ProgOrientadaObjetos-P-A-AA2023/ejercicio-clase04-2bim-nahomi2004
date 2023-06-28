/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeTerceraEdad extends PasajeUrbano {
    // El pasaje de tercera edad es el 50% del valor fijo
    
    public PasajeTerceraEdad(double pasaje){
        super(pasaje);
    }
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo-(valorFijo*0.5);
    }
       
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Tercera Edad\n"
                + "%s",
                super.toString()
                );
    }
}
