package EjercitacionClase;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class EjerciciosClase {
    public static void main(String[] args) {
      /**
       *                                        //-- EJERCITACION DE CLASE --//
       *1) Muestra la tabla de multiplicar de un número introducido por teclado.
       *2) Realiza un programa que nos diga cuántos dígitos tiene un número introducido
       *    por teclado limitado a 5 dígitos como máximo y el tipo de dato
       *    debe ser 'int' o 'long'.
       *3) Escribe un programa que calcule la media de un conjunto de números positivos
       *    introducidos por teclado. A priori, el programa no sabe cuántos números se
       *    introducirán. El usuario indicará que ha terminado de introducir los datos
       *    cuando meta un número negativo.
       *4) Escribe un programa que lea una lista de diez números y determine cuántos
       *    son positivos, y cuántos son negativos.
       *5) Escribe un programa que pida una base y un exponente (entero positivo) y que
       *    calcule la potencia..
       *6) Escribe un programa que diga si un número introducido por teclado es o no
       *    primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
       */


        /* Inicio Ejercicio Nro 1 */
        // 1) Muestra la tabla de multiplicar de un número introducido por teclado.
/**
        System.out.print("Ejercicio Nro 1");
        System.out.print("\033[33m"+"\nIngrese un entero: "+"\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        int numeroEntero = scannerBasic.nextInt();
        for(int i= 1; i<=10; i++){
            System.out.println(numeroEntero + " * " + i + "  =  " + numeroEntero*i);
        }
        scannerBasic.close();
*/
        /* Fin Ejercicio Nro 1 */

        /*----------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 2 */
        /**
          2) Realiza un programa que nos diga cuántos dígitos tiene un número introducido
             por teclado limitado a 5 dígitos como máximo y el tipo de dato
             debe ser 'int' o 'long'.
        **/
/**

        System.out.print("Ejercicio Nro 2");
        System.out.print("\033[33m"+"\nIngrese un entero: "+"\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String cadenaNumerica = scannerBasic.next();

        int numeroInt = Integer.parseInt(cadenaNumerica);
        long numeroLong = Long.parseLong(cadenaNumerica);

        if (cadenaNumerica.length() < 5){
            System.out.println("La longitud del dato ingresado fue de: "+ cadenaNumerica.length());
            scannerBasic.close();
        } else {
            System.out.println("La longitud del dato ingresado es mayor a 5");
            }
        scannerBasic.close();
 */
        /* Fin Ejercicio Nro 2 */

        /*----------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 3 */
/**
       *3) Escribe un programa que calcule la media de un conjunto de números positivos
        *    introducidos por teclado. A priori, el programa no sabe cuántos números se
        *    introducirán. El usuario indicará que ha terminado de introducir los datos
        *    cuando meta un número negativo.
*/
/**
        System.out.print("Ejercicio Nro 3");

        System.out.print("\033[33m" + "\nIngrese un entero: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado = scannerBasic.next();
        Integer numeroIngresado = Integer.parseInt(datoIngresado);
        Integer sumatoria = 0;
        Integer cantNumeros = 0;
        while(numeroIngresado > 0){
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
*/
        /* Fin Ejercicio Nro 3 */

        /*----------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 4 */
/**
               *4) Escribe un programa que lea una lista de diez números y determine cuántos
                *    son positivos, y cuántos son negativos.
*/
/**
        System.out.print("\033[33m" + "\nIngrese un entero: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado;
        Integer numeroIngresado;
        Integer cantNPositivos = 0;
        Integer cantNNegativos = 0;
        Integer cantNumeros = 0;
        for(int i=1; i<=10;i++) {
            System.out.print("\033[33m" + "\nIngrese un entero: " + "\u001B[0m");
            datoIngresado = scannerBasic.next();
            numeroIngresado = Integer.parseInt(datoIngresado);
            if(numeroIngresado >= 0) {
                cantNPositivos++;
            } else {
                cantNNegativos++;
            }
        }
        System.out.println("Cantidad de numeros positivos: " + cantNPositivos);
        System.out.println("Cantidad de numeros negativos: " + cantNNegativos);
        }
        scannerBasic.close();
*/
    /* Fin Ejercicio Nro 4 */
    /*----------------------------------------------------------------------------------*/
    /* Inicio Ejercicio Nro 5 */
/**
           *5) Escribe un programa que pida una base y un exponente (entero positivo) y que
       *    calcule la potencia..
*/
/**
        System.out.print("\033[33m" + "\nIngrese base: " + "\u001B[0m");
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
*/
    /* Fin Ejercicio Nro 5 */
    /*----------------------------------------------------------------------------------*/
    /* Inicio Ejercicio Nro 6 */
/**
       *6) Escribe un programa que diga si un número introducido por teclado es o no
       *    primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
*/
/**
        System.out.print("\033[33m" + "\nIngrese un numero: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado = scannerBasic.next();
        Integer numeroIngresado = Integer.parseInt(datoIngresado);

        if (numeroIngresado <= 0){
            System.out.println("El numero ingresado debe ser mayor a 1");
        }else if(Math.floorMod(numeroIngresado,2)==0) {
             System.out.println(datoIngresado + " No es un numero primo");
        }else if(Math.floorMod(numeroIngresado,3)==0) {
            System.out.println(datoIngresado + " No es un numero primo");
        }else if(Math.floorMod(numeroIngresado,5)==0) {
            System.out.println(datoIngresado + " No es un numero primo");
        }else if(Math.floorMod(numeroIngresado,7)==0) {
            System.out.println(datoIngresado + " No es un numero primo");
        }else if(Math.floorMod(numeroIngresado,11)==0) {
        System.out.println(datoIngresado + " No es un numero primo");
        } else{
            System.out.println(datoIngresado + " Es un numero primo");
           }
        scannerBasic.close();
*/
    /* Fin Ejercicio Nro 6 */
     }
    }