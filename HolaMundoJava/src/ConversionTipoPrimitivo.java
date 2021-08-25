
import java.util.Scanner;



/**
 *
 * @author stefanymedina
 */
public class ConversionTipoPrimitivo {
    public static void main(String Args[]){
        
        var edad = Integer.parseInt("20");
  
        System.out.println("edad = " + (edad + 1));
        
        var ValorPI = Double.parseDouble("3.1416");
        System.out.println("ValorPI = " + ValorPI);
        
        
        var consola = new Scanner(System.in);
        var edadIngreso = Integer.parseInt(consola.nextLine());
        System.out.println("edadIngreso = " + (edadIngreso + 1));
        
        
        
   
    }
    
    
}
