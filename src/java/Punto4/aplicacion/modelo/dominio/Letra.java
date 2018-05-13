/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Pc-Yo Mobile
 */
public class Letra implements Serializable{
    private char letra;
    private boolean estado;

    public Letra() {
    }

    public Letra(char letra, boolean estado) {
        this.letra = letra;
        this.estado = estado;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
