package CodigoDeClase.TryCatch;

public class DemoTryCatchSimple {
/*
?                       ╔════════════════════╗
?                       ║  SIMPLE TRY-CATCH  ║
?                       ╚════════════════════╝
! Bloque Try:
*   Este es el bloque try, que rodea el código que puede lanzar una excepción.
*   En este caso, se intenta realizar una división por cero (10 / 0), lo que provocará
*   una excepción de tipo ArithmeticException.
*   Si ocurre una excepción dentro de este bloque, el control se transfiere al bloque catch.

! Código que puede lanzar una excepción:
*   Esta línea realiza la operación que puede lanzar la excepción. En este caso, la división por cero.

! Bloque Catch:
*   Este es el bloque catch, que maneja la excepción específica ArithmeticException.
*   Aquí se coloca el código que se ejecutará en caso de que se produzca esa excepción.
*   Después de ejecutar el código en este bloque, el flujo de control continúa después del bloque try-catch.

! Manejo de la excepción específica (división por cero):
*   En este caso, simplemente se imprime un mensaje
*   que indica el tipo de error y el mensaje asociado a la excepción (e.getMessage()).
*/
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO SIMPLE TRY-CATCH ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════════╝" + "\u001B[0m");

        try{
            System.out.println("\033[31m" + "\n║  Bloque Try - INICIO  ║" + "\u001B[0m");

            //! Código que puede lanzar una excepción
            int resultado = 10 / 2;
            System.out.println("\n*) Resultado de la división: " + resultado);

            System.out.println("\033[31m" + "\n║  Bloque Try - FIN  ║" + "\u001B[0m");

        } catch (ArithmeticException e) {
            System.out.println("\033[34m" + "\n║  Bloque Catch - INICIO  ║" + "\u001B[0m");

            //* Manejo de la excepción específica (división por cero)
            System.out.println("\nError: " + e.getMessage());

            System.out.println("\033[34m" + "\n║  Bloque Catch - FIN  ║" + "\u001B[0m");
        }

        //? Fuera del Try-Catch
        System.out.println("\n<--Estoy fuera del Try-Catch-->");
    }
}
