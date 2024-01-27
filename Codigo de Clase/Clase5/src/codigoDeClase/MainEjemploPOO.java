package codigoDeClase;

public class MainEjemploPOO {
    public static void main(String[] args) {
//!-----------------Ejemplo POO simple-----------------//
        System.out.println("\033[36m" + "//--EJEMPLO POO SIMPLE--//" + "\u001B[0m");

//? Declaracion: Reservamos espacio en la memoria, por ahora 'persona' es nulo.
        Persona persona;

//? Instanciacion: Aplicamos valor a nuestra instancia/objeto/variable 'persona'.

//! Ejemplo1: La instancia tiene valor, pero sus atributos estan vacios.
        persona = new Persona();

//! Ejemplo2:
//? La instancia tiene valor al igual que sus atributos, ya que rellenamos a traves de constructor.
//? El constructor de esta instancia pide: new Persona(String nombre,String apellido,int edad);
        persona = new Persona("Javier","Palomo",25);

//! MOSTRAMOS EL SALUDO DE LA PERSONA
        System.out.println("\033[32m" + "--Instancia 'persona' saluda--" + "\u001B[0m");
        persona.saludar();

//? Modificacion: Modificamos los atributos de la instancia 'persona' a traves de los Setters.
        //Cambio el nombre.
        persona.setNombre("Maya");
        //Cambio el apellido.
        persona.setApellido("Rivelino");
        //Cambio la edad.
        persona.setEdad(20);

//? MOSTRAMOS EL SALUDO DE LA PERSONA DE NUEVO, VERIFICANDO SI HUBO CAMBIOS
        System.out.println("\033[32m" + "\n--Instancia 'persona' saluda de nuevo, luego de cambios con SETTERS--" + "\u001B[0m");
        persona.saludar();

//? Mostramos cada uno de los atributos de la instancia 'persona' usando GETTERS
        System.out.println("\033[32m" + "\nAtrtibutos de la iunstancia 'persona' recuperados con GETTERS" + "\u001B[0m");
        System.out.println("\033[33m" + "Nombre: " + persona.getNombre() + "\u001B[0m");
        System.out.println("\033[33m" + "Apellido: " + persona.getApellido() + "\u001B[0m");
        System.out.println("\033[33m" + "Edad: " + persona.getEdad() + "\u001B[0m");
    }
}