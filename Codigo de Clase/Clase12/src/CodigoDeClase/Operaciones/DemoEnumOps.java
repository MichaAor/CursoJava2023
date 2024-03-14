package CodigoDeClase.Operaciones;
/*
?                       ╔═════════════════════════╗
?                       ║  OPERACIONES CON ENUMS  ║
?                       ╚═════════════════════════╝
! Enum OperacionMatematica:
*   Se define un enum que representa diferentes operaciones matemáticas (SUMA, RESTA, MULTIPLICACION, DIVISION).
*   Cada constante del enum tiene un símbolo asociado (+, -, *, /).
*   Cada constante implementa un método abstracto realizarOperacion que toma dos números y realiza la operación correspondiente.

! Método mostrarInformacion():
*   Se agrega un método mostrarInformacion a cada constante del enum para mostrar detalles de la operación.

!Método main():
*   Se genera dos números aleatorios (numero1 y numero2) para realizar operaciones.
*   Se itera a través de todas las constantes del enum usando un bucle for-each.
*   En cada iteración, se muestra información sobre la operación y se intenta realizarla con los números aleatorios.
*   Si la operación es una división y se intenta dividir por cero, se captura y maneja la excepción ArithmeticException.
*   Se utiliza un enum en una sentencia switch para mostrar un mensaje según la operación seleccionada
*       (SUMA, RESTA, MULTIPLICACION, DIVISION).
*/

public class DemoEnumOps {

    //! Enumerado que representa operaciones matemáticas
    public enum OperacionMatematica {
        SUMA("+") {
            @Override
            public double realizarOperacion(double a, double b) {
                return a + b;
            }
        },
        RESTA("-") {
            @Override
            public double realizarOperacion(double a, double b) {
                return a - b;
            }
        },
        MULTIPLICACION("*") {
            @Override
            public double realizarOperacion(double a, double b) {
                return a * b;
            }
        },
        DIVISION("/") {
            @Override
            public double realizarOperacion(double a, double b) {
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            }
        };

        private String simbolo;

        //? Constructor privado para asignar el símbolo
        OperacionMatematica(String simbolo) {
            this.simbolo = simbolo;
        }

        //? Método para mostrar información de la operación
        public void mostrarInformacion() {
            System.out.println("\nOperación: " + this + "\nOperador: " + this.simbolo);
        }

        //? Método abstracto que cada valor del enum debe implementar
        public abstract double realizarOperacion(double a, double b);
    }

    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO OPERACIONES ENUM  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═════════════════════════╝" + "\u001B[0m");

        //? Generación de números aleatorios
        double numero1 = Math.random() * 100 + 0;
        double numero2 = Math.random() * 100 + 0;

        //! Iteración a través de todas las operaciones matemáticas
        System.out.println();
        System.out.println("\033[33m" + "╔                 ╗" + "\u001B[0m");
        System.out.println("\033[33m" + "║  DEMO FOR EACH  ║" + "\u001B[0m");
        System.out.println("\033[33m" + "╚                 ╝" + "\u001B[0m");
        for (OperacionMatematica operacion : OperacionMatematica.values()) {
            operacion.mostrarInformacion();
            try {
                //* Realización de la operación y muestra del resultado
                double resultado = operacion.realizarOperacion(numero1, numero2);
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                //? Manejo de la excepción en caso de división por cero
                System.err.println("\nError: " + e.getMessage());
            }
        }

        //! Selector de una sentencia switch usando un enum
        System.out.println();
        System.out.println("\033[33m" + "╔                        ╗" + "\u001B[0m");
        System.out.println("\033[33m" + "║  DEMO SELECTOR SWITCH  ║" + "\u001B[0m");
        System.out.println("\033[33m" + "╚                        ╝" + "\u001B[0m");
        OperacionMatematica operacionSeleccionada = OperacionMatematica.SUMA;
        switch (operacionSeleccionada) {
            case SUMA -> System.out.println("\nSe seleccionó la operación de SUMA");
            case RESTA -> System.out.println("\nSe seleccionó la operación de RESTA");
            case MULTIPLICACION -> System.out.println("\nSe seleccionó la operación de MULTIPLICACIÓN");
            case DIVISION -> System.out.println("\nSe seleccionó la operación de DIVISIÓN");
        }
    }
}

