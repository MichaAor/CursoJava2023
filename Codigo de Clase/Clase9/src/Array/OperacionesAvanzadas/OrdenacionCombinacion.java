package Array.OperacionesAvanzadas;

import Array.ArrayUtil;

public class OrdenacionCombinacion{
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔===================================================╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO ALGORITMO DE ORDENACION POR Combinacion  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚===================================================╝" + "\u001B[0m");
        //? Array de ejemplo
        int[] array = {64, 25, 12, 22, 11};
        
        //? Imprimir el array original
        System.out.print("\033[36m" + "Array original: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);

        //? Aplicar el algoritmo de ordenación por selección
        algoritmo(array);
        System.out.println();

        //? Imprimir el array ordenado
        System.out.print("\033[36m" + "Array ordenado por Ordenacion por Combinacion: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);
    }


//! ALGORITMO DE ORDENACIÓN POR COMBINACIÓN
//* Método principal para ordenar por combinación (Merge Sort)
    public static void algoritmo(int[] array) {
        int n = array.length;

    //? Caso base: Si el array tiene uno o cero elementos, ya está ordenado
        if (n <= 1) {
            return;
        }

    //? Dividir el array en dos mitades
        int mitad = n / 2;
        int[] izquierda = new int[mitad];
        int[] derecha = new int[n - mitad];

     //? Copiar elementos a las mitades
        System.arraycopy(array, 0, izquierda, 0, mitad);
        System.arraycopy(array, mitad, derecha, 0, n - mitad);

    //? Llamadas recursivas para ordenar las dos mitades
        algoritmo(izquierda);
        algoritmo(derecha);

    //? Combinar las dos mitades ordenadas
        combinar(array, izquierda, derecha);
    }

//* Método para combinar dos mitades ordenadas
    public static void combinar(int[] array, int[] izquierda, int[] derecha) {
        int n1 = izquierda.length;
        int n2 = derecha.length;
        int i = 0, j = 0, k = 0;

    //? Comparar y combinar elementos de las dos mitades
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

    //? Copiar los elementos restantes de izquierda[] si los hay
        while (i < n1) {
            array[k] = izquierda[i];
            i++;
            k++;
        }

    //? Copiar los elementos restantes de derecha[] si los hay
        while (j < n2) {
            array[k] = derecha[j];
            j++;
            k++;
        }
    }


}
