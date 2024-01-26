package codigoDeClase.ejemploStatic;

public class CuentaBancaria {
    // Atributo estático para contar el número total de cuentas
    private static int totalCuentas = 0;

    // Atributos no estáticos
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        // Incrementar el número total de cuentas cada vez que se crea una nueva instancia
        totalCuentas++;
    }

    // Método no estático para obtener el saldo de la cuenta
    public double getSaldo() {
        return this.saldo;
    }

    // Método no estático para obtener el titular de la cuenta
    public String getTitular(){
        return this.titular;
    }

    // Método no estático para realizar un depósito
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito de " + cantidad + " realizado. Saldo actual: " + saldo);
    }

    // Método no estático para realizar un retiro
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
        }
    }

    // Método estático para obtener el número total de cuentas
    public static int getTotalCuentas() {
        return totalCuentas;
    }

    //Metodo no estatico toString para ver el estado de la instancia.
    @Override
    public String toString() {
        return "\n" + this.getClass().getSimpleName() +
                "\n\t->Titular: " + this.getTitular() +
                "\n\t->Saldo: " + this.getTitular();
    }
}
