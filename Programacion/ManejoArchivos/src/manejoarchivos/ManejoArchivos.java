

package manejoarchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ManejoArchivos {
   public static void crearArchivo(String nombreArchivo){
       File archivo = new File(nombreArchivo);
       try {
           PrintWriter salida = new PrintWriter(archivo); // cuando se crea un objeto de tipo PrintWriter el constructor de la clase puede arrojar una excepcion por lo qu edebemo envolverla en un bloque try catch
           salida.close(); // se cierra el archivo 
           System.out.println("Se ha creado el archivo ");
       } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
       }
       
   }
   public static void escribirArchivo(String nombreArchivo, String contenido){
          File archivo = new File(nombreArchivo);
       try {
           PrintWriter salida = new PrintWriter(archivo); // cuando se crea un objeto de tipo PrintWriter el constructor de la clase puede arrojar una excepcion por lo qu edebemo envolverla en un bloque try catch
           salida.println(contenido);
           salida.close(); // se cierra el archivo 
           System.out.println("Se ha cargado informacion en el archivo ");
       } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
       }
   }
   
      public static void anexarArchivo(String nombreArchivo, String contenido){
          File archivo = new File(nombreArchivo);
       try { // no sobre escribimos si no que anexamos informacion en el archivo 
           PrintWriter salida = new PrintWriter(new FileWriter(archivo, true)); // cuando se crea un objeto de tipo PrintWriter y File writer el constructor de la clase puede arrojar una excepcion por lo qu edebemo envolverla en un bloque try catch
           salida.println(contenido);
           salida.close(); // se cierra el archivo 
           System.out.println("Se ha anexado informacion en el archivo ");
       } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
       } catch (IOException ex) {
           ex.printStackTrace(System.out);
       }
   }
      
      public static void leerArchivo(String nombreArchivo){
          var archivo = new File(nombreArchivo);
       try {
           var entrada = new BufferedReader(new FileReader(archivo)); // buffer es para leer lineas completas del archivo
           var lectura = entrada.readLine();
           while(lectura != null){
               System.out.println("lectura = " + lectura);
               lectura = entrada.readLine();
           }
           entrada.close();
       } catch (FileNotFoundException ex) {
           ex.printStackTrace(System.out);
       } catch (IOException ex) {
           ex.printStackTrace(System.out);
       }
          
      }
    
}
