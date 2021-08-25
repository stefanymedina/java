/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import exccpvi.OperacionExecpcion;

/**
 *
 * @author stefanymedina
 */
public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExecpcion{ // en la firma del metodo se debe infromar que posiblemente arroje un metodo e indicar el tipo de exepcion
        if(denominador == 0){
            throw new OperacionExecpcion("Division por cero");
        }
        
        return numerador/denominador;
    }
}
