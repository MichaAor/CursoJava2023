import java.util.List;

public class Colaborador {
    String nombre;
    String habilidades;
    List<Tarea> tareasAsignadas;

    public Colaborador(String nombre, String habilidades, List<Tarea> tareasAsignadas) {
        this.nombre = nombre;
        this.habilidades = habilidades;
        this.tareasAsignadas = tareasAsignadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public List<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void setTareasAsignadas(List<Tarea> tareasAsignadas) {
        this.tareasAsignadas = tareasAsignadas;
    }
}
