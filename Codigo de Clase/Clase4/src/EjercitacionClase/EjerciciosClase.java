package EjercitacionClase;

import java.util.Scanner;
public class EjerciciosClase {
    public static void main(String[] args) {
        /* Inicio Ejercicio Nro 1 */
        /**
         *                                        //-- EJERCITACION DE CLASE --//
         *1) Escribe un programa que solicite al usuario ingresar una serie de números
         *      y luego muestre estadísticas como el promedio, la suma y el valor máximo.
         */
/*
        System.out.println("\033[36m" + "//--EJERCICIO 1--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese un entero (finaliza con -1): " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado = scannerBasic.next();
        Integer numeroIngresado = Integer.parseInt(datoIngresado);
        Integer sumatoria = 0;
        Integer cantNumeros = 0;
        Integer valormaximo = -1;
        while (numeroIngresado > 0) {
            cantNumeros++;
            sumatoria = sumatoria + numeroIngresado;
            valormaximo = (numeroIngresado > valormaximo) ? numeroIngresado : valormaximo;
            System.out.print("\033[33m" + "\nIngrese un entero: " + "\u001B[0m");
            datoIngresado = scannerBasic.next();
            numeroIngresado = Integer.parseInt(datoIngresado);
        }
        if (cantNumeros > 0) {
            System.out.println("La suma es: " + sumatoria);
            System.out.println("La media es: " + sumatoria / cantNumeros);
            System.out.println("La maximo es: " + valormaximo);
        } else {
            System.out.println("No se ingreso ningun valor ");
        }
        scannerBasic.close();
*/
        /* Fin Ejercicio Nro 1 */

        /*---------------------------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 2 */
        /**
         *2) Escribe un programa que calcule el factorial de un número ingresado por el usuario,
         *   pero permitiendo calcular el factorial de varios números consecutivos.
         */
        System.out.println("\033[36m" + "//--EJERCICIO 2--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese un entero: " + "\u001B[0m");
        Scanner scannerBasic1 = new Scanner(System.in);
        String datoIngresado1 = scannerBasic1.next();
        Integer numeroIngresado1 = Integer.parseInt(datoIngresado1);
        Integer factorial = 1;
        if (numeroIngresado1 == 1) {
            System.out.println("El factorial de: 1 es: 1");
        } else {
            for (int i = 2; i <= numeroIngresado1+1; i++) {
                factorial = factorial * (i-1);
            }
        }
        System.out.println("El factorial de: " + numeroIngresado1 + " es: " + factorial);
    }
    /* Fin Ejercicio Nro 2 */
    /*---------------------------------------------------------------------------------------------------*/

    /**
     *3) Escribe un programa que calcule cuántos días laborables (sin contar fines de semana)
     *      entre 2 fechas.
     *4) Escribe un programa que solicite al usuario su fecha de nacimiento y calcule la
     *      fecha de jubilación considerando la edad de jubilación estándar
     *      (por ejemplo, 65 años).
     *5) Escribe un programa que solicite al usuario los catetos de
     *      un triángulo rectángulo y calcule e imprima la longitud de la hipotenusa.
     */
}



