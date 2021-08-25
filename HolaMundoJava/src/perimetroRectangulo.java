
import java.util.Scanner;

public class perimetroRectangulo {
    public static void main(String args[]){
        System.out.println("Proporciona el alto:");
        Scanner consola = new Scanner(System.in);
        int alto = consola.nextInt();
        System.out.println("Proporciona el ancho:");
        int ancho = consola.nextInt();
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        System.out.println("Area : " + area);
        System.out.println("Perimetro : " + perimetro);
      
    }
}
