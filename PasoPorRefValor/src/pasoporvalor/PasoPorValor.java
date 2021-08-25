/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author stefanymedina
 */
public class PasoPorValor {
    public static void main(String[] args) {
         var x = 10;
         
         cambiaValor(x); // solo se pasa una copia del valor a otros metodos mas no se puede cambiar en otro metodo
         System.out.println("x = " + x);
    }
    
    public static void cambiaValor(int valor){
        System.out.println("valor = " + valor); 
        valor = 15;
        
    }
    
}
