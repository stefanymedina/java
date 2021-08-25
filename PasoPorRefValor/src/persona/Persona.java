/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author stefanymedina
 */
public class Persona {

    public String nombre; // esto no es buena practica es solo pra hacer las pruebas de paso por referencia
    public String apellido;

    
    public void monstrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("apellido :" + apellido);
    }
    


}
