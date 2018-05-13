/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.aplicacion.beans.Forms;

import Punto4.aplicacion.modelo.dominio.Letra;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Pc-Yo Mobile
 */
@ManagedBean
@ViewScoped
public class letrasBean implements Serializable{

    private List<Letra> listaLetras;
    private char letra;
    private String palabra;
    private List<Character> letrasIngr;
    private int intentos;
    private String estadoDelJuego;

    /**
     * Creates a new instance of letrasBean
     */
    public letrasBean() {
        listaLetras = new ArrayList<>();
        letra=0;
        letrasIngr = new ArrayList<>();
        palabra = new String();
        intentos = 5;
    }

    public String mostrarEstadoDePalabra() {
        String pAux = "";
        for (Letra letra : listaLetras) {
            if (letra.isEstado()) {
                pAux = pAux + " " + letra.getLetra() + "  ";
            } else {
                pAux = pAux + " ?  ";
            }
        }
        return pAux;
    }
    
    
    public String mostrarPalabra() {
        String pAux = "";
        for (Letra letra : listaLetras) {
            pAux = pAux + " " + letra.getLetra() + "  ";
        }
        return pAux;
    }


    public String mostrarListaIngresado() {
        String pAux = "";
        for (Character letra : letrasIngr) {
            pAux = pAux + " " + letra + "  ";
        }
        return pAux;
    }
    
    public void comprobarEstadoDelJuego(){
        if (comprobarJuegoResuelto()) {
            estadoDelJuego=":) GANASTE!!!";
        }else{
            if (intentos==0) {
                estadoDelJuego=":( PERDISTE.";
            }else{ estadoDelJuego="";
            }
        }
    }
    
    public Boolean comprobarJuegoResuelto(){
        boolean BAux= true;
        for (Letra letra : listaLetras) {
            if (!letra.isEstado()) {
                BAux=false;
            }
        }
        return BAux;
    }

    public void cargarPalabra() {
        listaLetras = new ArrayList<>();
        intentos=5;
        for (int i = 0; i < palabra.length(); i++) {
            listaLetras.add(new Letra(palabra.charAt(i), false));
        }
        palabra = null;
        letrasIngr= new ArrayList<>();
        estadoDelJuego=null;
    }

    
    public void cargarLetra() {
        if (intentos >= 1 && !comprobarJuegoResuelto()) {
            letrasIngr.add(letra);
            if (!buscarLetra()) {
                intentos--;
            }
        }
        comprobarEstadoDelJuego();
        letra = 0;
    }

    public boolean buscarLetra() {
        boolean encontro = false;
        for (Letra let : listaLetras) {
            if (let.getLetra() == letra) {
                let.setEstado(true);
                encontro = true;
            }
        }
        return encontro;
    }

    public letrasBean(List<Letra> listaLetras, char letra, List<Character> letrasIngr) {
        this.listaLetras = listaLetras;
        this.letra = letra;
        this.letrasIngr = letrasIngr;
    }

    public List<Letra> getListaLetras() {
        return listaLetras;
    }

    public void setListaLetras(List<Letra> listaLetras) {
        this.listaLetras = listaLetras;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public List<Character> getLetrasIngr() {
        return letrasIngr;
    }

    public void setLetrasIngr(List<Character> letrasIngr) {
        this.letrasIngr = letrasIngr;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getEstadoDelJuego() {
        return estadoDelJuego;
    }

    public void setEstadoDelJuego(String estadoDelJuego) {
        this.estadoDelJuego = estadoDelJuego;
    }

    
}
