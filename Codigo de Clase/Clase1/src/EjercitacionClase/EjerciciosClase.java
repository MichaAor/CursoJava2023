package EjercitacionClase;

public class EjerciciosClase {
    public static void main(String[] args) {
/**
 *             //-- EJERCITACION DE CLASE --//
 * --Realizar la ejercitacion sobre el este main.
 * 1) Declara e inicializa por separado 2 variables, una de tipo primitivo y otra de referencia [String Class]:
 */
        System.out.println("\033[36m" + "//--EJERCICIO 1--//" + "\u001B[0m");
        int edad = 48;
        String nombre = "Veronica";

//a) Imprime ambas usando el metodo sout.
        System.out.println("\033[32m" + "--Ej A--" + "\u001B[0m");
        System.out.println("Variable 'edad' = " + edad);
        System.out.println("Variable 'nombre' = " + nombre);

//b) Concatena ambas variables y enseña por pantalla el resultado (puede o no usar una variable auxiliar).
        System.out.println("\033[32m" + "--Ej B--" + "\u001B[0m");
        System.out.println("La dama tiene " + edad + " anios y se llama " + nombre);


// 2) Corregir la cadena: "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.
        System.out.println("\033[36m" + "\n//--EJERCICIO 2--//" + "\u001B[0m");
        String cadena = "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.";

        System.out.println("Cadena a corregir: " + "\033[31m" + cadena + "\u001B[0m");

        cadena = cadena.replace("3", "e");
        cadena = cadena.replace("0", "o");
        cadena = cadena.replace("1", "i");
        cadena = cadena.replace("4", "a");
        cadena = cadena.replace("paginas WeBS", "programas");
        cadena = cadena.trim().toLowerCase();

        System.out.println("Cadena corregida: " + "\033[32m" + cadena + "\u001B[0m");

 //Observaciones: C es un lenguaje POO? Se usa para hacer paginas Web?

// 3) Demuestra tus conocimientos aplicando al menos 4 metodos (no usados anteriormente) y muestralos en la consola.
        System.out.println("\033[36m" + "\n//--EJERCICIO 3--//" + "\u001B[0m");
        String cadenaDemo = "Hola Mundo";
        System.out.println("Cadena DEMO: " + "\033[31m" + cadena + "\u001B[0m");

// Uso del método length()
        System.out.println("\033[32m" + "\n.length()" + "\u001B[0m");
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);

// Uso del método substring()
        System.out.println("\033[32m" + "\n.substring()" + "\u001B[0m");
        String subcadena = cadena.substring(20, 44);
        System.out.println("Subcadena: " + subcadena);

// Uso del método charAt()
        System.out.println("\033[32m" + "\n.charAt()" + "\u001B[0m");
        char caracter = cadena.charAt(89);
        System.out.println("El carácter numero 90 de la cadena es: " + caracter);

// Uso del método contains()
        System.out.println("\033[32m" + "\n.contains()" + "\u001B[0m");
        System.out.println("¿Contiene 'rama'? " + cadena.contains("rama"));

//Observacion: Una variable borrada, ya que no se usaba, el charAt() lanza excepcion.
//Excelente Documentacion.
    }
}