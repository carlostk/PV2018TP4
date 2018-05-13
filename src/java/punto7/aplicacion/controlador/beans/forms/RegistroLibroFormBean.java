/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion.controlador.beans.forms;


import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import punto7.aplicacion.modelo.dominio.Libro;
import punto7.aplicacion.modelo.dominio.ListaDeLibro;

/**
 *
 * @author pc1
 */
@ManagedBean
@ViewScoped
public class RegistroLibroFormBean {
    ListaDeLibro objLista = new ListaDeLibro();
    
    private String isbn;
    private String titulo;
    private String autor;
    private float precio;
    public RegistroLibroFormBean() {
    }
    public void registrarLibro(){
      
      Libro objLibro = new Libro(isbn,titulo,autor,precio);
      objLista.cargarListaDeLibro(objLibro);
    }
   

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ListaDeLibro getObjLista() {
        return objLista;
    }

    public void setObjLista(ListaDeLibro objLista) {
        this.objLista = objLista;
    }
    
}
