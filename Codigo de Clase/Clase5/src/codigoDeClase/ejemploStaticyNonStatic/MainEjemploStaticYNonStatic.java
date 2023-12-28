package codigoDeClase.ejemploStaticyNonStatic;

public class MainEjemploStaticYNonStatic {
    public static void main(String[] args) {
//-----------------Ejemplo POO simple-----------------//
        System.out.println("\033[36m" + "//--EJEMPLO POO STATIC Y NON STATIC--//" + "\u001B[0m");

        // Crear instancias de la clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("María", 2000);

        // Acceder a métodos no estáticos a través de instancias
        System.out.println("\033[36m" + "METODOS NON STATIC" + "\u001B[0m");

        System.out.println("\033[33m" + "Cuentas antes de usar metodos no estaticos" + "\u001B[0m");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        System.out.println("\033[36m" + "\nAplicamos metodos no estaticos" + "\u001B[0m");
        cuenta1.depositar(500);
        cuenta2.retirar(1000);

        System.out.println("\033[33m" + "\nCuentas despues de usar metodos no estaticos" + "\u001B[0m");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        // Acceder a método estático sin necesidad de instancia
        System.out.println("\033[36m" + "\nMETODOS STATIC" + "\u001B[0m");
        System.out.println("\033[32m" + "Obtener el total de instancias creadas => [total de cuentas]" + "\u001B[0m");
        System.out.println("Número total de cuentas: " + CuentaBancaria.getTotalCuentas());
    }
}