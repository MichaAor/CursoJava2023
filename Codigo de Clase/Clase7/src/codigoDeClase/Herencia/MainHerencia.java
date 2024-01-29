package codigoDeClase.Herencia;
/*
 ! HERENCIA
 ? Explicación:
 *  Se utiliza la herencia para modelar una relación "es un" entre la clase base Animal y
 *      la clase derivada Perro. La clase Perro hereda el método comer de la clase Animal y agrega su propio método ladrar.
 ? Ventajas:
 *  -Fomenta la reutilización del código: Al heredar comportamiento común de la clase base,
 *      se evita la duplicación de código.
 *  -Permite organizar las clases en una jerarquía: La jerarquía de herencia puede reflejar relaciones naturales
 *      entre los objetos.
 *  -Facilita la creación de nuevas clases con comportamiento similar: Las nuevas clases pueden aprovechar
 *      la funcionalidad existente y extenderla.
 ? Desventajas:
 *  -Puede llevar a una jerarquía compleja y difícil de mantener: A medida que se agregan más clases derivadas,
 *      la jerarquía puede volverse difícil de comprender y mantener.
 *  -La modificación de la clase base puede afectar a las clases derivadas: Cambiar la implementación en la clase base
 *      puede tener consecuencias en todas las clases derivadas.
 */
public class MainHerencia {
    public static void main(String[] args) {
//? Declaracion e Instanciacion o inicializacion;
       Perro perro = new Perro();

//? Ejecutamos el metodo heredado de la superclase 'Animal'.
       perro.comer();

//? Ejecutamos el metodo particular de la clase 'Perro'.
       perro.ladrar();

    }
}