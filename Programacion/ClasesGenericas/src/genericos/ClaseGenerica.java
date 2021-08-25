
package genericos;

// las clases genericas no infdican el tipo de dato, si no hasta el momento en que se crea el objeto 

public class ClaseGenerica<T>{
    
    private T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es:" + objeto.getClass().getSimpleName());
    }
}

