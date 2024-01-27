/**
 *                                        //-- EJERCITACION DE CLASE --//
 *4) Escribe un programa que solicite al usuario su fecha de nacimiento y calcule la
 *      fecha de jubilación considerando la edad de jubilación estándar
 *      (por ejemplo, 65 años).
 */

package EjercitacionClase;

//importo libreria para usar scanner, para poder ingresar datos por consola y guardarlos en variables.
import javax.swing.*;
import java.util.Scanner;
//importo libreria para usar LocalDate, para poder trabajar con fechas. (java.time.LocalDate)
import java.time.LocalDate;
//importo libreria para usar ChronoUnit, para poder calcular la diferencia entre dos fechas. (java.time.temporal.ChronoUnit)
import java.time.temporal.ChronoUnit;

public class Ejercicio4 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Calculemos que dia te jubilas!");
//        abro el scanner y solicito al usuario que ingrese su fecha de nacimiento.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (yyyy-mm-dd): ");
//        guardo en una variable la fecha ingresada por consola.
        String fechaNacimiento = scanner.nextLine();
//        convierto la fecha ingresada a LocalDate y la guardo en una variable parseada porque el metodo between de
//        ChronoUnit recibe LocalDate y no String.
        LocalDate fechaNacimientoLocalDate = LocalDate.parse(fechaNacimiento);

        // Calculo la fecha que el usuario se jubila, sumando 65 años a su fecha de nacimiento.
        LocalDate fechaJubilacion = fechaNacimientoLocalDate.plusYears(65);

//        muestro por consola la fecha de jubilacion del usuario.
        System.out.println("Su fecha de jubilacion es: " + fechaJubilacion);
//        Cierro el scanner
        scanner.close();
    }
}
