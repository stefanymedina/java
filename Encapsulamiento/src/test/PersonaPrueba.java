/**
 *
 * @author stefanymedina
 */
package test;

import domino.Persona;
        
        
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Stefany", 15000, false);
        System.out.println(persona1.getNombre());
        persona1.setSueldo(20300);
        System.out.println(persona1.getSueldo());
        System.out.println("esta eliminado: " + persona1.isEliminado());
        
        //con el metodo creado en la casle persona tostrgin se imprime todos los atributos de la persona
        // ademas con dicho metodo creago no es necesario llamar al mismo es decir persona1.toString si no solo imprimiendo el objeto lo imoprimira asi
        
        System.out.println("persona1 = " + persona1);
        
    }
}
