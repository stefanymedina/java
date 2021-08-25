/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author stefanymedina
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersona; // esto tiene que ver con el contexto statico es decir se asocian con la clase y no con los objetos 
    
    public Persona(String nombre){
        this.nombre = nombre; // this se utiliza para atributos que no son estaticos
        Persona.contadorPersona++; // se antepone el nombre de nuestra clase para los atributos que son estaticos
        this.idPersona = Persona.contadorPersona; // es por ello que aqui se llama Persona.contadorPersona (NombreClase.atributoEstatico)se esta asociando con la clase 
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorpersona() {
        return contadorPersona;
    }

    public static void setContadorpersona(int contadorpersona) {
        Persona.contadorPersona = contadorpersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }


    
    
    
}
