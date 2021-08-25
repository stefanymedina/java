
package test;

import Domain.*;

public class TestFigura {
    public static void main(String[] args) {
        //FiguraGeometrica f1 = new FiguraGeometrica("rectangulo"); una calase declarada como abstracta no puede ser instanciada pero si se puee heredar 
        
        //Aplicamos polomorfismo - upcasting aplicando un tipo hijo a un tipo padre 
        FiguraGeometrica r1 = new Rectangulo("rec");
        // se utiliza el metodo de menor jerarquia igual no podriamos utilizar el de la clase padre por ser abstracto
        r1.imprimir();
        
       
    }
}
