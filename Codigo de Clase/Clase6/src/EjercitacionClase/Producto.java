package EjercitacionClase;

/**
 *  *3) Realice una clase 'Producto' que contenga los atributos:
 *  *    -nombre
 *  *    -precioVenta
 *  *    -costoCompra
 *  *    -stock
 *  *    -totalVendido
 *  *    -CantidadVendida
 *  * y realizar los metodos correspondientes para demostrar las siguientes estadisticas a
 *  traves del metodo toString():
 *  *  -Nombre
 *  *  -Precio
 *  *  -Stock disponible
 *  *  -TotalVendido
 *  *  -Balance (Solo con positivo o negativo)
 *  *  -Unidades Vendidas.
 *  *
 *  *  Instanciar 3 productos y demostrar cual es el mas Rentable, no olvidarse de
 *     utilizar static cuando corresponda.
 *
 *   */

public class Producto {
    String nombre;
    float precioVenta;
    float costoCompra;
    int stock;
    float totalVendido;
    int cantidadVendida;

    public Producto(String nombre, float precioVenta, float costoCompra, int stock, float totalVendido, int cantidadVendida) {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.costoCompra = costoCompra;
        this.stock = stock;
        this.totalVendido = totalVendido;
        this.cantidadVendida = cantidadVendida;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public float getCostoCompra() {
        return costoCompra;
    }

    public float getTotalVendido() {
        return totalVendido;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void comprarProducto(int cantidadComprada, float precioVenta, float costoCompra ) {
        this.precioVenta = precioVenta;
        this.costoCompra = costoCompra;
        this.stock = this.stock + cantidadComprada;
    }

    public void venderProducto(int cantidadVendida ) {
        this.stock = this.stock - cantidadVendida;
        this.totalVendido = this.totalVendido + (this.precioVenta * cantidadVendida);
        this.cantidadVendida = this.cantidadVendida + cantidadVendida;
    }

    @Override
    public String toString() {
        String balance =  (costoCompra > precioVenta) ? " - " : " + ";
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioVenta=" + precioVenta +
                ", costoCompra=" + costoCompra +
                ", stock=" + stock +
                ", totalVendido=" + totalVendido +
                ", cantidadVendida=" + cantidadVendida +
                ", balance=" + balance +
                '}';
    }
}
