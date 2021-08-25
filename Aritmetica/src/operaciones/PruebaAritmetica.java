package operaciones;

import java.util.Scanner;

/**
 *
 * @author stefanymedina
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica operacion1 = new Aritmetica();
        operacion1.a = 1;
        operacion1.b = 2;
        operacion1.sumar();
        
        /*
        int resultado = operacion1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        System.out.println("Ingrese el primer valor a sumar");
        Scanner consola = new Scanner(System.in);
        int arg1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo valor a sumar");
        int arg2 = Integer.parseInt(consola.nextLine());
        
        int res2 = operacion1.sumarConArg(arg1, arg2);
        System.out.println("res2 = "+ res2);
        
        */
        
        Aritmetica artit1 = new Aritmetica(2, 4); // se guarda a referencia del objeto en la memoria heap
        
        System.out.println("artit1 valor 1 = " + artit1.a);
        System.out.println("artit1 valor 2= " + artit1.b);
        
    }
    
    
}
