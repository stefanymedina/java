
package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contOrdenes;
    private int contComp;
    private final static int MAX_COMPUTADORAS = 5;
    
    public Orden(){
     this.idOrden = ++Orden.contOrdenes;
     this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contComp < Orden.MAX_COMPUTADORAS){
            computadoras[this.contComp++]= computadora;
        }else{
            System.out.println("exedio el valor maximo de computadoras permitidas");
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Numero de Orden = " + idOrden);
        for (int i = 0; i < this.contComp; i++) {
            System.out.println(this.computadoras[i]);
        }
        

    }

}
