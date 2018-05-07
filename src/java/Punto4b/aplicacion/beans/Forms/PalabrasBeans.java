/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4b.aplicacion.beans.Forms;

import Punto4b.aplicacion.modelo.dominio.Palabra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Pc-Yo
 */
@ManagedBean
@RequestScoped
public class PalabrasBeans implements Serializable{
    private Palabra palabra;
    private List<Palabra> palabras;
    
    private List<Character> palabraOculta;
    private List<Character> palabraDescuvierta;
    private List<Character> letraIngresada;
    
    
    /**
     * Creates a new instance of PalabrasBeans
     */
    public PalabrasBeans() {
        palabra = new Palabra();
        palabras = new ArrayList<>();
        palabraOculta  = new ArrayList<>();
        palabraDescuvierta = new ArrayList<>();
        letraIngresada = new ArrayList<>();    
    }
    
    public void cargarPalabra(){
        palabras.add(palabra);
        palabra=new Palabra();
    }
    
   
    public void pasarPalabras() {
        
        for (int i = 0; i < palabras.get(0).getPalabraOcilta().length(); i++) {
            palabraOculta.add(i, palabras.get(0).getPalabraOcilta().charAt(i));
            palabraDescuvierta.add('?');
        }
    }

    public void buscarLetra() {
        boolean paso = false;
        for (int i = 0; i < palabraOculta.size(); i++) {
            if (palabraOculta.get(i) == palabra.getLetra()) {
                paso = true;
                palabraDescuvierta.set(i, palabra.getLetra());
            }
        }
        if (!paso) {
            palabra.restarIntento();
        }
    }

    public PalabrasBeans(Palabra palabra, List<Palabra> palabras, List<Character> palabraOculta, List<Character> palabraDescuvierta, List<Character> letraIngresada) {
        this.palabra = palabra;
        this.palabras = palabras;
        this.palabraOculta = palabraOculta;
        this.palabraDescuvierta = palabraDescuvierta;
        this.letraIngresada = letraIngresada;
    }
    

    public PalabrasBeans(Palabra palabra, List<Palabra> palabras) {
        this.palabra = palabra;
        this.palabras = palabras;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public void setPalabra(Palabra palabra) {
        this.palabra = palabra;
    }

    public List<Palabra> getPalabras() {
        return palabras;
    }

    public void setPalabras(List<Palabra> palabras) {
        this.palabras = palabras;
    }

    public List<Character> getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(List<Character> palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public List<Character> getPalabraDescuvierta() {
        return palabraDescuvierta;
    }

    public void setPalabraDescuvierta(List<Character> palabraDescuvierta) {
        this.palabraDescuvierta = palabraDescuvierta;
    }

    public List<Character> getLetraIngresada() {
        return letraIngresada;
    }

    public void setLetraIngresada(List<Character> letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    
    
}
