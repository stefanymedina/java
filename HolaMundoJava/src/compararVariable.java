/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefanymedina
 */
public class compararVariable {
    public static void main(String args[]){
        var nombreUno = "teo";
        var nombreDos =  "tef";
        var res = nombreUno.equals(nombreDos); //compara contenido
        System.out.println("res = " + res);
        
        var restest = nombreUno == nombreDos; // compara referencia de objeto
        System.out.println("restest = " + restest);
    }
}
