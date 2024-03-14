package CodigoDeClase.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoTryMultiCatch {
/*
?                       ╔═══════════════════╗
?                       ║  TRY MULTI CATCH  ║
?                       ╚═══════════════════╝
! Bloque Try:
*   Este bloque contiene el código que puede generar una excepción.
*   En este caso, se solicita al usuario que ingrese un número y se intenta realizar una operación
*       aritmética inválida (división por cero).

! Bloque Catch para InputMismatchException:
*   Este bloque catch maneja la excepción InputMismatchException, que se produce cuando el usuario
*       ingresa un valor que no es un número entero válido.

! Bloque Catch para Exception (cualquier otra excepción no capturada por los bloques anteriores):
*   Este bloque catch maneja cualquier otra excepción que no sea InputMismatchException.
*   En este caso, captura la excepción ArithmeticException generada por la operación aritmética inválida.

! Bloque Finally:
*   El bloque finally se ejecuta siempre, independientemente de si se produce una excepción o no.
*   Aquí, se realiza el cierre explícito del objeto Scanner para liberar recursos.
*/

    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO TRY MULTI CATCH  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════════╝" + "\u001B[0m");


        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\033[34m" + "\n║  Bloque Try - INICIO  ║" + "\u001B[0m");

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

            //! Se utiliza el valor ingresado y se realiza una operacion que termina erronea, forzando el CATCH 2
            int resultado = numero /0;

            System.out.println("\033[34m" + "\n║  Bloque Try - FIN  ║" + "\u001B[0m");

        } catch (InputMismatchException e) {
            System.out.println("\033[31m" + "\n║  Bloque Catch 1 - INICIO  ║" + "\u001B[0m");

            System.out.println("Error: La entrada no es un número entero válido.");

            System.out.println("\033[31m" + "\n║  Bloque Catch 1 - FIN  ║" + "\u001B[0m");

        } catch (Exception e) {
            //? Bloque Catch para cualquier otra excepción no capturada por los bloques anteriores
            System.out.println("\033[31m" + "\n║  Bloque Catch 2 - INICIO  ║" + "\u001B[0m");

            System.out.println("Error no esperado.");

            System.out.println("\033[31m" + "\n║  Bloque Catch 2 - FIN  ║" + "\u001B[0m");

        } finally {
            //? Bloque Finally que sin importar el resultado se ejecutara igual
            System.out.println("\033[32m" + "\n║  Bloque Finally - INICIO  ║" + "\u001B[0m");

            //* Cierre explícito del Scanner
            System.out.println("\nCerrando Scanner...");
            if (scanner != null) {
                scanner.close();
            }

            System.out.println("\033[32m" + "\n║  Bloque Finally - FIN  ║" + "\u001B[0m");
        }
    }
}
