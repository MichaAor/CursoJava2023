

import java.util.List;

public class Departamento {
    private int id;
    private String nombre;
    private List<Empleado> empleados;
    int totalEmpleados;

    public Departamento (int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEmpleados(List<Empleado> empleados,int cantidadEmpleados) {
        this.empleados = empleados;
        this.setTotalEmpleados(cantidadEmpleados);
    }
    public List<Empleado> getEmpleados(int nroEmpleado) {
        return(this.empleados);
    }
    public int getTotalEmpleados() {
        return this.totalEmpleados;
    }
    public void setTotalEmpleados(int totalEmpleados) {
        this.totalEmpleados = totalEmpleados;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", empleados=" + empleados +
                '}';
    }
}
