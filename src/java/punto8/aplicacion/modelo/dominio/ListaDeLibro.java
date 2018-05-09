/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.aplicacion.modelo.dominio;


import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ListaDeLibro {
    ArrayList<Libro> listaDeLibro = new ArrayList<>();

    public ListaDeLibro() {
    }

    public void cargarListaDeLibro(Libro libro){
        listaDeLibro.add(libro);
        
        }
   
   
    // PUNTO 9
   public Libro buscarLibroPorTitulo(String buscado){
        Libro li = new Libro();
        for (Libro libro : listaDeLibro) {
            if (libro.getTitulo().equals(buscado)) {
              li=libro; 
            }
          
        }
        return li;
    }
    
    public ArrayList<Libro> getListaDeLibro() {
        return listaDeLibro;
    }

    public void setListaDeLibro(ArrayList<Libro> listaDeLibro) {
        this.listaDeLibro = listaDeLibro;
    }
    
    
}
