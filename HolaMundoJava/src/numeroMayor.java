
import java.util.Scanner;


public class numeroMayor {
    public static void main(String args[]){
        System.out.println("Proporciona el numero 1");
        Scanner consola = new Scanner(System.in);
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero 2");
        int numero2 = Integer.parseInt(consola.nextLine());
        var numeromayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es: "+ numeromayor);
    }
}


