package EjercitacionClase.Ejercicio3;

/**
 * ? c) Crea una interfaz adicional llamada DescuentoCliente con los siguientes elementos:
 * *   Método abstracto aplicarDescuento(double monto) para aplicar descuentos específicos de cliente.
 * *   Variable estática DESCUENTO_GENERAL que represente un descuento fijo para todos los clientes.
 * *   Método default mostrarDetalles() que imprima detalles generales del descuento.
 * ? d) Implementa una clase Cliente que implemente DescuentoCliente.
 * *   Deberá tener una variable de instancia adicional, como tipoCliente, que represente el nivel
 * *       o tipo de cliente (por ejemplo, "Regular", "Premium", etc.).
 * *   Implementa el método abstracto aplicarDescuento(double monto) para proporcionar
 * *       descuentos específicos según el tipo de cliente.
 */
public interface DescuentoCliente {
    static double ESCUENTO_GENERAL = 1000f;
    public double aplicarDescuento(double monto);
    public void mostrarDetalles();
}
