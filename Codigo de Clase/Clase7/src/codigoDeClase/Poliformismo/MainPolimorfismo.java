package codigoDeClase.Poliformismo;

/*
!   POLIMORFISMO
?   Explicación: 
*   El polimorfismo permite que un objeto pueda tomar diferentes formas. Puede manifestarse a través de la
*       sobrecarga de métodos, la implementación de interfaces y la creación de métodos que pueden aceptar
*       objetos de diferentes tipos.
?   Ventajas:
*   -Permite tratar objetos de clases derivadas como objetos de la clase base.
*   -Facilita la extensión del sistema mediante nuevas implementaciones de interfaces.
?   Desventajas:
*   -Puede resultar complejo entender la relación entre clases y objetos en sistemas grandes.
*/
public class MainPolimorfismo{
    public static void main(String[] args) {
//! Declaración y Asignación o inicializacion;
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();

//! Ambos aplican el mismo método ejecutado de diferente manera
        double areaCirculo = circulo.calcularArea();
        double areaCuadrado = cuadrado.calcularArea();

        System.out.println(areaCirculo);
        System.out.println(areaCuadrado);
    }
}