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

public class Cliente implements DescuentoCliente{

    String tipoCliente; /* Regular/Premium */

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double aplicarDescuento(double monto){
        if (tipoCliente == "Regular")
            return(monto = monto * 0.5);
        else if (tipoCliente == "Premium") {
            return(monto = monto * 0.9);
        } else {return(0);}

    }
    public void mostrarDetalles(){
        System.out.println("Cliente{" +
                "tipoCliente='" + tipoCliente + '\'' +
                '}');

    }
    @Override
    public String toString() {
        return "Cliente{" +
                "tipoCliente='" + tipoCliente + '\'' +
                '}';
    }
}
