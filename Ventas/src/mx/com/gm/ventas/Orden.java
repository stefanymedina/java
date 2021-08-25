package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    public static final int MAX_PRODUCTOS = 10;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contProducto;
    private double total;

    public Orden() {
        idOrden = ++Orden.contadorOrdenes;
        productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contProducto < Orden.MAX_PRODUCTOS) {
            productos[this.contProducto++] = producto; // se incrementa la variable contProducto despues de ser usada
        } else {
            System.out.println("Se ha sueperado el maximo de productos" + Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {

        for (int i = 0; i < this.contProducto; i++) { // que sea menor a contador producto de manera que se itere solo sobre la cantidad de productos creados mas no el tamaño definido
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Numero de Orden = " + idOrden);
        for (int i = 0; i < this.contProducto; i++) {
            System.out.println(this.productos[i]);
        }
        System.out.println("total = " + calcularTotal());

    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", productos=" + productos[0] + '}';
    }

}
