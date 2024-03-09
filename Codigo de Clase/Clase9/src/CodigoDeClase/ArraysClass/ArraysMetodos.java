package CodigoDeClase.ArraysClass;

import CodigoDeClase.ArrayUtil;

import java.util.Arrays;
import java.util.List;

public class ArraysMetodos {
    public static void main(String[] args) {
        System.out.println("\033[36m" + "╔═══════════════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  EJEMPLO DE USO ARRAYS CLASS  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚═══════════════════════════════╝" + "\u001B[0m");

    //! ARRAY DEL EJEMPLO.
    int[] arr = ArrayUtil.inicializarArray(5);
        System.out.println("\033[34m" + "Array Original (arr): " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");

    //? Ordenación Completa
        System.out.println("\033[35m" + "═══ Arrays.sort(arr) ═══" + "\u001B[0m");
        Arrays.sort(arr);
        System.out.println("\033[32m" + "Resultado: " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");

    //! Reestablezco el valor del array.
    arr = ArrayUtil.inicializarArray(6);

    //? Ordenación con limites
        System.out.println("\033[35m" + "═══ Arrays.sort(arr,inicion,fin) ═══" + "\u001B[0m");
        System.out.println("\033[34m" + "Array Original (arr): " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");
        Arrays.sort(arr,2,5);
        System.out.println("\033[32m" + "Resultado: " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");

    //? Búsqueda Binaria
        System.out.println("\033[35m" + "═══ Arrays.binarySearch(arr, elementoBuscar) ═══" + "\u001B[0m");
        int elementoBuscar = 7;
        int indice = Arrays.binarySearch(arr, elementoBuscar);
        System.out.println("\033[37m" + "Elemento a buscar: "+ "\u001B[0m" + elementoBuscar );
        System.out.println("\033[32m" + "Posicion donde se encuentra: "+ "\u001B[0m" + indice );

    //? Comparación
        System.out.println("\033[35m" + "\n═══ Arrays.equals(arr, arr2) ═══" + "\u001B[0m");
    //! Declaro e Inicializo otro Array para comparar.
    int[] arr2 = {9, 6, 8, 3, 5};
        boolean sonIguales = Arrays.equals(arr, arr2);
        System.out.print("\033[37m" + "arr: " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");
        System.out.print("\033[37m" + "arr2: " + ArrayUtil.toStringArrayInt(arr2) +"\u001B[0m");
        System.out.println("\033[32m" + "Ambos Arrays son iguales? "+ "\u001B[0m" + sonIguales );

    //? Copiado
        System.out.println("\033[35m" + "\n═══ Arrays.copyOf(arr, tamanio) ═══" + "\u001B[0m");
    //! Declaro e Inicializo con el metodo que copia el contenido de otro Array, con nuevo tamanio incluido.
    int[] arrCopia = Arrays.copyOf(arr, 7);
        System.out.print("\033[37m" + "arr: " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");
        System.out.println("\033[32m" + "Resultado: " + ArrayUtil.toStringArrayInt(arrCopia) +"\u001B[0m");

    //? Llenado Completo
        System.out.println("\033[35m" + "\n═══ Arrays.fill(arrLlenado, valorQLlena) ═══" + "\u001B[0m");
    //! Declaro nuevo Array vacio para llenar con el metodo.
    int[] arrLlenado = new int[5];
        System.out.print("\033[37m" + "arrLlenado: " + ArrayUtil.toStringArrayInt(arrLlenado) +"\u001B[0m");
        Arrays.fill(arrLlenado, 42);
        System.out.println("\033[32m" + "Despues del metodo: " + ArrayUtil.toStringArrayInt(arrLlenado) +"\u001B[0m");

    //? Llenado Parcial
        System.out.println("\033[35m" + "\n═══ Arrays.fill(arrLlenado,inicio,fin, valorQLlena) ═══" + "\u001B[0m");
    //! Restauro el viejo Array y lo dejo vacio para llenar con el metodo.
        arrLlenado = new int[10];
        System.out.print("\033[37m" + "arrLlenado: " + ArrayUtil.toStringArrayInt(arrLlenado) +"\u001B[0m");
        Arrays.fill(arrLlenado,5,10, 42);
        System.out.println("\033[32m" + "Despues del metodo: " + ArrayUtil.toStringArrayInt(arrLlenado) +"\u001B[0m");

    //? Conversión a Lista
        System.out.println("\033[35m" + "\n═══ Arrays.asList(arrINT) ═══" + "\u001B[0m");
    //! Declaro nuevo Array de tipo Integer, ya que los primitivos como tal no caben en List.
        Integer[] arrINT = {5,6,2,3,9,1};
        List<Integer> arrList = Arrays.asList(arrINT);
        System.out.println("\033[32m" + "Resultado: " + arrList +"\u001B[0m");
//        arrList.forEach(System.out::println);

    //? Comprobación de Igualdad
        System.out.println("\033[35m" + "\n═══ Arrays.deepEquals(matriz,matriz2) ═══" + "\u001B[0m");
        int[][] matriz = {{1, 2}, {3, 4}};
        System.out.println("\033[36m" + "Matriz" +"\u001B[0m");
        ArrayUtil.mostrarMatriz(matriz);

        int[][] matriz2 = {{1, 2}, {3, 4}};
        System.out.println("\033[36m" + "\nMatriz2" +"\u001B[0m");
        ArrayUtil.mostrarMatriz(matriz2);

        boolean sonIgualesMatrices = Arrays.deepEquals(matriz, matriz2);
        System.out.println("\033[32m" + "\nSon iguales? " + sonIgualesMatrices +"\u001B[0m");

    //? Combinación
        System.out.println("\033[35m" + "\n═══ Arrays.copyOfRange(arr, inicio, fin) ═══" + "\u001B[0m");
        int[] arrCombinado = {4,5,7,8,9,1};
        System.out.println("\033[37m" + "arr: " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");
        System.out.println("\033[37m" + "arrCombinado: " + ArrayUtil.toStringArrayInt(arrCombinado) +"\u001B[0m");

        arrCombinado = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("\033[32m" + "Despues del metodo: " + ArrayUtil.toStringArrayInt(arrCombinado) +"\u001B[0m");

    //? toString()
        String arrayString = Arrays.toString(arr);
        System.out.println("\033[37m" + "arr: " + ArrayUtil.toStringArrayInt(arr) +"\u001B[0m");
        System.out.println("\033[32m" + "Despues del metodo: " + arrayString +"\u001B[0m");
    }
}
