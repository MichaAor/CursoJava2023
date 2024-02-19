

import java.util.List;
public class Empresa {
    private int id;
    private String nombre;
    private String cuit;
    private List<Departamento> departamentos;
    private int totalDepartamentos = 0;
    private int totalEmpleados = 0;
    public Empresa(int id, String nombre, String cuit) {
      this.id = id;
      this.nombre = nombre;
      this.cuit = cuit;
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

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    public void actualizarDepartamentos(List<Departamento> departamentos) {
        this.setDepartamentos(departamentos);
        this.setTotalDepartamentos(departamentos.size());
        for (int i = 0; i < departamentos.size(); i++) {
            totalEmpleados += departamentos.get(i).getTotalEmpleados();
        }
    }

    public int getTotalDepartamentos() {
        return this.totalDepartamentos;
    }

    public int getTotalEmpleados() {
        return this.totalEmpleados;
    }

    public void setTotalDepartamentos(int totalDepartamentos) {
        this.totalDepartamentos = totalDepartamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cuit='" + cuit + '\'' +
                ", departamentos=" + departamentos +
                '}';
    }
}