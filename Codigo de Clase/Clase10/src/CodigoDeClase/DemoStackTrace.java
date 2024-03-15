package CodigoDeClase;

//! Demostracion de un error para analizar la TRAZA DE PILA.
public class DemoStackTrace {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO STACK TRACE  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════╝" + "\u001B[0m");

//? Intentar dividir por cero
        int numerador = 10;
        int denominador = 0;

//? Esto lanzará una excepción interna
        int resultado = numerador / denominador;
/*
*   Dando como resultado la siguiente traza:
!        ┌──> CORRESPONDE AL PUNTO DE EJECUCION EL CUAL TIENE: ["NombreRama" TipoExceptionLanzada]
!   Exception in thread "main" java.lang.ArithmeticException:
?	    at CodigoDeClase.DemoStackTrace.main(DemoStackTrace.java:15)
?        └──> CORRESPONDE AL MARCO DE PILA EL CUAL DETALLA: [Paquete.clase.metodo:LineaDeCodigoDondeLanzoException]
*/


// * Esta línea no se ejecutará debido a la excepción anterior
        System.out.println("Resultado de la división: " + resultado);
    }
}
