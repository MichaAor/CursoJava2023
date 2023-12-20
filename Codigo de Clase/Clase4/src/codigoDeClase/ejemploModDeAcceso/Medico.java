package codigoDeClase.ejemploModDeAcceso;

//Declaracion de la clase 'Medico'.
//Ejemplo con uso de 'MODIFICADORES DE ACCESO' en atributos y metodos.
public class Medico {

    //Atributos pertenecientes a Medico.
    private String nombre;
    private String apellido;
    private String matricula;

//DECLARACION DE METODOS

//Constructores: Permiten instanciar o crear objetos de tipo 'Persona'
//* Sin argumentos
    public Medico() {}

//* Con todos los argumentos
    public Medico(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

//Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

//Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getMatricula() {
        return matricula;
    }

//TOSTRING: Metodo dedicado a formatear toda la instancia junto a los valores de sus atributos para crear un String
    @Override
    public String toString(){
        return "\n" + this.getClass().getSimpleName() + "{" +
                "\n Nombre: " + this.getNombre() +
                "\n Apellido: " + this.getApellido() +
                "\n Matricula: " + this.getMatricula()
                + "\n}";
    }

//METODOS PROPIOS O AJENOS AL ESTANDAR
//* Metodo para saludar.
    public void saludar(){
        System.out.println("Hola, soy el medico " + this.nombre + " " + this.apellido
                + "con numero de matricula  " + this.matricula);
    }
}
