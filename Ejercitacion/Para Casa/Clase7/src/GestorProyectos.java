import java.util.Date;
import java.util.List;

public class GestorProyectos {
    Proyecto nombreProyecto;
    String descripcionProyecto;
    String solicitanteProyecto;
    float presupuestoAsignadoProyecto;
    float presupuestoConsumidoProyecto;
    Colaborador pmAsignadoProyecto;
    Date fechaInicioProyecto;
    Date fechaFinProyecto;
    String estadoProyecto;
    List<Tarea> tareasProyecto;
    List<Colaborador> colaboradoresAsignadosProyecto;

}
