/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.aplicacion.controlador.beans.forms;


import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import punto8.aplicacion.modelo.dominio.Libro;
import punto8.aplicacion.modelo.dominio.ListaDeLibro;

/**
 *
 * @author pc1
 */
@ManagedBean
@ViewScoped
public class BuscarLibroFormBean implements Serializable{
    private ListaDeLibro objLista = new ListaDeLibro();
    private String buscado;
    private String isbn;
    private String titulo;
    private String autor;
    private float precio;
    
    public BuscarLibroFormBean() {
    }
    public void registrarLibro(){
      Libro objLibro = new Libro(isbn,titulo,autor,precio);
      objLista.cargarListaDeLibro(objLibro);
    }
   public void buscarLibro(){
    if(objLista.buscarLibroPorTitulo(buscado).size()== 0)
     {
        FacesMessage mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Libro no encontrado","Libro no encontrado");
        FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.addMessage(null, mensaje);  
       
       
     }
     
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

    public String getBuscado() {
        return buscado;
    }

    public void setBuscado(String buscado) {
        this.buscado = buscado;
    }

   

   
    
    
}
