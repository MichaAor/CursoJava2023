
public class vehiculoParticular extends Vehiculo {
    int numeroPuertas;

    public vehiculoParticular(String matricula, float velocidad, int numeroPuertas) {
        super(matricula, velocidad);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
