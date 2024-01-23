/**
 *                                        //-- EJERCITACION DE CLASE --//
 *1) Escribe un programa que solicite al usuario ingresar una serie de números
 *      y luego muestre estadísticas como el promedio, la suma y el valor máximo.
 */

package EjercitacionClase;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una serie de numeros separados por coma");
        String numeros = scanner.nextLine();
        String[] numerosArray = numeros.split(",");
        Integer suma = 0;
        Integer maximo = 0;
        for (String numero : numerosArray) {
            suma += Integer.parseInt(numero);
            if (Integer.parseInt(numero) > maximo) {
                maximo = Integer.parseInt(numero);
            }
        }
        System.out.println("El promedio es: " + suma / numerosArray.length);
        System.out.println("La suma es: " + suma);
        System.out.println("El maximo es: " + maximo);
        scanner.close();
    }
}