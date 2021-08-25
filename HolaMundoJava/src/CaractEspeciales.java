/*
 *caracteres especiales en java
 */
public class CaractEspeciales {
    public static void main(String args[]){
    
        var nombre = "Stefany";
        System.out.println("Nueva Linea: \n " + nombre);
        System.out.println("Tabulador: \t " + nombre);
        System.out.println("Retroceso: \b\b" + nombre); // retrocede tantos \b indiquemos en este caso dos por ende no se ven los dos ptos
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}
