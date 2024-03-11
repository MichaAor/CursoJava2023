package EjercitacionClase.Ejercicio3;

public class EjerciciosClase {
    public static void main(String[] args) {
 /*

? 3)  Sistema de Pago con Interfaces
? Diseña un sistema de pago que utilice interfaces para modelar diferentes métodos y tipos de variables.
? Este sistema simula transacciones de compra en una tienda.
? a) Crea una interfaz llamada MetodoPago con los siguientes elementos:
*   Método abstracto realizarPago(double monto) para procesar el pago.
*   Variable estática TARIFA_TRANSACCION que represente una tarifa fija por transacción.
*   Método default mostrarDetalles() que imprima detalles generales del método de pago.
? b) Implementa tres clases que representen métodos de pago concretos:
*   TarjetaCredito que implemente MetodoPago. Deberá tener una variable de instancia limiteCredito y un método para verificar si hay crédito disponible.
*   TransferenciaBancaria que implemente MetodoPago. Deberá tener una variable de instancia numeroCuenta y un método para realizar la transferencia.
*   PagoEfectivo que implemente MetodoPago. Deberá tener una variable de instancia montoRecibido y un método para manejar el efectivo recibido.
? c) Crea una interfaz adicional llamada DescuentoCliente con los siguientes elementos:
*   Método abstracto aplicarDescuento(double monto) para aplicar descuentos específicos de cliente.
*   Variable estática DESCUENTO_GENERAL que represente un descuento fijo para todos los clientes.
*   Método default mostrarDetalles() que imprima detalles generales del descuento.
? d) Implementa una clase Cliente que implemente DescuentoCliente. 
*   Deberá tener una variable de instancia adicional, como tipoCliente, que represente el nivel 
*       o tipo de cliente (por ejemplo, "Regular", "Premium", etc.).
*   Implementa el método abstracto aplicarDescuento(double monto) para proporcionar 
*       descuentos específicos según el tipo de cliente.

!En el programa principal, crea instancias de diferentes métodos de pago y clientes. 
!   Realiza transacciones de compra, aplicando descuentos y mostrando los resultados.
*/

        double monto = 500d;
        System.out.println("monto inicial: " + monto );
        Cliente miDescuentoCliente = new Cliente();
        miDescuentoCliente.setTipoCliente("Regular");
        monto = miDescuentoCliente.aplicarDescuento(monto);
        System.out.println("monto con descuento : " + monto );

        MetodoPago miPagoEfectivo = new PagoEfectivo();
        miPagoEfectivo.realizarPago(monto);
        miPagoEfectivo.mostrarDetalles();

    }
}