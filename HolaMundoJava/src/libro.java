
import java.util.Scanner;



/**
 *
 * @author stefanymedina
 */
public class libro {
    public static void main(String args[]){
        System.out.println("Proporcina el nombre:");
        Scanner consola = new Scanner(System.in);
        String nombre = consola.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        Double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        Boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        System.out.println(nombre + " #" + id);
        System.out.println("precio: $"+precio);
        System.out.println("Envio Gratuito: "+envioGratuito);
        
    }
    
}
