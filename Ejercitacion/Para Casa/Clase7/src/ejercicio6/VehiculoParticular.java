package ejercicio6;

public class VehiculoParticular extends Vehiculo {
    int numeroPuertas;

    public VehiculoParticular(String matricula, float velocidad, int numeroPuertas) {
        super(matricula, velocidad);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "ejercicio6.VehiculoParticular{" +
                "numeroPuertas=" + numeroPuertas +
                ", matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
