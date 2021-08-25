package Domain;

public class Escritor extends Empleado {

    final TipoEscritura tp1;

    public Escritor(String nombre, double sueldo, TipoEscritura tp1) {
        super(nombre, sueldo);
        this.tp1 = tp1;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + "Tipo de escritura =" + this.tp1.getDescripcion();

    }

    @Override
    public String toString() {
        return "Escritor{" + "tp1=" + tp1 + super.toString() + '}';
    }

    public TipoEscritura getTipoEscritura() {
        return this.tp1;
    }

}
