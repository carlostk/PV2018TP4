
package punto5.dominio;

import java.io.Serializable;
import java.util.Date;

public class Profesor implements Serializable{
    private int legajo;
    private String nombre;
    private String apellido;
    private Date fechaRegistro;

    public Profesor() {
    }

    public Profesor(int legajo, String nombre, String apellido, Date fechaRegistro) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaRegistro = fechaRegistro;
    }

    

   

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Profesor{" + "legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido +   '}';
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

   
    
   
}
