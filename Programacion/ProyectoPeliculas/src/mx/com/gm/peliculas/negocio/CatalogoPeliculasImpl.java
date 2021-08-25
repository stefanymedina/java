/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

import java.io.*;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author stefanymedina
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas {

    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = this.datos.existe(NOMBRE_ARCHIVO);
            try {
                PrintWriter salida = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO, true));
                salida.println(pelicula.toString());
                salida.close(); // se cierra el archivo 
                System.out.println("Se ha ingresado la pelicula");
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
                System.out.println("Error al escribir en archivo");
            }
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace();
            System.out.println("Error de acceso a datos");
        }
    }

    @Override
    public void listarPelicula() {
        try {
            var peliculas = this.datos.listar(NOMBRE_ARCHIVO);
            for (var pelicula : peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al imprimir lista");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String pelicula = null;
        try {
            pelicula = this.datos.buscar(NOMBRE_ARCHIVO, buscar);

        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar pelicula");
            ex.printStackTrace(System.out);
        }

        System.out.println("pelicula = " + pelicula);

    }

    @Override
    public void iniciarCatalogoPelicula() {
        try {
            if (this.datos.existe(NOMBRE_ARCHIVO)) {
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);
            } else {
                try {
                    this.datos.crear(NOMBRE_ARCHIVO);
                    System.out.println("Archivo Creado");
                } catch (AccesoDatosEx ex) {
                    System.out.println("Error al iniciar catalogo");
                    ex.printStackTrace(System.out);
                }
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de pelicula");
            ex.printStackTrace(System.out);
        }

    }

}
