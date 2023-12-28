package codigoDeClase.ejemploPOO;

//Declaracion de la clase 'Persona'.
//Ejemplo sin uso de 'MODIFICADORES DE ACCESO' en atributos y metodos ,por defecto son 'private'.
public class Persona {

    //Atributos pertenecientes a Persona.
    String nombre;
    String apellido;
    int edad;

//DECLARACION DE METODOS

    //Constructores: Permiten instanciar o crear objetos de tipo 'Persona'
    //* Sin argumentos
    public Persona(){}

    //* Con todos los argumentos
    public Persona(String nombre,String apellido,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

//Setters:
// A traves de estos metodos podemos alterar los valores de los atributos de nuestra instancia.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

//Getters:
// A traves de estos metodos podemos retornar los valores de los atributos de nuestra instancia.
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public int getEdad() {
        return this.edad;
    }

//METODOS PROPIOS O AJENOS AL ESTANDAR
//* Metodo para saludar.

    public void saludar(){
        System.out.println("Hola, soy " + this.nombre + " " + this.apellido
                            + " y tengo " + this.edad + " años");
    }
}
