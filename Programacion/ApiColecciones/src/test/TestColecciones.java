
package test;

import java.util.*;

/**
 *
 * @author stefanymedina
 */
public class TestColecciones {
    public static void main(String[] args) {
            List myLista = new ArrayList(); // cuando se crea un objeto de tipo lista, esta mantiene el ordene en que se agregan los elementos
            myLista.add("Lunes");
            myLista.add("Martes");
            myLista.add("Miercoles");
            myLista.add("Jueves");
            myLista.add("Viernes");
            myLista.add("Viernes"); // se pueden repetir elementos
            //imprimir(myLista);
            
            // se puede recorrer de las dos formas siguientes:
            /*
            for(Object elemnto: myLista){
                System.out.println("elemnto = " + elemnto);
            }
            
            myLista.forEach(elemento ->{
                System.out.println("elemento = " + elemento);
            });*/
            
            Set miSet = new HashSet();// cuando se crea un objeto de tipo Set, este NO mantiene el ordene en que se agregan los elementos, pero es mas rapido por lo mismo
            miSet.add("Lunes");
            miSet.add("Martes");
            miSet.add("Miercoles");
            miSet.add("Jueves");
            miSet.add("Viernes");
            miSet.add("Viernes"); // No se repite loselementos 
            //imprimir(miSet);
            
           //List y Set herena de la interfaz collection
            
            Map miMap = new HashMap();
            miMap.put("valor1", "Juan"); // los mapas funciona con clave valor 
            miMap.put("valor2", "Pedro");
            miMap.put("valor3", "Daniel");
            
            String elemento = (String) miMap.get("valor1"); //el metodo .get devuelve un objeto y como lo estoy guardadno en una viarble de tipo string lo debo de vconvertir  
            //System.out.println("elemento = " + elemento);
            // si quiero recorrer todos las  llaves del map 
            miMap.keySet(); // ya que esto devulve un set de todos las llaves en el map lo puedo imprimir con el metodo staitc imprimir que creamos
            imprimir(miMap.keySet());
            imprimir(miMap.values());
    
    
    }
    // creamos un metodo mas generico y aplicamos polimorfismo
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento->{
        System.out.println("elemento = " + elemento);
        });
        
    }
    

}
