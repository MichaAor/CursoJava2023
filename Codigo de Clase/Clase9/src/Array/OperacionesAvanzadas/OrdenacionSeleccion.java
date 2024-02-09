package Array.OperacionesAvanzadas;

import Array.ArrayUtil;

public class OrdenacionSeleccion {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔=================================================╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO ALGORITMO DE ORDENACION POR SELECCION  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚=================================================╝" + "\u001B[0m");
        //? Array de ejemplo
        int[] array = {64, 25, 12, 22, 11};
        
        //? Imprimir el array original
        System.out.print("\033[36m" + "Array original: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);

        //? Aplicar el algoritmo de ordenación por selección
        algoritmo(array);
        System.out.println();

        //? Imprimir el array ordenado
        System.out.print("\033[36m" + "Array ordenado por Ordenacion de Seleccion: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);
    }


//! ALGORITMO DE ORDENACIÓN POR SELECCIÓN
    public static void algoritmo(int[] array) {
    //? Obtener la longitud del array
        int n = array.length;
        
    //? Iterar sobre el array.
        for (int i = 0; i < n - 1; i++) {
    //? Suponer que el elemento actual es el mínimo.
            int minIndex = i;
            
    //? Buscar el elemento mínimo en el resto del array no ordenado.
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
    //? Actualizar el índice del mínimo SI se encuentra un elemento más pequeño.
                    minIndex = j;
                }
            }
            
    //? Intercambiar el elemento mínimo encontrado con el primer elemento no ordenado
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
