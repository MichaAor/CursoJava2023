import java.time.LocalDate;
import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {
        System.out.println("\033[32m" + "\n//----TEMA 3----//" + "\u001B[0m");
        //ejercicio6();
        //ejercicio7();
        ejercicio8();
    }

    public static void ejercicio6(){
/* 6) Desarrolla un programa que reciba el nombre completo de un usuario y su fecha de nacimiento.
        Utiliza la clase String para extraer el primer nombre y la clase LocalDate
        para calcular la edad del usuario.
*/
        System.out.println("\033[36m" + "//--EJERCICIO 6--//" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su fecha de nacimiento en formato YYYY-MM-DD:");
        String fechaNacimientoString = scanner.next();

// Convierto la fecha de nacimiento a un objeto LocalDate usando el metodo parse()
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);

// Utiliza la clase LocalDate para calcular la edad del usuario
//Obtenemos los componentes de este a traves del metodo getYear()
        int anioActual = LocalDate.now().getYear();
        int aniNacimiento = fechaNacimiento.getYear();
        int edad = anioActual - aniNacimiento;

        // Muestra los resultados
        System.out.println("Hola, " + nombre + "!");
        System.out.println("Tu fecha de nacimiento es: " + fechaNacimiento);
        System.out.println("Tienes " + edad + " años.");
    }

    public static void ejercicio7(){
/* 7) Implementa un programa que genere e imprima la serie de Fibonacci hasta el término cantidadDeNum ingresado
        por el usuario. Utiliza operadores y estructuras de control de manera eficiente.
*/
        System.out.println("\033[36m" + "//--EJERCICIO 7--//" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);
        int cantidadDeNum;

//Validamos que la cantidad de numeros a mostrar sea positivo.
        do{
            System.out.println("Ingrese el término (cantidadDeNum) hasta el cual desea generar la serie de Fibonacci:");
            cantidadDeNum = scanner.nextInt();
            if(cantidadDeNum < 0) {
                System.out.println("Por favor, ingrese un número no negativo.");
            }
        }while(cantidadDeNum < 0);

        int fibPrevio = 0, fibActual = 1;

        System.out.println("Serie de Fibonacci hasta el término " + cantidadDeNum + ":");
//Realizamos la iteracion mientras i sea menor a la cantidad de numeros a mostrar.
        for (int i = 0; i < cantidadDeNum; i++) {
//Mostramos el numero anterior guardado, mientras el actual es el que se va actualizando.
            System.out.print(fibPrevio + " ");

            int fibNuevo = fibPrevio + fibActual;
            fibPrevio = fibActual;
            fibActual = fibNuevo;
        }
    }
    public static void ejercicio8(){
/* 8) Crea un programa que simule un juego con las siguientes particularidades:
        Se debe ingresar por teclado un número entero positivo.
        El jugador comienza con 0 puntos.
        Si el número ingresado es un cuadrado perfecto:
            El jugador gana 4 puntos.
            Se mostrará el mensaje "Es un cuadrado perfecto, ganas 4 puntos. Puntos actuales: x".
        Si no es un cuadrado perfecto:
            El jugador pierde 2 puntos.
            Se mostrará el mensaje "No es un cuadrado perfecto, pierdes 2 puntos. Puntos actuales: x".
        Cada nuevo número ingresado debe ser mayor al anterior.
        El juego termina cuando el jugador alcanza los 30 puntos.
        Si los puntos caen por debajo de 0, la partida también termina.
*/
        System.out.println("\033[36m" + "//--EJERCICIO 8--//" + "\u001B[0m");
                Scanner scanner = new Scanner(System.in);

// Se debe ingresar por teclado un número entero positivo.
                System.out.println("Bienvenido al juego del Cuadrado Perfecto. Ingresa un número entero positivo:");
                int numeroIngresado = scanner.nextInt();
                int puntos = 0;

                if (numeroIngresado <= 0) {
                    System.out.println("Por favor, ingresa un número entero positivo. Fin del juego.");
                    return;
                }

                int numeroAnterior = numeroIngresado;

                while (puntos < 30 && puntos >= 0) {
// Comprobamos que el numero ingresado sea un cuadrado perfecto.
// Si lo es, gana 4 puntos y muestra mensaje. Caso contrario, pierde 2 y muestra mensaje.
                    if (esCuadradoPerfecto(numeroIngresado)) {
                        puntos += 4;
                        System.out.println("Es un cuadrado perfecto, ganas 4 puntos. Puntos actuales: " + puntos);
                    } else {
                        puntos -= 2;
                        System.out.println("No es un cuadrado perfecto, pierdes 2 puntos. Puntos actuales: " + puntos);
                    }

// Comprobamos que el numero anterior sea menor al nuevo.
// De no ser asi, la partida termina.
                    System.out.println("Ingresa un nuevo número mayor que " + numeroAnterior + ":");
                    numeroIngresado = scanner.nextInt();

                    if (numeroIngresado <= numeroAnterior) {
                        System.out.println("Error: El nuevo número debe ser mayor que el anterior. Fin del juego.");
                        break;
                    }

// Actualizar el número anterior con el nuevo número ingresado
                    numeroAnterior = numeroIngresado;
                }

                // El juego termina cuando el jugador alcanza los 30 puntos o cae por debajo de 0.
                if (puntos >= 30) {
                    System.out.println("¡Felicidades! Has alcanzado los 30 puntos. Fin del juego.");
                } else {
                    System.out.println("Lo siento, tus puntos son negativos. Fin del juego.");
                }
            }

            // Método para verificar si un número es un cuadrado perfecto.
            private static boolean esCuadradoPerfecto(int numero) {
                int raizCuadrada = (int) Math.sqrt(numero);
                return raizCuadrada * raizCuadrada == numero;
            }
        }

    }
}