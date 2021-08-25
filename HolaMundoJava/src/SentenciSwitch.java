
import java.util.Scanner;


/**
 *
 * @author stefanymedina
 */
public class SentenciSwitch {
    public static void main(String args[]){
        System.out.println("ingresa un valor");
        Scanner consola = new Scanner(System.in);
        int valor = Integer.parseInt(consola.nextLine());
        var numeroTexto = "valor desconocido";
        
        switch (valor){
            case 1 : 
                numeroTexto = "Numero uno";
                break;
            case 2 :
                numeroTexto = "Numero dos";
                break;
            case 3 :
                numeroTexto = "Numero tres";
                break;
            case 4 :
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "caso no encontrado";
                
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
