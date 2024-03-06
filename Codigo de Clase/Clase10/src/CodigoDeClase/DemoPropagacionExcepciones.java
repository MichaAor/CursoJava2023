package CodigoDeClase;

//! Demostracion de la Propagacion de Excepciones.
public class DemoPropagacionExcepciones {

    //? Método principal
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔══════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO PROPAGACION EXCEPTION  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚══════════════════════════════╝" + "\u001B[0m");

        //* Llamada al método principal
        metodoPrincipal();
    }

    //? Método principal que llama a otro método que propaga una excepción
    public static void metodoPrincipal() {
        System.out.println("\033[33m" + "╔═                             ═╗" + "\u001B[0m");
        System.out.println("\033[33m" + "║  INICIO del Metodo Principal  ║" + "\u001B[0m");
        System.out.println("\033[33m" + "╚═                             ═╝" + "\u001B[0m");

        //* Llamada al método secundario que puede lanzar una excepción
        metodoSecundario();

        System.out.println("\033[33m" + "╔═                          ═╗" + "\u001B[0m");
        System.out.println("\033[33m" + "║  FIN del Metodo Principal  ║" + "\u001B[0m");
        System.out.println("\033[33m" + "╚═                          ═╝" + "\u001B[0m");
    }

    //? Método secundario que arroja una excepción al intentar dividir por cero
    public static void metodoSecundario() {
        System.out.println("\033[32m" + "╔═                              ═╗" + "\u001B[0m");
        System.out.println("\033[32m" + "║  INICIO del Metodo Secundario  ║" + "\u001B[0m");
        System.out.println("\033[32m" + "╚═                              ═╝" + "\u001B[0m");

        //! Intento de dividir por cero, lo que provocará una ArithmeticException
        int numerador = 10;
        int denominador = 0;

        //! Esto lanzará una excepción interna (ArithmeticException)
        int resultado = numerador / denominador;

        //* Intento de llamar a metodoTerciario, pero no se ejecutará debido a la excepción
        metodoTerciario(resultado);

        System.out.println("\033[32m" + "╔═                           ═╗" + "\u001B[0m");
        System.out.println("\033[32m" + "║  FIN del Metodo Secundario  ║" + "\u001B[0m");
        System.out.println("\033[32m" + "╚═                           ═╝" + "\u001B[0m");
    }

    //? Método terciario que no se ejecutará debido a la excepción lanzada en metodoSecundario
    public static void metodoTerciario(int resultado) {
        System.out.println("\033[37m" + "╔═                             ═╗" + "\u001B[0m");
        System.out.println("\033[37m" + "║  INICIO del Metodo Terciario  ║" + "\u001B[0m");
        System.out.println("\033[37m" + "╚═                             ═╝" + "\u001B[0m");

        //! Esta línea no se ejecutará debido a la excepción en metodoSecundario
        System.out.println("Resultado de la división: " + resultado);

        System.out.println("\033[37m" + "╔═                          ═╗" + "\u001B[0m");
        System.out.println("\033[37m" + "║  FIN del Metodo Terciario  ║" + "\u001B[0m");
        System.out.println("\033[37m" + "╚═                          ═╝" + "\u001B[0m");
    }

/*
* Se lanza la siguiente Exception:

! Exception in thread "main" java.lang.ArithmeticException: / by zero
!	at CodigoDeClase.DemoPropagacionExcepciones.metodoSecundario(DemoPropagacionExcepciones.java:41)
!	at CodigoDeClase.DemoPropagacionExcepciones.metodoPrincipal(DemoPropagacionExcepciones.java:23)
!	at CodigoDeClase.DemoPropagacionExcepciones.main(DemoPropagacionExcepciones.java:13)

? 1) Exception in thread "main" java.lang.ArithmeticException: / by zero:
*   Indica que se ha producido una excepción de tipo ArithmeticException y específicamente,
*   la causa es la división por cero (/ by zero).

? 2) at CodigoDeClase.DemoPropagacionExcepciones.metodoSecundario(DemoPropagacionExcepciones.java:41):
*   Muestra la ubicación donde se lanzó la excepción. En este caso, la excepción se originó en el método
*   metodoSecundario de la clase DemoPropagacionExcepciones en la línea 41 del archivo DemoPropagacionExcepciones.java.

? 3) at CodigoDeClase.DemoPropagacionExcepciones.metodoPrincipal(DemoPropagacionExcepciones.java:23):
*   Indica que el método metodoPrincipal llamó a metodoSecundario, y la excepción fue propagada hasta el método principal.
*   El error ocurrió en la línea 23 de DemoPropagacionExcepciones.java dentro del método metodoPrincipal.

? 4) at CodigoDeClase.DemoPropagacionExcepciones.main(DemoPropagacionExcepciones.java:13):
*   Muestra la llamada al método principal desde el método main. El error ocurrió en la línea 13 de
*   DemoPropagacionExcepciones.java dentro del método main.
*/
}
