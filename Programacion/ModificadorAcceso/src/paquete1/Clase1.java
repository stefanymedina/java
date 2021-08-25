
package paquete1;
/* los modificadores de acceso 
-public -private(no aplica para clases) -default -protected (no aplica para clases)
  
*/


// modificador de acceso public
public class Clase1{
    public int atributoPublico = 10; //atributo publico para pruebas
    
    public Clase1(){
        System.out.println("prueba de constructor público : ");
    }
    
    public void mostrarMenasaje(){
        System.out.println("metodo publico");
    }
}
