/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Dias;

/**
 *
 * @author stefanymedina
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia dos de la semana  = " + Dias.MARTES );
        indicarDiaSemana(Dias.MARTES);
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
             case LUNES:
                 System.out.println("primer dia de la semana");
                break;
             case MARTES:
                  System.out.println("segundo dia de la semana");
                break;
        }
           
                    
    }
}
