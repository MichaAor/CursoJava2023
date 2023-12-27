package codigoDeClase;

public class Operadores {
    public static void main(String[] args) {
// Operadores aritméticos
        int a = 10;
        int b = 5;
        int suma = a + b; // Suma
        int resta = a - b; // Resta
        int multiplicacion = a * b; // Multiplicación
        int division = a / b; // División
        int modulo = a % b; // Módulo (resto de la división);

        System.out.println("\033[36m"+"Operadores Aritméticos:"+"\u001B[0m");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // Operadores de comparación
        int x = 5;
        int y = 7;
        boolean igual = x == y; // Igual a
        boolean noIgual = x != y; // No igual a
        boolean mayorQue = x > y; // Mayor que
        boolean menorQue = x < y; // Menor que
        boolean mayorIgualQue = x >= y; // Mayor o igual que
        boolean menorIgualQue = x <= y; // Menor o igual que

        System.out.println("\033[36m"+"\nOperadores de Comparación:"+"\u001B[0m");
        System.out.println("Igual a: " + igual);
        System.out.println("No igual a: " + noIgual);
        System.out.println("Mayor que: " + mayorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Mayor o igual que: " + mayorIgualQue);
        System.out.println("Menor o igual que: " + menorIgualQue);

        // Operadores lógicos
        boolean condicion1 = true;
        boolean condicion2 = false;
        boolean and = condicion1 && condicion2; // AND lógico
        boolean or = condicion1 || condicion2; // OR lógico
        boolean xor = condicion1 ^ condicion2; // XOR lógico
        boolean not = !condicion1; // NOT lógico

        System.out.println("\033[36m"+"\nOperadores Lógicos:"+"\u001B[0m");
        System.out.println("AND lógico: " + and);
        System.out.println("OR lógico: " + or);
        System.out.println("XOR lógico: " + xor);
        System.out.println("NOT lógico: " + not);

        // Operadores de incremento y decremento
        int inicial = 5;

         /** Con SUFIJO
         * En la forma de sufijo, la variable se utiliza primero en la expresión original
         * y luego se incrementa o decrementa después de que la expresión se evalúa.
         */
        int incSufijo = inicial++; // incSufijo toma el valor de inicial y luego inicial se incrementa
        int decSufijo = inicial--; // decSufijo toma el valor de inicial y luego inicial se decrementa

        System.out.println("\033[36m"+"\nOperadores de Sufijo:"+"\u001B[0m");
        System.out.println("incSufijo = inicial++; // incSufijo = " + incSufijo + ", inicial = " + inicial);
        System.out.println("decSufijo = inicial--; // decSufijo = " + decSufijo + ", inicial = " + inicial);

        // Restaurar el valor original de a
        inicial = 5;

         /** Con PREFIJO
         * En la forma de prefijo, la variable se incrementa o decrementa primero
         * y luego se utiliza en la expresión original.
         */
        int incPrefijo = ++inicial; // inicial se incrementa y luego incPrefijo toma el nuevo valor de inicial
        int decPrefijo = --inicial; // inicial se decrementa y luego decPrefijo toma el nuevo valor de inicial

        System.out.println("\033[36m"+"\nOperadores de Prefijo:"+"\u001B[0m");
        System.out.println("incPrefijo = ++inicial; // incPrefijo = " + incPrefijo + ", inicial = " + inicial);
        System.out.println("decPrefijo = --inicial; // decPrefijo = " + decPrefijo + ", inicial = " + inicial);

        // Operadores Unarios
        int positivo = 5; // Operador unario positivo
        int negativo = -8; // Operador unario negativo
        int complemento = ~10;

        System.out.println("\033[36m"+"\nOperadores Unarios:"+"\u001B[0m");
        System.out.println("Positivo: " + positivo);
        System.out.println("Negativo: " + negativo);
        System.out.println("Complemento de [10]: " + complemento);

        // Operador condicional (operador ternario)
        int edad = 5;
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println("\033[36m"+"\nOperador Condicional (Ternario):"+"\u001B[0m");
        System.out.println(mensaje);
    }
}