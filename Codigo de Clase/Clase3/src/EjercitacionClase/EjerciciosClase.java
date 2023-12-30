package EjercitacionClase;
import java.util.Scanner;

public class EjerciciosClase {
    public static void main(String[] args) {
      //ejercicio1();
      ejercicio2();
    }

    
    public static void ejercicio1(){
// 1) Muestra la tabla de multiplicar de un número introducido por teclado.
      
      // Crear un objeto Scanner para la entrada estándar (teclado)
      Scanner sc = new Scanner(System.in);

      System.out.print("Ingrese el valor a multiplicar: ");
      // Esta variable contiene el valor a ser multiplicado
      int multiplicado = sc.nextInt();

      //Limpiamos el buffer
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
      

      public static void ejercicio2(){
/*2) Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado 
      limitado a 5 dígitos como máximo y el tipo de dato debe ser 'int' o 'long'.
*/
      Scanner sca = new Scanner(System.in);

      System.out.println("Ingrese un numero de hasta 5 digitos:");
      // Esta variable contiene el valor al que se le contara los digitos.
      int numero = sca.nextInt();
      sca.close();

      if (numero <= 99999) {
        if (numero  < 10){
          System.out.println("el numero ingresado " +numero + " tiene 1 digito");
        }
        if (numero > 10 && numero < 100) {
          System.out.println("el numero ingresado " +numero + " tiene 2 digitos");
        }
         if (numero > 100 && numero < 1000) {
          System.out.println("el numero ingresado " +numero + " tiene 3 digitos");
        }
        if (numero > 1000 && numero < 10000) {
            System.out.println("el numero ingresado " +numero + " tiene 4 digitos");
        }
        if (numero > 10000 && numero < 1000000) {
            System.out.println("el numero ingresado " +numero + " tiene 5 digitos");
        }
      }else{
        System.out.println("Error, ingreso un valor mayor al indicado");
      }
      
    }
  
}
  
    






/* 
   * 
   * 3) Escribe un programa que calcule la media de un conjunto de números
   * positivos
   * introducidos por teclado. A priori, el programa no sabe cuántos números se
   * introducirán. El usuario indicará que ha terminado de introducir los datos
   * cuando meta un número negativo.
   * 4) Escribe un programa que lea una lista de diez números y determine cuántos
   * son positivos, y cuántos son negativos.
   * 5) Escribe un programa que pida una base y un exponente (entero positivo) y
   * que
   * calcule la potencia..
   * 1) Escribe un programa que diga si un número introducido por teclado es o no
   * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
   * unidad.
   */
