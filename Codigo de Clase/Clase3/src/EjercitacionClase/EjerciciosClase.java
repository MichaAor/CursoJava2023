package EjercitacionClase;

import java.util.Scanner;

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
       *1) Escribe un programa que diga si un número introducido por teclado es o no
       *    primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
       */
        /* Inicio Ejercicio Nro 1 */
        // 1) Muestra la tabla de multiplicar de un número introducido por teclado.

        Scanner scannerBasic = new Scanner(System.in);
        System.out.print("\033[36m"+"Ejercicio Nro 1 --TABLA DE MULTILICAR--"+"\u001B[0m");
        System.out.print("\033[33m"+"\nIngrese un entero: "+"\u001B[0m");
        int numeroEntero = scannerBasic.nextInt();
        for(int i= 1; i<=10; i++){
            System.out.println(numeroEntero + " * " + i + "  =  " + numeroEntero*i);
        }
        /* Fin Ejercicio Nro 1 */
    }
}