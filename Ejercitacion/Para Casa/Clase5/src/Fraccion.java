public class Fraccion {
    private int numerador;
    private int denominador;

    // Constructor
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("El denominador no puede ser cero.");
        }

        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Método para invertir la fracción
    public void invierte() {
        int auxiliar = numerador;
        this.numerador = denominador;
        this.denominador = auxiliar;
    }

    // Método para simplificar la fracción
    public void simplifica() {
        int gcd = mcd(Math.abs(numerador), Math.abs(denominador));
        this.numerador /= gcd;
        this.denominador /= gcd;
    }

    // Método para multiplicar por otra fracción
    public Fraccion multiplica(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        Fraccion resultado = new Fraccion(nuevoNumerador, nuevoDenominador);
        resultado.simplifica();
        return resultado;
    }

    // Método para dividir por otra fracción
    public Fraccion divide(Fraccion otraFraccion) {
        if (otraFraccion.numerador == 0) {
            System.out.println("El numerador no puede ser cero.");
        }

        Fraccion inversa = new Fraccion(otraFraccion.denominador, otraFraccion.numerador);
        return this.multiplica(inversa);
    }

    // Método para calcular el máximo común divisor (MCD) euclides
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
