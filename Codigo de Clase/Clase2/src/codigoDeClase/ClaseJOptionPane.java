package codigoDeClase;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseJOptionPane {
    public static void main(String[] args) {
        // 1. showMessageDialog con mensaje informativo
        JOptionPane.showMessageDialog(null
                , "¡Hola, este es un mensaje informativo!"
                , "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        // 2. showInputDialog para obtener entrada del usuario
        String nombre = JOptionPane.showInputDialog(null
                , "Ingrese su nombre:"
                , "Entrada de texto", JOptionPane.QUESTION_MESSAGE);
        System.out.println("Nombre ingresado: " + nombre);

        // 3. showConfirmDialog para obtener confirmación del usuario
        int respuesta = JOptionPane.showConfirmDialog(null
                , "¿Desea continuar?", "Confirmación"
                , JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.out.println("El usuario eligió continuar.");
        } else {
            System.out.println("El usuario eligió cancelar.");
        }

        // 4. showOptionDialog para seleccionar entre opciones
        Object[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        int opcionElegida = JOptionPane.showOptionDialog(null
                , "Seleccione una opción:"
                , "Opciones", JOptionPane.DEFAULT_OPTION
                , JOptionPane.QUESTION_MESSAGE
                , null
                , opciones
                , opciones[0]);
        System.out.println("Opción seleccionada: " + opciones[opcionElegida]);

        // 5. showInputDialog con selección de opciones
        Object[] frutas = {"Manzana", "Banana", "Uva"};
        Object frutaSeleccionada = JOptionPane.showInputDialog(null
                , "Seleccione una fruta:"
                , "Selección de Frutas"
                , JOptionPane.QUESTION_MESSAGE
                , null
                , frutas
                , frutas[0]);
        System.out.println("Fruta seleccionada: " + frutaSeleccionada);
    }
}