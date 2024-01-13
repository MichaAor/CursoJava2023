import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;
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
         cadenaAltura = cadenaAltura.replace(',', '.');
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
         } else if (masaCorporal >= 40) {
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

/**----------------------------------------------------------------------------------------*/
/**----------------------------------------------------------------------------------------*/
/**----------------------------------------------------------------------------------------*/
    // Repaso //
    //repasoEjercicio1();
    //repasoEjercicio2();
    //repasoEjercicio3();
    //repasoEjercicio4();
    repasoEjercicio5();
    //repasoEjercicio6();
    //repasoEjercicio7();
    //repasoEjercicio8();
    //repasoEjercicio9();
    //repasoEjercicio10();
    }
    // Repaso Inicio Ejercicio Nro 1 //
   public static void repasoEjercicio1 ()
    {
        /**
         * 8)	Escribe un programa Java que demuestre el uso de clases wrapper para convertir un int a un
         * Integer y realizar una operación aritmética.
         *
         */

        int valorEjemploInt = 100;
        Integer valorEjemploInteger = null;
        System.out.println("El valor de la variable declarada como int es: "+ valorEjemploInt);
        System.out.println("El valor de la variable declarada como Integer es: "+ valorEjemploInteger);

        //Convierto a Integer
        valorEjemploInteger = valorEjemploInt;
        System.out.println("Luego de la conversion de int a Integer,el valor de la variable Integer es: "+ valorEjemploInteger);
        valorEjemploInteger = valorEjemploInteger * 2;
        System.out.println("El valor de la variable Integer luego de multiplicarla por 2, es: "+ valorEjemploInteger);
    }

    // Repaso Fin Ejercicio Nro 1 //
/**----------------------------------------------------------------------------------------*/

