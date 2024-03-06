package CodigoDeClase.Estructura;
/*
?                       ╔══════════════════════════════════════╗
?                       ║  ENUM CON COMPORTAMIENTO ESPECÍFICO  ║
?                       ╚══════════════════════════════════════╝
! Enum OperacionMatematica:
*   Cada constante del enum representa una operación matemática específica (SUMA, RESTA, MULTIPLICACION, DIVISION).
*   Cada constante implementa el método operar de la interfaz abstracta OperacionMatematica con su propia lógica
*       específica para realizar la operación correspondiente.

! Método main:
*   Se imprime un encabezado para la demostración (DEMO METODOS ESPECIFICOS).
*   Se generan dos números aleatorios (numero1 y numero2).
*   Se realizan las siguientes operaciones matemáticas utilizando las constantes del enum:
?   SUMA: Se imprime el resultado de la suma de numero1 y numero2.
?   RESTA: Se imprime el resultado de la resta de numero1 y numero2.
?   MULTIPLICACION: Se imprime el resultado de la multiplicación de numero1 y numero2.
?   DIVISION: Se intenta imprimir el resultado de la división de numero1 por numero2. Si numero2 es 0, se lanza una
?       excepción ArithmeticException indicando "División por cero".

! Manejo de Excepciones:
*   Se utiliza un bloque try-catch para manejar la excepción ArithmeticException que podría ocurrir durante la
*       operación de división. Si se produce la excepción, se imprime un mensaje de error.
*/
public class DemoEnumEspecifico {
    public enum OperacionMatematica {
        SUMA {
            public int operar(int a, int b) {
                return a + b;
            }
        },
        RESTA {
            public int operar(int a, int b) {
                return a - b;
            }
        },
        MULTIPLICACION {
            public int operar(int a, int b) {
                return a * b;
            }
        },
        DIVISION {
            public int operar(int a, int b) {
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("División por cero");
                }
            }
        };

        //? Método abstracto que cada valor del enum debe implementar
        public abstract int operar(int a, int b);
    }

//! Uso del enumerado OperacionMatematica
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  DEMO METODOS ESPECIFICOS  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚════════════════════════════╝" + "\u001B[0m");

        int numero1 = (int) (Math.random() * 100 + 0);
        int numero2 = (int) (Math.random() * 100 + 0);

        //? Realizar operación de suma
        int suma = OperacionMatematica.SUMA.operar(numero1, numero2);
        System.out.println("Resultado de SUMA: " + suma);

        //? Realizar operación de resta
        int resta = OperacionMatematica.RESTA.operar(numero1, numero2);
        System.out.println("Resultado de RESTA: " + resta);

        //? Realizar operación de multiplicación
        int multiplicacion = OperacionMatematica.MULTIPLICACION.operar(numero1, numero2);
        System.out.println("Resultado de MULTIPLICACION: " + multiplicacion);

        //? Realizar operación de división
        try {
            int division = OperacionMatematica.DIVISION.operar(numero1, numero2);
            System.out.println("Resultado de DIVISION: " + division);
        }catch (ArithmeticException e){
            System.out.println("No se ha podido completar, Error: " + e);
        }
    }
}
