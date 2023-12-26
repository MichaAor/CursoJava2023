import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inicio Ejercicio Nro 1 //
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
        // Fin Ejercicio Nro 1 //
/**----------------------------------------------------------------------------------------*/
        // Inicio Ejercicio Nro 2 //
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
        // Fin Ejercicio Nro 2 //
/**----------------------------------------------------------------------------------------*/
        // Inicio Ejercicio Nro 3 //

/**  3.	Realizar un programa que indique el mayor y menor de cinco valores numéricos. */
/**
        System.out.print("Menor y Mayor de 5");
        Scanner scannerBasic = new Scanner(System.in);
        String valorEntrada;
        int valorMenor = 999999999;
        int valorMayor = -999999999;
        int valorLeido;
        for (int i=1;i<=5;i++) {
            System.out.print("\033[33m" + "\nIngrese Valor" + i + ":" + "\u001B[0m");
            valorEntrada = scannerBasic.next();
            valorLeido = Integer.parseInt(valorEntrada);
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
 */
        // Fin Ejercicio Nro 3 //
/**----------------------------------------------------------------------------------------*/
        // Inicio Ejercicio Nro 4 //

/** 4.	Crea una aplicación que pida un número por teclado y después comprobaremos si el número introducido es capicúa, es decir, que se lee igual sin importar la dirección.
    a.	Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no es capicua. Piensa cómo puedes dar la vuelta al número.
    b.	TIP: Una forma de pasar un número a un array es esta Character.getNumericValue(cadena.charAt(posicion)).


*/
/**
        System.out.print("Comprobar si es capicua");
        System.out.print("\033[33m" + "\nIngrese numero capicua: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String numeroCapicua = scannerBasic.next();
        int logitudNumero = numeroCapicua.length();

        // Calculo la cantidad de caracteres de cada mitad //
        int cantidadCaracteres = (logitudNumero - 1)/2;

        //Tomo la primer mitad //
        String primerMitad = numeroCapicua.substring(0,cantidadCaracteres);

        // Tomo la segunda mitad //
        String segundaMitad = numeroCapicua.substring(cantidadCaracteres+1,logitudNumero);

        // Invierto los caracteres de la segunda mitad //
        String reverso ="";
        for(int i=segundaMitad.length(); i>0 ; i--) {
            reverso = reverso + segundaMitad.substring(i-1,i);
        }
        // comparo si la primer mitad es igual a la segunda mitad //
        if(primerMitad.equals(reverso)) {
            System.out.println("El numero: " + numeroCapicua + " es un numero capicua");
        }else {
            System.out.println("El numero: " + numeroCapicua + " no un numero capicua");
        }
    }
**/
        // Fin Ejercicio Nro 4 //
/**----------------------------------------------------------------------------------------*/
    // Inicio Ejercicio Nro 5 //

    /** 5.	Realizar un programa que simule una calculadora, donde realice las operaciones
     * básicas (suma, resta, multiplicación, división), el usuario debe primero ingresar
     * dos valores, y especificar con un carácter la operación a realizar.
     */
/**
        System.out.print("Calculadora");
        System.out.print("\033[33m" + "\nIngrese primer numero: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String primerNumero = scannerBasic.next();
        int nro1 = Integer.parseInt(primerNumero);
        System.out.print("\033[33m" + "\nIngrese segundo numero: " + "\u001B[0m");
        String segundoNumero = scannerBasic.next();
        int nro2 = Integer.parseInt(segundoNumero);
        System.out.print("\033[33m" + "\nIngrese operacion: " + "\u001B[0m");
        String operacionIngresada = scannerBasic.next();
        char operacion = operacionIngresada.charAt(0);
        String mensaje2 = nro1 + " " + operacion + " " + nro2 + " => ";
        double calculo = 0F;
        switch (operacion) {
            case '+':
                calculo = nro1 + nro2;
                System.out.println(mensaje2 + calculo);
                break;
            case '-':
                calculo = nro1 - nro2;
                System.out.println(mensaje2 + calculo);
                break;
            case '*':
                calculo = nro1 * nro2;
                System.out.println(mensaje2 + calculo);
                break;
            case '/':
                if (nro2 == 0){
                    System.out.println("No se puede realizar una division por cero.");
                } else {
                    calculo = nro1 / nro2;
                    System.out.println(mensaje2 + calculo);
                }
                break;
            default:
                System.out.println("Operacion no definida");
        }
    // Fin Ejercicio Nro 5 //
   }
   **/
}