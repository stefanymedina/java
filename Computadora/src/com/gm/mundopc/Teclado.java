/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author stefanymedina
 */
public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = Teclado.contadorTeclado++;
    }

    public int getIdTeclado() {
        return this.idTeclado;
    }
    
    public static int getContadorTeclado() {
        return Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    

    
    
    


}
