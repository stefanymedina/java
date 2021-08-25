
import java.util.Scanner;

/*
 * @author stefanymedina
 */
public class SitemaNotas {

    public static void main(String args[]) {
        System.out.println("Proporciona un valor entre 0 y 10:");
        Scanner consola = new Scanner(System.in);
        float valor = Float.parseFloat(consola.nextLine());
                
        var calificacion = "valor desconocido";

        if (valor >= 9 && valor <= 10) {
            calificacion = "A";
        } else if (valor >= 8 && valor < 9) {
            calificacion = "B";
        } else if (valor >= 7 && valor < 8) {
            calificacion = "C";
        } else if (valor >= 6  && valor < 7) {
            calificacion = "D";
        } else if (valor >= 0 && valor < 6) {
            calificacion = "F";
        } else {
            calificacion = calificacion;
        }
        
        System.out.println(calificacion);

    }
}
