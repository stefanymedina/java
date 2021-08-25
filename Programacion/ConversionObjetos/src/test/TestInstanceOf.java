/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Domain.Empleado;
import Domain.Gerente;

/**
 *
 * @author stefanymedina
 */
public class TestInstanceOf {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Stefany", 200, "Development Group");
        //System.out.println("Informacion empl = " + g1.mostrarInfo()); // se muestra el metodo sobrescrito

        Empleado empleado1 = new Empleado("Carolina", 2000);
        imprimir(empleado1);

        empleado1 = new Gerente("Stefany", 5000, "System");
        imprimir(empleado1);

    }
    
    // instance of nos ayuda a determinar si un objeto pertenece a determinada clase 
    public static void imprimir(Empleado empleado) {
        if (empleado instanceof Gerente){  // se debe ir de el tipo mas especifico
            System.out.println("Tipo Gerente");
            Gerente gerente = (Gerente)empleado; // de esta manera estamos convirtiendo la variable de tipo empleado a gerente y  con ello poder acceder a los metodos de la clase hija 
            System.out.println("gerente:" + gerente.getDepartamento() );
        }else if (empleado instanceof Empleado ){ // en este caso no podemos realizar lo mismo debido a que es la case padre y no podemos convertila en una clase hija a nivel de compliación no generara error pero en tiempo de ejecución si
            System.out.println("Tipo Empleado"); // por ende podemos acceder a los metodos de la clase padre sin problemas pero no a los de clase hija
        }else if (empleado instanceof Object){
            System.out.println("Tipo Object"); // al mas generico
        }
    }
}
