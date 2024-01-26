package codigoDeClase.Encapsulamiento;

public class CuentaBancaria {
    private double saldo;

//! Getter para obtener el saldo
    public double getSaldo() {
        return saldo;
    }

//! Método para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

//! Método para retirar dinero
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }
}
