package codigoDeClase.Poliformismo;

public class MainPoliformismo {
    public static void main(String[] args) {
    //Declaracion y Asignacion o inicializacion;
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();

    //Ambos aplican el mismo metodo ejecutado de diferente manera
        double areaCirculo = circulo.calcularArea();
        double areaCuadrado = cuadrado.calcularArea();
    }
}