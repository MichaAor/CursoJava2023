package EjercitacionClase.Ejercicio2;

/**
 * ? c) Crea una clase abstracta llamada Subasta que tenga atributos como obraEnSubasta,
 * ?   pujaActual, y pujadorActual.
 * ? d) Define métodos abstractos como iniciarSubasta() y cerrarSubasta() en la clase Subasta.
 */
public abstract class Subasta {
    ObraDeArte obraEnSubasta;
    String pujaActual;
    String pujadorActual;

    public ObraDeArte getObraEnSubasta() {
        return obraEnSubasta;
    }

    public void setObraEnSubasta(ObraDeArte obraEnSubasta) {
        this.obraEnSubasta = obraEnSubasta;
    }

    public String getPujaActual() {
        return pujaActual;
    }

    public void setPujaActual(String pujaActual) {
        this.pujaActual = pujaActual;
    }

    public String getPujadorActual() {
        return pujadorActual;
    }

    public void setPujadorActual(String pujadorActual) {
        this.pujadorActual = pujadorActual;
    }

    public abstract void iniciarSubasta();
    public abstract void cerrarSubasta();

    @Override
    public String toString() {
        return "Subasta{" +
                "obraEnSubasta=" + obraEnSubasta +
                ", pujaActual='" + pujaActual + '\'' +
                ", pujadorActual='" + pujadorActual + '\'' +
                '}';
    }
}
