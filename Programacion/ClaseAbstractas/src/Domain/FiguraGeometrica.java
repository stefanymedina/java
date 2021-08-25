
package Domain;

// declara la existencia de un metdoo pero no su implementación como es el caso de el metodo imprimir 
// puede contener metodos no abstractos pero al menos uno de los metodos debe ser abstracto
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void imprimir();
    
}
