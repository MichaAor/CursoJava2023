import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 4)	Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta
         *      que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
         *      A partir de la hora 41, se pagan a 16 euros la hora(Se recibe las horas totales por teclado).
         */
/**
        System.out.println("\033[36m" + "//--EJERCICIO 4--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese horas totales: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado = scannerBasic.next();
        int salarioSemanal = 0;
        int horasOrdinarias = 0;
        int horasExtras = 0;
        int totalHoras = Integer.parseInt(datoIngresado);
        if (totalHoras > 40){
            // El calculo incluye horas extras.
            horasOrdinarias = 40;
            horasExtras = totalHoras -40;
            salarioSemanal = (horasOrdinarias * 12) + (horasExtras * 16);
        } else{
            // El calculo NO incluye horas extras.
            salarioSemanal = totalHoras * 12;
        }
        System.out.println("El salario semanal es: "+salarioSemanal);
    }
*/

    /**
     * 23)	Realiza el control de acceso a una caja fuerte donde la combinación será ingresada por teclado,
     *      un número de 4 cifras. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la
     *      combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
     *      Tendremos cuatro oportunidades para abrir la caja fuerte.
     */

        System.out.println("\033[36m" + "//--EJERCICIO 5--\\" + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado;
        int totalHoras;
        String claveSecreta = "1234";
        int cantIntentosActuales = 0;
        int cantIntentosMaximo = 4;
        String claveIngresada = "";
        do {
            cantIntentosActuales++;
            System.out.print("\033[33m" + "Ingrese clave secreta: " + "\u001B[0m");
            claveIngresada = scannerBasic.next();
           } while (!claveIngresada.equals(claveSecreta) && cantIntentosActuales < cantIntentosMaximo);
        if(claveIngresada.equals(claveSecreta)){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        } else {
            System.out.println("Despues de 4 intentos no pudiste adivinar la clave, seguis siendo pobre.");
        }
    }

}