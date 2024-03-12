package EjercitacionClase.Ejercicio3;

/**
 * ? a) Crea una interfaz llamada MetodoPago con los siguientes elementos:
 * *   Método abstracto realizarPago(double monto) para procesar el pago.
 * *   Variable estática TARIFA_TRANSACCION que represente una tarifa fija por transacción.
 * *   Método default mostrarDetalles() que imprima detalles generales del método de pago.
 */
public interface MetodoPago {
    static double TARIFA_TRANSACCION = 100F;
    public void realizarPago(double montoPago);
    public void mostrarDetalles();
}
