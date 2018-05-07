
package punto5.beans;


import punto5.dominio.Profesor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class ProfesorBeanForms implements Serializable{
private Profesor profesor = new Profesor();   
private  List <Profesor> listaProfesor;

 public void agregarProfesor(){
    listaProfesor.add(profesor);
    
    profesor = new Profesor();
   
}

    public ProfesorBeanForms() {
        
        listaProfesor = new ArrayList();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Profesor> getListaProfesor() {
        return listaProfesor;
    }

    public void setListaProfesor(List<Profesor> listaProfesor) {
        this.listaProfesor = listaProfesor;
    }


      
  
   
}
