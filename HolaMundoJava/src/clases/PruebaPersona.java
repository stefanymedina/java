/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author stefanymedina
 */
public class PruebaPersona{    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Stefany";
        persona1.apellido = "Medina";
        persona1.desplegarInfo();
        
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1); // el numero que se impre al final es el numero de la posición en la memoria que se ecuentra nuestro objeto
        System.out.println("persona2 = " + persona2);
        
        persona2.desplegarInfo();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInfo();
    }
}
