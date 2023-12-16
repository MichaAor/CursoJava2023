package codigoDeClase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
//       entradasBasicas();
//       entradaValidada();
//       entradaConCierreAutomatico();
//       entradaDelimiter();
    }

    public static void entradasBasicas(){
        // Crear un objeto Scanner para la entrada estándar (teclado)
        Scanner scannerBasic = new Scanner(System.in);

        // ENTRADA DE NUMEROS
        System.out.print("\033[36m"+"//--ENTRADA DE DATOS NUMERICOS--\\"+"\u001B[0m");

        System.out.print("\033[33m"+"\nIngrese un entero: "+"\u001B[0m");
        int numeroEntero = scannerBasic.nextInt();
        System.out.println("\033[35m"+"El numero ingresado fue: "+ numeroEntero +"\u001B[0m");

        System.out.print("\033[33m"+"\nIngrese un número decimal: "+"\u001B[0m");
        double numeroDecimal = scannerBasic.nextDouble();
        System.out.println("\033[35m"+"El decimal ingresado fue: "+ numeroDecimal +"\u001B[0m");

        // Consumir el salto de línea pendiente
        scannerBasic.nextLine();

        // ENTRADA DE TEXTO,CADENA Y BOOLEANO
        System.out.print("\033[36m"+"\n//--ENTRADA DE TEXTO, CADENA Y BOOLEANO--\\"+"\u001B[0m");

        System.out.print("\033[33m"+"\nIngrese una cadena: "+"\u001B[0m");
        String cadena = scannerBasic.nextLine();
        System.out.println("\033[35m"+"La cadena ingresada fue: "+ cadena +"\u001B[0m");

        System.out.print("\033[33m"+"\nIngrese un carácter: "+"\u001B[0m");
        char caracter = scannerBasic.next().charAt(0);
        System.out.println("\033[35m"+"El caracter ingresado fue: "+ caracter +"\u001B[0m");

        System.out.print("\033[33m"+"\nIngrese un valor booleano (true/false): "+"\u001B[0m");
        boolean valorBooleano = scannerBasic.nextBoolean();
        System.out.println("\033[35m"+"El booleano ingresado fue: "+ valorBooleano +"\u001B[0m");

        // Cierre del Scanner
        scannerBasic.close();
    }

    public static void entradaValidada(){
        // Crear un objeto Scanner para la entrada estándar (teclado)
        Scanner scannerValid = new Scanner(System.in);

        // VALIDACION DE ENTRADA
        System.out.print("\033[36m"+"\n//--ENTRADA DE ENTERO Y VALIDACION--\\"+"\u001B[0m");
        System.out.print("\033[33m"+"\na. Ingrese un entero: "+"\u001B[0m");
        if (scannerValid.hasNextInt()) {
            int otroEntero = scannerValid.nextInt();
            System.out.println("\033[35m" + "El entero ingresado fue: "+ otroEntero + "\u001B[0m");
        } else {
            System.out.println("\033[31m" + "No se ingresó un entero válido." + "\u001B[0m");
        }

        // Cierre del Scanner
        scannerValid.close();
    }

    public static void entradaConCierreAutomatico(){
        // Uso de try-with-resources para garantizar el cierre automático del Scanner
        System.out.print("\033[36m"+"\n//--USO DE TRY CATCH PARA CIERRE AUTOMATICO DEL SCANNER--\\"+"\u001B[0m");
        try (Scanner scannerTry = new Scanner(System.in)) {
            // Ejemplo de lectura de un número entero
            System.out.print("\033[33m"+"\nIngrese un número entero: "+"\u001B[0m");
            int numeroEnteroTry = scannerTry.nextInt();
            System.out.println("\033[35m" + "Número ingresado: " + numeroEnteroTry + "\u001B[0m");
        } catch (InputMismatchException e) {
            // Manejar la excepción cuando la entrada no coincide con el tipo esperado
            System.out.println("\033[31m" + "Error: La entrada no es del tipo esperado." + "\u001B[0m");
        }
        // No es necesario cerrar explícitamente el Scanner,
        // ya que try-with-resources se encarga de ello automáticamente
    }

    public static void entradaDelimiter(){
        // Crear un Scanner que utiliza el guión como delimitador
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[33m"+"\nIngrese lenguajes de programacion separados por / : "+"\u001B[0m");

        Scanner scannerDeli = new Scanner(scanner.next());

        // Configurar el delimitador
        scannerDeli.useDelimiter("/");

        // Leer e imprimir cada palabra
        while (scannerDeli.hasNext()) {
            String palabra = scannerDeli.next();
            System.out.println("\033[35m"+"Lenguaje: " + palabra +"\u001B[0m");
        }

        // Cierre del Scanner
        scannerDeli.close();
    }
}