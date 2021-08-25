
package test;

import paquete1.Clase1;

public class TestModificadoresAcceso {
    public static void  main(String[] args) {
        Clase1 c1 = new Clase1();
        System.out.println("c1 = " + c1); // valor en memoria del objeto creado
        System.out.println("c1 = " + c1.atributoPublico); // metodo publico
        c1.mostrarMenasaje();
    }
}
