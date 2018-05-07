/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.Beans;
import Punto3.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Ale
 */
@ManagedBean
@RequestScoped
public class CalculadoraBean implements Serializable{    
    private Calculadora casio;  

    /**
     * Creates a new instance of CalculadoraBean
     */
    public CalculadoraBean() {
       casio = new Calculadora();
    }

    public Calculadora getCasio() {
        return casio;
    }

    public void setCasio(Calculadora casio) {
        this.casio = casio;
    }
    
    
    
}
