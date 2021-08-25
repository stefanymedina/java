
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefanymedina
 */
public class Operadorternario {
    public static void main(String args[]){
        var resul = (4 > 2) ? "verdadero" : "falsa";
        System.out.println("resul = " + resul);
        
        
        System.out.println("Ingrese un numero para validar si es par");
        Scanner consola = new Scanner(System.in);
        var numero = consola.nextInt();
        var resultado = ( numero % 2 == 0 ) ? "Número es par" : "Número es impar";
        System.out.println("resultado = " + resultado);
    }
}
