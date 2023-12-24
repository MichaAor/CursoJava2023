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

      char variable1 = 'A';
      String variable2 = "A";
      System.out.println("El valor de variable1 es: " +variable1);
      System.out.println("El valor de variable2 es: " +variable2);
      System.out.println("variable1 concatenada a variable2 es: "+ variable1 + variable2);

      variable2 = "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS";
      System.out.println("El valor inicial del texto es: "+ variable2);
      variable2 = variable2.trim();
      variable2 = variable2.replace('3','e');
      variable2 = variable2.replace('0','o');
      variable2 = variable2.replace('1','i');
      variable2 = variable2.toLowerCase();
      variable2 = variable2.replace('4','a');
      System.out.println("El valor final del texto es: "+ variable2);


      variable2 = variable2.toUpperCase();
      System.out.println("toUpperCase(): "+ variable2);

      System.out.println("length: "+ variable2.length());

      String cadena1 = "Demuestra tus conocimientos aplicando al menos 4 metodos";
      String cadena2 = "Demuestra tus conocimientos aplicando al menos 3 metodos";
      if(cadena1.equals(cadena2)){
          System.out.println("cadena 1 y cadena 2 son iguales");
      } else {
          System.out.println("cadena 1 y cadena 2 son distintas");
      }
      System.out.println("Posicion de conocimientos, dentro del texto: " + cadena2 + ". " + "Posicion: " + cadena2.indexOf("conocimientos"));
    }
}