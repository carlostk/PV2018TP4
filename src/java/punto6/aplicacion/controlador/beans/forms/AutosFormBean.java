/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion.controlador.beans.forms;

import punto6.aplicacion.modelo.dominio.ArregloDeAuto;
import punto6.aplicacion.modelo.dominio.Auto;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;







/**
 *
 * @author pc1
 */
@ManagedBean
@ViewScoped
public class AutosFormBean implements Serializable{
   int tamanioDelArregloDeAuto = 6;
   ArregloDeAuto unArregloDeAuto = new ArregloDeAuto();
   Auto objauto = new Auto();
   
    public AutosFormBean() {
        unArregloDeAuto.crearArregloDeAuto(tamanioDelArregloDeAuto);
        unArregloDeAuto.cargarArregloDeAutoPredeterminado();
    }
    public void modificar(){
       unArregloDeAuto.modificarOpciones(objauto);
    }

    public int getTamanioDelArregloDeAuto() {
        return tamanioDelArregloDeAuto;
    }

    public void setTamanioDelArregloDeAuto(int tamanioDelArregloDeAuto) {
        this.tamanioDelArregloDeAuto = tamanioDelArregloDeAuto;
    }

    public ArregloDeAuto getUnArregloDeAuto() {
        return unArregloDeAuto;
    }

    public void setUnArregloDeAuto(ArregloDeAuto unArregloDeAuto) {
        this.unArregloDeAuto = unArregloDeAuto;
    }

    public Auto getObjauto() {
        return objauto;
    }

    public void setObjauto(Auto objauto) {
        this.objauto = objauto;
    }
   
}
