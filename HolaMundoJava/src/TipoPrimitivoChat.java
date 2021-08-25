
/**
 *
 * @author stefanymedina
 */
public class TipoPrimitivoChat {
    public static void main(String Args[]){
    
        char miCaracter ='a';
        System.out.println("miCaracter = " + miCaracter);
        
        char VarChar ='\u0021';
        System.out.println("VarChar = " + VarChar);
        
        char varCharDecimal = 33; // aca va imprimir el caracter de admiración que que char toma el valor decimal
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var VarChar1 ='\u0021';
        System.out.println("VarChar = " + VarChar1);
        
        var varCharDecimal2 = 33; // aca va imprimir el valor de 33 ya que por la inferencia de tipo var determna que es un tipo int 
        System.out.println("varCharDecimal = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo3);
        
        
    
    }
    
}
