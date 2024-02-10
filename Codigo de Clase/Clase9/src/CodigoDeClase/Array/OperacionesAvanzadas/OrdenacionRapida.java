package CodigoDeClase.Array.OperacionesAvanzadas;

import CodigoDeClase.ArrayUtil;

public class OrdenacionRapida {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═════════════════════════════════════════=╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO ALGORITMO DE ORDENACION RAPIDA  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚══════════════════════════════════════════╝" + "\u001B[0m");
        //? Array de ejemplo
        int[] array = ArrayUtil.inicializarArray(5);
        
        //? Imprimir el array original
        System.out.print("\033[36m" + "Array original: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);

        //? Aplicar el algoritmo de ordenación por selección
        algoritmo(array,0,array.length - 1);
        System.out.println();

        //? Imprimir el array ordenado
        System.out.print("\033[36m" + "Array ordenado por Ordenacion Rapida: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);
    }


//! ALGORITMO DE ORDENACIÓN RÁPIDA
//* Método principal para ordenar por Quick Sort
    public static void algoritmo(int[] array, int inicio, int fin) {
        if (inicio < fin) {
    //? Paso 1: Realizar la partición y obtener la posición final del pivote
            int indicePivote = particionar(array, inicio, fin);

    //? Paso 2: Llamadas recursivas a Quick Sort en los subconjuntos izquierdo y derecho del pivote
            algoritmo(array, inicio, indicePivote - 1);
            algoritmo(array, indicePivote + 1, fin);
        }
    }

//* Método para realizar la partición
    public static int particionar(int[] array, int inicio, int fin) {
    //? Paso 1: Seleccionar el pivote (en este caso, el último elemento del subarray)
        int pivote = array[fin];
        int i = inicio - 1; //* Inicializar el índice de elementos menores que el pivote

    //? Paso 2: Recorrer el subarray y reorganizar elementos menores y mayores que el pivote
        for (int j = inicio; j < fin; j++) {
            if (array[j] < pivote) {
    //? Intercambio de elementos: incrementar índice y swap
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

    //? Paso 3: Colocar el pivote en su posición correcta
        int temp = array[i + 1];
        array[i + 1] = array[fin];
        array[fin] = temp;

    //? Paso 4: Devolver la posición final del pivote
        return i + 1;
    }

//! EXPLICACIÓN DE PASOS RECURSIVOS:
/*
? Primera Llamada (Llamada Inicial):
*   - Comenzamos con el array completo.
*   - Elegimos un número llamado "pivote" (en este caso, el último número).
*   - Organizamos los números para que los menores al pivote estén a la izquierda y los mayores a la derecha.
*   - Ahora tenemos dos grupos: uno a la izquierda del pivote y otro a la derecha.

? Llamada Recursiva Izquierda:
*   - Aplicamos el mismo proceso al grupo de la izquierda (subarray izquierdo).
*   - Elegimos un nuevo pivote y organizamos los números.
*   - Ahora, en el subarray izquierdo, tenemos dos grupos más pequeños: uno a la izquierda del nuevo pivote y otro a la derecha.

? Llamada Recursiva Derecha:
*   - Hacemos lo mismo con el grupo de la derecha (subarray derecho).
*   - Elegimos un pivote y organizamos los números.
*   - Ahora, en el subarray derecho, también tenemos dos grupos más pequeños.

? Proceso Recursivo:
*   - Este proceso se repite en cada grupo más pequeño (izquierda y derecha) hasta que cada grupo tenga un solo número o esté vacío.
*   - Al final, todos los grupos se combinan en orden, y el array completo queda ordenado.
*/    
}
