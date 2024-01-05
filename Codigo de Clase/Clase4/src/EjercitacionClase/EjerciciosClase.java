package EjercitacionClase;

import com.sun.jdi.event.ClassUnloadEvent;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class EjerciciosClase {
    public static void main(String[] args) {
        /* Inicio Ejercicio Nro 1 */
        /**
         *                                        //-- EJERCITACION DE CLASE --//
         *1) Escribe un programa que solicite al usuario ingresar una serie de números
         *      y luego muestre estadísticas como el promedio, la suma y el valor máximo.
         */
/*
        System.out.println("\033[36m" + "//--EJERCICIO 1--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese un entero (finaliza con -1): " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado = scannerBasic.next();
        Integer numeroIngresado = Integer.parseInt(datoIngresado);
        Integer sumatoria = 0;
        Integer cantNumeros = 0;
        Integer valormaximo = -1;
        while (numeroIngresado > 0) {
            cantNumeros++;
            sumatoria = sumatoria + numeroIngresado;
            valormaximo = (numeroIngresado > valormaximo) ? numeroIngresado : valormaximo;
            System.out.print("\033[33m" + "\nIngrese un entero: " + "\u001B[0m");
            datoIngresado = scannerBasic.next();
            numeroIngresado = Integer.parseInt(datoIngresado);
        }
        if (cantNumeros > 0) {
            System.out.println("La suma es: " + sumatoria);
            System.out.println("La media es: " + sumatoria / cantNumeros);
            System.out.println("La maximo es: " + valormaximo);
        } else {
            System.out.println("No se ingreso ningun valor ");
        }
        scannerBasic.close();
*/
        /* Fin Ejercicio Nro 1 */

        /*---------------------------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 2 */
        /**
         *2) Escribe un programa que calcule el factorial de un número ingresado por el usuario,
         *   pero permitiendo calcular el factorial de varios números consecutivos.
         */
/*
        System.out.println("\033[36m" + "//--EJERCICIO 2--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese un entero: " + "\u001B[0m");
        Scanner scannerBasic1 = new Scanner(System.in);
        String datoIngresado1 = scannerBasic1.next();
        Integer numeroIngresado1 = Integer.parseInt(datoIngresado1);
        Integer factorial = 1;
        //Aplica cuando se solicita Factorial = 1, caso degenerado o basico que no requiere cuenta.
        if (numeroIngresado1 == 1) {
            System.out.println("El factorial de: 1 es: 1");
        } else {
        //Aplica cuando se solicita Factorial > 1.
            for (int i = 2; i <= numeroIngresado1+1; i++) {
                factorial = factorial * (i-1);
            }
        }
        System.out.println("El factorial de: " + numeroIngresado1 + " es: " + factorial);
    }
 */
        /* Fin Ejercicio Nro 2 */
        /*---------------------------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 3 */

        /**
         *3) Escribe un programa que calcule cuántos días laborables (sin contar fines de semana)
         *      entre 2 fechas.
         */
/*
        System.out.println("\033[36m" + "//--EJERCICIO 3--\\" + "\u001B[0m");

        //Datos inciales (fecha inicial, fecha final)
        String fechaInicialString = "2024-01-01";
        String fechaFinalString = "2024-01-31";

        LocalDate fechaInicial = LocalDate.parse(fechaInicialString);
        LocalDate fechaFinal = LocalDate.parse(fechaFinalString);

        //Calculo de dias entre la fecha inicial y la final
        Integer cantidadDias = fechaFinal.getDayOfYear() - fechaInicial.getDayOfYear();

        Integer diasLaborables = 0;
        String diaTemporal;
        LocalDate fechaTemporal;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("E");

        String diasDeSemanaLaborables = "lun,mar,mié,jue,vie";
        //Desde fecha de inicio hasta fecha fin, obtengo el dia de la semana y determino si es o no laboral
        for(int i=0; i<=cantidadDias; i++ ){
            fechaTemporal = fechaInicial.plusDays(i);
            diaTemporal = fechaTemporal.format(formato);
            if (diasDeSemanaLaborables.indexOf(diaTemporal) >= 0 ) {
                diasLaborables = diasLaborables + 1;
            }
        }
        System.out.println("La cantidad de dias laborables es: " + diasLaborables);
    }
*/
        /* Fin Ejercicio Nro 3 */
        /*---------------------------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 4 */
        /**
         *4) Escribe un programa que solicite al usuario su fecha de nacimiento y calcule la
         *      fecha de jubilación considerando la edad de jubilación estándar
         *      (por ejemplo, 65 años).
         */
/*
        System.out.println("\033[36m" + "//--EJERCICIO 4--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese su fecha de nacimiento (dd-mm-yyyy): " + "\u001B[0m");
        Scanner scannerBasic1 = new Scanner(System.in);
        String datoIngresado1 = scannerBasic1.next();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(datoIngresado1, formato);
        LocalDate fechaJubilacion = fechaNacimiento.plusYears(65);
        System.out.println("La fecha de jubilacion sera: "+ fechaJubilacion);
    }
 */
        /* Fin Ejercicio Nro 4 */
        /*---------------------------------------------------------------------------------------------------*/
        /* Inicio Ejercicio Nro 5 */
        /**
         *5) Escribe un programa que solicite al usuario los catetos de
         *      un triángulo rectángulo y calcule e imprima la longitud de la hipotenusa.
         */
        System.out.println("\033[36m" + "//--EJERCICIO 5--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese longitud del cateto 1: " + "\u001B[0m");
        Scanner scannerBasic1 = new Scanner(System.in);
        String datoIngresado1 = scannerBasic1.next();
        Integer longitudCateto1 = Integer.parseInt(datoIngresado1);
        System.out.print("\033[33m" + "Ingrese longitud del cateto 2: " + "\u001B[0m");
        String datoIngresado2 = scannerBasic1.next();
        Integer longitudCateto2 = Integer.parseInt(datoIngresado2);

        Integer longitudHipotenusa = (longitudCateto1 * longitudCateto1) + (longitudCateto2 * longitudCateto2);
        System.out.println("La longitud de la hipotenusa es: "+ longitudHipotenusa);
    }
    /* Fin Ejercicio Nro 5 */
}