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
public class TestSobreescritura {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Stefany", 200, "Development Group");
        //System.out.println("Informacion empl = " + g1.mostrarInfo()); // se muestra el metodo sobrescrito

        
        Empleado empleado1 = new Empleado("Carolina", 2000);
        //System.out.println("empleado1 info = " + empleado1.mostrarInfo());
        imprimir(empleado1);
        
        Gerente gerente1 = new Gerente("Stefany", 5000, "System");
        //System.out.println("gerente1 info = " + gerente1.mostrarInfo());
        imprimir(gerente1);
        
        

    }
    
    /*polimorfismo 
    El polimorfismo es una característica de la programación orientada a objetos que permite llamar 
    a métodos con igual nombre pero que pertenecen a clases distintas. por lo que es importante 
    que dichos metodos se llamen de igual forma en las clases, en el ejemplo que trabajamos las clases
    Empleado y gerente se llaman mostrarInfo
    
    el tipo de dato que se pasa como parametro al metodo en este caso imprimir debe ser de la clase padre
    si queremos imprmir objetos de este ultimo (Empleado) de lo contrario solo podremos imprimir de la clase hija 
    si por ejemplo en vez de pasar como parametro un ojeto de tipo Empleado pasamos de tipo Gerente 
    
    
    podemos definir una variable del tipo de la calase padre y asignarle un objeto de la clase hija 
    
    Empleado empleado1 = new Empleado("Carolina", 2000);
    empleado1 = new Gerente("Stefany", 5000, "System"); 
    
    */
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado :" + empleado.mostrarInfo());
    }
}
