
package bloquesinicializacion;

 
public class Persona {
    private final int idPersona;
    private static int contPersona;
    
    static{ //bloque de inicializacion static solo se ejecutara una vez cuando se cargue la clase
        System.out.println("Ejecución bloque estatico");
        ++Persona.contPersona; // por ende no se tiene acceso this 
                
    }
    { // bloque de incializacion dinamico cada vez que se cree un objeto se cargara
        System.out.println("Ejecución bloque dinamico");
        this.idPersona = Persona.contPersona++;
    
    }
    
   // el bloque estatico y dinamico se deben cargar antes de la ejecución del 
    // constructor
    
    public Persona(){
        System.out.println("Ejecucución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
