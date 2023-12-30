package EjercitacionClase;

import java.util.Scanner;

public class EjerciciosClase {
    public static void main(String[] args) {
      /*
       *    //-- EJERCITACION DE CLASE --//
       */

      //1) Realiza las siguientes conversiones:
        System.out.println("\033[34m" + "//--EJERCICIO 1--//" + "\u001B[0m");

        //a) De cm a mts. => {1cm = 0.01}
        System.out.println("\033[36m" + "--EJERCICIO A--" + "\u001B[0m");

        int centimetros = 5;
        double metros = centimetros * 0.01;
        System.out.println("\033[33m" + centimetros + " centimetros equivalen a " + metros + " metros." + "\u001B[0m");

        //b) De Celsius a Farenheit => {(0°C × 9/5) + 32 = 32F}
        System.out.println("\033[36m" + "\n--EJERCICIO B--" + "\u001B[0m");

        int celsius = 10;
        double farenheit = (celsius * 9/5)+32;
        System.out.println("\033[33m" + celsius +" celsius equivalen a " + farenheit + " farenheit." + "\u001B[0m");

        //c) De Dolar a Peso => {1 Dolar = 1100 Pesos}
        System.out.println("\033[36m" + "\n--EJERCICIO C--" + "\u001B[0m");

        double dolares = 80;
        double pesos = dolares * 1100;
        System.out.println("\033[33m" + dolares + " dolares equivalen a " +pesos +" pesos." + "\u001B[0m");


      //2) Declarar un numero y mostrar si es par o impar usando el operador 'ternario'*/
        System.out.println("\033[34m" + "\n//--EJERCICIO 2--//" + "\u001B[0m");
        int numero = 8;
        /*
            if (numero%2 == 0){
                System.out.println("El numero " + numero+" es par");
            }else{
                System.out.println("El numero " + numero+" es impar");
            }
         */
        String message = "El numero es: " + numero;
        String mensaje = (numero % 2 == 0) ? message + " es par" : message + " es impar";
        System.out.println(mensaje);

      /*
        3) Declara 2 variables y  muestre el resultado de las siguientes comparaciones:
            a) Igualdad
            b) Desigualdad
            c) Mayor que
            d) Menor que
            e) Mayor o igual que
            f) Menor o igual que
       */
        System.out.println("\033[34m" + "\n//--EJERCICIO 3--//" + "\u001B[0m");
        /*
            No utilizo mayor o igual que , porque ya comienzo comparando si son iguales,
            y si no lo son ya no es necesario usar el mayor o igual o menor o igual.
        */
        int variable1 = 32;
        int variable2 = 2;

        if (variable1 == variable2){
            System.out.println("La variable1 que vale " + variable1 +" es igual a la variable2 que vale " + variable2);
        } else
            if (variable1 < variable2) {
                System.out.println("La variable1 que vale " + variable1 +" es menor a la variable2 que vale " + variable2);
            }else {
                System.out.println("La variable1 que vale " + variable1 + " es mayor a la variable2 que vale " + variable2);
            }

        //4) Enseñar las tablas de multiplicar del 1 al 10
        System.out.println("\033[34m" + "\n//--EJERCICIO 4--//" + "\u001B[0m");
        for(int i= 1; i<=10; i++){
            for (int j= 1; j<=10; j++){
                System.out.print("[" + i + "X" + j + " = " + (i * j) + "]   ");
                if(j == 10){
                    System.out.println();
                }
            }
        }

        //5) Muestra la tabla de multiplicar de un número introducido por teclado.
        System.out.println("\033[34m" + "\n//--EJERCICIO 5--//" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numeroTeclado = scanner.nextInt();

        for (int i=1; i <= 10; i++){
            System.out.println("[" + numeroTeclado + "X" + i + " = " + (numeroTeclado * i) + "]");
        }
     }
