
package persona;

/**
 *
 * @author stefanymedina
 */
public class PruebaPersona {
    public static void main(String[] args) {
          Persona persona1 = new Persona();
          persona1.nombre = "lola";
          persona1.apellido =  "bracho";
          persona1.monstrarPersona();
          cambiaPersona(persona1); // cuando llamo al metdo le estoy pasando la referencia del objeto por lo que se cambiara el valor a diferencia de los tipos primitivos
          persona1.monstrarPersona();
         
    }
    public static void cambiaPersona(Persona persona){
        persona.nombre = "stef";
    }
    
    
}
