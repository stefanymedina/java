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
public class Caja {
    int ancho;
    int profundo;
    int alto;
    
    public Caja(){
        System.out.println("inciando constructor de caja ");
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int CalcularVolumen(){
    return this.ancho * this.alto * this.profundo ;
    
    }
    
}
