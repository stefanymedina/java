/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.excepciones.*;

/**
 *
 * @author stefanymedina
 */
public interface CatalogoPeliculas {
    String NOMBRE_ARCHIVO = "peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String buscar);
    void iniciarCatalogoPelicula();
    
}
