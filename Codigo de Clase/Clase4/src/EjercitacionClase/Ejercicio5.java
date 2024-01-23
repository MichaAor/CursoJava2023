/**
 *                                        //-- EJERCITACION DE CLASE --//
 *5) Escribe un programa que solicite al usuario los catetos de
 *      un triángulo rectángulo y calcule e imprima la longitud de la hipotenusa.
 */

package EjercitacionClase;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer cateto");
        Integer cateto1 = scanner.nextInt();
        System.out.println("Ingrese el segundo cateto");
        Integer cateto2 = scanner.nextInt();
        System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
        scanner.close();
    }
}
