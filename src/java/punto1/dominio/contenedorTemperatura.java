/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.dominio;

/**
 *
 * @author carlos
 */
public class contenedorTemperatura {
    private double numero;

    public contenedorTemperatura() {
    }
    public void asignarValor(double num){
        this.numero=num;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public double obtenerCelsiusFare(){
        return 1.8*numero+32;
    }
    public double obtenerCelciusKelvin(){
       return numero+273.15;
    }
     public double obtenerFareCelsiu(){
       return ((numero-32)*5)/9;
    }
    public double obtenerFareKelvin(){
        return ((numero+459.67)*5)/9;
    }
    public double obtenerKelvinCelsius(){
       return numero-273;
    }
    public double obtenerKelvinFare(){
       return 1.8*(numero-273)+32;
    }
}
    

