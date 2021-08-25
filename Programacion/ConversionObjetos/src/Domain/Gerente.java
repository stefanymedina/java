/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author stefanymedina
 */
public class Gerente extends Empleado {
    private String departamento;
   
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override // el metodo que se esta sobre escribiendo no puede ser mas restrictivo  que el de la calse padre
    public String mostrarInfo(){
        return super.mostrarInfo() + ", depa=" + this.departamento;
        
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
