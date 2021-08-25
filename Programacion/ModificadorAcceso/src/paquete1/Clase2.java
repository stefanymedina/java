
package paquete1;
/*
prueba de metodo protected este no aplica para clases
*/

public class Clase2 {
    protected String varProtected = "variable protected"; // solo prodre acceder a este atributo por medio de clases hijas
    
    protected Clase2(){ 
        System.out.println("Constructor pprotected llamado internamente"); 
    }
    
    public Clase2(String varUno){
        this();
        System.out.println("prueba = " + varUno);
    }
    
    protected void muestraInfo(){
        System.out.println("Metodo protected clase2");
    }
    
}
