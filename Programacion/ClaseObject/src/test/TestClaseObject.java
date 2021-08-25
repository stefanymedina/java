
package test;

import Domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Stefany", 2000);
        Empleado empleado2 = new Empleado("Stefany", 3000);
        
        
        if (empleado1 == empleado2) {
            System.out.println("los objetos son iguales en memoria");
        }else{
            System.out.println("Los objetos son diferentes en memoria ");
        }
        
        if (empleado1.equals(empleado2)) {
            System.out.println("los objetos son iguales en contenido");
        }else{
            System.out.println("los objetos No son iguales en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor hascode es igual"); 
        }else{
            System.out.println("el valor hascode es diferente");
        }
    }
}
