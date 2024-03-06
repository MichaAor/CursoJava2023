package CodigoDeClase.ThrowVSThrows;

public class DemoThrow {
/*
?                       ╔═════════╗
?                       ║  THROW  ║
?                       ╚═════════╝
! Simulación de una Condición y Lanzamiento de la Excepción con throw:
*   Dentro del método main, se simula una condición (condicion) que requiere lanzar una excepción.
*   Si la condición es true, se utiliza throw para lanzar una nueva instancia de RuntimeException con
*       un mensaje descriptivo.

! Resto del Código que No se Ejecuta si se Lanza la Excepción:
*   Después del bloque if, hay código que no se ejecutará si se lanza la excepción.
*   En este caso, se imprime un mensaje indicando que este código no se ejecuta si hay una excepción.

! Captura y Manejo en el Bloque catch:
*   En el bloque catch, se captura la excepción RuntimeException y se maneja imprimiendo un mensaje de error.
*/
    public static void main(String[] args) {
        try {
            //? Simulación de una condición que requiere lanzar la excepción
            boolean condicion = true;

            if (condicion) {
                //! Lanzamiento de la excepción con throw
                throw new RuntimeException("Esto es una excepción simple.");
            }

            //* Resto del código que no se ejecutará si se lanza la excepción
            System.out.println("Este código no se ejecuta si hay una excepción.");

        } catch (RuntimeException e) {
            //! Manejo de la excepción - INICIO

            //? Imprimir mensaje de error
            System.out.println("Se ha producido un error: " + e.getMessage());

            //! Manejo de la excepción - FIN
        }

        System.out.println("\nSeguimos con la ejecucion normal...");
    }
}
