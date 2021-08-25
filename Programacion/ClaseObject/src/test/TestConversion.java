
package test;

import Domain.*;


public class TestConversion {
    public static void main(String[] args) {
        Empleado empleado1;
        
        empleado1 = new Escritor("stefany", 2000, TipoEscritura.CLASICA);
        //System.out.println("empleado1 = " + empleado1);
        System.out.println(empleado1.mostrarInfo());
        
        // conversion de objetos
        //empleado1.getTipoEscritura(); esto nos genera error ya que estamos tratando de utilizar una variable definida como tipo padre y con ella obtener un metodo de una clase hija
        // por lo que debemos hacer lo siguiente:
        
        // aca realizamos la conversion para poder obtener el metodo tipo de escritura de la clase hiija 
        
        // Downcasting - conversion de la clase padre a la clase hija 
        //((Escritor)empleado1).getTipoEscritura(); 
        //System.out.println(((Escritor)empleado1).getTipoEscritura()); // imprimimos
        Escritor escritor = (Escritor)empleado1; 
        escritor.getTipoEscritura(); // es el mismo procedimiento de arriba pero en dos lienas
        
        
        //upcasting
        Empleado empleado2 = escritor; // conversion de clase hija a clase padre
        
    }
}
