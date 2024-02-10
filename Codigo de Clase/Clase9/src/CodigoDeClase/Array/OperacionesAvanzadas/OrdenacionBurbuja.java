package CodigoDeClase.Array.OperacionesAvanzadas;

import CodigoDeClase.ArrayUtil;

public class OrdenacionBurbuja {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO ALGORITMO DE ORDENACION BURBUJA  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════════════════════╝" + "\u001B[0m");
        //? Array de ejemplo
        int[] array = ArrayUtil.inicializarArray(5);
        
        //? Imprimir el array original
        System.out.print("\033[36m" + "Array original: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);

        //? Aplicar el algoritmo de ordenación por selección
        algoritmo(array);
        System.out.println();

        //? Imprimir el array ordenado
        System.out.print("\033[36m" + "Array ordenado por Ordenacion Burbuja: " + "\u001B[0m");
        ArrayUtil.mostrarArrayInt(array);
    }


//! ALGORITMO DE ORDENACIÓN BURBUJA
    public static void algoritmo(int[] array) {
    //? Obtener la longitud del array
        int n = array.length;

    //? Variable para controlar si se realizó algún intercambio
        boolean intercambioRealizado;

    //? Bucle do-while para garantizar al menos un pase
        do {
    //? Inicializar la variable de control en falso al comienzo de cada pase
            intercambioRealizado = false;

    //? Iterar sobre el array y realizar intercambios si es necesario
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
    //? Intercambiar elementos si están en el orden incorrecto
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

    //? Indicar que se ha realizado un intercambio
                    intercambioRealizado = true;
                }
            }
    //? Repetir hasta que no se realicen más intercambios        
        } while (intercambioRealizado);  
    }
}
