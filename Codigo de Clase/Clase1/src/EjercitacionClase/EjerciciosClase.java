package EjercitacionClase;

public class EjerciciosClase {
    public static void main(String[] args) {
      /**
       *                                        //-- EJERCITACION DE CLASE --//
       * --Realizar la ejercitacion sobre el este main.
       * 1) Declara e inicializa por separado 2 variables, una de tipo primitivo y otra de referencia [String Class]:
       *    a) Imprime ambas usando el metodo sout.
       *    b) Concatena ambas variables y enseña por pantalla el resultado (puede o no usar una variable auxiliar).
       * 2) Corregir la cadena: "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.
       * 3) Demuestra tus conocimientos aplicando al menos 4 metodos (no usados anteriormente) y muestralos en la consola.
       */

      //Ejercicio 1
      System.out.println("\033[36m" + "\n//--EJERCICIO 1--//" + "\u001B[0m");
      char variable1 = 'A';
      String variable2 = "A";

      System.out.println("\033[33m" + "--EJERCICIO A--" + "\u001B[0m");
      System.out.println("El valor de variable1 es: " +variable1);
      System.out.println("El valor de variable2 es: " +variable2);

      System.out.println("\033[33m" + "--EJERCICIO B--" + "\u001B[0m");
      System.out.println("variable1 concatenada a variable2 es: "+ variable1 + variable2);

      //Ejercicio 2
      System.out.println("\033[36m" + "\n//--EJERCICIO 2--//" + "\u001B[0m");
      variable2 = "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS";

      System.out.println("El valor inicial del texto es: "+ variable2);
      variable2 = variable2.trim();
      variable2 = variable2.replace('3','e');
      variable2 = variable2.replace('0','o');
      variable2 = variable2.replace('1','i');
      variable2 = variable2.toLowerCase();
      variable2 = variable2.replace('4','a');
      System.out.println("El valor final del texto es: "+ variable2);
      //Correccion: C es un lenguaje POO? Se usa para hacer paginas WEB?

      
      //Ejercicio 3
      System.out.println("\033[35m" + "\n//--EJERCICIO 3--//" + "\u001B[0m");
      System.out.println("Cadena Actual: " + "\033[31m" + variable2 + "\u001B[0m");

      //Convirtiendo toda la cadena a mayuscula con .toUpperCase()
      System.out.println("\033[33m" + "\nAplico .toUpperCase()" + "\u001B[0m");
      variable2 = variable2.toUpperCase();
      System.out.println("toUpperCase(): "+ variable2);

      //Obteniendo extension de cadena con .length()
      System.out.println("\033[33m" + "\nAplico .toUpperCase()" + "\u001B[0m");
      System.out.println("Extension de la cadena: "+ variable2.length());

      //Comparando con .equals()
      System.out.println("\033[33m" + "\nComparando con .equals()" + "\u001B[0m");
      String cadena1 = "Demuestra tus conocimientos aplicando al menos 4 metodos";
      String cadena2 = "Demuestra tus conocimientos aplicando al menos 3 metodos";
      System.out.println("Cadena 1: " + "\033[31m" + cadena1 + "\u001B[0m");
      System.out.println("Cadena 2: " + "\033[31m" + cadena2 + "\u001B[0m");

      if(cadena1.equals(cadena2)){
        System.out.println("Resultado de comparacion: " + "\033[32m" + "cadena1 y cadena2 son iguales" + "\u001B[0m");
      } else {
        System.out.println("Resultado de comparacion: " + "\033[31m" + "cadena1 y cadena2 son diferentes" + "\u001B[0m");
      }

      //Obteniendo primera posicion de coincidencia con .indexOf(String cadenaABuscar)
      System.out.println("\033[33m" + "\nComparando con .equals()" + "\u001B[0m");
      System.out.println("Cadena a filtar: " + "\033[31m" + cadena2 + "\u001B[0m");
      System.out.println("Posicion de la cadena 'conocimientos' usando .indexOf(): " + cadena2.indexOf("conocimientos"));
    }
}