package EjercitacionClase;

public class EjerciciosClase {
    public static void main(String[] args) {
 /*
!                                        //-- EJERCITACION DE CLASE --//
!  REALIZAR CADA EJERCICIO CON SU CORRESPONDIENTE DOCUMENTACIÓN Y DEMOSTRAR LOS RESULTADOS
!   DE MANERA PROLIJA EN LA CONSOLA
?  1)  Sistema de Recursos Humanos en una Empresa Tecnológica
?  Diseña un sistema avanzado de recursos humanos para una empresa tecnológica que utilice clases 
?   y métodos abstractos, incorporando conceptos adicionales.
? a) Crea una clase abstracta llamada Empleado con atributos como nombre, salarioBase,
?   nivel (por ejemplo, junior, intermedio, senior), y evaluacionDesempeño.
? b) Define un método abstracto calcularSalario() en la clase Empleado que tenga en cuenta 
?   la evaluación de desempeño.
? c) Implementa subclases concretas como Desarrollador, Diseñador, y Gerente que hereden de la clase Empleado.
? d) Agrega un método realizarEvaluacion() en la clase Empleado para simular el proceso de evaluación de desempeño.
? e) En el programa principal, crea instancias de diferentes empleados, realiza evaluaciones de desempeño 
?   y muestra sus salarios calculados.

? 2)  Galería de Arte con Subastas y Colecciones
? Amplía el sistema de gestión de figuras artísticas en una galería para incluir subastas y colecciones.
? a) Modifica la clase ObraDeArte para incluir atributos como estilo y periodoArtístico.
? b) Define un método abstracto adicional exponer() en la clase ObraDeArte para simular 
?   la exposición de la obra en una galería.
? c) Crea una clase abstracta llamada Subasta que tenga atributos como obraEnSubasta, 
?   pujaActual, y pujadorActual.
? d) Define métodos abstractos como iniciarSubasta() y cerrarSubasta() en la clase Subasta.
? e) Implementa subclases concretas como SubastaPresencial y SubastaVirtual que hereden de la clase Subasta.
? f) En el programa principal, crea instancias de obras de arte, organiza subastas y muestra información 
?   sobre las colecciones y subastas.

? 3)  Sistema de Pago con Interfaces
? Diseña un sistema de pago que utilice interfaces para modelar diferentes métodos y tipos de variables. Este sistema simula transacciones de compra en una tienda.
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
    }
}