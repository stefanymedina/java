
package accesodatos;

public class ImplemMysql implements IAccesoDatos {
    /*debemos implementar todos los metodos creados en la interfaz que estamos implementando
    de lo contratio debemo definit nuestra clase como abstracta pero si realizamos esto no podremos
    instancias objetos de ella, en este caso como si debemos implementar todos los metodos definidos en 
    la interfaz
    
    - cuando trabajamos con clases lo que abstraemos son caracteristicas en comun 
    - cuando trabajamos con interfaces lo que abstraemos es comportamiento mas bien funcionalidad y no caracteristicas
    */
    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Lista desde Mysql");
    }

    @Override
    public void eliminar() {
    }

    
}
