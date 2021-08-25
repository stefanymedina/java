
package test;

import aritmetica.Aritmetica;
import exccpvi.OperacionExecpcion;


public class TestExecption {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = Aritmetica.division(10, 0);
        }
        catch(OperacionExecpcion e){ // se recomienda ejecutar las exepciones de menor jerarquia
            System.out.println("Ocurrion un error de tipo Operacion Excepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            // e.printStackTrace(System.out); podemos mandar toda la pila de excepciones o solo el mensaje:
            System.out.println("Ocurrion un error de tipo Excepcion");
            System.out.println(e.getMessage());
            
        }
        finally{ // lo podemos utilizar para finalizar cualquier recurso ya que siempre se va a ejecutar
            System.out.println("Se finalizo la division por cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
