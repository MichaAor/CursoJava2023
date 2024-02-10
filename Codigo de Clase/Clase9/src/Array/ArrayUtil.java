package Array;

//!Esta clase contiene funciones auxiliares para ARRAYS.
public class ArrayUtil {
    public static <T> void mostrarArrayGeneric(T[] array){
        for (T value : array) {
            System.out.print("[" + value + "]-");
        }
    }

    public static <T> void mostrarArrayInt(int[] array){
        for (int value : array) {
            System.out.print("[" + value + "]-");
        }
    }

    public static int[] inicializarArray(int tamanio){
        int[] array = new int[tamanio];
        for(int i = 0; i < tamanio; i++){
            array[i] = (int) ((Math.random() * 100) + 1);  
        }        
    return array;    
    }
}
