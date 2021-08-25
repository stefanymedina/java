
import java.util.Scanner;

/**
 *
 * @author stefanymedina
 */
public class TipoPrimitivoBoolean {
    public static void main(String args[]){
         boolean variaUno = true;
         
        System.out.println("Ingrese su edad");
        Scanner consola = new Scanner(System.in);
        var edad = Integer.parseInt(consola.nextLine());
        
         if(edad >= 18){
             System.out.println("la persona es mayor de edad");
         }else{
             System.out.println("la persona es menor de edad");
        }
    
    }
    
}
