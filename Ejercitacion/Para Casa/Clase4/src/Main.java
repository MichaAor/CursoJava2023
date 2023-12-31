import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Inicio Ejercicio Nro 5 */
        /**
         * 5)	Escribe un programa en que dado un número ingresado por teclado (del 1 a 7)
         *      escriba el correspondiente nombre del día de la semana.
         */
/**
        System.out.println("\033[36m" + "//--EJERCICIO 5--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese el dia de la semana (1 al 7): " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado = scannerBasic.next();
        int numeroIngresado = Integer.parseInt(datoIngresado);
        switch (numeroIngresado) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: System.out.println("Valor invalido, este debe ser un numero entre 1 y 7");
        }
    }
*/
        /* Fin Ejercicio Nro 5 */
/*--------------------------------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 6 */

/**
 * 6)	Escribe un programa que genere y muestre una contraseña aleatoria. La contraseña debe tener
 *      una longitud específica y contener caracteres alfanuméricos.
  */
        int longitudContraseña = 5;
        String valoresAlfabeticos = "abcdefghijklmnopqrstuvwxyz";
        String valoresNumericos = "1234567890";
        String password = "";
        Double posicionAfabeticos;
        Double posicionNumericos;
        int cantidadIretaciones = longitudContraseña/2;

        for (int i=1; i<=cantidadIretaciones;i++){
            //Obtengo posicion al azar dentro de la cadena de caracteres
            posicionAfabeticos = Math.random()*25;

            //Obtengo posicion al azar dentro de la cadena de numeros
            posicionNumericos = Math.random()*9;

            //tomo un valor al azar de la cadena de caracteres
            password = password + valoresAlfabeticos.substring(posicionAfabeticos.intValue(),posicionAfabeticos.intValue()+1);

            //tomo un valor al azar de la cadena de numeros
            password = password + valoresNumericos.substring(posicionNumericos.intValue(),posicionNumericos.intValue()+1);
        }
        // Contraseñas con cantidad de digitos impares, agrego el ultimo caracter al azar
        if (longitudContraseña % 2 != 0){

            //Obtengo posicion al azar dentro de la cadena de caracteres
            posicionAfabeticos = Math.random()*25;

            //tomo un valor al azar de la cadena de caracteres
            password = password + valoresAlfabeticos.substring(posicionAfabeticos.intValue(),posicionAfabeticos.intValue()+1);

        }
        System.out.println("La password es: " + password);
    }

        /* Fin Ejercicio Nro 6 */

}