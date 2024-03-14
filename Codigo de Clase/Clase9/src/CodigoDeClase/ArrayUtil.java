package CodigoDeClase;

//!Esta clase contiene funciones auxiliares para ARRAYS y MATRICES.
public class ArrayUtil {
    public static <T> void mostrarArrayGeneric(T[] array){
        for (T value : array) {
            System.out.print("[" + value + "]-");
        }
    }

    public static void mostrarArrayInt(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("\033[33m" + "[" + array[i] + "]" + "\u001B[0m");
            if (i < array.length - 1) {
                System.out.print("-");
            }
        }
    }

    public static String toStringArrayInt(int[] array){
        String arr = "";
        for (int i = 0; i < array.length; i++) {
            arr += "\033[31m" + "[" + array[i] + "]" + "\u001B[0m";
            if (i < array.length - 1) {
                arr += "-";
            }
        }
        arr += "\n";
        return arr;
    }

    public static int[] inicializarArray(int tamanio){
        int[] array = new int[tamanio];
        for(int i = 0; i < tamanio; i++){
            array[i] = (int) ((Math.random() * 100) + 1);  
        }        
    return array;    
    }

    public static int[][] inicializarMatriz(int filas,int columna){
        int[][] matriz = new int[filas][columna];

        for(int i = 0; i < filas; i++){
            matriz[i] = inicializarArray(columna);
        }

    return matriz;    
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]\t");
            }
            System.out.println();
        }
    }
}
