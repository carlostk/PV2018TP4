package Punto3.FormBeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 
 
import Punto3.Beans.CalculadoraBean;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
 
/**
 *
 * @author Ale
 */
@ManagedBean
@RequestScoped
public class CalculadoraFormBean implements Serializable{
@ManagedProperty(value="#{calculadoraBean}")
    CalculadoraBean calculadoraBean;
/**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
    }

    public CalculadoraBean getCalculadoraBean() {
        return calculadoraBean;
    }

    public void setCalculadoraBean(CalculadoraBean calculadoraBean) {
        this.calculadoraBean = calculadoraBean;
    }
    
    
}
