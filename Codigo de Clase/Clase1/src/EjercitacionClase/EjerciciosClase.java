package EjercitacionClase;

public class EjerciciosClase {
    public static void main(String[] args) {
      /**
       *                                        //-- EJERCITACION DE CLASE --//
       * --Realizar la ejercitacion sobre el este main.
       * 1) Declara e inicializa por separado 2 variables, una de tipo primitivo y otra de referencia [String Class]:
       */

      int edad=48;
      String nombre= "Veronica";

        /**  a) Imprime ambas usando el metodo sout.
         */

        System.out.println(edad);
        System.out.println(nombre);

       /**b) Concatena ambas variables y enseña por pantalla el resultado (puede o no usar una variable auxiliar).
 */


        System.out.println("La dama tiene " + edad + " anios y se llama "+ nombre);


        /** * 2) Corregir la cadena: "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.
         */


        String cadena = "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.";

        cadena = cadena.replace("3", "e");
        cadena = cadena.replace("0", "o");
        cadena = cadena.replace("1", "i");
        cadena = cadena.replace("4", "a");
        cadena = cadena.replace("paginas WeBS","programas");

        System.out.println(cadena.trim().toLowerCase());

         /**
    * 3) Demuestra tus conocimientos aplicando al menos 4 metodos (no usados anteriormente) y muestralos en la consola.
    */

      String cadenaDemo = "Hola Mundo";

// Uso del método length()
      int longitud = cadena.length();
      System.out.println("Longitud de la cadena: " + longitud);

// Uso del método substring()
      String subcadena = cadena.substring(20, 44);
      System.out.println("Subcadena: " + subcadena);

// Uso del método charAt()
      char caracter = cadena.charAt(89);
      System.out.println("El carácter numero 90 de la cadena es: " + caracter);

// Uso del método contains()
      System.out.println("¿Contiene 'rama'? " + cadena.contains("rama"));
}
}