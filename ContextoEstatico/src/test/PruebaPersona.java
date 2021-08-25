package test;

import domain.Persona;

/**
 *
 * @author stefanymedina
 */
public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("stefany");
        imprimir(persona1);
        persona1.setNombre("claudia");
        imprimir(persona1);
        Persona persona2 = new Persona("carlos");
        imprimir(persona2);
        Persona persona3 = new Persona("Pedro");
        imprimir(persona3);
        
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}
