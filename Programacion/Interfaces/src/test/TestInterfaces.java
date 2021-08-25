
package test;

import accesodatos.*;


public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplemMysql();
        imprimir(datos);
        datos = new ImplemOracle();
        imprimir(datos);

        
    }
    // polimorfismo + interfaz
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
    
}

