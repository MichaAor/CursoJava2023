package CodigoDeClase.Array;

public class DeclaracionEInicializacion {

    public static void main(String[] args) {
//? Declaración sin Inicialización (Tamaño Dinámico):
        int[] datos = new int[5];

//? Declaración e Inicialización en una Línea:
        int[] numeros = {1, 2, 3, 4, 5};

//? Declaración e Inicialización en Dos Líneas:
        int[] edades;
        edades = new int[]{20, 25, 30};

//? Declaración con Tamaño Dinámico (Usando una Variable):
        int tamano = 8;
        float[] precios = new float[tamano]; 
 
//? Declaración sin Inicialización de referencia:
        String[] arrayString = new String[10];
    }
}
