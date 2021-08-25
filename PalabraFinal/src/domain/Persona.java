/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author stefanymedina
 */
public /*final*/ class Persona { // si dejamos el modificador de acceso final no podremos tener clases hijas
    public final static int MY_CONSTANTE =1; // cuando declaramos una variable como static ,final y ademas public estamos declarando una constatane   
    
    private String nombre;
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public final void imprimir(){
        System.out.println("metodo imprimir");
    }

 
}
