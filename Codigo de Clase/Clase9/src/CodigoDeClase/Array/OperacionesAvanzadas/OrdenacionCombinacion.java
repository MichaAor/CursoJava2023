package CodigoDeClase.Array.OperacionesAvanzadas;

import CodigoDeClase.ArrayUtil;

public class OrdenacionCombinacion{
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO ALGORITMO DE ORDENACION POR Combinacion  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════════════════════════════╝" + "\u001B[0m");
        //? Array de ejemplo
        int[] array = ArrayUtil.inicializarArray(5);
        
        //? Imprimir el array original
        System.out.print("\033[36m" + "Array original: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);

        //? Aplicar el algoritmo de ordenación por selección
        algoritmo(array,0,array.length - 1);
        System.out.println();

        //? Imprimir el array ordenado
        System.out.print("\033[36m" + "Array ordenado por Ordenacion por Combinacion: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);
    }


//! ALGORITMO DE ORDENACIÓN POR COMBINACIÓN
//* Método principal para ordenar por combinación (Merge Sort)
    public static void algoritmo(int[] array, int inicio, int fin) {
    //? Paso 1: Verificar si hay más de un elemento en el array
        if (inicio < fin) {
    //? Paso 2: Calcular la mitad del array
            int mitad = inicio + (fin - inicio) / 2;

    //? Paso 3: Llamadas recursivas para ordenar las dos mitades
            algoritmo(array, inicio, mitad);
            algoritmo(array, mitad + 1, fin);

    //? Paso 4: Combinar las dos mitades ordenadas
            combinar(array, inicio, mitad, fin);
        }
    }

//* Método para combinar dos mitades ordenadas
    public static void combinar(int[] array, int inicio, int mitad, int fin) {
    //? Calcular las longitudes de las dos mitades
        int n1 = mitad - inicio + 1;
        int n2 = fin - mitad;

    //? Crear arrays temporales para las dos mitades
        int[] izquierda = new int[n1];
        int[] derecha = new int[n2];

    //? Paso 1: Copiar datos a los arrays temporales
        System.arraycopy(array, inicio, izquierda, 0, n1);
        System.arraycopy(array, mitad + 1, derecha, 0, n2);

    //? Inicializar índices para recorrer las dos mitades y el array final
        int i = 0, j = 0, k = inicio;

    //? Paso 2: Comparar y combinar elementos de las dos mitades
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                array[k] = izquierda[i];
                i++;
            } else {
                array[k] = derecha[j];
                j++;
            }
            k++;
        }

    //? Paso 3: Copiar elementos restantes de izquierda[] si los hay
        while (i < n1) {
            array[k] = izquierda[i];
            i++;
            k++;
        }

    //? Paso 4: Copiar elementos restantes de derecha[] si los hay
        while (j < n2) {
            array[k] = derecha[j];
            j++;
            k++;
        }
    }
//! EXPLICACIÓN DE PASOS RECURSIVOS:
/*
? Caso Base:
*   - Cuando se llama a algoritmo, lo primero que hace es verificar si la longitud del subarray actual es 1 o menos (caso base).
*   - Si la longitud es 1 o menos, significa que el array está ordenado (ya que un solo elemento se considera ordenado), 
*       y la función simplemente devuelve sin hacer nada más.

? División:
*   - Si el caso base no se cumple (es decir, el subarray tiene más de un elemento), la función procede a dividir el subarray 
*       en dos mitades aproximadamente iguales.

? Recursividad:
*   - Ahora viene el aspecto recursivo. Se realizan dos llamadas recursivas a algoritmo, una para cada mitad del subarray.
*   - Cada llamada recursiva sigue el mismo proceso: verifica el caso base, divide el subarray y realiza llamadas recursivas.

? Combinación:
*   - Después de que las llamadas recursivas han dividido y ordenado las mitades, se realiza la fase de combinación.
*   - La función merge se encarga de combinar las dos mitades ordenadas en un array más grande y completamente ordenado.
*/    
}
