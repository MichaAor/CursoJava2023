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

        int numero=1;
        String nombre= "Micha";
        System.out.println(nombre+" es el numero "+numero+"!");

       // 2) Corregir la cadena: "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.

        String original="                 C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.";

        String nuevo;
        //1.pasar a mayuscula
        nuevo=original.toUpperCase();

        //2.pasar a borrar espacios sobrantes
        nuevo=nuevo.trim();

        //3.reemplazar 3 por E
        nuevo=nuevo.replace('3','E');

        //4.reemplazar 4 por A
        nuevo=nuevo.replace('4','A');

        //5.reemplazar 0 por O
        nuevo=nuevo.replace('0','O');

        //6.reemplazar 1 por I
        nuevo=nuevo.replace('1','I');

        //7. corregir el mensaje
        nuevo=nuevo.replace("C ", "C NO ");
        nuevo=nuevo.replace("WEBS", "WEB");

        System.out.println(nuevo);

       // 3) Demuestra tus conocimientos aplicando al menos 4 metodos (no usados anteriormente) y muestralos en la consola.
/*
       //metodo contains
        System.out.println("\033[32m" + "el metodo a mostrar es String.contains(String cadenaAcomparar)"+ "\u001B[0m" );
        boolean contains= nuevo.contains("x");
        System.out.println(" la cadena original contiene el fragmento que pase? " +contains);

        //metodo compare to
        String nuevo2="JAVA ES UN LENGUAJE DE PROGRAMACION ORIENTADO A OBJETOS";
        int resultado= nuevo.compareTo(nuevo2);
        if (resultado==0) {
            System.out.println("Las cadenas de texto son iguales ");
        } else if (resultado<0) {
            System.out.println("la cadena "+ nuevo +" es mayor que la cedena "+ nuevo2);
        }else System.out.println("la cadena "+ nuevo +" es menor que la cedena "+ nuevo2);

        //metodo lenght
        int largocadena= nuevo.length();
        System.out.println("el largo de la cadena "+ nuevo+" es igual a "+largocadena +" caracteres");

        //metodo Char At
    char letra= nuevo.charAt(6);
        System.out.println("la letra de la cadena '"+ nuevo+ "' indicada en la posicion 6 es una letra '"+letra+"'");
*/
        String nuevo2="JAVA ES UN LENGUAJE DE PROGRAMACION ORIENTADO A OBJETOS";
        String cad1 = nuevo;
        String cad2 = nuevo2;

        System.out.println("\033[36m" + "Metodo: string1.compareTo(String string2)"+ "\u001B[0m");
        System.out.println("Cadena 1 = '" + cad1 + "'");
        System.out.println("Cadena 2 = '" + cad2 + "'");

        String message = "El metodo devuelve el resultado: "+ cad1.compareTo(cad2)+".";
        String message2 = (cad1.compareTo(cad2)<0)? "la primera cadena es menor." : (cad1.compareTo(cad2)>0)?
                "la primera cadena es mayor.": "ambas son iguales.";

        System.out.println(message + " Usando comparacion, podemos ver que " + message2);


    }
}