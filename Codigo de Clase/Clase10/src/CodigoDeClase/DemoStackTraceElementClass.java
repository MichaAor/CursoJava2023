package CodigoDeClase;

//! Demostracion de un error para analizar la TRAZA DE PILA en profundidad.
public class DemoStackTraceElementClass {

    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔══════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO STACK TRACE ELEMENT CLASS  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚══════════════════════════════════╝" + "\u001B[0m");
        try {
            //! Llamo a un método que lanzará una excepción
            method1();
        } catch (Exception e) {
            //? Imprimo la pila de llamadas
            System.out.println("Stack Trace:");

            //? Obtengo la pila de llamadas desde la excepción
            StackTraceElement[] stackTrace = e.getStackTrace();

            System.out.println("\033[32m" + "╔═              ═╗" + "\u001B[0m");
            System.out.println("\033[32m" + "║  BLOQUE CATCH  ║" + "\u001B[0m");
            System.out.println("\033[32m" + "╚═              ═╝" + "\u001B[0m");
            //? Recorro cada elemento en la pila de llamadas
            for (StackTraceElement element : stackTrace) {
            //? Imprimo tinformación detallada del elemento
                System.out.println("Class: " + element.getClassName()); //* Nombre de la clase
                System.out.println("Method: " + element.getMethodName()); //* Nombre del método
                System.out.println("File: " + element.getFileName()); //* Nombre del archivo fuente
                System.out.println("Line: " + element.getLineNumber()); //* Número de línea
                System.out.println(); //* Línea en blanco para separar los elementos
            }
        }
    }

    // Método que lanzará una excepción
    public static void method1() {
        method2();
    }

    // Método que lanzará la excepción
    public static void method2() {
        int resultado = 10 / 0;
    }
}
