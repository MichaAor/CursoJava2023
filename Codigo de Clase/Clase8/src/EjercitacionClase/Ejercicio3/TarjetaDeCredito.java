package EjercitacionClase.Ejercicio3;

/**
 * ? b) Implementa tres clases que representen métodos de pago concretos:
 * *   TarjetaCredito que implemente MetodoPago. Deberá tener una variable de instancia limiteCredito
 *     y un método para verificar si hay crédito disponible.
 * *   TransferenciaBancaria que implemente MetodoPago. Deberá tener una variable de instancia numeroCuenta
 *     y un método para realizar la transferencia.
 * *   PagoEfectivo que implemente MetodoPago. Deberá tener una variable de instancia montoRecibido
 *     y un método para manejar el efectivo recibido.
 */
public class TarjetaDeCredito implements MetodoPago {
    double limiteCredito = 1000F;
    public void realizarPago(double montoPago) {
        if (montoPago < limiteCredito) {
            limiteCredito = limiteCredito - montoPago;
            System.out.println("Se realizo pago Tarjeta de Credito por un monto de: " + montoPago);
        }
        else {
                System.out.println("Monto a pagar: " + montoPago + ". Sobrepasa el limite: " + limiteCredito);
            }
    }
    public void mostrarDetalles(){
        System.out.println("Detalle de pago con Tarjeta. Saldo en cuenta: " + limiteCredito);
    }
}