package CodigoDeClase.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoNewMultiCatch {
/*
?                       ╔═══════════════════════╗
?                       ║  TRY NEW MULTI CATCH  ║
?                       ╚═══════════════════════╝
! Bloque Try:
*   Este bloque contiene el código que puede generar una excepción, tanto si se ingresa mal el dato solicitado como si la operacion siguiente falla.

! Bloque Catch para InputMismatchException:
*   Este bloque catch maneja ambas excepciones (InputMismatchException y ArithmeticException) en una sola línea
*       utilizando el operador | (pipe) para separar los tipos de excepciones. Se utiliza el método e.getClass().getSimpleName()
*       para obtener el nombre de la clase de la excepción y e.getMessage() para obtener el mensaje asociado a la excepción.

! Bloque Finally:
*   Este bloque finally se ejecuta siempre, independientemente de si se produce una excepción o no.
*   Cierra explícitamente el objeto Scanner para liberar recursos.
*/



    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO NEW TRY MULTI CATCH  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════════════╝" + "\u001B[0m");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("\033[34m" + "\n║  Bloque Try - INICIO  ║" + "\u001B[0m");

            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

            //! Se utiliza el valor ingresado y se realiza una operacion que termina erronea, forzando una Excepcion que sera atrapada.
            int resultado = numero /0;

            System.out.println("\033[34m" + "\n║  Bloque Try - FIN  ║" + "\u001B[0m");

        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("\033[31m" + "\n║  Bloque Multi Catch - INICIO  ║" + "\u001B[0m");

            System.out.println("Error: " + e.getClass().getSimpleName() + " - " + e.getMessage());

            System.out.println("\033[31m" + "\n║  Bloque Multi Catch - FIN  ║" + "\u001B[0m");

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
