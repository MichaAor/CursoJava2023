package CodigoDeClase.Estructura;

/*
? En este código, la línea import static CodigoDeClase.Estructura.EnumEstructura.*;
?   se utiliza para importar estáticamente todos los miembros estáticos de la clase EnumEstructura.
?   En este caso, * indica que estamos importando todos los miembros estáticos, que incluyen los enums ColorSec y Tamanio.

? Esto permite que en la clase MainEstructura, puedas referenciar directamente los enums sin calificar
?   el nombre de la clase.
? Por ejemplo, puedes usar ColorSec.NARANJA en lugar de EnumEstructura.ColorSec.NARANJA y Tamanio.PEQUE
?   en lugar de EnumEstructura.Tamanio.PEQUE.

* Este tipo de importación estática puede hacer que tu código sea más conciso y legible,
*   pero debes tener cuidado de no importar demasiados miembros estáticos, ya que podría causar confusión si
*   hay nombres conflictivos.
*   En este caso, importar solo los enums que necesitas puede ser más claro.
*/
import static CodigoDeClase.Estructura.EnumEstructura.*;


/*
?                       ╔════════════════════════╗
?                       ║  DEMO ENUM ESTRUCTURA  ║
?                       ╚════════════════════════╝
! ColorPri:
*   Es un enumerado que se utiliza fuera de la clase.
*   En este caso, se asigna el valor AMARILLO a la variable colorFuera y se imprime en la consola.

! Size:
*   Es un enumerado que tiene cuerpo (método getCodigo() y atributo codigo).
*   Se crea una instancia size con el valor MEDIANO y se imprime el resultado del método getCodigo().

! ColorSec:
*   Es un enumerado que se utiliza dentro de la clase.
*   Se asigna el valor NARANJA a la variable colorDentro y se imprime en la consola.

! Tamanio:
*   Es un enumerado sin cuerpo.
*   Se crea una instancia tamanio con el valor PEQUE y se imprime en la consola.
*/


//! Ejemplo de uso de los enumerados
public class DemoEnumEstructura {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO ENUM STRUCT  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════╝" + "\u001B[0m");

        //? Uso del enumerado ColorPri fuera de la clase
        ColorPri colorFuera = ColorPri.AMARILLO;
        System.out.println("Color fuera de la clase: " + colorFuera);

        //? Uso del enumerado Size con cuerpo (con método y atributo)
        Size size = Size.MEDIANO;
        System.out.println("Tamaño con cuerpo: " + size.getCodigo());

        //? Uso del enumerado ColorSec dentro de la clase
        ColorSec colorDentro = ColorSec.NARANJA;
        System.out.println("Color dentro de la clase: " + colorDentro);

        //? Uso del enumerado Tamanio sin cuerpo
        Tamanio tamanio = Tamanio.PEQUE;
        System.out.println("Tamaño sin cuerpo: " + tamanio);
    }
}
