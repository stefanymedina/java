package test;

import Domain.Persona;
import java.util.Random;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        Random rand = new Random();
        int maxValue = 25;
        int int_random = rand.nextInt(maxValue);

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                edades[i][j] = rand.nextInt(maxValue);
            }
        }

        imprimir(edades);
         
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora", "pera"}};
        imprimir(frutas);
       
         
         Persona personas[][] = new Persona[2][3];
         personas[0][0] = new Persona("stefany");
         personas[0][1] = new Persona("caro");
         imprimir(personas);
         
    
}
    
    public static void imprimir(Object matriz[][]){
      for (int i = 0; i < matriz.length; i++) {
            System.out.println("fila: " + i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Col = " + j + ": " + matriz[i][j]);
            }
            System.out.println("\n");
        }
    }
    
       
    public static void imprimir(int matriz[][]){
      for (int i = 0; i < matriz.length; i++) {
            System.out.println("fila: " + i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Col = " + j + ": " + matriz[i][j]);
            }
            System.out.println("\n");
        }
    }

}