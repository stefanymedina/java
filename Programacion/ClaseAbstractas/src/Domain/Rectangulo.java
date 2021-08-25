
package Domain;

 
public class Rectangulo extends FiguraGeometrica {
    public String tipoFig;
    
    public Rectangulo(String tipoFig){
        super(tipoFig);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Tipo de Figura" + this.getClass().getName());
    }
}
