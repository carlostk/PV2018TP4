/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion.modelo.dominio;

import java.io.Serializable;




/**
 *
 * @author Carlos
 */
public class ArregloDeAuto implements Serializable{
    Auto[] arregloDeAuto;

    public ArregloDeAuto() {
       
    }

    public ArregloDeAuto(Auto[] arregloDeAuto) {
        this.arregloDeAuto = arregloDeAuto;
    }
    
    public void crearArregloDeAuto(int tamanio){
        arregloDeAuto = new Auto[tamanio];
    }

   public void cargarArreglo(){
        arregloDeAuto[0] = new Auto("ASD 123", "Ford", "Negro", 1998, "Nafta");
        arregloDeAuto[1] = new Auto("QEE 456", "Fiad", "Blanco", 1998, "Diesel");
        arregloDeAuto[2] = new Auto("ÑLK 789", "Toyota", "Rojo", 1998, "GNC");
        arregloDeAuto[3] = new Auto("MNB 321", "Audi", "Azul", 1998, "Electrico");
        arregloDeAuto[4] = new Auto("YUI 654", "Peugeot", "Gris", 1998, "Nafta");
        arregloDeAuto[5] = new Auto("POI 987", "Nissan", "Verde", 1998, "Diesel");
   
   }
    
  
    
  
    
    public Auto[] getArregloDeAuto() {
        return arregloDeAuto;
    }

    public void setArregloDeAuto(Auto[] arregloDeAuto) {
        this.arregloDeAuto = arregloDeAuto;
    }
    
    
}
