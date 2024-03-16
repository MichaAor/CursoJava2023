package EjercitacionClase.Ejercicio1;

import java.util.Scanner;

public class EjerciciosIntroduccionExcepciones {
    /*
    * RECUERDA DESARROLLAR CADA EJERCICIO EN UN PACKAGE SEPARADO, CON SU PROPIA DEMOSTRACION.
    * DOCUMENTAR CORRECTAMENTE.

    ! Ejercicio 1: Calculadora
    ? Desarrolla un sistema que realice calculos basicos a partir de 2 numeros.
    ? Ambos numeros deben ser ingresados por teclado.
    ? Las operaciones a realizar deben ser Suma,Resta,Division y Multiplicacion.
    * Anticiparse a los posibles errores declarando Excepciones segun crean convenientes.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese numerador: ");
            int numeroa = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.print("Ingrese denominador: ");
            int numerob = Integer.parseInt(new Scanner(System.in).nextLine());

            //* Validación del número ingresado
            if (numeroa < 0) {
                //! Lanzamiento de la excepción personalizada con un mensaje descriptivo
                throw new NumeroNoPositivoException("El numerador debe ser positivo.");
            }

            if (numerob < 0) {
                //! Lanzamiento de la excepción personalizada con un mensaje descriptivo
                throw new NumeroNoPositivoException("El denominador debe ser positivo.");
            }

            if (numerob == 0) {
                //! Lanzamiento de la excepción personalizada con un mensaje descriptivo
                throw new DenominadorCeroException("El deniminador debe ser distinto de cero.");
            }
        }
          catch (NumeroNoPositivoException e) {
            //* Manejo de la excepción personalizada
            System.out.println("Error personalizado: " + e.getMessage());

        } catch (DenominadorCeroException e) {
            //* Manejo de la excepción personalizada
            System.out.println("Error personalizado: " + e.getMessage());

        } finally {
            //? Cierre del Scanner
            System.out.println("Cerrando Scanner...");
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}