
package test;

import java.util.*;

/**
 *
 * @author stefanymedina
 */
public class TestColeccionesGenericas {
    public static void main(String[] args) {
            // cuando trabajamos con api coleccioones y generic debemos indicar el tipo de dato que utilizarmoes asi:
            List<String> myLista = new ArrayList(); // cuando se crea un objeto de tipo lista, esta mantiene el ordene en que se agregan los elementos
            //myLista.add(1); aqui ya no puedo llenar el arry list con cualquier tipo de dato
            myLista.add("Martes");
            myLista.add("Miercoles");
            myLista.add("Jueves");
            myLista.add("Viernes");
            myLista.add("Viernes"); // se pueden repetir elementos
            //System.out.println("myLista = " + myLista.get(0));
            //imprimir(myLista);
            
            Set<String> miSet = new HashSet<>();// cuando se crea un objeto de tipo Set, este NO mantiene el ordene en que se agregan los elementos, pero es mas rapido por lo mismo
            miSet.add("Lunes");
            miSet.add("Martes");
            miSet.add("Miercoles");
            miSet.add("Jueves");
            miSet.add("Viernes");
            miSet.add("Viernes"); // No se repite loselementos 
            //imprimir(miSet);
//            System.out.println("myLista = " + myLista.get(0));
//            imprimir(miSet);
            
           //List y Set herena de la interfaz collection
            
            Map<String, String> miMap = new HashMap<>();
            miMap.put("valor1", "Juan"); // los mapas funciona con clave valor 
            miMap.put("valor2", "Pedro");
            miMap.put("valor3", "Daniel");
            miMap.put("valor3", "Diego"); // sustitute el ultimo valor ingresado en la llave valor3
            // aca no es necesario hacer conversion de tipo String ya que estamos indicando que vamos a trabajar con elementos de tipo String
            String elementoMapa = miMap.get("valor1");
            //System.out.println("elementoMapa = " + elementoMapa);
            imprimir(miMap.keySet());
            imprimir(miMap.values());
            
            
         
           // imprimir(miMap.keySet());
           // imprimir(miMap.values());
    
    
    }
    // creamos un metodo mas generico y aplicamos polimorfismo
    public static void imprimir(Collection<String> coleccion){ // tambien podemos indicar que trabaje solo con colecciones que soporten elementos de tipo string si queremos que sea mas especifico
        coleccion.forEach(elemento->{
        System.out.println("elemento = " + elemento);
        });
        
    }
    

}
