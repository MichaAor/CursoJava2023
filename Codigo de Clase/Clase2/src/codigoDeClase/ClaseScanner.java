package codigoDeClase;

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de lectura de diferentes tipos de datos
        System.out.print("\033[33m"+"Ingrese un entero: "+"\u001B[0m");
        int numeroEntero = scanner.nextInt();
        System.out.println("\033[35m"+"El numero ingresado fue: "+ numeroEntero +"\u001B[0m");

        System.out.print("\033[33m"+"\nIngrese un número decimal: "+"\u001B[0m");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("\033[32m"+"El decimal ingresado fue: "+ numeroDecimal +"\u001B[0m");

        // Consumir el salto de línea pendiente
        scanner.nextLine();

        System.out.print("\033[33m"+"\nIngrese una cadena: "+"\u001B[0m");
        String cadena = scanner.nextLine();

        System.out.print("\033[33m"+"\nIngrese un carácter: "+"\u001B[0m");
        char caracter = scanner.next().charAt(0);

        System.out.print("\033[33m"+"\nIngrese un valor booleano (true/false): "+"\u001B[0m");
        boolean valorBooleano = scanner.nextBoolean();

        // Ejemplo de validación de entrada
        if (scanner.hasNextInt()) {
            int otroEntero = scanner.nextInt();
            System.out.println("Otro entero ingresado: " + otroEntero);
        } else {
            System.out.println("No se ingresó un entero válido.");
        }

        // Ejemplo de uso de delimitadores
        scanner.useDelimiter(",");
        System.out.print("\033[33m"+"\nIngrese varios números separados por comas: "+"\u001B[0m");
        while (scanner.hasNext()) {
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);
        }

        // Cierre automático del Scanner al usar try-with-resources
        try (Scanner scannerCierreAutomatico = new Scanner(System.in)) {
            // Código que utiliza el segundo Scanner
        } catch (Exception e) {
            // Manejo de excepciones
        }

        // Otros métodos útiles
        System.out.print("\033[33m"+"\nIngrese una línea con espacios: "+"\u001B[0m");
        scanner.useDelimiter("\n");
        String lineaCompleta = scanner.next();
        System.out.println("Línea completa: " + lineaCompleta);

        // Cierre del Scanner
        scanner.close();
    }
}