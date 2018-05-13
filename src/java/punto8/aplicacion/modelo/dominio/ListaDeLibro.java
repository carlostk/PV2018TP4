/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.aplicacion.modelo.dominio;


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ListaDeLibro implements Serializable{
    ArrayList<Libro> listaDeLibro = new ArrayList<>();
     ArrayList<Libro> listaAuxiliarDeLibro = new ArrayList<>();
    public ListaDeLibro() {
    }

    public void cargarListaDeLibro(Libro libro){
        listaDeLibro=listaAuxiliarDeLibro;
        listaDeLibro.add(libro);
        listaAuxiliarDeLibro=listaDeLibro;
        }
   
   
    // PUNTO 9
   public ArrayList<Libro> buscarLibroPorTitulo(String buscado){
        
       ArrayList<Libro> librosAuxiliar = new ArrayList<>();
        
        for (Libro libro : listaAuxiliarDeLibro) {
            if (libro.getAutor().equals(buscado)) {
              
              librosAuxiliar.add(libro);
              
            }
          
        }
        listaDeLibro=librosAuxiliar;
        return listaDeLibro;
    }
    
    public ArrayList<Libro> getListaDeLibro() {
        return listaDeLibro;
    }

    public void setListaDeLibro(ArrayList<Libro> listaDeLibro) {
        this.listaDeLibro = listaDeLibro;
    }

    public ArrayList<Libro> getListaAuxiliarDeLibro() {
        return listaAuxiliarDeLibro;
    }

    public void setListaAuxiliarDeLibro(ArrayList<Libro> listaAuxiliarDeLibro) {
        this.listaAuxiliarDeLibro = listaAuxiliarDeLibro;
    }
    
    
}
