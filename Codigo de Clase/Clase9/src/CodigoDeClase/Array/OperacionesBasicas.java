package CodigoDeClase.Array;

public class OperacionesBasicas {
    public static void main(String[] args) {
//? Declaración e Inicialización: Crear un array y asignarle valores.
        int[] numeros = {1, 2, 3, 4, 5};

//? Acceso a Elementos: Recuperar o modificar el valor de un elemento en el array.
        int primerElemento = numeros[0];  // * Acceder al primer elemento

//? Longitud del Array: Obtener la cantidad total de elementos en el array.
        int longitud = numeros.length;

//? Recorrido con Bucles: Iterar sobre todos los elementos del array.
        for (int i = 0; i < numeros.length; i++) {
            //* Operaciones con elementos (numeros[i])
            System.out.println(i);
        }

//? Recorrido con ForEach: Iterar sobre todos los elementos del array sin marcar un limite explicito.
        for (int num : numeros) {
            //* Operaciones con elementos (num cambiara con cada iteración,debido al avance)
            System.out.println(num);
        }

//? Modificación de Elementos: Cambiar el valor de uno o varios elementos en el array.
        numeros[2] = 100;  //* Modificar el tercer elemento

//? Copia de Arrays: Crear una copia de un array existente.
        int[] copia = new int[numeros.length];
        System.arraycopy(numeros, 0, copia, 0, numeros.length);

//? Búsqueda en Arrays: Buscar un elemento específico y obtener su índice.
        int elemento = 3;
        int indice = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elemento) {
                indice = i;
                break;
            }
        }
    }
}
