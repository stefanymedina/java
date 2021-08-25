// Mi clase en Java 

public class HolaMundo {
    public static void main(String args[]){
        //Definimos la variable
        int miVariableEntera = 10 ;
        System.out.println("miVariableEntera = " + miVariableEntera);;
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println("miVariableEntera = " + miVariableEntera);
                
        String miVariableCadena = "Saludos";
        System.out.println("miVariableCadena = " + miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println("miVariableCadena = " + miVariableCadena);
        
        // var - inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        
        var miVariableCadena2 = "Hola soy una cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
    }
}
