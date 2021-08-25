/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author stefanymedina
 */
public class TestGenerico {
    public static void main(String[] args) {
        ClaseGenerica<Integer> numero = new ClaseGenerica(15);
        numero.obtenerTipo();
        
        ClaseGenerica<String> cadena = new ClaseGenerica("Hola Mundo");
        cadena.obtenerTipo();
        
    }
}
