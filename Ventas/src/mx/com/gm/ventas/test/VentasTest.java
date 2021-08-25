/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.*;

/**
 *
 * @author stefanymedina
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto productoUno = new Producto("lapiz", 200);
        Producto productoDos = new Producto("borra", 100);
        Orden orden1 = new Orden();
        orden1.agregarProducto(productoUno);
        orden1.agregarProducto(productoDos);
        orden1.mostrarOrden();
        //System.out.println("orden1 = " + orden1);

        System.out.println(Byte.MAX_VALUE);
        
        
        
    }
}
