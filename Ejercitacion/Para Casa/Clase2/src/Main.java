import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

            1)	Clasifica y menciona al menos 2 ejemplos de Operadores.
                Suma, Resta, Multiplicacion, Division

            2)	¿Cual es la principal diferencia entre las sentencias ‘if’ y switch?
            Un IF nos permite realizar comparaciones complejas, en cambio un swich si bien es mas compacto, solo se puede realizar comparación de igualdad.

            3)	Explica con tus palabras el funcionamiento de la estructura de control de iteración ‘foreach’.
            Es una estructura de control de iteración abreviada.

            4)	Declara una variable ‘hora’ de tipo ‘int’ y que muestra los buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben usar.

            int hora = 14;
            if(hora >=6 && hora <=12 ){
            System.out.println(“Buenos Dias”);
            } else if (hora >=13 && hora <=20){
            System.out.println(“Buenos Tardes”);
            } else if(hora >=21 && hora <=5){
            System.out.println(“Buenos Noches”);
            }

            5)	Realiza un mini cuestionario con 5 preguntas tipo test. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.

            public static void main(String[] args) {
                int cantidadRCorrectas = 0;
                cantidadRCorrectas  = cantidadRCorrectas  + preguntaCuestionario(“Java es fuertemente tipado? 1=Si 2=No”, 1);
                cantidadRCorrectas  = cantidadRCorrectas  + preguntaCuestionario(“C++ permite crear objetos? 1=Si 2=No”, 1);
                cantidadRCorrectas  = cantidadRCorrectas  + preguntaCuestionario(“Pascal es fuertemente tipado? 1=Si 2=No”, 1);
                cantidadRCorrectas  = cantidadRCorrectas  + preguntaCuestionario(“Todo developer .Net es Nerd? 1=Si 2=No”, 2);
                cantidadRCorrectas  = cantidadRCorrectas  + preguntaCuestionario(“Asembler es alto nivel? 1=Si 2=No”, 2);
                System.out.println(“Calificacion Obtenida: ” + cantidadRCorrectas);
                        }

            public static int preguntaCuestionario(String pregunta, int opcionCorrecta){
                System.out.println(pregunta);
                System.out.print("\033[33m" + "Ingrese su respuesta: " + "\u001B[0m");
                String datoIngresado = scannerBasic.next();
                Integer numeroIngresado = Integer.parseInt(datoIngresado);
                If(numeroIngresado == opcionCorrecta){
                   Return 1;
                } else {
                   Return 0;
                }
/*
            6)	Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
                El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula
                sumando los dos anteriores, por lo que tendríamos que los términos
                son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.

*/
        int fibonacci[];
        fibonacci = new int[500];
        System.out.println("\033[36m" + "//--EJERCICIO 6--\\" + "\u001B[0m");
        System.out.print("\033[33m" + "Ingrese cantidad de elementos de la serie: " + "\u001B[0m");
        Scanner scannerBasic = new Scanner(System.in);
        String datoIngresado = scannerBasic.next();
        int numeroIngresado = Integer.parseInt(datoIngresado);
        String cadenaFibonacci = "";
            // caso que se solicite factorial de 1
        if (numeroIngresado == 1) {
            System.out.println("La serie es: 0");
            // caso que se solicite factorial de 2
        } else if (numeroIngresado == 2) {
            System.out.println("La serie es: 0,1");
            // caso que se solicite factorial mayor a 2
        } else if (numeroIngresado > 2) {
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            cadenaFibonacci = "La serie es: ";
            for (int i=2; i <= numeroIngresado; i++) {
                //Lleno un vector con el calculo de cada numero fibonacci
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
            for (int j=0; j <= numeroIngresado; j++) {
                //Formateo la la cadena de salida con los numeros que calcule en el vector.
                if (j == numeroIngresado) {
                    cadenaFibonacci = cadenaFibonacci + fibonacci[j];
                } else {
                    cadenaFibonacci = cadenaFibonacci + fibonacci[j] + ',';
                }
            }
            System.out.println(cadenaFibonacci);

            //Observsacion: Muy bien planteado, pero debe realizarse con los contenidos dados. Inteta refactorizarlo en un segundo metodo.
            //Observsacion: Ser mas declarativo, ordenado y sobre todo, comentar el codigo (por mas que sea un algoritmo faciles.
        }
    }
}
