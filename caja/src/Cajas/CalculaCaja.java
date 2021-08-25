/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajas;

/**
 *
 * @author stefanymedina
 */
public class CalculaCaja{
    
    public static void main(String[] args) {
       Caja inicia = new Caja();
       Caja cj1 = new Caja(3, 2, 6);
        System.out.println("el volumen de la caja es " + cj1.CalcularVolumen());
        
    
    }
}
