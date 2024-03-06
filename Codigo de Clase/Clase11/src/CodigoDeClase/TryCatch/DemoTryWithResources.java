package CodigoDeClase.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoTryWithResources {
/*
?                       ╔══════════════════════╗
?                       ║  TRY-WITH-RESOURCES  ║
?                       ╚══════════════════════╝
! Bloque Try:
*   Este es el bloque try, que rodea el código que puede lanzar una excepción mientras
*       se trabaja con el recurso (Scanner en este caso).
*   En este ejemplo, se solicita al usuario que ingrese un número utilizando scanner.nextInt().
*   Si se produce alguna excepción dentro de este bloque, el recurso Scanner se cerrará automáticamente
*       al salir del bloque.

! Código para leer la entrada del usuario:
*   En este caso, se utiliza un objeto Scanner para leer un número entero desde la entrada del usuario.

! Bloque Catch (Exception e):
*   Este es el bloque catch, que maneja cualquier excepción de tipo Exception (general).
*   Aquí se coloca el código que se ejecutará en caso de que se produzca esa excepción.

! Manejo de la excepción (por ejemplo, imprimir el mensaje de error):
*   En este caso, simplemente se imprime un mensaje que indica el tipo de error y el mensaje asociado
*       a la excepción (e.getMessage()).

? No es necesario cerrar explícitamente el recurso:
*   Debido al uso de try-with-resources, el Scanner se cierra automáticamente al salir del bloque try.
*   No es necesario cerrarlo explícitamente.
*/
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO TRY-WITH-RESOURCES  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════╝" + "\u001B[0m");

        //? Se utiliza try-with-resources para gestionar automáticamente el cierre del recurso (Scanner)
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("\033[31m" + "\n║  Bloque Try - INICIO  ║" + "\u001B[0m");

            //! Código que puede lanzar una excepción
            System.out.print("\n?) Ingrese un número: ");
            int numero = scanner.nextInt();
            System.out.println("\n*) Número ingresado: " + numero);

            System.out.println("\033[31m" + "\n║  Bloque Try - FIN  ║" + "\u001B[0m");

        } catch (InputMismatchException e) {
            System.out.println("\033[34m" + "\n║  Bloque Catch - INICIO  ║" + "\u001B[0m");

            //* Manejo de la excepción (por ejemplo, imprimir el mensaje de error)
            System.out.println("\nError al leer la entrada: " + e);

            System.out.println("\033[34m" + "\n║  Bloque Catch - FIN  ║" + "\u001B[0m");
        }
//? No es necesario cerrar explícitamente el recurso, ya que se cierra automáticamente al salir del bloque try
    }
}
