package EjercitacionClase.Ej1;

public class Ej1Main {
    public static void main(String[] args) {
        /*
         *                                        //-- EJERCITACION DE CLASE --//
         * REALIZAR CADA EJERCICIO CON SU CORRESPONDIENTE DOCUMENTACION Y DEMOSTRAR LOS RESULTADOS
         *  DE MANERA PROLIJA EN LA CONSOLA
         *
         *1) Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor
         *    1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También
         *    debe contar con un método para calcular el área y perímetro del mismo. Ejecute las
         *    siguientes pruebas:
         *    a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
         *    b. Imprimir por pantalla el alto y ancho.
         *    c. Imprimir por pantalla el área y perímetro.
         *    d. Modificar el alto y el ancho de la instancia.
         *    e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
         *    f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
         */

        Rectangulo rectangulo= new Rectangulo(2.1f,1.0f);
        System.out.println(rectangulo);

    }
}