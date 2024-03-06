package CodigoDeClase.ThrowVSThrows;

public class DemoThrows {
/*
?                       ╔══════════╗
?                       ║  THROWS  ║
?                       ╚══════════╝
! throws InterruptedException:
*   En la firma del método main, se utiliza throws InterruptedException para indicar que este método
*       puede lanzar una excepción del tipo InterruptedException.
*   La excepción InterruptedException generalmente se asocia con la interrupción de un hilo mientras
*       está en estado de espera (sleep), y es una excepción comprobada que debe ser manejada o declarada.

! Thread.sleep(1000):
*   Dentro del método main, se utiliza Thread.sleep(1000) para simular la pausa del hilo principal
*       (el hilo que ejecuta el método main) durante 1000 milisegundos (1 segundo).
*   Esta operación puede lanzar una excepción de tipo InterruptedException.

! System.out.println("Hello Geeks"):
*   Después de la pausa, se imprime en la consola el mensaje "Hello Geeks".
*/
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Hello Geeks");
    }
}
