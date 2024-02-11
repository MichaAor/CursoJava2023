import java.util.Date;
import java.util.List;

public class Proyecto {
    String nombre;
    String descripcion;
    float presupuestoAsignado;
    float presupuestoConsumido;
    Date fechaInicio;
    Date fechaFin;
    Colaborador pmAsignadoProyecto;
    String estadoProyecto; //sin desvio, desvio tiempo y desvio presupeusto, desvio tiempo, desvio presupuesto.
    List<Tarea> tareasProyecto;
}
