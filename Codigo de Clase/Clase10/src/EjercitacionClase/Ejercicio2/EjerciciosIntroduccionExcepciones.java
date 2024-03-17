package EjercitacionClase.Ejercicio2;

public class EjerciciosIntroduccionExcepciones {
/*
* RECUERDA DESARROLLAR CADA EJERCICIO EN UN PACKAGE SEPARADO, CON SU PROPIA DEMOSTRACION.
* DOCUMENTAR CORRECTAMENTE.

! Ejercicio 2: Demostracion
? Desarrolla una aplicacion que creas que pueda demostrar la propagacion de Excepciones.
? La forma de hacerlo es totalmente libre. Comenta tu codigo para detallar la explicacion.
*/

    public static void main(String[] args) {
        invocacion1();
    }

    private static void invocacion1() {
        System.out.println("invocacion 1, sin error");
        invocacion2();
    }

    private static void invocacion2() {
        System.out.println("invocacion 2, sin error");
        invocacion3();
    }

    private static void invocacion3() {
        int numerador = 100;
        int denominador = 0;
        int resultado;

        if (denominador == 0) {
           System.out.println("invocacion 3, con error de division por cero");
        } else {
            System.out.println("invocacion 3, sin error");
        }
        resultado = numerador / denominador;
        invocacion4();
    }

    private static void invocacion4() {
        System.out.println("invocacion 4, sin error");
    }

}