// Repaso Inicio Ejercicio Nro 2 //
    public static void repasoEjercicio2 () {


/** 9)	Ingresar por teclado todos tus datos personales para armar un cv y mostrarlo por pantalla.
 *
 */
        System.out.print("Ejercicio2 CV");
        // Capturo datos del CV
        System.out.print("\033[33m" + "\nIngrese Apellido y Nombre: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String apellidoNombre = scannerBasic.nextLine();
        System.out.print("\033[33m" + "\nIngrese Direccion: " + "\u001B[0m");
        String direccion = scannerBasic.nextLine();
        System.out.print("\033[33m" + "\nIngrese Localidad: " + "\u001B[0m");
        String localidad = scannerBasic.nextLine();

        // informo datos del CV
        System.out.println("-------Curriculum Vitae-------");
        System.out.println(" ");
        System.out.println(">Datos Personales<");
        System.out.println("Apellido y Nmbre: "+apellidoNombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Localidad: "+localidad);
        System.out.println(" ");
        System.out.println(">Estudios<");
        System.out.println("-------Curriculum Vitae-------");
        scannerBasic.close();
    }
// Repaso Fin Ejercicio Nro 2 //

    /**----------------------------------------------------------------------------------------*/

// Repaso Inicio Ejercicio Nro 3 //

    /**10)	Crear un programa que determine en qué día de la semana naciste y cuántos días
     *      faltan para tu próximo cumpleaños.
     */

    public static void repasoEjercicio3 () {
        System.out.print("Ejercicio3");
        System.out.print("\033[33m" + "\nIngrese Fecha de nacimiento (yyyy-mm-dd): " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String fechaNacimientoStr = scannerBasic.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        //formateo a dia de la semana
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("E");
        String diaNacimiento = null;
        //convierto a dia de la semana amigable para el usuario
        switch(fechaNacimiento.format(formato)){
            case "lun":
                diaNacimiento = "Lunes";
                break;
            case "mar":
                diaNacimiento = "Martes";
                break;
            case "mié":
                diaNacimiento = "Miércoles";
                break;
            case "jue":
                diaNacimiento = "Jueves";
                break;
            case "vie":
                diaNacimiento = "Viernes";
                break;
            case "sáb":
                diaNacimiento = "Sábado";
                break;
            case "dom":
                diaNacimiento = "Domingo";
                break;
        }

        System.out.println("Tu dia de nacimiento fue: "+diaNacimiento);

        //determino si la fecha de cumpleaños esta antes o despues de la fecha actual
        if (fechaNacimiento.isAfter(LocalDate.now())){
            System.out.println("Faltan " + ChronoUnit.DAYS.between(LocalDate.now(),fechaNacimiento)+ " para tu cumpleaños.");
        } else {
            System.out.println("Pasaron " + ChronoUnit.DAYS.between(fechaNacimiento,LocalDate.now())+ " para tu cumpleaños.");
        }
        scannerBasic.close();
        }
    // Repaso Fin Ejercicio Nro 3 //
    /**----------------------------------------------------------------------------------------*/
/**
 * 11)	Escribe un programa que utilice al menos tres métodos de la clase Math para realizar operaciones
 * matemáticas y muestre los resultados.
 */
    // Repaso Inicio Ejercicio Nro 4 /
    public static void repasoEjercicio4 () {
        Integer valor1 = 500;
        Integer valor2 = 100;
        Integer valor3 = 20;
        Integer resultado1 = null;
        Integer resultado2 = null;
        Double resultado3 = null;
        //uso de max
        resultado1 = Math.max(valor1,valor2);
        resultado2 = Math.max(resultado1,valor3);
        System.out.println("El valor maximo entre los valores: "+valor1+" , "+valor2+" y " + valor3 +" es: "+resultado2);
        //uso de random
        resultado3 = Math.random()*10;
        System.out.println("Numero al azar entre 1 y 10 es: " + resultado3.intValue());
        //uso de log
        System.out.println("El logaritmo natural: " +Math.log(resultado3) + " corresponiente al numero al azar: "+ resultado3.intValue());
    }
    // Repaso Fin Ejercicio Nro 4 //
    /**----------------------------------------------------------------------------------------*/
    /**
     * 12)	Desarrolla un programa que solicite al usuario ingresar una serie de números hasta
     * que introduzca un valor negativo. Luego, realiza las siguientes estadísticas:
     * ❖	Número máximo y mínimo.
     * ❖	Promedio de los números ingresados.
     * ❖	Suma total.
     * ❖	Cantidad de números primos y no primos.
     */
    // Repaso Inicio Ejercicio Nro 5 /
    public static void repasoEjercicio5 () {
        Scanner scannerBasic = new Scanner(System.in);
        Integer valorMaximo = 0;
        Integer valorMinimo = 999999999;
        Integer sumatoriaNumeros = 0;
        Integer cantPrimos = 0;
        Integer cantidadNumeros = 0;
        Integer numeroIngresado = null;
        Double  promedio = 0D;
        do{
            System.out.print("\033[33m" + "\nIngrese numero (finaliza con negativo): " + "\u001B[0m");
            numeroIngresado = scannerBasic.nextInt();
            if(numeroIngresado > 0) {
                if (numeroIngresado > valorMaximo) {
                    valorMaximo = numeroIngresado;
                }
                if (numeroIngresado < valorMinimo) {
                    valorMinimo = numeroIngresado;
                }
                if (esPrimo(numeroIngresado)) {
                    cantPrimos++;
                }
                sumatoriaNumeros = sumatoriaNumeros + numeroIngresado;
                cantidadNumeros++;
            }
        } while (numeroIngresado > 0);
        System.out.println("El numero maximo ingresado fue: " + valorMaximo);
        System.out.println("El numero minimo ingresado fue: " + valorMinimo);
        promedio = (double) (sumatoriaNumeros/cantidadNumeros);
        System.out.println("El promedio fue: "+ promedio);
        System.out.println("Suma total: "+sumatoriaNumeros);
        System.out.println("Cantidad de primos: " + cantPrimos);
        System.out.println("Cantidad de no primos: "+ (cantidadNumeros - cantPrimos));
        scannerBasic.close();
    }
    // Función para verificar si un número es primo
    public static Boolean esPrimo(Integer numeroIngresado){
        if (numeroIngresado <= 0) {
            return false;
        } else if (Math.floorMod(numeroIngresado, 2) == 0) {
            return false;
        } else if (Math.floorMod(numeroIngresado, 3) == 0) {
            return false;
        } else if (Math.floorMod(numeroIngresado, 5) == 0) {
            return false;
        } else if (Math.floorMod(numeroIngresado, 7) == 0) {
            return false;
        } else if (Math.floorMod(numeroIngresado, 11) == 0) {
            return false;
        } else {
            return true;
        }
    }

    // Repaso Fin Ejercicio Nro 5 //
    /**----------------------------------------------------------------------------------------*/

    // Repaso Inicio Ejercicio Nro 6 /
    public static void repasoEjercicio6 () {

    }
    // Repaso Fin Ejercicio Nro 6 //
    /**----------------------------------------------------------------------------------------*/

    // Repaso Inicio Ejercicio Nro 7 /
    public static void repasoEjercicio7 () {

    }
    // Repaso Fin Ejercicio Nro 7 //

    /**----------------------------------------------------------------------------------------*/

    // Repaso Inicio Ejercicio Nro 8 /
    public static void repasoEjercicio8 () {

    }
    // Repaso Fin Ejercicio Nro 8 //
    /**----------------------------------------------------------------------------------------*/

    // Repaso Inicio Ejercicio Nro 9 /
    public static void repasoEjercicio9 () {

    }
    // Repaso Fin Ejercicio Nro 9 //
    /**----------------------------------------------------------------------------------------*/

    // Repaso Inicio Ejercicio Nro 10 /
    public static void repasoEjercicio10 () {

    }
    // Repaso Fin Ejercicio Nro 10 //
}