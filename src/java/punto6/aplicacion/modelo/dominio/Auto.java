/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion.modelo.dominio;

import java.util.Scanner;

/**
 *
 * @carlos
 */
public class Auto {

    private String patente;
    private String marca;
    private String color;
    private int modelo;
    private String tipoDeConbustible;

    public Auto() {
    }

    public Auto(String patente, String marca, String color, int modelo, String TipoDeConbustible) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.tipoDeConbustible = TipoDeConbustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipoDeConbustible() {
        return tipoDeConbustible;
    }

    public void setTipoDeConbustible(String tipoDeConbustible) {
        this.tipoDeConbustible = tipoDeConbustible;
    }

}
