package EjercitacionClase.Ejercicio2;

/**
 * ? a) Modifica la clase ObraDeArte para incluir atributos como estilo y periodoArtístico.
 * ? b) Define un método abstracto adicional exponer() en la clase ObraDeArte para simular
 * ?   la exposición de la obra en una galería.
 */
public abstract class ObraDeArte {

    String estilo;
    String periodoArtístico;
    public abstract void exponer();

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getPeriodoArtístico() {
        return periodoArtístico;
    }

    public void setPeriodoArtístico(String periodoArtístico) {
        this.periodoArtístico = periodoArtístico;
    }

    @Override
    public String toString() {
        return "ObraDeArte{" +
                "estilo='" + estilo + '\'' +
                ", periodoArtístico='" + periodoArtístico + '\'' +
                '}';
    }
}
