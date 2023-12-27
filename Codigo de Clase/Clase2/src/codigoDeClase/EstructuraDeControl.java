package codigoDeClase;

public class EstructuraDeControl {
    public static void main(String[] args) {
        // ESTRUCTURAS O FLUJOS DE CONTROL
        // Estructura de Control de Seleccion
        System.out.println("\033[32m" + "\n//--ESTRUCTURA DE CONTROL DE SELECCION--//" + "\u001B[0m");

        // if-else
        System.out.println("\033[36m" + "\n--IF-ELSE--" + "\u001B[0m");
        int edad = 20;
        String mensaje = "Tienes " + edad + " años.";
        if (edad >= 18) {
            System.out.println(mensaje + "Eres mayor de edad");
        } else {
            System.out.println(mensaje + "Eres menor de edad");
        }

        // switch
        System.out.println("\033[36m" + "\n--SWITCH--" + "\u001B[0m");
        char calificacion = 'B';
        String mensaje2 = "Calificacion: " + calificacion + " => ";
        switch (calificacion) {
            case 'A':
                System.out.println(mensaje2 + "Excelente");
                break;
            case 'B':
                System.out.println(mensaje2 + "Buena");
                break;
            case 'R':
                System.out.println(mensaje2 + "Regular");
                break;
            default:
                System.out.println("Calificación no válida");
        }

        // Estructura de Control de Iteracion(Bucles)
        System.out.println("\033[32m" + "\n//--ESTRUCTURA DE CONTROL DE ITERACION(BUCLES)--//" + "\u001B[0m");

        // for
        System.out.println("\033[36m" + "\n--FOR--" + "\u001B[0m");
        for (int contFor = 1; contFor <= 5; contFor++) {
            System.out.println("Ciclo for [" + contFor + "]");
        }

        // foreach
        System.out.println("\033[36m" + "\n--FOREACH--" + "\u001B[0m");
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println("Ciclo foreach [" + numero + "]");
        }

        // while
        System.out.println("\033[36m" + "\n--WHILE--" + "\u001B[0m");
        int contWhile = 1;
        while (contWhile <= 5) {
            System.out.println("Ciclo while [" + contWhile + "]");
            contWhile++;
        }

        // do-while
        System.out.println("\033[36m" + "\n--DO-WHILE--" + "\u001B[0m");
        int contDoWhile = 1;
        do {
            System.out.println("Ciclo do-while [" + contDoWhile + "]");
            contDoWhile++;
        } while (contDoWhile <= 5);

        // Etiqueta con Continue
        System.out.println("\033[36m" + "\n--ETIQUETAS CONTINUE--" + "\u001B[0m");
        for1:for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue for1;
                }
                System.out.print("[i = " + i + ",j = " + j + "],");
            }
        }

        // Etiqueta con Break
        System.out.println("\033[36m" + "\n\n--ETIQUETAS BREAK--" + "\u001B[0m");
        for2:for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break for2;
                }
                System.out.print("[i = " + i + ",j = " + j + "],");
            }
        }
    }
}