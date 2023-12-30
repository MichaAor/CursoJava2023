package EjercitacionClase;

import java.util.Scanner;

public class EjerciciosClase {
  public static void main(String[] args) {
    // ejercicio1();
    // ejercicio2();
    //ejercicio3();
    ejercicio4();
  }

//* 1) Muestra la tabla de multiplicar de un número introducido por teclado.
  public static void ejercicio1() {
    // Crear un objeto Scanner para la entrada estándar (teclado)
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el valor a multiplicar: ");
    // Esta variable contiene el valor a ser multiplicado
    int multiplicado = sc.nextInt();

    // Limpiamos el buffer
    sc.nextLine();
    sc.close();

    // Este for se encarga de incrementar los multiplicadores
    // i * j = resultado
    for (int i = 1; i <= 10; i++) {
      // Mostramos todas las partes involucradas junto al resultado.
      System.out.println("[" + multiplicado + "X" + i + " = " + (multiplicado * i) + "]   ");
      // Hacemos un salto de linea para separar cada tabla de multiplicacion
      if (i == 10) {
        System.out.println();
      }
    }

  }

  public static void ejercicio2() {
    /*
     * 2) Realiza un programa que nos diga cuántos dígitos tiene un número
     * introducido por teclado
     * limitado a 5 dígitos como máximo y el tipo de dato debe ser 'int' o 'long'.
     */
    Scanner sca = new Scanner(System.in);

    System.out.println("Ingrese un numero de hasta 5 digitos:");
    // Esta variable contiene el valor al que se le contara los digitos.
    int numero = sca.nextInt();
    sca.close();

    if (numero <= 99999) {
      if (numero < 10) {
        System.out.println("el numero ingresado " + numero + " tiene 1 digito");
      }
      if (numero > 10 && numero < 100) {
        System.out.println("el numero ingresado " + numero + " tiene 2 digitos");
      }
      if (numero > 100 && numero < 1000) {
        System.out.println("el numero ingresado " + numero + " tiene 3 digitos");
      }
      if (numero > 1000 && numero < 10000) {
        System.out.println("el numero ingresado " + numero + " tiene 4 digitos");
      }
      if (numero > 10000 && numero < 1000000) {
        System.out.println("el numero ingresado " + numero + " tiene 5 digitos");
      }
    } else {
      System.out.println("Error, ingreso un valor mayor al indicado");
    }
  }

  /**
   * 3) Escribe un programa que calcule la media de un conjunto de números
   * positivos introducidos por teclado. A priori, el programa no sabe cuántos
   * números se introducirán. El usuario indicará que ha terminado de introducir los datos
   * cuando meta un número negativo.
   */
  public static void ejercicio3() {
    Scanner scan = new Scanner(System.in);
    int numero;
    int suma = 0;
    int numerosIngresados = 0;
    float promedio;
    
    do {
      System.out.println("Ingrese un numero:");
      numero = scan.nextInt();

      if (numero > 0) {
        // La variable 'suma' se usa como acumulador.
        // El equivalente al codigo de abajo es ->  suma += numero;
        suma = suma + numero;

        // La variable 'numerosIngresados' funciona como contador.
        // Aumentara cada vez que el numero ingresado sea positivo.
        numerosIngresados++; 
      }

      //'suma' contiene la suma de los numeros positivos ingresados.
      //'numerosIngresados' contiene la cantidad de numeros positivos que se sumaron.
      //'promedio' contiene la division entre 'suma' y 'numerosIngresados'. 
      promedio = suma / numerosIngresados;
      
    // Con cada iteracion sumaremos el numero si es mayor a 0.
    // Caso contrario, salimos del bucle.
    } while (numero > 0);

    System.out.println("Ya no se pueden ingresar mas numeros.\nEl promedio es: " + promedio);
    scan.close();
  }

/* 
* 4) Escribe un programa que ingrese diez números y determine cuántos son positivos, 
*   y cuántos son negativos.
*/
  public static void ejercicio4(){ 
    Scanner scan = new Scanner(System.in);
    int numero;
    int contadorPositivo = 0;
    int contadorNegativo = 0;


    //*Usamos for porque sabemos la cantidad finita de iteraciones
    //? Necesito ingresar 10 numeros
    for(int i = 0; i < 10 ; i++){
      System.out.println("\nLleva " + i + " numeros ingresados");
      System.out.println("Ingrese un numero:");
      numero = scan.nextInt();

      //*Son positivos?
      if(numero > 0 ){
          contadorPositivo++;
      }

      //! Son negativos?
      if(numero < 0 ){
        contadorNegativo++;
      }
    }
    //Ya son 10
 System.out.println("De los numeros ingresados hay " + contadorPositivo + " Positivos y " 
                        + contadorNegativo + " Negativos");
  }
}
