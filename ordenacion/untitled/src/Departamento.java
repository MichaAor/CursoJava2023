public class Departamento {
    String nombre;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

     //Retorna True si el nombre del Depto1 es mayor que el nombre del Depto2
    public static boolean comparaDepto(Departamento Depto1, Departamento Depto2){
        if (Depto1.nombre.compareTo(Depto2.nombre) == 1) {
            return true;
        } else return false;
    }
}
