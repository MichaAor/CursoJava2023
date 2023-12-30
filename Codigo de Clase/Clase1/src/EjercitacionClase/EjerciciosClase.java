package EjercitacionClase;

public class EjerciciosClase {
    public static void main(String[] args) {
      /*
       *               //-- EJERCITACION DE CLASE --//
       */

      /* 1) Declara e inicializa por separado 2 variables, una de tipo primitivo y otra de referencia [String Class]:
       *    a) Imprime ambas usando el metodo sout.
       *    b) Concatena ambas variables y enseña por pantalla el resultado (puede o no usar una variable auxiliar).
       */
        System.out.println("\033[34m" + "//--EJERCICIO 1--//" + "\u001B[0m");
        int numero = 1;
        String nombre = "Micha";
        System.out.println(nombre + " es el numero "+numero+"!");

       /* 2) Corregir la cadena:
        * "                C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS."
        */
        System.out.println("\033[34m" + "\n//--EJERCICIO 2--//" + "\u001B[0m");
        String original = "                 C 3s un l3nguaj3 d3 pr0gramac10n 0r1entad0 a obj3tos, USAD0 PARA HAC3R pag1n4s W3BS.";
        String corregido;

        //--Pasos para arreglar la cadena--
        //1. Convertir toda la cadena a mayusculas.
        corregido = original.toUpperCase();

        //2. Borrar espacios sobrantes.
        corregido = corregido.trim();

        //3. Reemplazar 3 por E.
        corregido = corregido.replace('3','E');

        //4. Reemplazar 4 por A.
        corregido = corregido.replace('4','A');

        //5. Reemplazar 0 por O.
        corregido = corregido.replace('0','O');

        //6. Reemplazar 1 por I.
        corregido = corregido.replace('1','I');

        //7. Correccion de mensaje reemplazando.
        corregido = corregido.replace("C ", "C NO ");
        corregido = corregido.replace("WEBS", "WEB");

        System.out.println("La cadena original es: " + "\033[31m" + "'" + original + "'" + "\u001B[0m");
        System.out.println("La cadena corregida es: " + "\033[32m" + "'" + corregido + "'" + "\u001B[0m");


       /* 3) Demuestra tus conocimientos aplicando al menos 4 metodos (no usados anteriormente)
        *    y muestralos en la consola.
        */
        System.out.println("\033[34m" + "\n//--EJERCICIO 3--//" + "\u001B[0m");

       //Metodo string1.contains(String cadenaABuscar)
        System.out.println("\033[35m" + "//string1.contains(String string2aABuscar)//" + "\u001B[0m");

        String cadenaABucar = "javita";
        boolean contains = corregido.contains(cadenaABucar);

        System.out.println("La cadena a buscar es: " + "\033[36m" + "'" + cadenaABucar + "'" + "\u001B[0m");
        System.out.println("La cadena original contiene la cadena a buscar? (True/false): " + contains);

       //Metodo compareTo
        System.out.println("\033[35m" + "\n//string1.compareTo(String string2AComparar)//" + "\u001B[0m");

        String cadenaAComparar = "JAVA ES UN LENGUAJE DE PROGRAMACION ORIENTADO A OBJETOS";
        int resultado = corregido.compareTo(cadenaAComparar);

        System.out.println("Cadena original: " + "\033[36m" + "'" + corregido + "'" + "\u001B[0m");
        System.out.println("Cadena a comparar: " + "\033[36m" + "'" + cadenaAComparar + "'" + "\u001B[0m");
        System.out.println("El resultado de 'corregido.compareTo(cadenaAComparar)' = " + resultado);

        System.out.println("\033[33m" + "\nUsando IF-ELSE para comparar cadenas en base al resultado anterior podemos ver que: " + "\u001B[0m");
        if (resultado == 0) {
            System.out.println("\033[32m" + "Las cadenas de texto son iguales "+ "\u001B[0m");
        } else
            if (resultado<0) {
                System.out.println("\033[32m" + "La cadena '" + corregido + "' es mayor que la cadena '" + cadenaAComparar + "'" + "\u001B[0m");
            }else {
                System.out.println("\033[32m" + "La cadena '" + corregido + "' es menor que la cedena '" + cadenaAComparar + "'" + "\u001B[0m");
            }

        //Metodo lenght
        System.out.println("\033[35m" + "\n//string1.length()//" + "\u001B[0m");
        int largoCadena= corregido.length();
        System.out.println("El largo de la cadena '" + corregido + "' es igual a " + largoCadena + " caracteres");

        //Metodo charAt
        System.out.println("\033[35m" + "\n//string1.charAt(int posicionABuscar)//" + "\u001B[0m");
        int posicionABuscar = 6;
        char letra= corregido.charAt(posicionABuscar);
        System.out.println("La letra de la cadena '" + corregido + "' ubicado en la posicion [" + posicionABuscar + "] es: '" + letra +"'");

          }
        //FORMA2 DE HACER EJERCICIO 2 (MICHA)
        System.out.println("\033[35m" + "\n//string1.contains(String string2aABuscar)// --> FORMA 2" + "\u001B[0m");
        String cad1 = original;
        String cad2 = "JAVA ES UN LENGUAJE DE PROGRAMACION ORIENTADO A OBJETOS";;
        
        System.out.println("Cadena 1 = '" + cad1 + "'");
        System.out.println("Cadena 2 = '" + cad2 + "'");

        String message = "El metodo devuelve el resultado: "+ cad1.compareTo(cad2)+".";
        String message2 = (cad1.compareTo(cad2)<0)? "la primera cadena es menor." : (cad1.compareTo(cad2)>0)?
                "la primera cadena es mayor.": "ambas son iguales.";

        System.out.println(message + " Usando comparacion, podemos ver que " + message2);
        }
      } 

          