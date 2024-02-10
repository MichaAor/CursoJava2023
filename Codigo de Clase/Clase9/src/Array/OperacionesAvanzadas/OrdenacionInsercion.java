package Array.OperacionesAvanzadas;

import Array.ArrayUtil;

public class OrdenacionInsercion{
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔=================================================╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO ALGORITMO DE ORDENACION POR INSERCION  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚=================================================╝" + "\u001B[0m");
        //? Array de ejemplo
        int[] array = ArrayUtil.inicializarArray(5);
        
        //? Imprimir el array original
        System.out.print("\033[36m" + "Array original: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);

        //? Aplicar el algoritmo de ordenación por selección
        algoritmo(array);
        System.out.println();

        //? Imprimir el array ordenado
        System.out.print("\033[36m" + "Array ordenado por Ordenacion por Insercion: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);
    }


//! ALGORITMO DE ORDENACIÓN POR INSERCIÓN
    public static void algoritmo(int[] array) {
    //? Obtengo la longitud del array
        int n = array.length;

    //? Itero sobre el array desde el segundo elemento
        for (int i = 1; i < n; ++i) {
            int elementoActual = array[i]; //? Elemento actual a insertar
            int j = i - 1;

    //? Desplazo elementos mayores hacia la derecha
    //? hasta encontrar la posición correcta para el elemento actual
            while (j >= 0 && array[j] > elementoActual) {
                array[j + 1] = array[j];
                j = j - 1;
            }

    //? Insertar el elemento actual en la posición correcta
            array[j + 1] = elementoActual;
        }
    }
}
