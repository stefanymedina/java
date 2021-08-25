
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumero(1,2,3);
        System.out.println("otros:");
        imprimirNumero(6,9);
        System.out.println("arguemnto + argumento variable  :");
        imprimirNumero("lista1", 2,3,5);
        
    }
    
    public static void imprimirNumero(int... numeros){ // a esto se le llama argumentos variables en un metodo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero "+ i +":"+ numeros[i] );
        }
    }
    
    public static void imprimirNumero(String nombre, int... numeros){ // cuando se pasn varios argumentos ademas de el variable el ultimo arguumento enviado debe ser este ultimo (el argumento variable)
        System.out.println("nombre = " + nombre);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero "+ i +":"+ numeros[i] );
        }
    }
   
}
