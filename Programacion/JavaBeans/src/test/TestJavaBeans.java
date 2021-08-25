
package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona1 = new Persona(); // el concepto de serialización se refiere a que estamos convirtiendo nuestro objeto a ceros y uno 
        
        persona1.setNombre("Stefany");
        persona1.setApellido("Medina");
        
        System.out.println("Persona = " + persona1);
        System.out.println("persona1 = " + persona1.getNombre());
        System.out.println("persona1 = " + persona1.getApellido());
    }
}
