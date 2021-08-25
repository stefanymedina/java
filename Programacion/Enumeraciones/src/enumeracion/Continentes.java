
package enumeracion;

public enum Continentes{
    AFRICA(50),
    EUROPA(20),
    ASIA(10),
    AMERICA(15),
    OCEANIA(30);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
        
    }
    
    public int getPaises(){
     return this.paises;
    }
    
    
}
