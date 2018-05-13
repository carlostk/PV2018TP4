/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion.controlador.beans.forms;

import punto6.aplicacion.modelo.dominio.ArregloDeAuto;
import punto6.aplicacion.modelo.dominio.Auto;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;







/**
 *
 * @author pc1
 */
@ManagedBean
@ViewScoped
public class AutosFormBean implements Serializable{
   private int tamanioDelArregloDeAuto = 6;
   private Auto objauto = new Auto();
   private Auto[] arregloDeAutos=new Auto[tamanioDelArregloDeAuto];
   private ArregloDeAuto unArregloDeAuto =new ArregloDeAuto();
   private int año;
    public AutosFormBean() {
        
        unArregloDeAuto.crearArregloDeAuto(tamanioDelArregloDeAuto);
        arregloDeAutos=new Auto[tamanioDelArregloDeAuto];
        unArregloDeAuto.cargarArreglo();
        arregloDeAutos=unArregloDeAuto.getArregloDeAuto();
       
    }
   
    public void modificar(){
       if(Integer.toString(año).length() != 4)
       {
         año=objauto.getModelo();
         FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR,"año tiene que tener  4 digitos","año tiene que tener 4 digitos");
         FacesContext facesContext = FacesContext.getCurrentInstance();
         facesContext.addMessage(null, mensaje);
       }else{
           objauto.setModelo(año);
       }
     
    }
    public void elejirAuto(Auto autoElejido){
       
      objauto=autoElejido;
      año=objauto.getModelo();
    }

    public int getTamanioDelArregloDeAuto() {
        return tamanioDelArregloDeAuto;
    }

    public void setTamanioDelArregloDeAuto(int tamanioDelArregloDeAuto) {
        this.tamanioDelArregloDeAuto = tamanioDelArregloDeAuto;
    }

   
    
   public Auto getObjauto() {
        return objauto;
    }

    public void setObjauto(Auto objauto) {
        this.objauto = objauto;
    }

    public Auto[] getArregloDeAutos() {
        return arregloDeAutos;
    }

    public void setArregloDeAutos(Auto[] arregloDeAutos) {
        this.arregloDeAutos = arregloDeAutos;
    }

    public ArregloDeAuto getUnArregloDeAuto() {
        return unArregloDeAuto;
    }

    public void setUnArregloDeAuto(ArregloDeAuto unArregloDeAuto) {
        this.unArregloDeAuto = unArregloDeAuto;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
  
   

   
   
}
