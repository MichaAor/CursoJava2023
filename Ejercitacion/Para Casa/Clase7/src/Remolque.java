public class Remolque extends Vehiculo{
    int tipoRemolque;

    public Remolque(String matricula, float velocidad, int tipoRemolque) {
        super(matricula, velocidad);
        this.tipoRemolque = tipoRemolque;
    }
    public int getTipoRemolque() {
        return tipoRemolque;
    }
    public void setTipoRemolque(int tipoRemolque) {
        this.tipoRemolque = tipoRemolque;
    }

    @Override
    public String toString() {
        return "Remolque{" +
                "tipoRemolque='" + tipoRemolque + '\'' +
                ", matricula='" + matricula + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}