
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];   
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 60;
        System.out.println("edades { ind0: " + edades[0] +", ind1 :"+ edades[1] +", ind2 :" + edades[2]);
        
        // dara error al compilar ya que se esta intentado ingresar a un indice que no existe ya que la cantidad de indices es n-1 en este caso 3-1
        // edades[3] = 4;   //no marca error ya que no es un error a nivel de compilación si no en tiempo de ejecución 
        
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemnto "+ i +" : "+ edades[i]);
        }
    
    }

    
    
    
}
