
package accesodatos;


public interface IAccesoDatos {
    int MAX_REGISTRO= 10; // todos los atributos definido seran constantes el compilador lo agrega de manera automatica
    
    void insertar(); // tos lod metodos que creemos van hacer publicos y abstractos
    
    void actualizar();
    
    void listar();
    
    void eliminar();
    
}
