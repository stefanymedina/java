 
package test;

import domain.Persona;


public class TestFinal {
    public static void main(String[] args) {
        final int miVar = 6;
        //miVar= 8; una vez una variable es declarada como final no se puede
        //cambiar los valores
        System.out.println("miVar = " + miVar);
        
        // Persona.MY_CONSTANTE = 4; como es una variable declarada como final no podemos cambiar su valor
        System.out.println("My constante = " + Persona.MY_CONSTANTE);
        
        final Persona personaUno = new Persona();
        //personaUno = new Persona(); no se le puede asignar una nueva referencia a este obejto ya que se esta declarado como final
        personaUno.setNombre("amalia");
        System.out.println("personaUno = " + personaUno.getNombre());
        personaUno.setNombre("Carlos");
        System.out.println("personaUno = " + personaUno.getNombre()); // podemos modificar su contenido mas no la referencia al objeto al que esta apuntando 
        
       
        
    }
}
