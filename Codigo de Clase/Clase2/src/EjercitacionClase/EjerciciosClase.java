package EjercitacionClase;

import java.util.Scanner;

public class EjerciciosClase {
    public static void main(String[] args) {
      /*
       *                                        //-- EJERCITACION DE CLASE --//

    /*  * 1) Realiza las siguientes conversiones:
       *   a) De cm a mts. => {1cm = 0.01}*/

        int centimetros= 5;
        double metros= centimetros*0.01;
        System.out.println(centimetros+" equivalen a " +metros+" metros" );

     /*   b) De Celsius a Farenheit => {(0°C × 9/5) + 32 = 32F}*/
        int celsius=10;
        double farenheit=(celsius*9/5)+32;
        System.out.println(celsius +" equivalen a " +farenheit + "farenheit");

    /* c) De Dolar a Peso => {1 Dolar = 1100 Pesos}*/
        double dolar=80;
        double pesos=dolar*1100;
        System.out.println(dolar+ " equivalen a " +pesos +" pesos");


        /* 2) Declarar un numero y mostrar si es par o impar usando el operador 'ternario'*/
        int numero=8;
         /*if (numero%2 == 0){
             System.out.println("El numero " + numero+" es par");
         }
         else System.out.println("El numero " + numero+" es impar");*/

        String mensaje= (numero%2 == 0) ?"El numero " + numero+" es par":"El numero " + numero+" es impar";
        System.out.println(mensaje);

      /* 3) Declara 2 variables y  muestre el resultado de las siguientes comparaciones:
       *    a) Igualdad
                *    b) Desigualdad
                *    c) Mayor que
       *    d) Menor que
       *    e) Mayor o igual que
       *    f) Menor o igual que
       */


        /* no utilizo mayor o igual que , porque ya comienzo comparando si son iguales, y si no lo son ya no es necesario usar el mayor o igual o menor o igual*/
        int variable1=32;
        int variable2=2;
        if (variable1==variable2){
            System.out.println("la variable 1 que vale  " + variable1 +" es igual a la variable 2 que vale " + variable2);
        } else if (variable1<variable2) {
            System.out.println("la variable 1 que vale " + variable1 +" es menor a la variable 2 que vale " + variable2);
        }
        else System.out.println("la variable 1 que vale " + variable1 + " es mayor a la variable 2 que vale " + variable2);

        /*4) Enseñar las tablas de multiplicar del 1 al 10*/
        for(int i= 1; i<11; i++){
            for (int j= 1; j<11; j++){
                System.out.println(i+"X"+j + "=" + (i*j));
            }
        }
 //5) Muestra la tabla de multiplicar de un número introducido por teclado.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
       int numero1 = scanner.nextInt();

        for (int i=1; i < 11; i++){
            System.out.println(i +"X"+numero1 + "=" + (numero1*i));
        }
    }
}
