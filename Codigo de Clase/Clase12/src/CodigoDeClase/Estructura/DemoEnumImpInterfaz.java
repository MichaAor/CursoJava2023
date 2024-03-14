package CodigoDeClase.Estructura;
/*
?                       ╔════════════════════════════╗
?                       ║  ENUM IMPLEMENT INTERFACE  ║
?                       ╚════════════════════════════╝
! Interfaz OperacionMatematica:
*   Define una interfaz con un único método operar para realizar operaciones matemáticas.

! Enum Operaciones:
*   Implementa la interfaz OperacionMatematica.
*   Cada constante del enum proporciona su propia implementación del método operar según la operación
*       matemática correspondiente.

! Uso del Enum en el Método main:
*   En el método main, se generan dos números aleatorios y se recorren todas las constantes del enum Operaciones.
*   Para cada operación, se invoca el método operar para obtener y mostrar el resultado de la operación matemática.

? Simplicidad:
*   La eliminación de la palabra clave abstract en la interfaz no afecta su funcionalidad,
*       ya que los métodos de una interfaz son implícitamente abstractos.
*   Este enfoque simplificado mantiene la claridad del código.
*/

//! Interfaz que será implementada por el enum
interface OperacionMatematica {
    int operar(int a, int b);
}

//! Enum que implementa la interfaz OperacionMatematica
enum Operaciones implements OperacionMatematica {
    SUMA {
        // Implementación del método operar para la operación de suma
        public int operar(int a, int b) {
            return a + b;
        }
    },
    RESTA {
        // Implementación del método operar para la operación de resta
        public int operar(int a, int b) {
            return a - b;
        }
    },
    MULTIPLICACION {
        // Implementación del método operar para la operación de multiplicación
        public int operar(int a, int b) {
            return a * b;
        }
    },
    DIVISION {
        // Implementación del método operar para la operación de división
        public int operar(int a, int b) {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("División por cero");
            }
        }
    }
}

public class DemoEnumImpInterfaz {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO ENUM CON INTERFAZ IMPLEMENTADA  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════════════════╝" + "\u001B[0m");

        int numero1 = (int) (Math.random() * 100 + 1);
        int numero2 = (int) (Math.random() * 100 + 1);

        //? Uso de la interfaz OperacionMatematica a través del enum
        for (OperacionMatematica operacion : Operaciones.values()) {
            int resultado = operacion.operar(numero1, numero2);
            System.out.println("Resultado de " + operacion + ": " + resultado);
        }
    }
}
