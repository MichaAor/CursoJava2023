

import java.util.List;
public class Empresa {
    private int id;
    private String nombre;
    private String cuit;
    private List<Departamento> departamentos;
    static int totalDepartamentos = 0;
    static int totalEmpleados = 0;
    public Empresa(int id, String nombre, String cuit) {
      this.id = id;
      this.nombre = nombre;
      this.cuit = cuit;
      this.departamentos = departamentos;

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
        Empresa.totalDepartamentos = departamentos.size();
        for (int i = 0; i < departamentos.size(); i++) {
            Empresa.totalEmpleados += departamentos.get(i).getTotalEmpleados();
        }
    }

    public static int getTotalDepartamentos() {
        return Empresa.totalDepartamentos;
    }

    public static void setTotalDepartamentos(int totalDepartamentos) {
        Empresa.totalDepartamentos = totalDepartamentos;
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