
package test;

import Dominio.Operaciones;

public class TestSuma {
    public static void main(String[] args) {
        var resultado = Operaciones.Sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.Sumar(5.6, 5);
        System.out.println("resultado2 = " + resultado2);
    }
    
}
