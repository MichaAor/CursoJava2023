import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Inicio Ejercicio Nro 1 */
        /** 1.	Realizar un algoritmo que permita calcular el índice de masa corporal de una
         *      persona ingresando sus valores del peso y la altura*/

/**
 System.out.print("Ejercicio Masa Corporal");
 System.out.print("\033[33m" + "\nIngrese Peso: " + "\u001B[0m");
 Scanner scannerBasic = new Scanner(System.in);
 String cadenaPeso = scannerBasic.next();
 float peso = Float.parseFloat(cadenaPeso);
 System.out.print("\033[33m" + "\nIngrese Altura: " + "\u001B[0m");
 String cadenaAltura = scannerBasic.next();
 cadenaAltura = cadenaAltura.replace(',','.');
 float altura = Float.parseFloat(cadenaAltura);
 float masaCorporal = peso / altura;
 if (masaCorporal < 20) {
 System.out.println("MC = " + masaCorporal + " mal estado");
 } else if (masaCorporal >= 20 && masaCorporal < 22) {
 System.out.println("MC = " + masaCorporal + " bajo de peso");
 } else if (masaCorporal >= 22 && masaCorporal < 25) {
 System.out.println("MC = " + masaCorporal + " peso normal");
 } else if (masaCorporal >= 25 && masaCorporal < 30) {
 System.out.println("MC = " + masaCorporal + " Sobrepeso");
 } else if (masaCorporal >= 30 && masaCorporal < 40) {
 System.out.println("MC = " + masaCorporal + " Sobrepeso Cronico");
 }  else if (masaCorporal >= 40) {
 System.out.println("MC = " + masaCorporal + " Hospitalizado");
 }
 */
        /* Fin Ejercicio Nro 1 */
/**----------------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 2 */
/**        2.	Realizar un programa para calcular el promedio de tres notas, e indique
 *              si el promedio es menor de 6 que muestre reprobado, si es mayor que 6 pero
 *              menor que 9 aprobado, y mayor de 9, sobresaliente.
 */
/**
        System.out.print("Promedio de 3 notas");
        System.out.print("\033[33m" + "\nIngrese Nota1: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String primerNota = scannerBasic.next();
        int nota1 = Integer.parseInt(primerNota);
        System.out.print("\033[33m" + "\nIngrese Nota2: " + "\u001B[0m");
        String segundaNota = scannerBasic.next();
        int nota2 = Integer.parseInt(segundaNota);
        System.out.print("\033[33m" + "\nIngrese Nota3: " + "\u001B[0m");
        String tercerNota = scannerBasic.next();
        int nota3 = Integer.parseInt(tercerNota);
        float promedio = (nota1 + nota2 + nota3) / 3F;

        String mensaje2 = "Calificacion: " + promedio + " => ";
        if (promedio < 6) {
            System.out.println(mensaje2 + "Reprobado");
        } else if (promedio >= 6 && promedio < 9) {
            System.out.println(mensaje2 + "Aprobado");
        } else if (promedio > 9) {
            System.out.println(mensaje2 + "Sobresaliente");
        } else
            System.out.println("Calificación no válida");
    }
 */
    /* Fin Ejercicio Nro 2 */
/**----------------------------------------------------------------------------------------*/
    /* Inicio Ejercicio Nro 3 */

/**  3.	Realizar un programa que indique el mayor y menor de cinco valores numéricos. */

        System.out.print("Menor y Mayor de 5");
        Scanner scannerBasic = new Scanner(System.in);
        int valorMenor = 999999999;
        int valorMayor = -999999999;
        int valorLeido;
        for (int i=1;i<=5;i++) {
            System.out.print("\033[33m" + "\nIngrese Valor" + i + ":" + "\u001B[0m");
            String primerNota = scannerBasic.next();
            valorLeido = Integer.parseInt(primerNota);
            if (valorLeido >= valorMayor) {
                valorMayor = valorLeido;
            }
            if (valorLeido <= valorMenor) {
                valorMenor = valorLeido;
            }
        }
            System.out.println("El valor menor es: " + valorMenor);
            System.out.println("El valor mayor es: " + valorMayor);

        }
    /* Fin Ejercicio Nro 3 */

    }
