
package operaciones;

/**
 *
 * @author stefanymedina
 */
public class Aritmetica {
    int a; // los atributos de la clase no se pueden declarar con var
    int b; 
    
    //constructor vacio el cual se puede declarar o bien lo agrega el compilador siempre y cunado no se declare por el usuario
    public Aritmetica(){ 
        System.out.println("Ejecutando Constructor s");
    }
    
    public Aritmetica(int a, int b){  // sobre carga de constructro
     this.a = a;
     this.b = b;
    }
    
    public  void sumar(){
        int c = a + b; // la variable local como es el caso de c se alamacenan en la memoria stack y solo se pueden acceder en el metodo que son creadas
        System.out.println("la suma es  = " + c );
    }
    
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArg(int arg1, int arg2){
        a = arg1;
        b = arg2;
        return a + b;
    }
}
