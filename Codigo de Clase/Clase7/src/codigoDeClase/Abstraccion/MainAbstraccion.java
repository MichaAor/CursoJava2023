package codigoDeClase.Abstraccion;

/*
 ! ABSTRACCION
 ?Explicación: 
 *  -En este caso, se utiliza la abstracción para definir una interfaz Vehículo
 *      con métodos acelerar y frenar.
 *  -Luego, la clase Automóvil implementa esta interfaz, proporcionando una
 *      implementación concreta de los métodos.
 ?  Ventajas:
 *  -Simplifica la complejidad del sistema:
 *      Al definir una interfaz que representa acciones comunes para todos los vehículos,
 *      se simplifica la comprensión del sistema.
 *  -Facilita la comprensión y el diseño:
 *      La abstracción permite centrarse en los aspectos esenciales, 
 *      sin preocuparse por los detalles específicos de implementación.
 ?  Desventajas:
 *  -Puede ser difícil definir la abstracción correcta: 
 *      Determinar qué métodos deben incluirse en la interfaz puede requerir un análisis cuidadoso.
 */
public class MainAbstraccion {
    public static void main(String[] args) {
//? Declaración e Instantiation o inicializaron;

        Automovil automovil = new Automovil();
        automovil.acelerar();
    }
}