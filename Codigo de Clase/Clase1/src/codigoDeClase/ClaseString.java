package codigoDeClase;

public class ClaseString {
    public static void main(String[] args) {
    //Declaracion y Asignacion o inicializacion;
        String cadena1 = "Hola a todos";

    //Formas de crear
        String cadena2 = "Creacion 1";
        String cadena3 = new String("Cadena 2");

    //Algunos Metodos Fundamentales
        String cadena4 = "Fundamentales";
        String cadena5 = "fundamentales";
        System.out.println("El tamaño de [cadena4] es de " + cadena4.length() + " caracteres");
        System.out.println("El caracter ubicado en la posicion [5] es: " + cadena4.charAt(5));
        System.out.println("1 Los String 'cadena4' y 'cadena5' son iguales? " + cadena4.equals(cadena5));
        System.out.println("2 Los String 'cadena4' y 'cadena5' son iguales? " + cadena4.equalsIgnoreCase(cadena5));
        System.out.println("3 Los String 'cadena4' y 'cadena5' son iguales? " + (cadena4.compareTo(cadena5)));
        System.out.println("El String 'cadena4' cambia a minusculas: " + cadena4.toLowerCase());
        System.out.println("La posicion donde comienza la palabra 'mentales' es: " + cadena4.indexOf("mentales"));
    }
}