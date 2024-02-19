package ejercicio6;

public class Remolque{
    Integer tipoRemolque = null;

    public Remolque(String matricula, float velocidad) {
        this.tipoRemolque = null;
    }
    public int getTipoRemolque() {
        return tipoRemolque;
    }
    public void setTipoRemolque(int tipoRemolque) {
        this.tipoRemolque = tipoRemolque;
    }

    public boolean esTipoRemoqueNulo(){
        return ((this.tipoRemolque == null) ? true : false);
    }
    @Override
    public String toString() {
        return "ejercicio6.Remolque{" +
                "tipoRemolque=" + tipoRemolque +
                '}';
    }
}