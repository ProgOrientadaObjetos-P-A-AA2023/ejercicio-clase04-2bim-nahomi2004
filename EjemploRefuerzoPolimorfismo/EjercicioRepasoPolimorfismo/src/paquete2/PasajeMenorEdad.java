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
public class PasajeMenorEdad extends PasajeUrbano {
    // El pasaje de un menor de edad tiene la ventaja de tener un 20% de descuento del valor fijo del pasaje
    public PasajeMenorEdad(double pasaje){
        super(pasaje);
    }
    
    @Override
    public void establecerValorPasaje() {
        valorPasaje = valorFijo-(valorFijo*0.2);
    }
    
    @Override
    public String toString(){
        return String.format("Tipo de pasaje: Menor de edad\n"
                + "%s",
                super.toString()
                );
    }
}
