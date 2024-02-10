package CodigoDeClase.Matriz;

import CodigoDeClase.ArrayUtil;

public class OperacionesBasicas {
    public static void main(String[] args) {
//? Declaración e inicialización de matrices
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

//? Recuperación de elemento por índice
        int elementoRecuperado = matriz1[1][2]; //* Recuperar elemento en la segunda fila y tercera columna.

//? Modificación de elemento por índice
        matriz1[0][1] = 10; //* Modificar elemento en la primera fila y segunda columna.    

//? Obtención del tamaño de la matriz
        int filasM = matriz1.length; //* Número de filas.
        int columnasM = matriz1[0].length; //* Número de columnas (asumiendo que todas las filas tienen la misma longitud).    
    
//? Recorrido con un bucle
        for (int i = 0; i < filasM; i++) {
            for (int j = 0; j < columnasM; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

//? Recorrido con bucle foreach
        for (int[] fila : matriz1) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println(); //* */ Nueva línea después de cada fila
        }

//? Copia de matrices
        int[][] copiaMatriz = new int[filasM][columnasM];
        for (int i = 0; i < filasM; i++) {
            System.arraycopy(matriz1[i], 0, copiaMatriz[i], 0, columnasM);
        }    

//? Suma de matrices
        int[][] sumaMatrices = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

//? Resta de matrices
        int[][] restaMatrices = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    restaMatrices[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

//? Multiplicación de matrices
        int[][] multiplicacionMatrices = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                        multiplicacionMatrices[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

//? Transposición de matriz
        int filas = 3;
        int columnas = 3;
        int[][] matrizTranspuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                    matrizTranspuesta[j][i] = matriz1[i][j];
            }
        }

//? Búsqueda en matriz
        int elementoBuscado = 5;
        boolean encontrado = false;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                    if (matriz1[i][j] == elementoBuscado) {
                    encontrado = true;
                    break; //* Elemento encontrado, salir del bucle
                    }
            }
            if (encontrado) {
                    break; //* Elemento encontrado, salir del bucle externo
            }
        }

//? Cargar Matriz Automaticamente
        int fila = 5;
        int columna = 8;
        int[][] matrizAuto = ArrayUtil.inicializarMatriz(fila, columna);

//? Mostrar con formato
        System.out.println("\033[36m" + "╔══════════════════════╗" + "\u001B[0m");
        System.out.println("\033[36m" + "║  MATRIZ CON FORMATO  ║" + "\u001B[0m");
        System.out.println("\033[36m" + "╚══════════════════════╝" + "\u001B[0m");
        ArrayUtil.mostrarMatriz(matrizAuto);   
    }   
}
