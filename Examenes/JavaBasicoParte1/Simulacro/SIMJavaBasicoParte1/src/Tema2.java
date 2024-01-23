import java.time.LocalDate;
import java.util.Scanner;

public class Tema2 {
    public static void main(String[] args) {
        System.out.println("\033[32m" + "\n//----TEMA 2----//" + "\u001B[0m");
        //ejercicio6();
        //ejercicio7();
        ejercicio8();
    }

    public static void ejercicio6(){
/*  Crea un programa que solicite al usuario ingresar una serie de números hasta que introduzca un valor negativo.
    Luego,calcula las estadísticas, tales como el numeroIngresado max, numeroIngresado min, promedio, suma total,
    cantidad de números primos y no primos.
*/
        System.out.println("\033[36m" + "//--EJERCICIO 6--//" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);

// Variables para estadísticas
        int sumaTotal = 0;
        int cantidadNumeros = 0;
        int numeroMaximo = 0;
        int numeroMinimo = 0;
        int cantidadPrimos = 0;
        int cantidadNoPrimos = 0;
        int numeroIngresado;

System.out.println("Ingrese una serie de números. Introduzca un valor negativo para finalizar:");
// Control de ingreso de numeros
        do {
            System.out.print("Ingrese una número: ");
            numeroIngresado = scanner.nextInt();

// Actualizar estadísticas si cumplimos la condicion
            if (numeroIngresado > 0) {
                sumaTotal += numeroIngresado;
                cantidadNumeros++;

// Actualizar número máximo y mínimo, al inicio seteamos el primer valor ingresado para ambos.
                numeroMaximo = (numeroMaximo == 0)? numeroIngresado :  Math.max(numeroIngresado, numeroMaximo);
                numeroMinimo = (numeroMinimo == 0)? numeroIngresado :  Math.min(numeroIngresado, numeroMinimo);

// Verificar si el número es primo
                if (esPrimo(numeroIngresado)) {
                    cantidadPrimos++;
                } else {
                    cantidadNoPrimos++;
                }
            }
        } while (numeroIngresado > 0);

// Calculo promedio
        double promedio = (double) sumaTotal / cantidadNumeros;

// Muestro resultados
        System.out.println("\033[33m" + "\n//ESTADISTICAS//" + "\u001B[0m");
        System.out.println("Número máximo: " + numeroMaximo);
        System.out.println("Número mínimo: " + numeroMinimo);
        System.out.println("Promedio: " + promedio);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Cantidad de números primos: " + cantidadPrimos);
        System.out.println("Cantidad de números no primos: " + cantidadNoPrimos);
    }

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

    public static void ejercicio7(){
/* 7) Ingresa por teclado tres números enteros y guardarlos en las variables Y,M y D que contienen año,mes,día
        respectivamente y con ello:
        a)	Instanciar según corresponda:  LocalDate, LocalTime o LocalDateTime.
        b)	Mostrarlo completo por consola.
        c)	Demostrar si la fecha y tiempo creado es posterior, anterior o igual a la fecha y tiempo actual.
        d)	[10pts plus] -> Formatear fecha y hora al patrón => “dd-MM-yyyy”.
*/
        System.out.println("\033[36m" + "//--EJERCICIO 7--//" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el año:");
        int año = scanner.nextInt();

        System.out.println("Ingresa el mes:");
        int mes = scanner.nextInt();

        System.out.println("Ingresa el día:");
        int dia = scanner.nextInt();

        //Con los datios suministrados, solo puedo instanciar un LocalDate.
        LocalDate fecha = LocalDate.of(año, mes, dia);

        System.out.println("Fecha instanciada: " + fecha);

        //Demuestro si la fecha es anterior, posterior o igual a la actual.
        LocalDate fechaActual = LocalDate.now();
        String mensaje = (fecha.isAfter(fechaActual))?
                "La fecha instanciada es posterior a la fecha actual." : (fecha.isBefore(fechaActual)) ?
                "La fecha instanciada es anterior a la fecha actual." : "La fecha instanciada es igual a la fecha actual.";

        System.out.println(mensaje);

        //Formateo fecha al patrón => “dd-MM-yyyy”.
        String fechaFormateada = fecha.format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Fecha formateada: " + fechaFormateada);
    }

    public static void ejercicio8(){
/* 8) Crea un programa que simule un juego con las siguientes particularidades:
        a)	Se debe ingresar por teclado un número.Dicho número debe ser entero positivo
        b)	El jugador empieza con 0 puntos.
        c)	Si el número ingresado es primo:
            i)	El jugador gana 3 puntos.
            ii)	Se mostrará el evento “Es primo, ganas 3 puntos y tienes x puntos”.
        d)	Si no es primo:
            i)	El jugador pierde 2 puntos.
            ii)	Se mostrará el evento “No es primo, pierdes 2 puntos y tienes x puntos”.
        e)	Cada nuevo número ingresado debe ser mayor al anterior.
        f)	Se gana al conseguir 60 puntos.
        g)	Cuándo puntos < 0. La partida termina.
*/
        System.out.println("\033[36m" + "//--EJERCICIO 8--//" + "\u001B[0m");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de números primos. Ingresa un número positivo:");
        int numeroIngresado = scanner.nextInt();

        int numeroAnterior;
        int puntos = 0;
        int flag = 0;

//Iteracion encargada de mantener el ciclo de vida del juego segun 3 condiciones
        while (puntos < 60 && puntos >= 0 && flag == 0) {
//Siempre actualizo el numero anterior.
            numeroAnterior = numeroIngresado;
//Aumento 3 puntos y mensaje si el numero es primo, sino decremento 2 puntos y mensaje.
            if (esPrimo(numeroIngresado)) {
                puntos += 3;
                System.out.println("Es primo, ganas 3 puntos y tienes " + puntos + " puntos.");
            } else {
                puntos -= 2;
                System.out.println("No es primo, pierdes 2 puntos y tienes " + puntos + " puntos.");
            }

            System.out.println("Ingresa un nuevo número mayor que " + numeroAnterior + ":");
            numeroIngresado = scanner.nextInt();

//Compruebo si el numero ingresado es menor al anterior, de ser asi, ejecuto condicion de corte mediante flag.
            if (numeroIngresado <= numeroAnterior) {
                System.out.println("Error: El nuevo número debe ser mayor que el anterior. Fin del juego.");
                flag = 1;
            }
        }

// Se gana al conseguir 60 puntos, se pierde si los puntos son negativos o si el corte se ejecuto.
        if (puntos >= 60 && flag == 0) {
            System.out.println("¡Felicidades! Has ganado el juego con " + puntos + " puntos.");
        } else {
            // g) Cuándo puntos < 0. La partida termina.
            System.out.println("Fin del juego.");
        }
    }
}

