/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4b.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Pc-Yo
 */
public class Palabra implements Serializable{
    private String palabraOcilta;
    private int intentosRestantes;
    private char letra;

    public Palabra() {
        this.intentosRestantes = 5;
    }

    public Palabra(String palabraOcilta, char letra) {
        this.palabraOcilta = palabraOcilta;
        this.intentosRestantes = 5;
        this.letra = letra;
    }
    
     public void restarIntento(){
        intentosRestantes--;
    }

    public String getPalabraOcilta() {
        return palabraOcilta;
    }

    public void setPalabraOcilta(String palabraOcilta) {
        this.palabraOcilta = palabraOcilta;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
}
