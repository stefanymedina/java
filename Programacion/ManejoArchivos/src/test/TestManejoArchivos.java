/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author stefanymedina
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "/Users/stefanymedina/Documents/estudio/Java/Programacion/ManejoArchivos/test/prueba.txt";
        crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo, "Hola mundo dentro de un archivo"); sobre escribe la informacion 
        //anexarArchivo(nombreArchivo, "Hola mundo dentro de un archivo anexando info"); // agrega informacion al archivo 
        //leerArchivo(nombreArchivo);
    }
}
