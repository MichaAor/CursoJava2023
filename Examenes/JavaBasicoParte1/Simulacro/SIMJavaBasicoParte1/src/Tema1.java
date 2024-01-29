import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {
        System.out.println("\033[33m" + "\n//----TEMA 1----//" + "\u001B[0m");
        ejercicio6();
        //ejercicio7();
        //ejercicio8();
    }

    public static void ejercicio6(){
/*
6)	Implementa un programa que calcule las estadísticas en un rango dado
    (sumas de números primos, números no primos, sumas totales, cantidad de números del rango,promedio).
    Utiliza estructuras de control y operadores adecuados.
*/
        System.out.println("\033[36m" + "\n//--EJERCICIO 6--//" + "\u001B[0m");

        Scanner scanner = new Scanner(System.in);
//Creamos el rango a tomar
        System.out.println("Ingresa el rango inferior:");
        int rangoInferior = scanner.nextInt();

        System.out.println("Ingresa el rango superior:");
        int rangoSuperior = scanner.nextInt();

// Valido el rango, ejecuto el ejercicio en su totalidad si es que se cumple esta fundamental.
        if (rangoInferior < rangoSuperior) {
            int sumaPrimos = 0;
            int sumaNoPrimos = 0;
            int sumaTotal = 0;
            int cantidadNumeros = 0;

//Establezco limites para el recorrido del for.
            for (int i = rangoInferior; i <= rangoSuperior; i++) {
// Verifico si el número es primo
                if (esPrimo(i)) {
                    sumaPrimos += i;
                } else {
                    sumaNoPrimos += i;
                }

                sumaTotal += i;
                cantidadNumeros++;
            }

// Calculo el promedio
            double promedio = (double) sumaTotal / cantidadNumeros;

// Mostrar resultados
            System.out.println("Suma de números primos en el rango: " + sumaPrimos);
            System.out.println("Suma de números no primos en el rango: " + sumaNoPrimos);
            System.out.println("Suma total de números en el rango: " + sumaTotal);
            System.out.println("Cantidad de números en el rango: " + cantidadNumeros);
            System.out.println("Promedio de números en el rango: " + promedio);

        }else{
            System.out.println("Error: El rango inferior no puede ser mayor al rango superior.");
        }


    }

//Declaramos un metodo para calcular si es un numero primo
    private static boolean esPrimo(int numero) {
//Los numeros 0 y 1 no pueden ser primos, manejamos casos especiales.
        if (numero <= 1) {
            return false;
        }
/* Luego de excluir el numero 0 y 1,
    1) Uso un bucle for que comienza desde i = 2 hasta la raíz cuadrada de numero (Math.sqrt(numero)).
        Esto se hace para optimizar el rendimiento, ya que si un número no es primo, debe tener un divisor menor o igual a su raíz cuadrada.
    2) En cada iteración del bucle, verifica si numero es divisible por i.
        Si encuentra un número que divide al número dado sin dejar residuo, el número no es primo. Retorna false ya que encontró un divisor.
        Si no encuentra ningún número que divida al número sin dejar residuo, el número es primo. Retorna true porque no encontró ningún divisor.
 */
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
}

    public static void ejercicio7() {
/*
    7) Lee tres números enteros Y,M,D,H, M, S que contienen año,mes,dia,hora, minutos y segundos respectivamente y con ello:
    a)	Instanciar segun corresponda: LocalDate, LocalTime o LocalDateTime.
    b)	Mostrarlo completo por consola.
    c)	Demostrar si la fecha y tiempo creado es posterior, anterior o igual a la fecha y tiempo actual.
    d)	[10pts plus] -> Formatear fecha y hora al patrón => “dd-MM-yyyy HH:mm:ss”.
*/
        System.out.println("\033[36m" + "\n//--EJERCICIO 7--//" + "\u001B[0m");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año:");
        int año = scanner.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese la hora:");
        int hora = scanner.nextInt();
        System.out.println("Ingrese los minutos:");
        int minuto = scanner.nextInt();
        System.out.println("Ingrese los segundos:");
        int segundo = scanner.nextInt();

        // Instanciamos un LocalDateTime ya que los datos suministrados son suficientes para ello.
        LocalDateTime localDateTime = LocalDateTime.of(año, mes, dia, hora, minuto, segundo);

        // Mostrarmos por consola.
        System.out.println("LocalDateTime instanciado: " + localDateTime);

        // Demostramos si la fecha y tiempo creada es posterior, anterior o igual a la fecha y tiempo actual.
        LocalDateTime now = LocalDateTime.now();
        if (localDateTime.isAfter(now)) {
            System.out.println("La fecha y hora creadas son posteriores a la fecha y hora actual.");
        } else if (localDateTime.isBefore(now)) {
            System.out.println("La fecha y hora creadas son anteriores a la fecha y hora actual.");
        } else {
            System.out.println("La fecha y hora creadas son iguales a la fecha y hora actual.");
        }

        // d) Formatear fecha y hora al patrón => “dd-MM-yyyy HH:mm:ss”.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Fecha y hora formateadas: " + formattedDateTime);
    }

    public static void ejercicio8() {
/*
    8)	Crea un programa que simule un juego de adivinanza con las siguientes características:
        a)	Se debe generar un número aleatorio entre 1 y 100.
        b)	El jugador empieza con 5 intentos.
        c)	El jugador debe ingresar por teclado su número.
        d)	En caso de coincidir:
            i)	El jugador ganará 3 puntos.
            ii)	Se mostrará “Has acertado, te quedan x intentos y te faltan x puntos para ganar”.
        e)	En caso de fallar,
            i)	El jugador perderá 3 puntos.
            ii)	 Se mostrará “No has acertado, te quedan x intentos y te faltan x puntos para ganar”.
        g)	Se gana al conseguir 20 puntos.
        h)	Cuándo intentos =  0. La partida termina.
*/
        System.out.println("\033[36m" + "\n//--EJERCICIO 8--//" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);

        int intentos = 5;
        int puntos = 0;

//Defino y asigno un numero random en un rango de 1 a 10.
        int numeroAdivinar = (int) (Math.random() * 10) + 1;

//La iteracion controla el ciclo de vida del juego, siguiendo 2 condiciones.
        while (puntos < 20 && intentos > 0) {
            System.out.println("Numero a adivinar: " + numeroAdivinar);
            System.out.println("Ingrese un numero:");
            int numeroIngresado = scanner.nextInt();

//Gana 5 puntos si coincide y muestro mensaje.
//Pierde 3 puntos al fallar, muestro mensaje y decremento los intentos.
            if (numeroIngresado == numeroAdivinar) {
                puntos += 3;
                System.out.println("Has acertado, te quedan " + intentos + " intentos y te faltan " + (20 - puntos) + " puntos para ganar");
                numeroAdivinar = (int) (Math.random() * 100) + 1;
            } else {
                puntos = (puntos > 0)? puntos - 3 : 0;
                intentos--;
                System.out.println("No has acertado, te quedan " + intentos + " intentos y te faltan " + (20 - puntos) + " puntos para ganar");
            }
        }

//Final del juego, puede ganar alcanzando los 20 puntos o perder si intentos = 0.
        if (puntos >= 20) {
            System.out.println("¡Felicidades! Has ganado el juego.");
        } else {
            System.out.println("Has agotado tus intentos. Fin del juego.");
        }
    }
}
