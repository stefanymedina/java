/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

/**
 *
 * @author stefanymedina
 */
public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("Elige la opción: \n 1. - Iniciar catalogo peliculas \n 2. - Agregar pelicula \n 3. - Listar peliculas \n 4. - Buscar Pelicula \n 0. - Salir");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Iniciar catalogo, Ingrese nombre archivo");
                    catalogo.iniciarCatalogoPelicula();

                    break;

                case 2:
                    System.out.println("Agregar Pelicula");
                    System.out.println("Ingrese Nombre de Pelicula: ");
                    String nombrePeli = teclado.nextLine();
                    catalogo.agregarPelicula(nombrePeli);
                    break;

                case 3:
                    catalogo.listarPelicula();
                    break;
                case 4:
                    System.out.println("Buscar Pelicula");
                    System.out.println("Ingrese Nombre de Pelicula: ");
                    var nombreP = teclado.nextLine();
                    catalogo.buscarPelicula(nombreP);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el catalogo");
                    break;
                default:
                    System.out.println("Opción no reconocida");
                    break;

            }
        }

    }
}
