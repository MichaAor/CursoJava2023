package CodigoDeClase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoTiposExcepciones {
    public static void main(String[] args) throws IOException {
        System.out.println("\033[36m" + "╔═════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO TIPOS DE EXCEPCIONES  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═════════════════════════════╝" + "\u001B[0m");

        //! Operación que puede lanzar una Excepción controlada (FileNotFoundException)
        //leerArchivoNoExistente();

        //! Operación que puede lanzar una Excepción No Controlada (ArithmeticException)
        //dividirPorCero();

        //! Operación que puede llevar a un Error (OutOfMemoryError)
        crearListaInfinita();
    }

/*
? Operación que lanza IOException (Excepción Controlada)
* Realizar operaciones de lectura que podrían lanzar IOException
! Esta excepción se lanza cuando se intenta abrir un archivo que no existe.
*/
    private static void leerArchivoNoExistente() throws IOException {
        System.out.println("\033[33m" + "╔═                      ═╗" + "\u001B[0m");
        System.out.println("\033[33m" + "║  Excepcion Controlada  ║" + "\u001B[0m");
        System.out.println("\033[33m" + "╚═                      ═╝" + "\u001B[0m");
        InputStream inputStream = new FileInputStream("archivo_no_existente.txt");
        inputStream.close();
    }

/*
? Operación que lanza ArithmeticException (Excepción No Controlada)
! Este tipo de excepción se lanza cuando se intenta realizar una operación aritmética inválida,
!   y en este caso, se está intentando dividir un número por cero
*/
    private static void dividirPorCero() {
        System.out.println("\033[33m" + "╔═                         ═╗" + "\u001B[0m");
        System.out.println("\033[33m" + "║  Excepcion NO Controlada  ║" + "\u001B[0m");
        System.out.println("\033[33m" + "╚═                         ═╝" + "\u001B[0m");
        int resultado = 10 / 0; // * Esto provocará una ArithmeticException
    }

/*
? Operación que podría llevar a un OutOfMemoryError (error)
! Este error se produce cuando la aplicación intenta asignar más memoria de la que está
!   disponible en el heap de Java.
*/
    private static void crearListaInfinita() {
        System.out.println("\033[33m" + "╔═       ═╗" + "\u001B[0m");
        System.out.println("\033[33m" + "║  Error  ║" + "\u001B[0m");
        System.out.println("\033[33m" + "╚═       ═╝" + "\u001B[0m");

        //! Intento de crear un gran array para provocar un OutOfMemoryError
        int[] array = new int[Integer.MAX_VALUE];

        //* Esta línea no se ejecutará si se lanza el error anterior
        System.out.println("Array creado exitosamente");
    }
}
