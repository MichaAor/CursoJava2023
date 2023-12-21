package codigoDeClase;

import java.util.List;

public class Introduccion {
    public static void main(String[] args) {
        int cantidad;   //Declaracion.
        cantidad = 55;  //Asignacion.

        int cantidad2 = 28; //Declaracion y Asignacion al mismo tiempo.

//VARIABLES PRIMITIVAS
//Enteros
        byte val1;  //Rango de -128 a 127
        short val2;   //Rango de -32,768 a 32,767
        int val3;   //Rango de -2,147,483,648 a 2,147,483,647
        long val4;  //Rango de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

//Decimales
        float val5; //Precisión de hasta 7 dígitos decimales
        double val6; //Precisión de hasta 15 dígitos decimales

//Caracter
        char val7;  //Representa un carácter Unicode.

//Booleano
        boolean val8; //Representa valores de verdad (true o false).

//VARIABLES DE REFERENCIA
//Objeto
        String val9;    //Sin instanciar aun.

//Array
        int[] val10;    //Sin longitud definida, ni inicializado.

//Interfaz
        List<String> textos;    //Sin inicializar.
    }
}