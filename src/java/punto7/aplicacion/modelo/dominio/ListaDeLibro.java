/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion.modelo.dominio;


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
    /*public void buscarLibroPorTitulo(String titulo){
        System.out.println("Libros Encontrado con el Titulo:");
        for (Libro libro : listaDeLibro) {
            if (libro.getTitulo().equals(titulo)) {
                System.out.println("ISBN: "+libro.getIsbn());
                System.out.println("Titulo: "+libro.getTitulo());
                System.out.println("Autor: "+libro.getAutor());
                System.out.println("Precio: "+libro.getPrecio());
            }
        }
    }*/
    
    public ArrayList<Libro> getListaDeLibro() {
        return listaDeLibro;
    }

    public void setListaDeLibro(ArrayList<Libro> listaDeLibro) {
        this.listaDeLibro = listaDeLibro;
    }
    
    
}
