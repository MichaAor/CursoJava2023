package EjercitacionClase;

import java.util.Scanner;

public class EjerciciosClase {
    public static void main(String[] args) {

        //ejercicio1();
        ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
    }
        /* Inicio Ejercicio Nro 1 */
// 1) Muestra la tabla de multiplicar de un número introducido por teclado.

        public static void ejercicio1() {
            System.out.println("\033[36m" + "//--EJERCICIO 1--\\" + "\u001B[0m");
            System.out.print("\033[33m" + "Ingrese un entero: " + "\u001B[0m");
            Scanner scannerBasic = new Scanner(System.in);
            int numeroEntero = scannerBasic.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroEntero + " * " + i + "  =  " + numeroEntero * i);
            }
            scannerBasic.close();
        }
        /* Fin Ejercicio Nro 1 */

        /*--------------------------------------------------------------------------------------------------------------------------------------*/

        /* Inicio Ejercicio Nro 2 */
/* 2) Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado limitado a 5 dígitos como máximo
        y el tipo de dato debe ser 'int' o 'long'.
*/

        public static void ejercicio2 () {
            System.out.println("\033[36m" + "//--EJERCICIO 2--\\" + "\u001B[0m");
            System.out.print("\033[33m" + "Ingrese un entero: " + "\u001B[0m");
            Scanner scannerBasic = new Scanner(System.in);
            String cadenaNumerica = scannerBasic.next();

            int numeroInt = Integer.parseInt(cadenaNumerica);
            long numeroLong = Long.parseLong(cadenaNumerica);

            if (cadenaNumerica.length() < 5) {
                System.out.println("La longitud del dato ingresado fue de: " + cadenaNumerica.length());
                scannerBasic.close();
            } else {
                System.out.println("La longitud del dato ingresado es mayor a 5");
            }
            scannerBasic.close();
        }

        /* Fin Ejercicio Nro 2 */
//Observacion: Perfecto como abordas el ejercicio, pero no me queda claro el uso de las
// variables 'numeroInt' y 'numeroLong'.
//RTA: Convierto a int y long si no da error es un tipo de datos valido ingresado.

        /*--------------------------------------------------------------------------------------------------------------------------------------*/

        /* Inicio Ejercicio Nro 3 */
/* 3) Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
        - A priori, el programa no sabe cuántos números se introducirán.
        - El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
*/

        public static void ejercicio3 () {
            System.out.println("\033[36m" + "//--EJERCICIO 3--\\" + "\u001B[0m");
            System.out.print("\033[33m" + "Ingrese un entero: " + "\u001B[0m");
            Scanner scannerBasic = new Scanner(System.in);
            String datoIngresado = scannerBasic.next();
            Integer numeroIngresado = Integer.parseInt(datoIngresado);
            Integer sumatoria = 0;
            Integer cantNumeros = 0;
            while (numeroIngresado > 0) {
                cantNumeros++;
                sumatoria = sumatoria + numeroIngresado;
                System.out.print("\033[33m" + "\nIngrese un entero: " + "\u001B[0m");
                datoIngresado = scannerBasic.next();
                numeroIngresado = Integer.parseInt(datoIngresado);
            }
            if (cantNumeros > 0) {
                System.out.println("La media es: " + sumatoria / cantNumeros);
            } else {
                System.out.println("No se ingreso ningun valor ");
            }
            scannerBasic.close();
        }

        /* Fin Ejercicio Nro 3 */
//Observacion: Muy bien planteado. Hay que revisar la optimizacion de recursos, tanto el Scanner
// como las variables de referencia.

        /*--------------------------------------------------------------------------------------------------------------------------------------*/

        /* Inicio Ejercicio Nro 4 */
//4) Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.

        public static void ejercicio4 () {
            System.out.println("\033[36m" + "//--EJERCICIO 4--\\" + "\u001B[0m");
            Scanner scannerBasic = new Scanner(System.in);
            int numeroIngresado;
            int cantNPositivos = 0;
            int cantNNegativos = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.print("\033[33m" + "Ingrese un entero: " + "\u001B[0m");
                numeroIngresado = scannerBasic.nextInt();
                if (numeroIngresado >= 0) {
                    cantNPositivos++;
                } else {
                    cantNNegativos++;
                }
            }
            System.out.println("Cantidad de numeros positivos: " + cantNPositivos);
            System.out.println("Cantidad de numeros negativos: " + cantNNegativos);
            scannerBasic.close();
        }


        /* Fin Ejercicio Nro 4 */
//Observaciones: A cuidar los recursos, mejorar uso de Scanner,
// clases primitivas y revisar, 1 variable sin uso y sobra 1 '}'.

        /*--------------------------------------------------------------------------------------------------------------------------------------*/

        /* Inicio Ejercicio Nro 5 */
// 5) Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.

        public static void ejercicio5 () {
            System.out.println("\033[36m" + "//--EJERCICIO 5--\\" + "\u001B[0m");
            System.out.print("\033[33m" + "Ingrese base: " + "\u001B[0m");
            Scanner scannerBasic = new Scanner(System.in);
            String datoIngresado = scannerBasic.next();
            Integer base = Integer.parseInt(datoIngresado);

            System.out.print("\033[33m" + "\nIngrese exponente: " + "\u001B[0m");
            datoIngresado = scannerBasic.next();
            Integer exponente = Integer.parseInt(datoIngresado);

            double resultadoPotencia = Math.pow(base, exponente);
            System.out.println("Potencia: " + resultadoPotencia);
            scannerBasic.close();
        }


        /* Fin Ejercicio Nro 5 */

        /*--------------------------------------------------------------------------------------------------------------------------------------*/

        /* Inicio Ejercicio Nro 6 */
/* 6) Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que sólo es
        divisible entre él mismo y la unidad.
*/

        public static void ejercicio6 () {
            System.out.println("\033[36m" + "//--EJERCICIO 6--\\" + "\u001B[0m");
            System.out.print("\033[33m" + "Ingrese un numero: " + "\u001B[0m");
            Scanner scannerBasic = new Scanner(System.in);
            String datoIngresado = scannerBasic.next();
            Integer numeroIngresado = Integer.parseInt(datoIngresado);

            if (numeroIngresado <= 0) {
                System.out.println("El numero ingresado debe ser mayor a 1");
            } else if (Math.floorMod(numeroIngresado, 2) == 0) {
                System.out.println(datoIngresado + " No es un numero primo");
            } else if (Math.floorMod(numeroIngresado, 3) == 0) {
                System.out.println(datoIngresado + " No es un numero primo");
            } else if (Math.floorMod(numeroIngresado, 5) == 0) {
                System.out.println(datoIngresado + " No es un numero primo");
            } else if (Math.floorMod(numeroIngresado, 7) == 0) {
                System.out.println(datoIngresado + " No es un numero primo");
            } else if (Math.floorMod(numeroIngresado, 11) == 0) {
                System.out.println(datoIngresado + " No es un numero primo");
            } else {
                System.out.println(datoIngresado + " Es un numero primo");
            }
            scannerBasic.close();
        }

        /* Fin Ejercicio Nro 6 */
//Observacion: Buen planteo, aunque se puede mejorar y acotar, cuidado los recursos.

    }
