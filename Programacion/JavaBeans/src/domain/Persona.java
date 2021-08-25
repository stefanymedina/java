
package domain;

//debe cumplir ciertas caracteristicas 

import java.io.Serializable;

// constructor vacio
// atributos privados debe tener metodo get y set
//implementar una interfaz serializable
public class Persona implements Serializable{ // serializable significa que estamos convirtiendo nuestro objeto de ceros a 1
    private String nombre;
    private String apellido;
    
    
    public Persona(){
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
}
