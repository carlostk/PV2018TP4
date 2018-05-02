/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.beans;

import punto1.dominio.contenedorTemperatura;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author carlos
 */
@ManagedBean
@RequestScoped
public class ContenedorManageBean {

   private double n;
   private contenedorTemperatura conversor;
   private char unidadOrigen;
   private char unidadDestino;
    public ContenedorManageBean() {
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public contenedorTemperatura getConversor() {
        return conversor;
    }

    public void setConversor(contenedorTemperatura conversor) {
        this.conversor = conversor;
    }

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    public double convertirUnidades(){
      double resultado=0;
      conversor = new contenedorTemperatura();
      conversor.asignarValor(n);
     if (unidadOrigen == 'C' && unidadDestino == 'F')
      {
        resultado = conversor.obtenerCelsiusFare();
        /*return resultado;*/
      }else{
            if (unidadOrigen == 'C' && unidadDestino == 'K')
              {
              resultado = conversor.obtenerCelciusKelvin();
              /*return resultado;*/
              }
            }
      if (unidadOrigen == 'F' && unidadDestino == 'C')
      {
        resultado=conversor.obtenerFareCelsiu();
        /*return resultado;*/
      }else{
             if (unidadOrigen == 'F' && unidadDestino == 'K')
             {
                resultado=conversor.obtenerFareKelvin();
               /* return resultado;*/
             }
           }
      if(unidadOrigen == 'K' && unidadDestino == 'F')
      {
          resultado=conversor.obtenerKelvinFare();
      }else
      {
        if(unidadOrigen == 'K' && unidadDestino == 'C')
        {
          resultado=conversor.obtenerKelvinCelsius();
        }  
      }
      return resultado;
    }
    
}
