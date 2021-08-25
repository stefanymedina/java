/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEX;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

/**
 *
 * @author stefanymedina
 */
public class AccesoDatosImpl implements AccesoDatos {

    @Override
    public boolean existe(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);

        List<Pelicula> peliculas = new ArrayList();

        try {
            var entrada = new BufferedReader(new FileReader(archivo)); // buffer es para leer lineas completas del archivo
            var lectura = entrada.readLine();
            while (lectura != null) {
                peliculas.add(new Pelicula(lectura));
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("excepcion al listar archivo ");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("excepcion al listar archivo ");
        }

        return peliculas;

    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEX {
        var archivo = new File(nombreArchivo);
        try { // no sobre escribimos si no que anexamos informacion en el archivo 
            var salida = new PrintWriter(new FileWriter(archivo, anexar)); // cuando se crea un objeto de tipo PrintWriter y File writer el constructor de la clase puede arrojar una excepcion por lo qu edebemo envolverla en un bloque try catch
            salida.println(pelicula.toString());
            salida.close(); // se cierra el archivo 
            System.out.println("Se ha escrito informacion en el archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEX("Excepcion al Escribir en archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEX("Excepcion al Escribir en archivo");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        String foundFile = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo)); // buffer es para leer lineas completas del archivo
            var lectura = entrada.readLine();
            var indice = 1;
            while (lectura != null) {
                if (lectura != null && buscar.equalsIgnoreCase(lectura)) {
                    foundFile = "Pelicula"+ buscar +"encontrada en la linea"+ indice;
                    break;
                } else {
                    foundFile = "Pelicula"+ buscar +"NO encontrada en la linea";
                }
                lectura = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("excepcion al buscar archivo " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("excepcion al buscar archivo " + ex.getMessage());
        }
        return foundFile;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo); // cuando se crea un objeto de tipo PrintWriter el constructor de la clase puede arrojar una excepcion por lo qu edebemo envolverla en un bloque try catch
            salida.close(); // se cierra el archivo 
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al Crear archivo" + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        if(archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo");
        
    }

}
