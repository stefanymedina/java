
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {4, 7, 9}; // no es posible utilizar var cuando trabajamos con array ya q la inferencia de tipo no se aplica en arreglos
        
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        
        // var se puede utilizar para variables que sean de tipo primitivo u object pero no de tipo array
        Persona personas[] = {new Persona("Stefany"), new Persona("Carolina"), new Persona("Andres")};
        for (Persona persona: personas) {
            System.out.println("persona = " + persona);
        }
    }
}