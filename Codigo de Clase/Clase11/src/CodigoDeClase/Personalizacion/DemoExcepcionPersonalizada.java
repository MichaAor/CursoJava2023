package CodigoDeClase.Personalizacion;

import java.util.Scanner;

public class DemoExcepcionPersonalizada {
/*
?                       ╔═════════════════════════╗
?                       ║  PERSONALIZED EXCEPTION ║
?                       ╚═════════════════════════╝
! Definición de la Excepción Personalizada (NumeroNoPositivoException):
*   Se crea la clase NumeroNoPositivoException, que extiende Exception y tiene un constructor que
*       acepta un mensaje de error.
*   Esta clase se utiliza para representar un error específico cuando se detecta que el número ingresado
*       no es positivo.

! Llamada al Método procesarDatos() en el main (Throw):
*   El método procesarDatos() es llamado desde el método main.
*   Este método puede lanzar la excepción personalizada NumeroNoPositivoException si la validación del número
*       ingresado falla.

! Método procesarDatos() con throws NumeroNoPositivoException:
*   En la firma del método procesarDatos(), se utiliza la palabra clave throws para indicar que este método
*       puede lanzar la excepción personalizada NumeroNoPositivoException.
*   Esto se hace porque la excepción es una excepción comprobada (checked), y el compilador necesita saber
*       que el método puede arrojar esta excepción.

! Lanzamiento de la Excepción en procesarDatos():
*   Dentro del método procesarDatos(), se valida si el número ingresado es positivo.
*   Si no lo es, lanzo la excepción personalizada NumeroNoPositivoException utilizando la palabra clave throw.
*   Esto se hace para notificar que ha ocurrido una situación excepcional y para propagar la excepción al
*       contexto que llamó al método.

! Captura y Manejo en el Bloque catch del main:
*   En el bloque catch del main, se captura la excepción personalizada NumeroNoPositivoException y se maneja
*       imprimiendo un mensaje de error personalizado.
*/
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO EXCEPCION PERSONALIZADA  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════════════════╝" + "\u001B[0m");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número positivo: ");
            int numero = Integer.parseInt(new Scanner(System.in).nextLine());

            //* Validación del número ingresado
            if (numero <= 0) {
                //! Lanzamiento de la excepción personalizada con un mensaje descriptivo
                throw new NumeroNoPositivoException("El número debe ser positivo.");
            }

            //* Resto del código si el número es positivo
            System.out.println("Número ingresado: " + numero);

        } catch (NumeroNoPositivoException e) {
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
