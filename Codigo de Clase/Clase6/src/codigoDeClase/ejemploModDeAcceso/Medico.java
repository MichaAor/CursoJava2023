package codigoDeClase.ejemploModDeAcceso;


//! Ejemplo con uso de 'MODIFICADORES DE ACCESO' en atributos y metodos.
//? Declaracion de la clase 'Medico'.
public class Medico {
//? Atributos pertenecientes a Medico.
    private String nombre;
    private String apellido;
    private String matricula;

//! DECLARACION DE METODOS

//? Constructores: Permiten instanciar o crear objetos de tipo 'Persona'
// *Sin argumentos
    public Medico() {}

// *Con todos los argumentos
    public Medico(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

//? Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

//? Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getMatricula() {
        return matricula;
    }

//? TOSTRING: Metodo dedicado a formatear toda la instancia junto a los valores de sus atributos para crear un String
    @Override
    public String toString(){
        return "\n" + this.getClass().getSimpleName() + "{" +
                "\n Nombre: " + this.getNombre() +
                "\n Apellido: " + this.getApellido() +
                "\n Matricula: " + this.getMatricula()
                + "\n}";
    }

//! METODOS PROPIOS O AJENOS AL ESTANDAR
//? Metodo para saludar.
    public void saludar(){
        System.out.println("Hola, soy el medico " + this.nombre + " " + this.apellido
                + "con numero de matricula  " + this.matricula);
    }

    
//? Defiinicion de metodo: Se declara dentro de una clase siempre. Su alcance sera marcado por los modificadores de acceso y si es
//? static o nonStatic. Puede o no tener parametros de entrada de datos.

// *modificadorDeAcceso static/nonStatic TipoDeRetorno nombreDelMetodo(TipoDeDato parametro, TipoDeDato parametro2){
   //?Instrucciones del metodo
//! return datoARetornar; //*En caso de NO TENER DECLARADO UN 'TipoDeRetorno' de tipo 'void', se debe retornar algun valor.
// *}

//? Invocacion de metodo: Veremos los 2 casos correspondientes
//? static: Para acceder al metodo NO tendremos que crear un objeto o instanciar la clase, se podra acceder directamente.
//      *NombreClase.metodoAInvocar(TipoDeDato parametro1,TipoDeDato parametro2);

//? nonStatic: Para acceder al metodo tendremos que crear un objeto o instanciar la clase.\
//      *instancia de 'NombreClase'.
//      *instanciaNombreClase.metodoAInvocar(TipoDeDato parametro1,TipoDeDato parametro2);
}
