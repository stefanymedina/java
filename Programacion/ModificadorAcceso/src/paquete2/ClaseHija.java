/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase2;

/**
 *
 * @author stefanymedina
 */
public class ClaseHija extends Clase2 {
    
    public ClaseHija(){
        super();
        this.varProtected = "var protected desde clase hijacd"; // se puede acceder al atributo protected desde una clase hija
        System.out.println("var protected desde caalseHija = " + this.varProtected);
        this.muestraInfo();
    }
    
}
