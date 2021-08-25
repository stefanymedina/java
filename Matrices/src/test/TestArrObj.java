
package test;

import Domain.Persona;

public class TestArrObj {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("stefany");
        personas[1] = new Persona("carolina");
        /*System.out.println("personas = " + personas[0]);
        System.out.println("personas = " + personas[1]);*/
        
       for (int d= 0; d < personas.length; d++){
           System.out.println(personas[d]);
       
       }
        
       
       String frutas[] = {"manzana", "pera", "uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta i"+ i + ":" + frutas[i]);
        }
        
        
    }
}
