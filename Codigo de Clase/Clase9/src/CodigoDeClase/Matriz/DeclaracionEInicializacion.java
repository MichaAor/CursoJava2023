package CodigoDeClase.Matriz;

public class DeclaracionEInicializacion {
    public static void main(String[] args) {
//? Declaración de una matriz de tamaño específico
        int[][] matriz1 = new int[3][4]; // Matriz de 3 filas y 4 columnas

//? Inicialización directa de una matriz
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//? Declaración e inicialización por separado
        int[][] matriz3;
        matriz3 = new int[2][3]; // Matriz de 2 filas y 3 columnas

//? Declaración con inicialización dinámica
        int[][] matriz4 = new int[3][];
        matriz4[0] = new int[2];
        matriz4[1] = new int[4];
        matriz4[2] = new int[3];

//? Declaración y creación por separado
        int[][] matriz5;
        matriz5 = new int[2][]; // El número de columnas puede variar en cada fila
        matriz5[0] = new int[3];
        matriz5[1] = new int[5];
    }
}
