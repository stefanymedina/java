/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.gm.mundopc.*;


public class MondoPC {
    public static void main(String[] args) {
        Orden orden1= new Orden();
        Monitor m1 = new Monitor("dell", 25.4);
        Teclado t1 = new Teclado("hdmi", "dell");
        Raton r1 = new Raton("usb", "hp");
        Computadora pc1 = new Computadora("HP", m1, t1, r1);
        Computadora pc2 = new Computadora("HP", m1, t1, r1);
        
        orden1.agregarComputadora(pc1);
         orden1.agregarComputadora(pc2);
        orden1.mostrarOrden();
        
    }
}
