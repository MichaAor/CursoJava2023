package EjercitacionClase;

import java.time.LocalDate;
import java.util.Scanner;

public class EjerciciosClase {
    public static void main(String[] args) {
       // ejercicio1();
        // ej2();
        ej3();
        // ejercicio4();
        // ejercicio5();

        /*
         
         * 4) Escribe un programa que solicite al usuario su fecha de nacimiento y
         * calcule la
         * fecha de jubilación considerando la edad de jubilación estándar
         * (por ejemplo, 65 años).
         * 5) Escribe un programa que solicite al usuario los catetos de
         * un triángulo rectángulo y calcule e imprima la longitud de la hipotenusa.
         */
    }

    public static void ejercicio1() {
        // Escribe un programa que solicite al usuario ingresar una serie de números y
        // luego muestre estadísticas como el promedio, la suma y el valor máximo.//
 Scanner scan = new Scanner(System.in);
        int numero;
        int suma = 0;
        int numerosIngresados = 0;
        int numeroMax = 0;
        float promedio;
       

        do {
            System.out.println("Ingrese un numero:");
            numero = scan.nextInt();

            if (numero > 0) {
                // La variable 'suma' se usa como acumulador.
                // El equivalente al codigo de abajo es -> suma += numero;
                suma = suma + numero;

                // La variable 'numerosIngresados' funciona como contador.
                // Aumentara cada vez que el numero ingresado sea positivo.
                numerosIngresados++;

                //por cada iteracion voy a encontrar el numero maximo entre el numero alamcendado en la variable 'numero'y el nuevo 'numero maximo' ingresado.
                 numeroMax = Math.max(numeroMax,numero);
            }

            // 'suma' contiene la suma de los numeros positivos ingresados.
            // 'numerosIngresados' contiene la cantidad de numeros positivos que se sumaron.
            // 'promedio' contiene la division entre 'suma' y 'numerosIngresados'.
            promedio = suma / numerosIngresados;

            // Con cada iteracion sumaremos el numero si es mayor a 0.
            // Caso contrario, salimos del bucle.

        } while (numero > 0);

        System.out.println("Ya no se pueden ingresar mas numeros.\nEl promedio es: " + promedio);
        System.out.println("la suma de los numeros ingresados es: " + suma);
        scan.close();
        System.out.println("El numero maximo es : "+ numeroMax);

    }

    public static void ej2() {
        /* 2) Escribe un programa que calcule el factorial de un número ingresado por el
         usuario, pero permitiendo calcular el factorial de varios números consecutivos. */

        Scanner sc = new Scanner(
                System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial es: " + factorial);
    }

    public static void ej3() {
        /** 3) Escribe un programa que calcule cuántos días laborables (sin contar fines
         de semana) entre 2 fechas. */
         Scanner scan = new Scanner(System.in);

         // *Ingreso fecha 1.
         System.out.println("Ingrese una fecha yyyy-MM-dd: ");
         String fechaString = scan.next();
         LocalDate fecha1 = LocalDate.parse(fechaString);
         System.out.println("\033[35m"+"\n"+"Fecha 1: " + fecha1 +"\u001B[0m");

         // *Ingreso fecha 2.
         System.out.println("Ingrese una fecha yyyy-MM-dd: ");
         fechaString = scan.next();
         LocalDate fecha2 = LocalDate.parse(fechaString);
         System.out.println("\033[35m"+"\n"+"Fecha 2: " + fecha2 +"\u001B[0m");
    }

    public static void ej4() {
    }

    public static void ej5() {
    }
}