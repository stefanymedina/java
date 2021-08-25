
package Dominio;
import java.util.Date;

public class Cliente  extends Persona{
    private int idCliente;
    private boolean vip;
    private static int contCliente;
    private  Date fechaRegistro;
    
    private Cliente(){
    
    }

    public Cliente(String nombre, char genero, int edad, String direccion,boolean vip) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contCliente;
        this.vip = vip;
        this.fechaRegistro = new Date();
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContCliente() {
        return contCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
    
    
    
    
   
}
