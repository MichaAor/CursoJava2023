package EjercitacionClase;

import java.util.Scanner;

public class EjerciciosClase {
    public static void main(String[] args) {
        /**
         *                                        //-- EJERCITACION DE CLASE --//
         * --Realizar la ejercitacion sobre el este main.
         * 1) Realiza las siguientes conversiones:
         *   a) De cm a mts. => {1cm = 0.01mts}
         *   b) De Celsius a Farenheit => {(0°C × 9/5) + 32 = 32F}
         *   c) De Dolar a Peso => {1 Dolar = 1100 Pesos}
         * 2) Declarar un numero y mostrar si es par o impar usando el operador 'ternario'
         * 3) Declara 2 variables y  muestre el resultado de las siguientes comparaciones:
         *    a) Igualdad
         *    b) Desigualdad
         *    c) Mayor que
         *    d) Menor que
         *    e) Mayor o igual que
         *    f) Menor o igual que
         *4) Enseñar las tablas de multiplicar del 1 al 10
         */

        /** De cm a mts. => {1cm = 0.01mts} */
        int centimetros = 100;
        int metros = centimetros/100;
        System.out.println(centimetros + " centimetros representan " + metros + " metros");

        /**  b) De Celsius a Farenheit => {(0°C × 9/5) + 32 = 32F} */
        int celsious = 0;
        int farenheit = (celsious * 9/5)+32;
        System.out.println(celsious + " celsious representan " + farenheit + " farenheit");

        /**  c) De Dolar a Peso => {1 Dolar = 1100 Pesos} */
        float cotizacion = 1100;
        float pesos = 500;
        float convesionDolares = pesos/cotizacion;
        System.out.println(pesos + " Pesos, representan: " + convesionDolares + " Dolares");

        /** 2) Declarar un numero y mostrar si es par o impar usando el operador 'ternario' */

        int numero = 21;
        if (Math.floorMod(numero, 2) == 0) {
            System.out.println("El numero: "+ numero + " es par");
        } else {
            System.out.println("El numero: "+ numero + " es impar");
        }
        /** 3) Declara 2 variables y  muestre el resultado de las siguientes comparaciones:
         *    a) Igualdad
         *    b) Desigualdad
         *    c) Mayor que
         *    d) Menor que
         *    e) Mayor o igual que
         *    f) Menor o igual que
         */
        int variableA = 1;
        int variableB = 2;
        if (variableA == variableB) {
            System.out.println("variableA y variableB son iguales");
        }
        if (variableA != variableB){
            System.out.println("variableA y variableB son distintas");
        }
        if (variableA >= variableB){
            System.out.println("variableA es mayor que variableB");
        }
        if (variableA <= variableB){
            System.out.println("variableA es menor que variableB");
        }

        /** 4) Enseñar las tablas de multiplicar del 1 al 10 */
        for (int tabla=1; tabla<=10; tabla++ ) {
            System.out.println("Tabla del: " + tabla);
            for (int i = 1; i <= 10; i++) {
                System.out.println(tabla + " * " + i + " = " + i * tabla);
            }
        }
    }
}