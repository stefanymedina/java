/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author stefanymedina
 */
public class TestManejoPersona {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        
        //Insertar una nueva persona  
//        Persona persona = new Persona("Andres", "Carrasco", "ccarras@gmail.com", "315654334");
//        int numPersonas = personaDao.insertar(persona);
//        System.out.println(" se han insertado = " + numPersonas);
        
        
       List<Persona> personas = personaDao.seleccionar();
        for(Persona personaB: personas){
            System.out.println("persona = " + personaB);
        }
        
        personaDao.eliminar(2);
        
        personaDao.actualizar(1, "Federico","Díaz","f@gamil.com", "2345224");
    }
}
